package com.example.pullrefreshlistview.refresh_and_load_more;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.NoConnectionError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.error.KyeApiRequestError;
import com.example.pullrefreshlistview.PtrClassicFrameLayout;
import com.example.pullrefreshlistview.PtrDefaultHandler1;
import com.example.pullrefreshlistview.PtrFrameLayout;
import com.example.pullrefreshlistview.R;


/**
 * @version V1.0
 * @Author ly
 * @company 跨越速运
 * @Description
 * @Date 2017/3/24
 */
public class RefreshAndLoadListView extends FrameLayout {

    private long mLoadingStartTime;
    private LinearLayout mErrorRequestContentLaoyout;
    private LinearLayout mNoDataContentLayout;
    private OnItemLongClickListener mOnItemLongClickListener;

    public enum Modes {
        NONE, REFRESH, LOAD_MORE, BOTH
    }

    private OnItemClickListener mOnItemClickListenr;
    private OnReLoadCilckListener mOnReLoadListener;
    private RelativeLayout mErrorRequestPage;
    private TextView mReloadTv;
    private ImageView mErrorPageImageIv;
    private boolean mIsLoadMore;
    private ListAdapter mAdapter;
    private boolean isIntercept; //设置父容器不拦截此控件标记
    private int mLoadingMinTime = 350;
    private PtrClassicFrameLayout ptrRefreshLayout;
    private RelativeLayout mNoDataLayout;
    private TextView mNoDataText;

    private LoadMoreListView mContentList;
    private OnCallBack mCallBack;
    private HintHeader mHintHeader;
    protected byte mStatus = RAL_IDLE;
    private final static byte RAL_IDLE = 0;
    private final static byte RAL_REFRESH = 1;
    private final static byte RAL_LOAD_MORE = 2;
    private Modes mMode = Modes.BOTH;

    public RefreshAndLoadListView(Context context) {
        this(context, null);
    }

