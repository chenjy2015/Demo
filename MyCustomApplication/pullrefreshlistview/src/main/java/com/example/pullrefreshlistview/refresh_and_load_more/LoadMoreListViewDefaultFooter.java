/**
 * @file XFooterView.java
 * @create Mar 31, 2012 9:33:43 PM
 * @author Maxwin
 * @description XListView's footer
 */
package com.example.pullrefreshlistview.refresh_and_load_more;


import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pullrefreshlistview.R;
import com.example.pullrefreshlistview.util.SizeUtils;


public class LoadMoreListViewDefaultFooter extends LinearLayout implements FooterUiHandler {
    public final static int STATE_NORMAL = 0;
    public final static int STATE_READY = 1;
    public final static int STATE_LOADING = 2;

    private Context mContext;

    private String mNoMoreHint = "没有更多数据";
    private String mShowMoreHint = "查看更多";

    private View mContentView;
    private ImageView mProgressBar;
    private TextView mHintView;
    private int mDefaultFooterViewHeight;
    private AnimationDrawable animationDrawable;
    private TextView loadingHint;
    private boolean mIsLoadMore = true;//默认为ture

    public LoadMoreListViewDefaultFooter(Context context) {
        super(context);
        mDefaultFooterViewHeight = SizeUtils.dip2px(context, 80);
        initView(context);
    }

    public LoadMoreListViewDefaultFooter(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        initConfig();
    }

    private void initConfig() {
    }


    private void initView(Context context) {
        mContext = context;
        LinearLayout footerView = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.layout_load_more_default_footer, this);
        mContentView = footerView.findViewById(R.id.xlistview_footer_content);
        mProgressBar = (ImageView) footerView.findViewById(R.id.xlistview_footer_progressbar);
        loadingHint = (TextView) footerView.findViewById(R.id.xlistview_footer_loading_hint);//正在加载时的文字提示
        mHintView = (TextView) footerView.findViewById(R.id.xlistview_footer_hint_textview);
        animationDrawable = new AnimationDrawable();
        addFrameAnim();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            mProgressBar.setBackground(animationDrawable);
        } else {
            mProgressBar.setBackgroundDrawable(animationDrawable);
        }
//        获取footer的高度
        post(new Runnable() {
            @Override
            public void run() {
                mDefaultFooterViewHeight = getHeight();
            }
        });
    }


    /**
     * 开始播放
     */
    protected void animStart() {
        if (animationDrawable != null && !animationDrawable.isRunning()) {
            animationDrawable.start();
        }
    }

    /**
     * 停止播放
     */
    protected void animStop() {
        if (animationDrawable != null && animationDrawable.isRunning()) {
            animationDrawable.stop();
        }
    }

    /**
     * hide footer when disable pull load more
     */
    public void hide() {
        setFooterHeight(0);
    }

    /**
     * show footer
     *
     * @param defaultFooterHeight
     */
    public void show(int defaultFooterHeight) {
        setFooterHeight(defaultFooterHeight);
    }


    /*
     * 添加帧动画
    */
    private void addFrameAnim() {
        // 为AnimationDrawable添加动画帧
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p1), 70);
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p2), 70);
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p3), 70);
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p4), 70);
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p5), 70);
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p6), 70);
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p7), 70);
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p8), 70);
        animationDrawable.addFrame(getContext().getResources().getDrawable(R.mipmap.loading_p9), 70);
        animationDrawable.setOneShot(false);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    @Override
    public void onUINoDataToLoad() {
    }

    @Override
    public void onUILoadMorePrepare() {
        animStop();
//        mProgressBar.setVisibility(View.GONE);
//        loadingHint.setVisibility(View.GONE);
        mHintView.setVisibility(View.VISIBLE);
        if (mIsLoadMore) {
            mHintView.setText(mShowMoreHint);
        } else {
            mHintView.setText(mNoMoreHint);
        }
    }

    @Override
    public void onUILoadMoreBegin() {
//        loadingHint.setVisibility(View.INVISIBLE);
//        mProgressBar.setVisibility(View.VISIBLE);
        mHintView.setVisibility(View.INVISIBLE);
        animStart();
    }

    @Override
    public void onUILoadMoreComplete(boolean isSuccess, String hint) {
//        mProgressBar.setVisibility(View.INVISIBLE);
//        loadingHint.setVisibility(View.INVISIBLE);
        mHintView.setVisibility(View.VISIBLE);
        if (mIsLoadMore) {
            if (isSuccess) {
                mHintView.setText(mShowMoreHint);
            } else {
                mHintView.setText(hint);
            }
        } else {
            mHintView.setText(mNoMoreHint);
        }
        animStop();
    }

    @Override
    public void onUIPrepareStateChange() {
    }

    public int getDefaultFooterViewHeight() {
        return mDefaultFooterViewHeight;
    }

    /**
     * 是否能够加载更多数据
     *
     * @param isLoadMore
     */
    public void setLoadMore(boolean isLoadMore) {
        if (mIsLoadMore != isLoadMore) {
            mIsLoadMore = isLoadMore;
            if (mIsLoadMore) {
                mHintView.setText(mShowMoreHint);
            } else {
                mHintView.setText(mNoMoreHint);
            }
        }
    }

    public void setLoadMoreHint(String hint){
        mNoMoreHint = hint;
        mShowMoreHint = hint;
        mHintView.setText(hint);
    }


    public int getFooterHeight() {
        return mContentView.getLayoutParams().height;
    }


    /**
     * 设置footer的高度
     *
     * @param height
     */
    public void setFooterHeight(int height) {
        mContentView.getLayoutParams().height = height;
        mContentView.requestLayout();
    }

    /**
     * 设置footer的高度
     */
    public void setFooterHide() {
        postDelayed(new Runnable() {
            int h = mContentView.getLayoutParams().height;

            @Override
            public void run() {
                int in = h / 10;
                for (int i = 0; i < h; i += in) {
                    mContentView.getLayoutParams().height = i;
                }
                mContentView.getLayoutParams().height = 0;
            }
        }, 100);
        mContentView.requestLayout();
    }

    public void setMarginBottom(int distance) {
        if (distance < 0) {
            return;
        }
//        LayoutParams lp = (LayoutParams) mContentView.getLayoutParams();
        LayoutParams lp = (LayoutParams) mContentView.getLayoutParams();
        lp.bottomMargin = distance;
        mContentView.setLayoutParams(lp);
    }

    public int getMarginBottom() {
        return ((LayoutParams) mContentView.getLayoutParams()).bottomMargin;
    }

}
