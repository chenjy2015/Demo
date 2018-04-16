package com.example.chenjiayou.mycustomapplication.view.refreshAndLoad;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kye.express.R;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/12/2017
 * @updated : 19/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 * <p>
 * 自定义加载更多，上拉小人跑动样式
 */

public class KyeLoadFooter extends FrameLayout implements RefreshFooter {

    private static final String TAG = KyeRefreshHeader.class.getSimpleName();
    protected LinearLayout textContainer;
    protected ImageView logoView;
    protected ImageView progressView;
    protected TextView titleView;

    protected RefreshState oldState, newState;
    RefreshLayout refreshLayout;

    protected int[] frameList = {
            R.drawable.loading_1,
            R.drawable.loading_2,
            R.drawable.loading_3,
            R.drawable.loading_4,
            R.drawable.loading_5,
            R.drawable.loading_6,
            R.drawable.loading_7,
            R.drawable.loading_8,
            R.drawable.loading_9
    };

    public KyeLoadFooter(@NonNull Context context) {
        super(context, null, 0);
        initView();
    }

    public KyeLoadFooter(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
        initView();
    }

    public KyeLoadFooter(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public KyeLoadFooter(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.kye_refresh_footer_layout, this, false);
        textContainer = view.findViewById(R.id.llContainer);
        logoView = view.findViewById(R.id.ivLogo);
        progressView = view.findViewById(R.id.ivProgress);
        titleView = view.findViewById(R.id.tvTitle);
        addView(view, LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    }

    @NonNull
    @Override
    public View getView() {
        return this;
    }

    @Override
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Translate;
    }

    @Override
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState oldState, RefreshState newState) {
        this.oldState = oldState;
        this.newState = newState;
        switch (newState) {
            case None:
            case PullToUpLoad:
                titleView.setText("上拉加载更多");
                break;
            case Loading:
                titleView.setText("正在加载...");
                break;
            case ReleaseToLoad:
                titleView.setText("释放立即加载");
                break;
        }
    }

    @Override
    public int onFinish(RefreshLayout layout, boolean success) {
        if (success) {
            titleView.setText("加载完成");
        } else {
            titleView.setText("加载失败");
        }
        return 500;//延迟500毫秒之后再弹回
    }

    @Override
    public void onPullingUp(float percent, int offset, int footerHeight, int extendHeight) {
        if (refreshLayout != null && !refreshLayout.isEnableRefresh()) {
            return ;
        }
        if (newState == null) {
            return;
        }
//        Log.d(TAG, "onPullingDown : percent : " + percent + " , offset : " + offset + " , headerHeight : " + headerHeight + " , extendHeight : " + extendHeight);
        switch (newState) {
            case None:
            case PullToUpLoad: {
                int index = (int) (percent * 8);
                logoView.setVisibility(VISIBLE);
                progressView.setVisibility(GONE);
                // todo : bugfix
                if (index < frameList.length) {
                    logoView.setImageResource(frameList[index]);
                }
                break;
            }
            case Loading: {

            }
            case ReleaseToLoad: {
                logoView.setVisibility(GONE);
                progressView.setVisibility(VISIBLE);

                Drawable drawable = progressView.getDrawable();
                if (drawable == null) {
                    progressView.setImageResource(R.drawable.kye_loading_anim);
                    AnimationDrawable animationDrawable = (AnimationDrawable) progressView.getDrawable();
                    animationDrawable.start();
                }
            }
        }
    }

    @Override
    public void onPullReleasing(float percent, int offset, int footerHeight, int extendHeight) {

    }

    @Override
    public void onLoadmoreReleased(RefreshLayout layout, int footerHeight, int extendHeight) {

    }

    @Override
    public boolean setLoadmoreFinished(boolean finished) {
        return false;
    }


    @Override
    public void setPrimaryColors(int... colors) {

    }

    @Override
    public void onInitialized(RefreshKernel kernel, int height, int extendHeight) {

    }

    @Override
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {

    }

    @Override
    public void onStartAnimator(RefreshLayout layout, int height, int extendHeight) {

    }

    @Override
    public boolean isSupportHorizontalDrag() {
        return false;
    }

}
