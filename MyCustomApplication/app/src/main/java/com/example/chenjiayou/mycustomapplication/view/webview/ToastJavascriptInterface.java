package com.example.chenjiayou.mycustomapplication.view.webview;

import android.webkit.JavascriptInterface;

import com.kye.express.view.ToastManager;

public class ToastJavascriptInterface {
    @JavascriptInterface
    public void showMsg(String msg) {
        ToastManager.show(msg);
    }
}
