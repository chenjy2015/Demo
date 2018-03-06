package com.example.pullrefreshlistview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

public class PtrClassicFrameLayout extends PtrFrameLayout {

    private PtrClassicDefaultHeader mPtrClassicHeader;

    public PtrClassicFrameLayout(Context context) {
        super(context);
        initConfig();
        initViews();
    }

    public PtrClassicFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initConfig();
        initViews();
    }

    private void initConfig() {
        setBackgroundColor(Color.parseColor("#f9f9fb"));
    }

    public PtrClassicFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initViews();
    }

    private void initViews() {
        mPtrClassicHeader = new PtrClassicDefaultHeader(getContext());
        setHeaderView(mPtrClassicHeader);
        addPtrUIHandler(mPtrClassicHeader);
    }

    public PtrClassicDefaultHeader getHeader() {
        return mPtrClassicHeader;
    }

    /**
     * Specify the last update time by this key string
     *
     * @param key
     */
    public void setLastUpdateTimeKey(String key) {
        if (mPtrClassicHeader != null) {
            mPtrClassicHeader.setLastUpdateTimeKey(key);
        }
    }

    /**
     * Using an object to specify the last update time.
     *
     * @param object
     */
    public void setLastUpdateTimeRelateObject(Object object) {
        if (mPtrClassicHeader != null) {
            mPtrClassicHeader.setLastUpdateTimeRelateObject(object);
        }
    }

    public boolean isRefreshing() {
        return mStatus == PTR_STATUS_LOADING;
    }

    public int getDefaultHeaderHeight(){
        return mPtrClassicHeader.getDefaultHeaderHeight();
    }

}
