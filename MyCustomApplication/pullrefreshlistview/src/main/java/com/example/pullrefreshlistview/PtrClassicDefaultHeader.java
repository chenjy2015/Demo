package com.example.pullrefreshlistview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.pullrefreshlistview.indicator.PtrIndicator;
import com.example.pullrefreshlistview.util.PtrCLog;
import com.example.pullrefreshlistview.util.SizeUtils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class PtrClassicDefaultHeader extends FrameLayout implements PtrUIHandler {

    private final static String KEY_SharedPreferences = "cube_ptr_classic_last_update";
    private static SimpleDateFormat sDataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int mRotateAniTime = 150;
    private RotateAnimation mFlipAnimation;
    private RotateAnimation mReverseFlipAnimation;
    private TextView mTitleTextView;
    private View mRotateView;
    private View mProgressBar;
    private long mLastUpdateTime = -1;
    //    private TextView mLastUpdateTextView;
    private String mLastUpdateTimeKey;
    private boolean mShouldShowLastUpdate;

    private AnimationDrawable animationDrawable;

    private LastUpdateTimeUpdater mLastUpdateTimeUpdater = new LastUpdateTimeUpdater();
    private ImageView mResultFlagIv;
    //    private int mDefaultHeaderHeight = getResources().getDimensionPixelOffset(R.dimen.w180);
    private int mDefaultHeaderHeight;

    public PtrClassicDefaultHeader(Context context) {
        super(context);
        mDefaultHeaderHeight = SizeUtils.dip2px(context, 80);
        initViews(null);
    }

    public PtrClassicDefaultHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        mDefaultHeaderHeight = SizeUtils.dip2px(context, 80);
        initViews(attrs);
    }

    public PtrClassicDefaultHeader(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mDefaultHeaderHeight = SizeUtils.dip2px(context, 80);
        initViews(attrs);
    }

    protected void initViews(AttributeSet attrs) {
        TypedArray arr = getContext().obtainStyledAttributes(attrs, R.styleable.PtrClassicHeader, 0, 0);
        if (arr != null) {
            mRotateAniTime = arr.getInt(R.styleable.PtrClassicHeader_ptr_rotate_ani_time, mRotateAniTime);
        }
        buildAnimation();
        View header = LayoutInflater.from(getContext()).inflate(R.layout.cube_ptr_classic_default_header, this);

        mRotateView = header.findViewById(R.id.ptr_classic_header_rotate_view);

        mTitleTextView = (TextView) header.findViewById(R.id.ptr_classic_header_rotate_view_header_title);
//        成功图片
        mResultFlagIv = (ImageView) header.findViewById(R.id.ptr_classic_header_refresh_result_flag);

//        mLastUpdateTextView = (TextView) header.findViewById(R.id.ptr_classic_header_rotate_view_header_last_update);
//        mProgressBar = header.findViewById(R.id.ptr_classic_header_rotate_view_progressbar);
        mProgressBar = header.findViewById(R.id.header_progressbar);

        //        progress帧动画
        animationDrawable = new AnimationDrawable();
        addFrameAnim();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            mProgressBar.setBackground(animationDrawable);
        } else {
            mProgressBar.setBackgroundDrawable(animationDrawable);
        }

        post(new Runnable() {
            @Override
            public void run() {
                mDefaultHeaderHeight = getHeight();
            }
        });
        resetView();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mLastUpdateTimeUpdater != null) {
            mLastUpdateTimeUpdater.stop();
        }
    }

    public void setRotateAniTime(int time) {
        if (time == mRotateAniTime || time == 0) {
            return;
        }
        mRotateAniTime = time;
        buildAnimation();
    }

    /**
     * Specify the last update time by this key string
     *
     * @param key
     */
    public void setLastUpdateTimeKey(String key) {
        if (TextUtils.isEmpty(key)) {
            return;
        }
        mLastUpdateTimeKey = key;
    }

    /**
     * Using an object to specify the last update time.
     *
     * @param object
     */
    public void setLastUpdateTimeRelateObject(Object object) {
        setLastUpdateTimeKey(object.getClass().getName());
    }

    private void buildAnimation() {
        mFlipAnimation = new RotateAnimation(0, -180, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        mFlipAnimation.setInterpolator(new LinearInterpolator());
        mFlipAnimation.setDuration(mRotateAniTime);
        mFlipAnimation.setFillAfter(true);

        mReverseFlipAnimation = new RotateAnimation(-180, 0, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        mReverseFlipAnimation.setInterpolator(new LinearInterpolator());
        mReverseFlipAnimation.setDuration(mRotateAniTime);
        mReverseFlipAnimation.setFillAfter(true);
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

    /**
     * 开始播放
     */
    protected void animStart() {
        if (animationDrawable != null && !animationDrawable.isRunning()) {
            PtrCLog.d("111", "小人跑");
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

    private void resetView() {
        hideRotateView();
        mProgressBar.setVisibility(INVISIBLE);
    }

    private void hideRotateView() {
        mRotateView.clearAnimation();
        mRotateView.setVisibility(INVISIBLE);
    }

    @Override
    public void onUIReset(PtrFrameLayout frame) {
        resetView();
        mShouldShowLastUpdate = true;
//        tryUpdateLastUpdateTime();
    }

    @Override
    public void onUIRefreshPrepare(PtrFrameLayout frame) {

        mShouldShowLastUpdate = true;
//        tryUpdateLastUpdateTime();
//        mLastUpdateTimeUpdater.start();

        mProgressBar.setVisibility(INVISIBLE);
        mResultFlagIv.setVisibility(INVISIBLE);
        mRotateView.setVisibility(VISIBLE);
        mTitleTextView.setVisibility(VISIBLE);
        mTitleTextView.setText(getResources().getString(R.string.cube_ptr_pull_down_to_refresh));
//        if (frame.isPullToRefresh()) {
//            mTitleTextView.setText(getResources().getString(R.string.cube_ptr_pull_down_to_refresh));
//        } else {
//            mTitleTextView.setText(getResources().getString(R.string.cube_ptr_pull_down));
//        }
    }

    @Override
    public void onUIRefreshBegin(PtrFrameLayout frame) {
        mShouldShowLastUpdate = false;
        hideRotateView();
        mProgressBar.setVisibility(VISIBLE);
        mTitleTextView.setVisibility(VISIBLE);
        mResultFlagIv.setVisibility(INVISIBLE);
        mTitleTextView.setText(R.string.cube_ptr_refreshing);
        animStart();
//        tryUpdateLastUpdateTime();
//        mLastUpdateTimeUpdater.stop();
    }

    @Override
    public void onUIRefreshComplete(PtrFrameLayout frame, boolean isRefreshSuccess) {

        hideRotateView();
        mProgressBar.setVisibility(INVISIBLE);
        mTitleTextView.setVisibility(VISIBLE);
        if (isRefreshSuccess) {
            mTitleTextView.setText(getResources().getString(R.string.cube_ptr_refresh_complete));
            mResultFlagIv.setImageResource(R.mipmap.icon_header_refresh_success);
        } else {
            mTitleTextView.setText("刷新失败");
            mResultFlagIv.setImageResource(R.mipmap.icon_header_refresh_failure);
        }
        mResultFlagIv.setVisibility(VISIBLE);
        animStop();

        // update last update time
//        SharedPreferences sharedPreferences = getContext().getSharedPreferences(KEY_SharedPreferences, 0);
//        if (!TextUtils.isEmpty(mLastUpdateTimeKey)) {
//            mLastUpdateTime = new Date().getTime();
//            sharedPreferences.edit().putLong(mLastUpdateTimeKey, mLastUpdateTime).commit();
//        }
    }

    private void tryUpdateLastUpdateTime() {
        if (TextUtils.isEmpty(mLastUpdateTimeKey) || !mShouldShowLastUpdate) {
//            mLastUpdateTextView.setVisibility(GONE);
        } else {
            String time = getLastUpdateTime();
            if (TextUtils.isEmpty(time)) {
//                mLastUpdateTextView.setVisibility(GONE);
            } else {
//                mLastUpdateTextView.setVisibility(VISIBLE);
//                mLastUpdateTextView.setText(time);
            }
        }
    }

    private String getLastUpdateTime() {

        if (mLastUpdateTime == -1 && !TextUtils.isEmpty(mLastUpdateTimeKey)) {
            mLastUpdateTime = getContext().getSharedPreferences(KEY_SharedPreferences, 0).getLong(mLastUpdateTimeKey, -1);
        }
        if (mLastUpdateTime == -1) {
            return null;
        }
        long diffTime = new Date().getTime() - mLastUpdateTime;
        int seconds = (int) (diffTime / 1000);
        if (diffTime < 0) {
            return null;
        }
        if (seconds <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R.string.cube_ptr_last_update));

        if (seconds < 60) {
            sb.append(seconds + getContext().getString(R.string.cube_ptr_seconds_ago));
        } else {
            int minutes = (seconds / 60);
            if (minutes > 60) {
                int hours = minutes / 60;
                if (hours > 24) {
                    Date date = new Date(mLastUpdateTime);
                    sb.append(sDataFormat.format(date));
                } else {
                    sb.append(hours + getContext().getString(R.string.cube_ptr_hours_ago));
                }

            } else {
                sb.append(minutes + getContext().getString(R.string.cube_ptr_minutes_ago));
            }
        }
        return sb.toString();
    }

    @Override
    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator) {

        final int mOffsetToRefresh = frame.getOffsetToRefresh();
        final int currentPos = ptrIndicator.getCurrentPosY();
        final int lastPos = ptrIndicator.getLastPosY();

        if (currentPos < mOffsetToRefresh && lastPos >= mOffsetToRefresh) {
            if (isUnderTouch && status == PtrFrameLayout.PTR_STATUS_PREPARE) {
                crossRotateLineFromBottomUnderTouch(frame);
                if (mRotateView != null) {
                    mRotateView.clearAnimation();
                    mRotateView.startAnimation(mReverseFlipAnimation);
                }
            }
        } else if (currentPos > mOffsetToRefresh && lastPos <= mOffsetToRefresh) {
            if (isUnderTouch && status == PtrFrameLayout.PTR_STATUS_PREPARE) {
                crossRotateLineFromTopUnderTouch(frame);
                if (mRotateView != null) {
                    mRotateView.clearAnimation();
                    mRotateView.startAnimation(mFlipAnimation);
                }
            }
        }
    }

    private void crossRotateLineFromTopUnderTouch(PtrFrameLayout frame) {
        if (!frame.isPullToRefresh()) {
            mTitleTextView.setVisibility(VISIBLE);
            mResultFlagIv.setVisibility(INVISIBLE);
            mTitleTextView.setText(R.string.cube_ptr_release_to_refresh);
        }
    }

    private void crossRotateLineFromBottomUnderTouch(PtrFrameLayout frame) {
        mTitleTextView.setVisibility(VISIBLE);
        mResultFlagIv.setVisibility(INVISIBLE);
        if (frame.isPullToRefresh()) {
            mTitleTextView.setText("下拉");
        } else {
            mTitleTextView.setText(getResources().getString(R.string.cube_ptr_pull_down_to_refresh));
        }
    }

    private class LastUpdateTimeUpdater implements Runnable {

        private boolean mRunning = false;

        private void start() {
            if (TextUtils.isEmpty(mLastUpdateTimeKey)) {
                return;
            }
            mRunning = true;
            run();
        }

        private void stop() {
            mRunning = false;
            removeCallbacks(this);
        }

        @Override
        public void run() {
            tryUpdateLastUpdateTime();
            if (mRunning) {
                postDelayed(this, 1000);
            }
        }
    }

    public int getDefaultHeaderHeight() {
        return mDefaultHeaderHeight;
    }
}
