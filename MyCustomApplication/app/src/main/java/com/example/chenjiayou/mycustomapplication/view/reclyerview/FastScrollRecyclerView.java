package com.example.chenjiayou.mycustomapplication.view.reclyerview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class FastScrollRecyclerView extends RecyclerView {

    private boolean move = false;
    private int mIndex = 0;

    private LinearLayoutManager mLinearLayoutManager;
    private GridLayoutManager mGridlayoutManager;
    private Adapter mAdapter;

    public FastScrollRecyclerView(Context context) {
        super(context);
        init();
    }

    public FastScrollRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    @Override
    public void setAdapter(Adapter adapter) {
        super.setAdapter(adapter);
        this.mAdapter = adapter;
    }

    @Override
    public void setLayoutManager(LayoutManager layout) {
        super.setLayoutManager(layout);
        if (layout instanceof LinearLayoutManager) {
            this.mLinearLayoutManager = (LinearLayoutManager) layout;
            this.mGridlayoutManager = null;
        } else if (layout instanceof GridLayoutManager) {
            this.mGridlayoutManager = (GridLayoutManager) layout;
            this.mLinearLayoutManager = null;
        } else {
            throw new IllegalArgumentException("layout mananger failed.");
        }

    }

    private void init() {
        addOnScrollListener(new RecyclerViewListener());
    }

    public void move(int n){
        if (n < 0 || n >= mAdapter.getItemCount() ){
//            Toast.makeText(this,"超出范围了",Toast.LENGTH_SHORT).show();
            return;
        }
        mIndex = n;
        stopScroll();
//        switch (mRadioGroup.getCheckedRadioButtonId()){
//            case R.id.scroll:
//                moveToPosition(n);
//                break;
//            case R.id.smoothScroll:
//                smoothMoveToPosition(n);
//                break;
//        }
        moveToPosition(n);
    }

    private void smoothMoveToPosition(int n) {
        int firstItem = 0;
        int lastItem = 0;
        if (mLinearLayoutManager != null) {
            firstItem = mLinearLayoutManager.findFirstVisibleItemPosition();
            lastItem = mLinearLayoutManager.findLastVisibleItemPosition();
        } else {
            firstItem = mGridlayoutManager.findFirstVisibleItemPosition();
            lastItem = mGridlayoutManager.findLastVisibleItemPosition();
        }

        if (n <= firstItem ){
            smoothScrollToPosition(n);
        }else if ( n <= lastItem ){
            int top = getChildAt(n - firstItem).getTop();
            smoothScrollBy(0, top);
        }else{
            smoothScrollToPosition(n);
            move = true;
        }

    }

    private void moveToPosition(int n) {

        int firstItem = 0;
        int lastItem = 0;
        if (mLinearLayoutManager != null) {
            firstItem = mLinearLayoutManager.findFirstVisibleItemPosition();
            lastItem = mLinearLayoutManager.findLastVisibleItemPosition();
        } else {
            firstItem = mGridlayoutManager.findFirstVisibleItemPosition();
            lastItem = mGridlayoutManager.findLastVisibleItemPosition();
        }

        if (n <= firstItem ){
            scrollToPosition(n);
        }else if ( n <= lastItem ){
            int top = getChildAt(n - firstItem).getTop();
            scrollBy(0, top);
        }else{
            scrollToPosition(n);
            move = true;
        }

    }

    class RecyclerViewListener extends OnScrollListener{
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (move && newState == RecyclerView.SCROLL_STATE_IDLE){
                move = false;
                int n = 0;
                if (mLinearLayoutManager != null) {
                    n = mIndex - mLinearLayoutManager.findFirstVisibleItemPosition();
                } else {
                    n = mIndex - mGridlayoutManager.findFirstVisibleItemPosition();
                }

                if ( 0 <= n && n < getChildCount()){
                    int top = getChildAt(n).getTop();
                    smoothScrollBy(0, top);
                }

            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            if (move){
                move = false;
                int n = 0;
                if (mLinearLayoutManager != null) {
                    n = mIndex - mLinearLayoutManager.findFirstVisibleItemPosition();
                } else {
                    n = mIndex - mGridlayoutManager.findFirstVisibleItemPosition();
                }
                if ( 0 <= n && n < getChildCount()){
                    int top = getChildAt(n).getTop();
                    scrollBy(0, top);
                }
            }
        }
    }
}
