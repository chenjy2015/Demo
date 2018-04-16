package com.example.chenjiayou.mycustomapplication.view.webview;

import android.webkit.JavascriptInterface;

import com.kye.model.ApiBase;
import com.kye.model.SharedPreferencesConfig;
import com.kye.model.SharedPreferencesManager;
import com.kye.model.bean.user.User;

public abstract class UserInfoJavascriptInterface {

    @JavascriptInterface
    public String getUserInfo() {
        String       defaultValue = ApiBase.getInstance().getGson().toJson(new User());
        final String userJson     = SharedPreferencesManager.get(SharedPreferencesConfig.KEY_USER, defaultValue);
        alert(userJson);
        return userJson;
    }

    protected abstract void alert(String s);
}
