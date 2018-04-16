package com.example.chenjiayou.mycustomapplication.view.refreshAndLoad;

import android.annotation.SuppressLint;
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
import android.widget.ProgressBar;
import android.widget.TextView;

import com.kye.express.R;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/12/2017
 * @updated : 19/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 * <p>
 * 自定义刷新头，下拉小人跑动样式
 */

public class KyeRefreshHeader extends FrameLayout implements RefreshHeader {

    private static final String TAG = KyeRefreshHeader.class.getSimpleName();
    protected LinearLayout textContainer;
    protected ImageView logoView;
    protected ImageView progressView;
    @Deprecated
    protected ProgressBar ivProgress;

    protected TextView titleView;
    protected TextView dateView;

    @SuppressLint("SimpleDateFormat")
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd HH:mm");

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
    protected RefreshState oldState, newState;
    // todo : 上次刷新时间
    protected long refreshDate;
    RefreshLayout refreshLayout;

    public KyeRefreshHeader(@NonNull Context context) {
        super(context, null, 0);
        initView();
    }

    public KyeRefreshHeader(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
        initView();
    }

    public KyeRefreshHeader(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.kye_refresh_header_layout, this, false);
        ivProgress = view.findViewById(R.id.pbProgress);
        textContainer = view.findViewById(R.id.llContainer);
        logoView = view.findViewById(R.id.ivLogo);
        progressView = view.findViewById(R.id.ivProgress);
        titleView = view.findViewById(R.id.tvTitle);
        dateView = view.findViewById(R.id.tvDate);
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
        this.refreshLayout = refreshLayout;
        this.oldState = oldState;
        this.newState = newState;
//        E yyyy.MM.dd hh:mm:ss a zzz
        String updateDate = dateFormat.format(new Date(refreshDate));
        dateView.setText("最后更新: " + updateDate);
        switch (newState) {
            case None:
            case PullDownToRefresh:
                titleView.setText("下拉开始刷新");
                break;
            case Refreshing:
                titleView.setText("正在刷新");
                break;
            case ReleaseToRefresh:
                titleView.setText("释放立即刷新");
                break;
        }
    }

    @Override
    public int onFinish(RefreshLayout layout, boolean success) {
//        Log.d(TAG, "onFinish");
        if (success) {
            titleView.setText("刷新完成");
        } else {
            titleView.setText("刷新失败");
        }
        refreshDate = System.currentTimeMillis();
        dateView.setVisibility(refreshDate > 0 ? VISIBLE : GONE);
        return 500;//延迟500毫秒之后再弹回
    }

    @Override
    public void setPrimaryColors(int... colors) {

    }

    @Override
    public void onPullingDown(float percent, int offset, int headerHeight, int extendHeight) {
        if (refreshLayout != null && !refreshLayout.isEnableRefresh()) {
            return ;
        }
        if (newState == null) {
            return;
        }
//        Log.d(TAG, "onPullingDown : percent : " + percent + " , offset : " + offset + " , headerHeight : " + headerHeight + " , extendHeight : " + extendHeight);
        switch (newState) {
            case None:
            case PullDownToRefresh: {
                /**
                 * 下拉未到释放状态读取显示每帧动画
                 */
                int index = (int) (percent * 8);
                logoView.setVisibility(VISIBLE);
//                ivProgress.setVisibility(GONE);
                progressView.setVisibility(GONE);
                if (index < frameList.length) {
                    logoView.setImageResource(frameList[index]);
                }
                break;
            }
            case Refreshing: {

            }
            case ReleaseToRefresh: {
                /**
                 * 待释放刷新，显示轮播动画
                 */
                logoView.setVisibility(GONE);
//                ivProgress.setVisibility(VISIBLE);
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
    public void onReleasing(float percent, int offset, int headerHeight, int extendHeight) {
//        Log.d(TAG, "onReleasing : percent : " + percent + " , offset : " + offset + " , headerHeight : " + headerHeight + " , extendHeight : " + extendHeight);
    }

    @Override
    public void onRefreshReleased(RefreshLayout layout, int headerHeight, int extendHeight) {
//        Log.d(TAG, "onRefreshReleased : headerHeight : " + headerHeight + " , extendHeight : " + extendHeight);
    }

    @Override
    public void onInitialized(RefreshKernel kernel, int height, int extendHeight) {
//        Log.d(TAG, "onInitialized : height : " + height + " , extendHeight : " + extendHeight);
    }

    @Override
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
//        Log.d(TAG, "onHorizontalDrag : " + percentX + " , " + offsetX + " , " + offsetMax);
    }

    @Override
    public void onStartAnimator(RefreshLayout layout, int height, int extendHeight) {
//        Log.d(TAG, "onStartAnimator : height : " + height + " , extendHeight : " + extendHeight);
    }

    @Override
    public boolean isSupportHorizontalDrag() {
        return false;
    }

}