    public RefreshAndLoadListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RefreshAndLoadListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
        iniConfig(attrs);
        initEvent();
    }


    /**
     * 初始化View
     */
    private void initView() {
        View rootView = inflate(getContext(), R.layout.layout_refresh_and_load, this);
        ptrRefreshLayout = (PtrClassicFrameLayout) findViewById(R.id.fragment_refresh_and_load_more);
        mContentList = (LoadMoreListView) findViewById(R.id.lv_content);
        mNoDataLayout = (RelativeLayout) findViewById(R.id.layout_no_data);
        mNoDataText = findViewById(R.id.tv_nodata);
        mNoDataContentLayout = (LinearLayout) findViewById(R.id.layout_no_data_contont_show);
        mErrorRequestPage = (RelativeLayout) findViewById(R.id.layout_error);
        mErrorRequestContentLaoyout = (LinearLayout) findViewById(R.id.layout_error_content);
        mErrorPageImageIv = (ImageView) findViewById(R.id.img_error);
        mReloadTv = (TextView) findViewById(R.id.tv_nodata_load);
        mHintHeader = new HintHeader(getContext());

    }

    public void setmRefreshLayoutBackground(String color){
        ptrRefreshLayout.setBackgroundColor(Color.parseColor(color));
    }

    public void setNoDataLayout(View view) {
        mNoDataContentLayout.setVisibility(GONE);
        mNoDataLayout.addView(view);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(layoutParams);
    }


    /**
     * 设置数据为空时的提示语
     * @param text
     */
    public void setNoDataText(String text){
        mNoDataText.setText(text);
    }

    /**
     * 初始化参数
     *
     * @param attrs
     */
    private void iniConfig(AttributeSet attrs) {
        ptrRefreshLayout.setPullToRefresh(false);
        ptrRefreshLayout.setKeepHeaderWhenRefresh(true);
//        设置上拉时paddingTop的偏移量
        mContentList.setTopPaddingOffeset(ptrRefreshLayout.getDefaultHeaderHeight());

        TypedArray arr = getContext().obtainStyledAttributes(attrs, R.styleable.RefreshAndLoadListView);
        //            框架的模式
        mMode = getModeFromIndex(arr.getInt(R.styleable.RefreshAndLoadListView_modes, 3));

//        设置刷新和加载的模式
        setRefreshAndLoadMode(mMode);
    }


    private void setRefreshAndLoadMode(Modes mode) {
        //        设置是否可以加载更多数据
        if ((mode.ordinal() & 2) > 0) {
            mContentList.setPullLoadEnable(true);
        } else {
            mContentList.setPullLoadEnable(false);
        }

        if ((mode.ordinal() & 1) > 0) {
            ptrRefreshLayout.setEnableRefresh(true);
        } else {
            ptrRefreshLayout.setEnableRefresh(false);
        }
    }

    public void setMode(Modes mMode) {
        this.mMode = mMode;
        setRefreshAndLoadMode(mMode);
    }

    private Modes getModeFromIndex(int index) {
        switch (index) {
            case 0:
                return Modes.NONE;
            case 1:
                return Modes.REFRESH;
            case 2:
                return Modes.LOAD_MORE;
            case 3:
                return Modes.BOTH;
            default:
                return Modes.BOTH;
        }
    }

    private void initEvent() {
        ptrRefreshLayout.setPtrHandler(new PtrDefaultHandler1() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                if (mCallBack != null) {
                    mLoadingStartTime = System.currentTimeMillis();
                    mCallBack.onRefreshBegin(frame);
                    mStatus = RAL_REFRESH;
                }
            }
        });

        mContentList.setOnLoadMoreCallBack(new LoadMoreListView.LoadMoreCallBack() {
            @Override
            public void onLoadMore() {
                if (mCallBack != null) {
                    mLoadingStartTime = System.currentTimeMillis();
                    mCallBack.onLoadMoreBegin();
                    mStatus = RAL_LOAD_MORE;
                }
            }
        });

        mReloadTv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnReLoadListener != null) {
                    mOnReLoadListener.onReLoad(view);
                }
            }
        });
    }

    /**
     * 是否还有数据加载,推荐使用 setLoadMore(boolean isLoadMore, int itemCount)
     */
    @Deprecated
    public void setLoadMore(boolean isLoadMore) {
        this.mIsLoadMore = isLoadMore;
        mContentList.setLoadMore(isLoadMore, 0);
    }

    /**
     * 是否还有数据加载
     *
     * @param isLoadMore
     * @param itemCount  本次请求下来的item数目
     */
    public void setLoadMore(boolean isLoadMore, int itemCount) {
        this.mIsLoadMore = isLoadMore;
        mContentList.setLoadMore(isLoadMore, itemCount);
    }

    /**
     * 设置列表的Adapter
     *
     * @param adapter
     */
    public void setContentAdapter(BaseAdapter adapter) {
        if (mContentList == null) {
            return;
        }
        this.mAdapter = adapter;
        mContentList.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    /**
     * 是否显示无数据布局
     *
     * @param isShow
     */
    public void showNoDataLayout(final VolleyError error, boolean isShow) {
        if (isShow) {//展示
            long delay = mLoadingMinTime - (System.currentTimeMillis() - mLoadingStartTime);
            if (delay <= 0) {
                showErrorHintPage(error, 0);
            } else {
                showErrorHintPage(error, delay);
            }
        } else {
            setRefreshAndLoadMode(mMode);
            if (!mIsLoadMore) {
                setLoadMore(mIsLoadMore);
            }
            if (mNoDataLayout.getVisibility() == View.VISIBLE) {
                mNoDataLayout.setVisibility(View.GONE);
            }

            if (mErrorRequestPage.getVisibility() == View.VISIBLE) {
                mErrorRequestPage.setVisibility(View.GONE);
            }

            mContentList.setVisibility(View.VISIBLE);
        }
    }

    /**
     * 是否显示无数据布局
     *
     * @param isShow
     */
    public void showNoDataLayout1(final VolleyError error, boolean isShow) {
        if (isShow) {//展示
            long delay = mLoadingMinTime - (System.currentTimeMillis() - mLoadingStartTime);
            if (delay <= 0) {
                showErrorHintPage1(error, 0);
            } else {
                showErrorHintPage1(error, delay);
            }
        } else {
            setRefreshAndLoadMode(mMode);
            if (!mIsLoadMore) {
                setLoadMore(mIsLoadMore);
            }
            if (mNoDataLayout.getVisibility() == View.VISIBLE) {
                mNoDataLayout.setVisibility(View.GONE);
            }

            if (mErrorRequestPage.getVisibility() == View.VISIBLE) {
                mErrorRequestPage.setVisibility(View.GONE);
            }

            mContentList.setVisibility(View.VISIBLE);
        }
    }

    private void showErrorHintPage(VolleyError error, long delay) {
        setRefreshAndLoadMode(Modes.NONE);
//        mContentList.setVisibility(View.GONE);
        if (error == null) {
            mNoDataLayout.setVisibility(View.VISIBLE);
            if (delay != 0) {
                startShowAnimation(mNoDataContentLayout, delay);
            }
            mErrorRequestPage.setVisibility(View.GONE);
        } else {
            if (error instanceof TimeoutError || error instanceof NoConnectionError) {
                mErrorPageImageIv.setImageResource(R.drawable.icon_request_error);
                mErrorRequestPage.setVisibility(VISIBLE);
                if (delay != 0) {
                    startShowAnimation(mErrorRequestContentLaoyout, delay);
                }
                mNoDataLayout.setVisibility(View.GONE);
            } else if (error instanceof KyeApiRequestError) {
                mNoDataLayout.setVisibility(View.VISIBLE);
                if (delay != 0) {
                    startShowAnimation(mNoDataContentLayout, delay);
                }
                mErrorRequestPage.setVisibility(View.GONE);
            } else {
                mErrorPageImageIv.setImageResource(R.drawable.icon_server_error);
                mErrorRequestPage.setVisibility(VISIBLE);
                mNoDataLayout.setVisibility(View.VISIBLE);
                if (delay != 0) {
                    startShowAnimation(mErrorRequestContentLaoyout, delay);
                }
                mNoDataLayout.setVisibility(View.GONE);
            }
        }
    }

    private void showErrorHintPage1(VolleyError error, long delay) {
        if (error == null) {
            mNoDataLayout.setVisibility(View.VISIBLE);
            if (delay != 0) {
                startShowAnimation(mNoDataContentLayout, delay);
            }
            mErrorRequestPage.setVisibility(View.GONE);
        } else {
            if (error instanceof TimeoutError || error instanceof NoConnectionError) {
                mErrorPageImageIv.setImageResource(R.drawable.icon_request_error);
                mErrorRequestPage.setVisibility(VISIBLE);
                if (delay != 0) {
                    startShowAnimation(mErrorRequestContentLaoyout, delay);
                }
                mNoDataLayout.setVisibility(View.GONE);
            } else if (error instanceof KyeApiRequestError) {
                mNoDataLayout.setVisibility(View.VISIBLE);
                if (delay != 0) {
                    startShowAnimation(mNoDataContentLayout, delay);
                }
                mErrorRequestPage.setVisibility(View.GONE);
            } else {
                mErrorPageImageIv.setImageResource(R.drawable.icon_server_error);
                mErrorRequestPage.setVisibility(VISIBLE);
                mNoDataLayout.setVisibility(View.VISIBLE);
                if (delay != 0) {
                    startShowAnimation(mErrorRequestContentLaoyout, delay);
                }
                mNoDataLayout.setVisibility(View.GONE);
            }
        }
    }


    /**
     * 初始化动画
     */
    private void startShowAnimation(View view, long duration) {
//      缩放动画
        ScaleAnimation scale = new ScaleAnimation(0, 1.0f, 0, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(duration);
//      透明度
        AlphaAnimation alpha = new AlphaAnimation(0, 1.0f);
        alpha.setDuration(duration);

        AnimationSet set = new AnimationSet(false);
        set.addAnimation(scale);
        set.addAnimation(alpha);
        view.startAnimation(set);
    }

    /**
     * 第一次进入页面时的自动刷新,没有下滑的动画效果
     * 自动刷新
     */
    public void firstAutoRefresh() {
        if (ptrRefreshLayout == null) {
            return;
        }
        if (mContentList != null && mAdapter != null && mAdapter.getCount() > 0 && mContentList.canScrollVertically(-1)) {
            mContentList.setSelection(0);
        }
//        延时150ms
        postDelayed(new Runnable() {
            @Override
            public void run() {
                ptrRefreshLayout.autoRefresh(true, 0, false);
            }
        }, 20);
    }


    /**
     * 自动刷新
     * 有下滑的动画效果
     */
    public void autoRefresh() {
        autoRefresh(300);

    }

    /**
     * 自动刷新
     * 有下滑的动画效果
     *
     * @param ScrollDuration 下滑的时间
     */
    private void autoRefresh(int ScrollDuration) {
        if (ptrRefreshLayout == null) {
            return;
        }
        if (mContentList != null && mAdapter != null && mAdapter.getCount() > 0 && mContentList.canScrollVertically(-1)) {
            mContentList.setSelection(0);
        }
//        延时150ms
        postDelayed(new Runnable() {
            @Override
            public void run() {
                ptrRefreshLayout.autoRefresh(true, 500, true);
            }
        }, 100);
    }


    /**
     * 刷新或加载结束
     */
    @Deprecated
    public void refreshOrLoadComplete(boolean isSuccess, String hint) {
        refreshOrLoadComplete(new VolleyError(), isSuccess);
    }

    /**
     * 刷新或加载结束
     */
    public void refreshOrLoadComplete(Exception error, boolean isSuccess) {
        if (isSuccess) {//请求成功
            if ((mMode.ordinal() & 1) > 0) {
                int headerCount = mContentList.getHeaderViewsCount();
                if (headerCount > 0) {
                    mContentList.removeHeaderView(mHintHeader);
                }
                ptrRefreshLayout.refreshComplete(isSuccess);
            }

            mContentList.completeLoadMore(isSuccess, "加载成功");
        } else {//请求失败

            String hint = "加载失败";
            if (error instanceof TimeoutError || error instanceof NoConnectionError) {
                hint = "无法连接服务器，请检查你的网络设置";
            }
//          mStatus != RAL_IDLE && (mMode.ordinal() & 1) > 0
            if (mStatus != RAL_IDLE && (mMode.ordinal() & 1) > 0) {//是否是刷新
                int headerCount = mContentList.getHeaderViewsCount();
                if (headerCount > 0) {
                    mContentList.removeHeaderView(mHintHeader);
                }
                if (error instanceof TimeoutError || error instanceof NoConnectionError) {
                    mHintHeader.setHint(hint);
                    mContentList.addHeaderView(mHintHeader);
                }
            }
            ptrRefreshLayout.refreshComplete(isSuccess);

            mContentList.completeLoadMore(isSuccess, hint);
        }
//       闲置,
        mStatus = RAL_IDLE;
    }


    /**
     * 少于count条时,不显示footer
     *
     * @param count
     */
    public void setMinItemCount(int count) {
        if (mContentList != null) {
            mContentList.setMinItemCount(count);
        }
    }

    public void setOnCallBack(OnCallBack callBack) {
        this.mCallBack = callBack;
    }

    public void smoothToPosition(int position) {
        if (mContentList != null) {
            mContentList.setSelection(position);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListenr) {
        initItemClickEvent();
        mOnItemClickListenr = onItemClickListenr;
    }

    private void initItemClickEvent() {
        if (mOnItemClickListenr == null) {
            mContentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    if (mOnItemClickListenr != null) {
                        int dataPosition = position;
                        if (mContentList.getHeaderViewsCount() > 0) {
                            dataPosition = position - mContentList.getHeaderViewsCount();
                        }
                        if (dataPosition >= 0) {
                            mOnItemClickListenr.onItemClick(adapterView, view, dataPosition, id);
                        }
                    }
                }
            });
        }
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        initItemLongClickEvent();
        mOnItemLongClickListener = onItemLongClickListener;
    }

    private void initItemLongClickEvent() {
        if (mOnItemLongClickListener == null) {
            mContentList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    if (mOnItemLongClickListener != null) {
                        int dataPosition = position;
                        if (mContentList.getHeaderViewsCount() > 0) {
                            dataPosition = position - mContentList.getHeaderViewsCount();
                        }
                        return mOnItemLongClickListener.onItemLongClick(parent, view, dataPosition, id);
                    }
                    return false;
                }
            });
        }
    }


    public void setOnReLoadListener(OnReLoadCilckListener listener) {
        this.mOnReLoadListener = listener;
    }

    /**
     * 回调的接口
     */
    public interface OnCallBack {
        void onRefreshBegin(PtrFrameLayout frame);

        void onLoadMoreBegin();
    }

    /**
     * 点击事件
     */
    public interface OnItemClickListener {
        void onItemClick(AdapterView<?> adapterView, View view, int dataPosition, long id);
    }

    /**
     * 长按事件
     */
    public interface OnItemLongClickListener {
        boolean onItemLongClick(AdapterView<?> parent, View view, int dataPosition, long id);
    }

    public interface OnReLoadCilckListener {
        void onReLoad(View view);
    }


    /**
     * 设置 isIntercept = true 父容器不拦截事件
     */
    public void setIntercept(boolean intercept) {
        isIntercept = intercept;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (isIntercept) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(ev);
    }

    public ListView getListView() {
        return mContentList;
    }

    /**
     * 上拉加载更多提示语设置
     * @param hint
     */
    public void setLoadMoreHint(String hint){
        mContentList.setLoadMoreHint(hint);
    }


    /**
     * 设置 下拉刷新是否可用 解决可滑动View与当前下拉刷新时 事件分发问题
     *
     * @param isEnable
     */
    public void setRefreshLayoutEnable(boolean isEnable) {
        ptrRefreshLayout.mEnableRefresh = isEnable;
        mContentList.mEnablePullLoad = isEnable;
    }

    public void setSelection(int position){
        mContentList.setSelection(position);
    }
}
