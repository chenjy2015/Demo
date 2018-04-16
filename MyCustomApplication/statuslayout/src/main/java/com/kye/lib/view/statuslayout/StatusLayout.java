package com.kye.lib.view.statuslayout;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 21/12/2017
 * @updated : 21/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class StatusLayout extends FrameLayout {

    private final String TAG_CURRENT_STATUS = "TAG_CURRENT_STATUS";
    private final String TAG_IS_DEFAULT_LAYOUT = "TAG_IS_DEFAULT_LAYOUT";

    LayoutInflater inflater;
    // layout
    int loadingLayout;
    int emptyLayout;
    int errorNetworkLayout;
    int errorServerLayout;
    int customLayout; // todo : 自定义
    // root view
    int contentViewId;
    int loadingViewId = R.id.status_layout_loading_container_id;
    int emptyViewId = R.id.status_layout_empty_container_id;
    int errorNetworkViewId = R.id.status_layout_network_container_id;
    int errorServerViewId = R.id.status_layout_server_container_id;
    int customViewId = R.id.status_layout_server_container_id;
    // textview in each status layout
    int loadingTextId = R.id.status_layout_loading_text_id;
    int emptyTextId = R.id.status_layout_empty_text_id;
    int errorNetworkTextId = R.id.status_layout_network_text_id;
    int errorServerTextId = R.id.status_layout_server_text_id;
    // content view embed in statuslayout in xml file
    View contentView;

    Map<Integer, View> mLayouts = new HashMap<>();
    Map<Integer, View> mViews = new HashMap<>();

    protected OnStatusChangeListener onStatusChangeListener;
    protected OnLoadingListener onLoadingListener;
    protected OnShowContentListener onShowContentListener;
    protected OnDefaultRetryListener onDefaultRetryListener;

    protected StatusLayoutType currentStatus = StatusLayoutType.CONTENT;

    protected boolean isDefaultLayout = true;

    public StatusLayout(@NonNull Context context) {
        this(context, null, R.style.StatusLayout_Default);
    }

    public StatusLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, R.style.StatusLayout_Default);
    }

    public StatusLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        inflater = LayoutInflater.from(context);

        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.StatusLayout, defStyleAttr, R.style.StatusLayout_Default);

        /**
         * 获取布局xml定义的layout
         */
        loadingLayout = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutLoadingResLayout, NO_ID);
        emptyLayout = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutEmptyResLayout, NO_ID);
        errorNetworkLayout = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutNetworkResLayout, NO_ID);
        errorServerLayout = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutServerResLayout, NO_ID);
        customLayout = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutCustomResLayout, NO_ID);

