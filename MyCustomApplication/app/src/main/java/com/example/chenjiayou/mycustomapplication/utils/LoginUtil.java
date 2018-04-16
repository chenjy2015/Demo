package com.example.chenjiayou.mycustomapplication.utils;

import android.app.Activity;

import com.kye.express.business.login.LoginActivity;
import com.kye.model.UserSession;

/**
 * 登录工具类
 *
 * Created by SkyYu on 04/04/2018 02:20.
 */

public class LoginUtil {

    /**
     * 判断是否登录
     */
    public static boolean isLogin() {
        Activity currentActivity = ActivityManager.getInstance().getCurrentActivity();
        if (UserSession.getInstance().getUser() != null && UserSession.getInstance().getUser().isLogin()) {
            return true;
        } else {
            LoginActivity.startActivity(currentActivity);
            currentActivity.finish();
            return false;
        }
    }
}
