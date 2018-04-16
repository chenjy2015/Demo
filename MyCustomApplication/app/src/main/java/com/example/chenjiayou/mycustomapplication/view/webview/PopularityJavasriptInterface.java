package com.example.chenjiayou.mycustomapplication.view.webview;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public abstract class PopularityJavasriptInterface {
    @JavascriptInterface
    public void checkAgreement() {
        onCheckAgreement();
    }

    protected abstract void onCheckAgreement();

    @JavascriptInterface
    public boolean getCheckAgreementValue() {
        return onGetCheckAgreementValue();
    }

    protected abstract boolean onGetCheckAgreementValue();

    @JavascriptInterface
    public void lancuherContactSelector() {
        onLancuherContactSelector();
    }

    protected abstract void onLancuherContactSelector();

    public static void loadPopularity(WebView webView, int popularity) {
        webView.loadUrl("javascript:getRq(" + popularity + ")");
    }

    /**
     * 跳入机型选择帮助页面
     */
    @JavascriptInterface
    public void JumpH5PhoneBrandHelp() {
        onJumpH5PhoneBrandHelp();
    }

    protected abstract void onJumpH5PhoneBrandHelp();
}
