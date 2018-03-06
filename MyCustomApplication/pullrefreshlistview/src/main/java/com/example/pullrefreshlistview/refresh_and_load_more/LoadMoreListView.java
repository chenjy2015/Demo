/**
 * @file XListView.java
 * @package me.maxwin.view
 * @create Mar 18, 2012 6:28:41 PMXLi
 * @author Maxwin
 * @description An ListView support (a) Pull down to refresh, (b) Pull up to load more.
 */
package com.example.pullrefreshlistview.refresh_and_load_more;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Scroller;

import com.example.pullrefreshlistview.util.PtrCLog;


public class LoadMoreListView extends ListView {

    private static final String TAG = LoadMoreListView.class.getSimpleName();

    protected byte mStatus = STATUS_INIT;
    public final static byte STATUS_INIT = 1;
    public final static byte STATUS_LOADING = 2;
    public final static byte STATUS_COMPLETE = 3;


    private OnScrollListener mScrollListener; // user's scroll listener

    //  listview的加载监听
    private LoadMoreCallBack mCallBack;

    // -- footer view
    private LoadMoreListViewDefaultFooter mFooterView;
    public boolean mEnablePullLoad = true;//是否可以加载更多

    // total list items, used to detect is at the bottom of listview.
    private int mTotalItemCount;


    //   存储参数的类
    private LoadMoreIndicator mLoadMoreIndicator;


    private boolean mIsLoadMore = true;
    //    滚动
    private ScrollChecker mScrollChecker;
    private boolean isBoottom;
    private int mScrollState;
    private int mTopPaddingTopOffset = 0;
    //    上拉的阻尼
    private float mResistance = 2.0f;
    //    最少加载时间
    private int mLoadingMinTime = 500;
    //    开始加载时间
    private long mLoadingStartTime = 0;
    private int mWindowHeight;
    //    一屏的item数目,默认为10
    private int MIN_ITEM_COUNT = 10;
    //    footer从显示到隐藏需要的时间
    private int mFooterScrollBackDuration = 500;

    private Runnable mFooterScrollBackRunable = new Runnable() {
        @Override
        public void run() {
            if (isBoottom && !mLoadMoreIndicator.isUnderTouch() && mLoadMoreIndicator.isInStartPosition()) {
                footerScrollBack(mFooterScrollBackDuration);
            }
        }
    };

    private Runnable mAfterCompleteFooterScrollBackRunable = new Runnable() {
        @Override
        public void run() {
            if (mLoadMoreIndicator.isInStartPosition() & !mIsViewDestroy) {
                if (isBoottom && !mLoadMoreIndicator.isUnderTouch()) {
                    PtrCLog.d(TAG, "footer开始回滚");
                    footerScrollBack(mFooterScrollBackDuration);
                    resetStatus(mFooterScrollBackDuration - 200);
                } else {
                    resetStatus(0);
                }
            }
        }
    };

    private Runnable mPerformCompleteLoadMoreDelay = new Runnable() {
        @Override
        public void run() {
            performCompleteLoadMore(mIsLoadMoreSuccess, mHint);
        }
    };


    //  是否释放将cancel event传递给child
    private boolean mHasSendCancelEvent = false;
    private MotionEvent mLastMoveEvent;
    private ViewGroup mParentView;
    private int mHeight;
    //    View是否被清除(Fragment切换)
    private boolean mIsViewDestroy = false;
    private boolean mIsLoadMoreSuccess;
    private String mHint;

    /**
     * @param context
     */
    public LoadMoreListView(Context context) {
        this(context, null);
    }

