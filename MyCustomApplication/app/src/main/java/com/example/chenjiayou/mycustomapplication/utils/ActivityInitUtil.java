package com.example.chenjiayou.mycustomapplication.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;

import java.util.LinkedList;
import java.util.List;

/**
 * Activity 监听生命周期的初始化工具类
 * <p>
 * Created by SkyYu on 2018/1/3
 */
public class ActivityInitUtil {

    @SuppressLint("StaticFieldLeak")
    private static Application mApplication;

    public static List<Activity> mActivityList = new LinkedList<>();

    private ActivityInitUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 用来监听一些Activity的回调
     * <p>
     * Source http://droidyue.com/blog/2016/02/21/thinking-of-getting-the-current-activity-in-android/
     */
    private static Application.ActivityLifecycleCallbacks mCallbacks = new Application.ActivityLifecycleCallbacks() {
        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            mActivityList.add(activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {
        }

        @Override
        public void onActivityResumed(Activity activity) {
            ActivityManager.getInstance().setCurrentActivity(activity);
        }

        @Override
        public void onActivityPaused(Activity activity) {

        }

        @Override
        public void onActivityStopped(Activity activity) {

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            mActivityList.remove(activity);
        }
    };

    /**
     * 初始化工具类
     *
     * @param app 应用
     */
    public static void init(@NonNull final Application app) {
        ActivityInitUtil.mApplication = app;
        app.registerActivityLifecycleCallbacks(mCallbacks);
    }
}