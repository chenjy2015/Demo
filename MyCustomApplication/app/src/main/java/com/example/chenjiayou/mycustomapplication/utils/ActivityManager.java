package com.example.chenjiayou.mycustomapplication.utils;

import android.app.Activity;
import android.content.Context;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * 当前Activity的设置和获取
 * <p>
 * Source  http://droidyue.com/blog/2016/02/21/thinking-of-getting-the-current-activity-in-android/
 * <p>
 * Created by SkyYu on 2018/1/3
 */
public class ActivityManager {

    private static ActivityManager sInstance = new ActivityManager();
    /**
     * 那么为什么要使用弱引用持有Activity实例呢？
     * 其实最主要的目的就是避免内存泄露，因为使用默认的强引用会导致Activity实例无法释放，导致内存泄露的出现
     */
    private WeakReference<Activity> sCurrentActivityWeakRef;

    private ActivityManager() {
    }

    public static ActivityManager getInstance() {
        return sInstance;
    }

    public Activity getCurrentActivity() {
        Activity currentActivity = null;
        if (sCurrentActivityWeakRef != null) {
            currentActivity = sCurrentActivityWeakRef.get();
        }
        return currentActivity;
    }

    public void setCurrentActivity(Activity activity) {
        if (sCurrentActivityWeakRef == null || !activity.equals(sCurrentActivityWeakRef.get())) {
            sCurrentActivityWeakRef = new WeakReference<>(activity);
        }
    }

    /**
     * 获取当前Activity
     * <p>
     * Source：http://droidyue.com/blog/2016/02/21/thinking-of-getting-the-current-activity-in-android/
     * <p>
     * Desc:然而这种方法并不是很推荐，主要是有以下的不足：
     * 反射通常会比较慢
     * 不稳定性，这个才是不推荐的原因，Android框架代码存在修改的可能性，谁要无法100%保证mActivities，paused固定不变。所以可靠性不是完全可靠。
     *
     * @return
     */
    public static Activity getActivity() {
        Class activityThreadClass = null;
        try {
            activityThreadClass = Class.forName("android.app.ActivityThread");
            Object activityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null);
            Field activitiesField = activityThreadClass.getDeclaredField("mActivities");
            activitiesField.setAccessible(true);
            Map activities = (Map) activitiesField.get(activityThread);
            for (Object activityRecord : activities.values()) {
                Class activityRecordClass = activityRecord.getClass();
                Field pausedField = activityRecordClass.getDeclaredField("paused");
                pausedField.setAccessible(true);
                if (!pausedField.getBoolean(activityRecord)) {
                    Field activityField = activityRecordClass.getDeclaredField("activity");
                    activityField.setAccessible(true);
                    Activity activity = (Activity) activityField.get(activityRecord);
                    return activity;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 判断自己的activity是否是在top
     * <p>
     * source:http://496676735.iteye.com/blog/1861175
     *
     * @param activity
     * @return
     */
    protected static boolean isTopActivity(Activity activity) {
        String packageName = "com.douyaduobao";  //
        android.app.ActivityManager activityManager = (android.app.ActivityManager) activity.getSystemService(Context.ACTIVITY_SERVICE);
        List<android.app.ActivityManager.RunningTaskInfo> tasksInfo = activityManager.getRunningTasks(1);
        if (tasksInfo.size() > 0) {
            System.out.println("---------------包名-----------" + tasksInfo.get(0).topActivity.getPackageName());
            //应用程序位于堆栈的顶层
            if (packageName.equals(tasksInfo.get(0).topActivity.getPackageName())) {
                return true;
            }
        }
        return false;
    }
}
