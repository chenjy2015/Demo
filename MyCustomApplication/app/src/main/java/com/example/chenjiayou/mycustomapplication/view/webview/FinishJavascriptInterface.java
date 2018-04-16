package com.example.chenjiayou.mycustomapplication.view.webview;

import android.webkit.JavascriptInterface;

public abstract class FinishJavascriptInterface {
    @JavascriptInterface
    public void finish() {
        onFinish();
    }

    protected abstract void onFinish();
}