    public LoadMoreListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadMoreListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
        initView();
        initEvent();
        initCongig();
    }

    private void initCongig() {


        DisplayMetrics metric = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(metric);
        // 屏幕高度（像素）
        mWindowHeight = metric.heightPixels;
        PtrCLog.d(TAG, "屏幕的高度==" + mWindowHeight);


//      footer没有点击事件
        setFooterDividersEnabled(true);
        mFooterView.setOnClickListener(null);
    }

    private void init() {

        mLoadMoreIndicator = new LoadMoreIndicator();

        mScrollChecker = new ScrollChecker();

        mLoadMoreIndicator.setResistance(mResistance);

    }


    private void initView() {
        mFooterView = new LoadMoreListViewDefaultFooter(getContext());
        mLoadMoreIndicator.setFooterHeight(mFooterView.getDefaultFooterViewHeight());
        if (getFooterViewsCount() == 0) {
            addFooterView(mFooterView);
        }


//        mFooterView.hide();
    }


    private void initEvent() {
        setOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                //停止滑动
                mScrollState = OnScrollListener.SCROLL_STATE_IDLE;
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, final int totalItemCount) {
//                是否到达footer
                isBoottom = totalItemCount == firstVisibleItem + visibleItemCount;
                mTotalItemCount = totalItemCount;
                if (totalItemCount > 1 && mScrollState == OnScrollListener.SCROLL_STATE_IDLE) {
                    if (mEnablePullLoad && mStatus == STATUS_INIT && isBoottom && !mLoadMoreIndicator.isUnderTouch() &&
                            mLoadMoreIndicator.isPrepareLoadMore() && mLoadMoreIndicator.isPrepareScroll()) {
                        PtrCLog.d(TAG, "scroll加载");
                        onRelease(true);
                    }
                }
            }
        });

    }


    /**
     * 是否能够加载更多
     *
     * @param enable
     */
    public void setPullLoadEnable(boolean enable) {
        if (mEnablePullLoad != enable) {
            mEnablePullLoad = enable;
            if (mEnablePullLoad) {
                mFooterView.show(mLoadMoreIndicator.getDefaultFooterHeight());
            } else {
                mFooterView.hide();
            }
        }
    }


    /**
     * stop load more
     */
    public void completeLoadMore(final boolean isSuccess, final String hint) {
        int delay = (int) (mLoadingMinTime - (System.currentTimeMillis() - mLoadingStartTime));
        if (delay <= 0) {
            performCompleteLoadMore(isSuccess, hint);
        } else {
            mIsLoadMoreSuccess = isSuccess;
            mHint = hint;
            postDelayed(mPerformCompleteLoadMoreDelay, delay);
        }
    }

    private void performCompleteLoadMore(boolean isSuccess, String hint) {
        PtrCLog.d(TAG, "结束加载");
        if (mStatus == STATUS_LOADING && mEnablePullLoad) {
            notifyUIRefreshComplete(isSuccess, hint);
        } else if (mStatus == STATUS_INIT) {
            onRelease(false);
        }
    }

    /**
     * UI刷新完成
     *
     * @param isSuccess
     * @param hint
     */
    private void notifyUIRefreshComplete(boolean isSuccess, String hint) {
        mStatus = STATUS_COMPLETE;
        if (!isSuccess) {//刷新失败
            mFooterView.onUILoadMoreComplete(isSuccess, hint);
            tryBackFooterAfterComplete();
            return;
        }
//        刷新成功
        resetStatus(0);
        if (!mIsLoadMore) {//不能加载更多
            onRelease(false);
        }
    }

    //结束后回滚
    private void tryBackFooterAfterComplete() {
        onRelease(false);
    }

    private void performFooterBackAfterComplete() {
        if (isBoottom) {
            if (!mLoadMoreIndicator.isUnderTouch() && mLoadMoreIndicator.isInStartPosition() && !mIsViewDestroy) {
                postDelayed(mAfterCompleteFooterScrollBackRunable, 1000);
            }
        } else {
            resetStatus(0);
        }
    }

    private void resetStatus(int duaration) {
        if (mStatus == STATUS_COMPLETE || mStatus == STATUS_LOADING) {
            postDelayed(new Runnable() {
                @Override
                public void run() {
                    mFooterView.onUILoadMorePrepare();
                    mStatus = STATUS_INIT;
                }
            }, duaration);
        }
    }

    /**
     * 加载失败延时隐藏底部
     */
    private void footerScrollBack(int Duration) {

        int footViewLocationY = getFootViewLocationY();
//        Fragment切换时调用onDestroyView方法,footView测量高度为0
        if (footViewLocationY == 0) {
            removeFooterView(mFooterView);
            addFooterView(mFooterView);
            footViewLocationY = getFootViewLocationY();
        }
//        LogOut.d(TAG, "Scroll Back时,footer的y坐标==" + footViewLocationY);
//        int offestY = ViewUtils.getDimenPx(R.dimen.h5);
//        smoothScrollBy(footViewLocationY - mWindowHeight - offestY, Duration);
        int endY = getLocationStartY() + mHeight;
        PtrCLog.d(TAG, "Scroll Back时,mStartY==" + getLocationStartY() +
                "...mHeight==" + mHeight +
                "...footViewLocationY==" + footViewLocationY);
        if (footViewLocationY < endY && getLocationStartY() != 0 && footViewLocationY != 0) {
            smoothScrollBy(footViewLocationY - endY, Duration);
        }
    }

    public int getLocationStartY() {
        int[] location = new int[2];
        getLocationOnScreen(location);
        return location[1];
    }

    /**
     * 获取footer控件左上角在屏幕的y轴坐标(绝对坐标)
     */
    private int getFootViewLocationY() {
        int[] location = new int[2];
        mFooterView.getLocationOnScreen(location);
        return location[1];
    }


    private void movePos(float deltaY) {
        if (deltaY < 0 && mLoadMoreIndicator.isInStartPosition()) {
            PtrCLog.d(TAG, "已经到达底部");
            return;
        }
        if (deltaY == 0) {
            PtrCLog.d(TAG, "不刷新页面");
            return;
        }

        int to = mLoadMoreIndicator.getCurrentPosY() + (int) deltaY;
        if (mLoadMoreIndicator.willOverBottom(to)) {
            to = mLoadMoreIndicator.POS_START;
        }

        mLoadMoreIndicator.setCurrentPos(to);
        int change = to - mLoadMoreIndicator.getLastPosY();
        updatePos(change);

    }

    private void updatePos(int change) {
//        ObjectAnimator.ofInt(mFooterView, "marginBottom", to).setDuration(0).start();
        if (change == 0) {
            return;
        }

        if (mLoadMoreIndicator.isUnderTouch() && !mHasSendCancelEvent && mLoadMoreIndicator.hasMovedAfterPressedDown()) {
            mHasSendCancelEvent = true;
            sendCancelEvent();
        }

        if (mLoadMoreIndicator.hasJustBackToStartPosition() && mLoadMoreIndicator.isUnderTouch()) {
            sendDownEvent();
        }

        PtrCLog.d(TAG, "updatePos....change==" + change +
                "....currentPos==" + mLoadMoreIndicator.getCurrentPosY() +
                "....lastPos==" + mLoadMoreIndicator.getLastPosY());

        offsetTopAndBottom(-change);
        invalidate();
    }

    /**
     * 将CancelEvnent传递给child
     */
    private void sendCancelEvent() {
        if (mLastMoveEvent == null) {
            return;
        }
        MotionEvent last = mLastMoveEvent;
        MotionEvent e = MotionEvent.obtain(last.getDownTime(), last.getEventTime() + ViewConfiguration.getLongPressTimeout(), MotionEvent.ACTION_CANCEL, last.getX(), last.getY(), last.getMetaState());
        dispatchTouchEventSupper(e);
    }

    /**
     * 将DownEvent传递给child
     */
    private void sendDownEvent() {
        if (mLastMoveEvent == null) {
            return;
        }
        final MotionEvent last = mLastMoveEvent;
        MotionEvent e = MotionEvent.obtain(last.getDownTime(), last.getEventTime(), MotionEvent.ACTION_DOWN, last.getX(), last.getY(), last.getMetaState());
        dispatchTouchEventSupper(e);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mLoadMoreIndicator.onPressDown(ev.getRawX(), ev.getRawY());
                mLoadMoreIndicator.prepareScroll(true);
                mHasSendCancelEvent = false;
                mScrollChecker.abortIfWorking();
//                删除回滚效果(没有更多的情况)
                removeCallbacks(mFooterScrollBackRunable);
                removeCallbacks(mAfterCompleteFooterScrollBackRunable);
//                准备加载更多
                mLoadMoreIndicator.prepareLoadMore(true);
                break;
            case MotionEvent.ACTION_MOVE:
                mLastMoveEvent = ev;
                mLoadMoreIndicator.onMove(ev.getRawX(), ev.getRawY());
                float offsetY = mLoadMoreIndicator.getOffsetY();
                boolean moveDown = offsetY > 0;
                boolean moveUp = !moveDown;//是否上拉

                boolean canFooterMoveUp = !this.canScrollVertically(1);


                PtrCLog.d(TAG, "MotionEvent....offsetY==" + offsetY +
                        "....currentPos==" + mLoadMoreIndicator.getCurrentPosY() +
                        "....lastPos==" + mLoadMoreIndicator.getLastPosY() +
                        "....moveUp==" + moveUp +
                        "....canFooterMoveUp==" + canFooterMoveUp +
                        "....moveDown==" + moveDown);

                if (moveUp && !canFooterMoveUp) {//ListView自身可以刷新
                    return dispatchTouchEventSupper(ev);
                }
                if (((moveUp || (moveDown && mLoadMoreIndicator.hasLeftStartPosition())) && mEnablePullLoad)
                        && mStatus == STATUS_INIT) {
                    movePos(-offsetY);
                    return false;
                }
                break;
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                mLoadMoreIndicator.onRelease();
////                释放手指
                onRelease(false);

                if (mLoadMoreIndicator.hasMovedAfterPressedDown()) {
                    sendCancelEvent();
                    return true;
                }
                break;
        }
        return dispatchTouchEventSupper(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:

                break;
            case MotionEvent.ACTION_MOVE:
                break;

            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:

                break;
            default:
                break;
        }
        return super.onTouchEvent(ev);
    }


    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        mHeight = getHeight();


    }

    /**
     * 加载更多
     */
    private void tryToLoadMore() {
        mLoadingStartTime = System.currentTimeMillis();
        mStatus = STATUS_LOADING;
        mLoadMoreIndicator.prepareLoadMore(false);
        mFooterView.onUILoadMoreBegin();
        if (mCallBack != null) {
            mCallBack.onLoadMore();
        }
    }

    public boolean dispatchTouchEventSupper(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 释放手指
     *
     * @param isScroll
     */
    private void onRelease(boolean isScroll) {
        PtrCLog.d(TAG, "onRelease(释放),isScroll==" + isScroll);
        if (isBoottom) {
            mLoadMoreIndicator.prepareScroll(false);
        }

        if (mEnablePullLoad && !mLoadMoreIndicator.isUnderTouch()
                && mLoadMoreIndicator.isPrepareLoadMore() && mIsLoadMore && mStatus == STATUS_INIT) {
            if (isBoottom) {
                mFooterView.onUILoadMoreBegin();
            } else {
                mFooterView.onUILoadMorePrepare();
            }
        }

        if (mLoadMoreIndicator.hasLeftStartPosition()) {
            mScrollChecker.tryToScrollTo(mLoadMoreIndicator.POS_START, 500);
        } else {
            if (mStatus == STATUS_INIT) {
                if (isBoottom) {
                    //                开始加载
                    if (mEnablePullLoad && !mLoadMoreIndicator.isUnderTouch()
                            && mLoadMoreIndicator.isPrepareLoadMore() && mIsLoadMore) {
                        PtrCLog.d(TAG, "开始加载");
                        tryToLoadMore();
                    }
                    if (mEnablePullLoad && !mIsLoadMore && !mLoadMoreIndicator.isUnderTouch() && mLoadMoreIndicator.isInStartPosition()) {//没有更多数据的时候
                        postDelayed(mFooterScrollBackRunable, 1000);
                    }
                } else {
                    if (mEnablePullLoad && !mIsLoadMore && !mLoadMoreIndicator.isUnderTouch()) {
                        mFooterView.onUILoadMorePrepare();
                    }
                }
            } else if (mStatus == STATUS_LOADING) {

            } else if (mStatus == STATUS_COMPLETE) {
                performFooterBackAfterComplete();
            }
        }
    }


    @Override
    public void setOnScrollListener(OnScrollListener listener) {
        mScrollListener = listener;
        super.setOnScrollListener(listener);
    }

    public void setOnLoadMoreCallBack(LoadMoreCallBack callBack) {
        mCallBack = callBack;
    }

    /**
     * 是否还有更多数据加载
     *
     * @param isLoadMore
     * @param i
     */
    public void setLoadMore(boolean isLoadMore, int i) {
        mIsLoadMore = isLoadMore;
        mFooterView.setLoadMore(isLoadMore);
        if (isLoadMore) {
            setPullLoadEnable(true);
        } else {
            if (i > MIN_ITEM_COUNT) {//只有一页数据,且超过一个屏幕
                setPullLoadEnable(true);
                return;
            }
            if (getAdapter() == null || (getAdapter().getCount() + i) <= MIN_ITEM_COUNT) {
                setPullLoadEnable(false);
            }
        }
    }

    /**
     * 少于count条时,不显示footer
     *
     * @param count
     */
    public void setMinItemCount(int count) {
        this.MIN_ITEM_COUNT = count;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PtrCLog.d(TAG, "listview onDetachedFromWindow");
        mIsViewDestroy = true;
        if (mScrollChecker != null) {
            mScrollChecker.destroy();
        }

        if (mFooterScrollBackRunable != null) {
            removeCallbacks(mFooterScrollBackRunable);
        }
        if (mAfterCompleteFooterScrollBackRunable != null) {
            removeCallbacks(mAfterCompleteFooterScrollBackRunable);
        }

        if (mPerformCompleteLoadMoreDelay != null) {
            removeCallbacks(mPerformCompleteLoadMoreDelay);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mIsViewDestroy = false;
        PtrCLog.d(TAG, "listview onAttachedToWindow");
        if (mLoadMoreIndicator.hasLeftStartPosition() || isBoottom) {
            onRelease(false);
        }
    }

    public void setTopPaddingOffeset(int defaultHeaderHeight) {
        this.mTopPaddingTopOffset = defaultHeaderHeight;
    }


    /**
     * implements this interface to get refresh/load more event.
     */
    public interface LoadMoreCallBack {
        void onLoadMore();
    }

    class ScrollChecker implements Runnable {

        private int mLastFlingY;
        private Scroller mScroller;
        private boolean mIsRunning = false;
        private int mStart;
        private int mTo;

        public ScrollChecker() {
            mScroller = new Scroller(getContext());
        }

        public void run() {
            boolean finish = !mScroller.computeScrollOffset() || mScroller.isFinished();
            int curY = mScroller.getCurrY();
            int deltaY = curY - mLastFlingY;
            PtrCLog.d(TAG, "Scroller开始运行");

            if (finish && mLoadMoreIndicator.hasLeftStartPosition() && mLoadMoreIndicator.getCurrentPosY() > mTo) {
                movePos(mTo - mLoadMoreIndicator.getCurrentPosY());
                post(this);
                return;
            }

            PtrCLog.d(TAG, "Scroller....curY==" + curY +
                    "....mLastFlingY==" + mLastFlingY +
                    "....deltaY==" + deltaY +
                    "....currentPos==" + mLoadMoreIndicator.getCurrentPosY() +
                    "....lastPos==" + mLoadMoreIndicator.getLastPosY() +
                    "....finish==" + finish);

            if (!finish && mLoadMoreIndicator.hasLeftStartPosition()) {
                mLastFlingY = curY;
                movePos(deltaY);
                post(this);
            } else {
                PtrCLog.d(TAG, "Scrollerback结束");
                finish();
            }
        }

        private void finish() {

            reset();
//
            onScrollFinish();
        }

        private void reset() {
            mIsRunning = false;
            mLastFlingY = 0;
            removeCallbacks(this);
        }

        private void destroy() {
            reset();
            if (!mScroller.isFinished()) {
                mScroller.forceFinished(true);
            }
        }

        public void abortIfWorking() {
            if (mIsRunning) {
                if (!mScroller.isFinished()) {
                    mScroller.forceFinished(true);
                }
                onScrollAbort();
                reset();
            }
        }

        public void tryToScrollTo(int to, int duration) {
            if (mLoadMoreIndicator.isAlreadyHere(to)) {
                return;
            }
            mStart = mLoadMoreIndicator.getCurrentPosY();
            mTo = to;
            int distance = to - mStart;
            PtrCLog.d(TAG, "tryToScrollTo: start:" + mStart + ", distance:" + distance + ", to:" + to);
            removeCallbacks(this);

            mLastFlingY = 0;

            // fix #47: Scroller should be reused, https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh/issues/47
            if (!mScroller.isFinished()) {
                mScroller.forceFinished(true);
            }
            mScroller.startScroll(0, 0, 0, distance, duration);
            post(this);
            mIsRunning = true;
        }
    }

    @Override
    public void setAdapter(ListAdapter adapter) {
        super.setAdapter(adapter);
        if (adapter != null && adapter.getCount() < MIN_ITEM_COUNT) {
            setPullLoadEnable(false);
        }
    }

    private void onScrollFinish() {
        onRelease(true);
    }

    private void onScrollAbort() {
        onRelease(true);
    }

    /**
     * 上拉加载更多提示语设置
     * @param hint
     */
    public void setLoadMoreHint(String hint){
        mFooterView.setLoadMoreHint(hint);
    }
}
