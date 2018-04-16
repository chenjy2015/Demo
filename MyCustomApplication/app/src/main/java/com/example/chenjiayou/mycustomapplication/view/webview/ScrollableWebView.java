package com.example.chenjiayou.mycustomapplication.view.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/03/2018
 * @updated : 27/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason> 解决webview嵌套scrollview缩放后内容上下滑动冲突
 */

public class ScrollableWebView extends WebView implements View.OnTouchListener {

    public OnScrollChangeListener listener;
    private volatile boolean enableScroll = false;

    public ScrollableWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public ScrollableWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ScrollableWebView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOnTouchListener(this);
    }

    public boolean isEnableScroll() {
        return enableScroll;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        float webcontent = getContentHeight() * getScale();// webview的高度
        float webnow     = getHeight() + getScrollY();// 当前webview的高度
        if (Math.abs(webcontent - webnow) <= 0) {
            enableScroll = false;
            if (listener != null) {
                listener.onPageEnd(l, t, oldl, oldt);
            }
        } else if (getScrollY() <= 0) {
            enableScroll = false;
            if (listener != null) {
                listener.onPageTop(l, t, oldl, oldt);
            }
        } else {
            enableScroll = true;
            if (listener != null) {
                listener.onScrollChanged(l, t, oldl, oldt);
            }
        }
    }

    public void setOnScrollChangeListener(OnScrollChangeListener listener) {
        this.listener = listener;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        ((WebView) v).requestDisallowInterceptTouchEvent(enableScroll);
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    public interface OnScrollChangeListener {

        public void onPageEnd(int l, int t, int oldl, int oldt);

        public void onPageTop(int l, int t, int oldl, int oldt);

        public void onScrollChanged(int l, int t, int oldl, int oldt);

    }
}