//        loadingViewId = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutLoadingViewId, NO_ID);
//        emptyViewId = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutEmptyViewId, NO_ID);
//        errorNetworkViewId = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutNetworkViewId, NO_ID);
//        errorServerViewId = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutServerViewId, NO_ID);
//
//        loadingViewId = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutLoadingTextId, NO_ID);
//        emptyViewId = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutEmptyTextId, NO_ID);
//        errorNetworkViewId = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutNetworkTextId, NO_ID);
//        errorServerViewId = attributes.getResourceId(R.styleable.StatusLayout_statusLayoutServerTextId, NO_ID);

        attributes.recycle();

        setLayoutTransition(new LayoutTransition());
    }

    public void setDefaultStatus(StatusLayoutType defaultStatus) {
        currentStatus = defaultStatus;
    }

    public void showCurrentStatusLayout() {
        showStatusLayout(currentStatus);
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            currentStatus = (StatusLayoutType) savedInstanceState.getSerializable(TAG_CURRENT_STATUS);
            isDefaultLayout = savedInstanceState.getBoolean(TAG_IS_DEFAULT_LAYOUT);
        }
    }

    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putSerializable(TAG_CURRENT_STATUS, currentStatus);
        outState.putBoolean(TAG_IS_DEFAULT_LAYOUT, isDefaultLayout);
    }

    @Override
    protected void onFinishInflate() {
        if (getChildCount() == 0) {
            return;
        }
        if (getChildCount() == 1) {
            /**
             * 使用默认定义布局
             */
            View view = getChildAt(0);
            setContentView(view);
            initDefaultStatusLayouts();
            isDefaultLayout = true;
        } else if (getChildCount() > 1) {
            /**
             * 使用自定义的状态布局, xml中自定义, 按规则顺序定义
             CONTENT(0, "content view"), // 内容
             LOADING(1, "loading view"), // 正在加载
             EMPTY(2, "empty view"), // 无数据
             ERROR_NETWORK(3, "network error view"), // 网络错误
             ERROR_SERVER(4, "server error view"); // 后台错误
             */
            initCustomStatusLayouts();
            isDefaultLayout = false;
        } else if (getChildCount() > 5) {
            throw new IllegalStateException("StatusLayout child view init error.");
        }
        super.onFinishInflate();
    }

    /**
     * 使用默认的配置状态布局
     */
    private void initDefaultStatusLayouts() {
        layoutDefault(loadingLayout);
        layoutDefault(emptyLayout);
        layoutDefault(errorNetworkLayout);
        layoutDefault(errorServerLayout);
//        layoutDefault(customLayout);
    }

    /**
     * todo :
     * 使用xml上自定的状态布局
     */
    private void initCustomStatusLayouts() {
        int childCount = getChildCount();
        /**
         * todo : handle content view
         */
        for (int i = 0; i < childCount; i++) {
            switch (StatusLayoutType.toOrder(i)) {
                case CONTENT: {
                    contentView = getChildAt(i);
                    contentViewId = contentView.getId();
                    mLayouts.put(contentViewId, contentView);
                    break;
                }
                case LOADING: {
                    View loadingView = getChildAt(i);
                    loadingViewId = loadingView.getId();
                    mLayouts.put(loadingLayout, loadingView);
                    break;
                }
                case EMPTY: {
                    View emptyView = getChildAt(i);
                    emptyViewId = emptyView.getId();
                    mLayouts.put(emptyLayout, emptyView);
//                    emptyView.setOnClickListener(new OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            if (onDefaultRetryListener != null) {
//                                onDefaultRetryListener.onRetry(StatusLayoutType.EMPTY);
//                            }
//                        }
//                    });
                    break;
                }
                case ERROR_NETWORK: {
                    View errorNetView = getChildAt(i);
                    errorNetworkViewId = errorNetView.getId();
                    mLayouts.put(errorNetworkLayout, errorNetView);
//                    errorNetView.setOnClickListener(new OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            if (onDefaultRetryListener != null) {
//                                onDefaultRetryListener.onRetry(StatusLayoutType.ERROR_NETWORK);
//                            }
//                        }
//                    });
                    break;
                }
                case ERROR_SERVER: {
                    View errorServerView = getChildAt(i);
                    errorServerViewId = errorServerView.getId();
                    mLayouts.put(errorServerLayout, errorServerView);
//                    errorServerView.setOnClickListener(new OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            if (onDefaultRetryListener != null) {
//                                onDefaultRetryListener.onRetry(StatusLayoutType.ERROR_SERVER);
//                            }
//                        }
//                    });
                    break;
                }
                case CUSTOM: {
                    View customView = getChildAt(i);
                    customViewId = customView.getId();
                    mLayouts.put(customLayout, customView);
//                    errorServerView.setOnClickListener(new OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            if (onDefaultRetryListener != null) {
//                                onDefaultRetryListener.onRetry(StatusLayoutType.ERROR_SERVER);
//                            }
//                        }
//                    });
                    break;
                }
            }
        }
    }

    private View layoutDefault(@LayoutRes int layoutId) {
        if (mLayouts.containsKey(layoutId)) {
            return mLayouts.get(layoutId);
        }

        final View layout = inflater.inflate(layoutId, this, false);
        layout.setVisibility(GONE);
        addView(layout);
        mLayouts.put(layoutId, layout);

        if (layoutId == loadingLayout) {
//            layout.setOnClickListener(new OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (onLoadingListener != null) {
//                        onLoadingListener.onLoading();
//                    }
//                }
//            });
            TextView loadingTextView = layout.findViewById(R.id.status_layout_loading_text_id);
            if (loadingTextView != null) {
                mViews.put(loadingTextId, loadingTextView);
            }
        } else if (layoutId == emptyLayout) {
            layout.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    layout.post(new Runnable() {
                        @Override
                        public void run() {
                            showLoadingView();
                        }
                    });
                    if (onDefaultRetryListener != null) {
                        onDefaultRetryListener.onRetry(currentStatus);
                    }
                }
            });
            TextView emptyTextView = layout.findViewById(R.id.status_layout_empty_text_id);
            if (emptyTextView != null) {
                mViews.put(emptyTextId, emptyTextView);
            }
        } else if (layoutId == errorNetworkLayout) {
            layout.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    layout.post(new Runnable() {
                        @Override
                        public void run() {
                            showLoadingView();
                        }
                    });
                    if (onDefaultRetryListener != null) {
                        onDefaultRetryListener.onRetry(currentStatus);
                    }
                }
            });
            TextView errorNetTextView = layout.findViewById(R.id.status_layout_network_text_id);
            if (errorNetTextView != null) {
                mViews.put(errorNetworkTextId, errorNetTextView);
            }
        } else if (layoutId == errorServerLayout) {
            layout.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    layout.post(new Runnable() {
                        @Override
                        public void run() {
                            showLoadingView();
                        }
                    });
                    if (onDefaultRetryListener != null) {
                        onDefaultRetryListener.onRetry(currentStatus);
                    }
                }
            });
            TextView errorServerTextView = layout.findViewById(R.id.status_layout_server_text_id);
            if (errorServerTextView != null) {
                mViews.put(errorServerTextId, errorServerTextView);
            }
        } else if (layoutId == errorServerLayout) {

        } else {
            throw new IllegalStateException("layout error.");
        }
        return layout;
    }

    private void setContentView(View contentView) {
        this.contentView = contentView;
        contentViewId = contentView.getId();
        mLayouts.put(contentViewId, contentView);
    }

    public void showStatusLayout(StatusLayoutType statusLayoutType) {
        currentStatus = statusLayoutType;
        switch (statusLayoutType) {
            case CONTENT:
                hideAllViews();
                mLayouts.get(contentViewId).setVisibility(VISIBLE);
                if (onShowContentListener != null) {
                    onShowContentListener.onShowContent();
                }
                break;
            case LOADING:
                hideAllViews();
                mLayouts.get(loadingLayout).setVisibility(VISIBLE);
                if (onLoadingListener != null) {
                    onLoadingListener.onLoading();
                }
                break;
            case EMPTY:
                hideAllViews();
                mLayouts.get(emptyLayout).setVisibility(VISIBLE);
                break;
            case ERROR_NETWORK:
                hideAllViews();
                mLayouts.get(errorNetworkLayout).setVisibility(VISIBLE);
                break;
            case ERROR_SERVER:
                hideAllViews();
                mLayouts.get(errorServerLayout).setVisibility(VISIBLE);
                break;
            case CUSTOM:
                hideAllViews();
                mLayouts.get(customLayout).setVisibility(VISIBLE);
                break;
            default:
                throw new IllegalStateException("showStatusLayout type error : " + statusLayoutType);
        }
        if (onStatusChangeListener != null) {
            onStatusChangeListener.onStatusChange(currentStatus);
        }
    }

    public void showDefaultView() {
        showStatusLayout(currentStatus);
    }

    public void showContentView() {
        if (currentStatus == StatusLayoutType.CONTENT) return;
        showStatusLayout(StatusLayoutType.CONTENT);
    }

    public void showLoadingView() {
        if (currentStatus == StatusLayoutType.LOADING) return;
        showStatusLayout(StatusLayoutType.LOADING);
    }

    public void showEmptyView() {
        if (currentStatus == StatusLayoutType.EMPTY) return;
        showStatusLayout(StatusLayoutType.EMPTY);
    }

    public void showErrorNetworkView() {
        if (currentStatus == StatusLayoutType.ERROR_NETWORK) return;
        showStatusLayout(StatusLayoutType.ERROR_NETWORK);
    }

    public void showErrorServerView() {
        if (currentStatus == StatusLayoutType.ERROR_SERVER) return;
        showStatusLayout(StatusLayoutType.ERROR_SERVER);
    }

    public void showCustomView() {
        if (currentStatus == StatusLayoutType.CUSTOM) return;
        showStatusLayout(StatusLayoutType.CUSTOM);
    }

    public View getLoadingView() {
        return mLayouts.get(StatusLayoutType.LOADING);
    }

    public void hideLoadingView() {
        getLoadingView().setVisibility(GONE);
    }

    private TextView getStatusLayoutTextView(StatusLayoutType statusLayoutType) {
        switch (statusLayoutType) {
            case LOADING:
                return (TextView) mViews.get(loadingTextId);
            case EMPTY:
                return (TextView) mViews.get(emptyTextId);
            case ERROR_NETWORK:
                return (TextView) mViews.get(errorNetworkTextId);
            case ERROR_SERVER:
                return (TextView) mViews.get(errorServerTextId);
            default:
                throw new IllegalStateException("getStatusLayoutTextView type error : " + statusLayoutType);
        }
    }

    public boolean isContentShown() {
        View contentView = mLayouts.get(contentViewId);
        return contentView.isShown();
    }

    public @Nullable TextView getLoadingTextView() {
        return getStatusLayoutTextView(StatusLayoutType.LOADING);
    }

    public @Nullable TextView getEmptyTextView() {
        return getStatusLayoutTextView(StatusLayoutType.EMPTY);
    }

    public @Nullable TextView getErrorNetworkTextView() {
        return getStatusLayoutTextView(StatusLayoutType.ERROR_NETWORK);
    }

    public @Nullable TextView getErrorServerTextView() {
        return getStatusLayoutTextView(StatusLayoutType.ERROR_SERVER);
    }

    private void hideAllViews() {
        for (View view : mLayouts.values()) {
            if (view != null) {
                view.setVisibility(GONE);
            }
        }
    }

    public interface OnStatusChangeListener {
        void onStatusChange(StatusLayoutType currentStatus);
    }

    public interface OnLoadingListener {
        void onLoading();
    }

    public interface OnShowContentListener {
        void onShowContent();
    }

    public interface OnDefaultRetryListener {
        void onRetry(StatusLayoutType currentStatus);
    }

    public void setOnStatusChangeListener(OnStatusChangeListener onStatusChangeListener) {
        this.onStatusChangeListener = onStatusChangeListener;
    }

    public void setOnLoadingListener(OnLoadingListener onLoadingListener) {
        this.onLoadingListener = onLoadingListener;
    }

    public void setOnShowContentListener(OnShowContentListener onShowContentListener) {
        this.onShowContentListener = onShowContentListener;
    }

    public void setOnDefaultRetryListener(OnDefaultRetryListener onDefaultRetryListener) {
        this.onDefaultRetryListener = onDefaultRetryListener;
    }
}
