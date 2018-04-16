package com.example.chenjiayou.mycustomapplication.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity收集器
 *
 * Created by SkyYu on 12/04/2018 19:51.
 */
public class ActivityTaskManger {

    public static List<Activity> activities = new ArrayList<Activity>(); // 1个专门的集合类对所有的活动进行管理

    /**
     * 添加活动界面
     *
     * @param activity
     */
    public static void addActivity(Activity activity) {
        if (!activities.contains(activity)) { // 在addActivity()方法中加入了一个if判断，只有当集合中不包含传入的Activity实例的时候才会将它添加到集合中，这样就可以解决掉活动重复的bug了
            activities.add(activity);
        }
    }

    /**
     * 删除活动界面
     * @param activity
     */
    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    /**
     * 关闭所有的活动界面
     */
    public static void finishAll() {
        for (Activity act : activities) {
            if (!act.isFinishing()) {
                act.finish();
            }
        }
        activities.clear(); // 最后在清空Activity引用集合
    }
}
