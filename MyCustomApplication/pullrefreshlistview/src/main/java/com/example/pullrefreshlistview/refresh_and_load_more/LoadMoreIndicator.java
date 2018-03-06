package com.example.pullrefreshlistview.refresh_and_load_more;

import android.graphics.PointF;

import com.example.pullrefreshlistview.util.PtrCLog;


/**
 * @version V1.0
 * @Author ly
 * @company 跨越速运
 * @Description
 * @Date 2017/3/25
 */
public class LoadMoreIndicator {

    public final static int POS_START = 0;
    private static final String TAG = LoadMoreIndicator.class.getSimpleName();


    //    是否触摸
    private boolean mIsUnderTouch = false;
    //    是否准备好加载更多
    private boolean mIsPrepareLoadMore = false;
    private int mCurrentPos = 0;
    private int mPressedPos;
    private int mLastPos = 0;

    private PointF mPtLastMove = new PointF();
    private float mOffsetX = 0;
    private float mOffsetY = 0;
    private float mResistance = 1.5f;
    //    footer的高度
    private int mDefaultFooterHeight;
    private float mRatioOfFooterHeightToLoadMore = 1.0f;
    //    加载的高度
    private int mOffsetToLoadMore;


    //   是否准备滑动
    private boolean isPrepareScroll;

    public void onPressDown(float x, float y) {
        mIsUnderTouch = true;
        mPressedPos = mCurrentPos;
        PtrCLog.d(TAG, "MotionEvent.ACTION_DOWN,y==" + y);
        mPtLastMove.set(x, y);
    }

    public final void onMove(float x, float y) {
        float offsetX = x - mPtLastMove.x;
        float offsetY = (y - mPtLastMove.y);
        PtrCLog.d(TAG, "MotionEvent.ACTION_MOVE,y==" + y);
        processOnMove(x, y, offsetX, offsetY);
        mPtLastMove.set(x, y);
    }

    public void setResistance(float resistance) {
        this.mResistance = resistance;
    }

    protected void processOnMove(float currentX, float currentY, float offsetX, float offsetY) {
        setOffset(offsetX, offsetY / mResistance);
    }


    protected void setOffset(float x, float y) {
        mOffsetX = x;
        mOffsetY = y;
    }

    public float getOffsetX() {
        return mOffsetX;
    }

    public float getOffsetY() {
        return mOffsetY;
    }

    /**
     * 设置footer的高度
     *
     * @param height
     */
    public void setFooterHeight(int height) {
        this.mDefaultFooterHeight = height;
        updateFooter();
    }

    /**
     * 更新footer上拉加载的高度
     */
    private void updateFooter() {
        mOffsetToLoadMore = (int) (mRatioOfFooterHeightToLoadMore * mDefaultFooterHeight);
    }

    /**
     * 获取底部默认的高度
     *
     * @return
     */
    public int getDefaultFooterHeight() {
        return mDefaultFooterHeight;
    }

    /**
     * 松开手指
     */
    public void onRelease() {
        mIsUnderTouch = false;
    }

    /**
     * 是否是开始位置
     *
     * @return
     */
    public boolean isInStartPosition() {
        return mCurrentPos == POS_START;
    }

    public int getCurrentPosY() {
        return mCurrentPos;
    }

    /**
     * Update current position before update the UI
     */
    public final void setCurrentPos(int current) {
        mLastPos = mCurrentPos;
        mCurrentPos = current;
    }

    public int getLastPosY() {
        return mLastPos;
    }

    /**
     * 是否触摸屏幕
     *
     * @return
     */
    public boolean isUnderTouch() {
        return mIsUnderTouch;
    }


    /**
     * 是否是刚刚上拉footer
     *
     * @return
     */
    public boolean hasJustLeftStartPosition() {
        return mLastPos == POS_START && hasLeftStartPosition();
    }

    public boolean hasLeftStartPosition() {
        return mCurrentPos > POS_START;
    }

    /**
     * footer是否刚好回到初始位置
     *
     * @return
     */
    public boolean hasJustBackToStartPosition() {
        return mLastPos != POS_START && isInStartPosition();
    }

    /**
     * 是否准备加载更多
     *
     * @param isPrepared
     */
    public void prepareLoadMore(boolean isPrepared) {
        this.mIsPrepareLoadMore = isPrepared;
    }

    /**
     * 是否准备加载更多
     *
     * @return
     */
    public boolean isPrepareLoadMore() {
        return mIsPrepareLoadMore;
    }

    public boolean willOverBottom(int to) {
        return to < POS_START;
    }


    public boolean isAlreadyHere(int to) {
        return mCurrentPos == to;
    }


    public void prepareScroll(boolean isPrepareScroll) {
        this.isPrepareScroll = isPrepareScroll;
    }

    public boolean isPrepareScroll() {
        return isPrepareScroll;
    }

    /**
     * 是否离开press位置
     *
     * @return
     */
    public boolean hasMovedAfterPressedDown() {
        return mPressedPos != mCurrentPos;
    }
}
