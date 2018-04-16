package com.example.chenjiayou.mycustomapplication.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/**
 * Intent工具类
 * <p>
 * Created by SkyYu on 29/01/2018 15:47
 */
public class IntentUtil {

    private static final String TAG = "IntentUtil";

    private IntentUtil() {
    }

    /**
     * 传递多个参数进行页面跳转
     */
    public static void showIntent(Class<?> clzz, String[] keys, String[] values) {
        Activity currentActivity = ActivityManager.getInstance().getCurrentActivity();
        Intent   intent          = new Intent(currentActivity, clzz);
        if (values != null && values.length > 0) {
            for (int i = 0; i < values.length; i++) {
                if (!TextUtils.isEmpty(keys[i]) && !TextUtils.isEmpty(values[i])) {
                    intent.putExtra(keys[i], values[i]);
                }
            }
        }
        currentActivity.startActivity(intent);
    }

    /**
     * 传递一个参数进行页面跳转
     */
    public static void showIntent(Class<?> clzz, String key, String value) {
        Activity currentActivity = ActivityManager.getInstance().getCurrentActivity();
        Intent   intent          = new Intent(currentActivity, clzz);
        intent.putExtra(key, value);
        currentActivity.startActivity(intent);
    }
    public static void showIntent(Class<?> clzz, String key, long value) {
        Activity currentActivity = ActivityManager.getInstance().getCurrentActivity();
        Intent   intent          = new Intent(currentActivity, clzz);
        intent.putExtra(key, value);
        currentActivity.startActivity(intent);
    }

    /**
     * 打电话（直接拨号）
     *
     * @param context
     * @param phoneNum
     */
    public static void callImmediately(Context context, String phoneNum) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNum));
        context.startActivity(intent);
    }

    /**
     * 打电话（跳转到拨号界面）
     *
     * @param context
     * @param phoneNum
     */
    public static void callPage(Context context, String phoneNum) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNum));
        context.startActivity(intent);
    }

    /**
     * 打开其他应用的某个界面（如跳转到微信的首页）
     */
    public static void openOtherApp(String packageName, String className) {
        Activity      currentActivity = ActivityManager.getInstance().getCurrentActivity();
        Intent        intent          = new Intent();
        ComponentName cmp             = new ComponentName(packageName, className);
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setComponent(cmp);
        currentActivity.startActivity(intent);
    }
}
