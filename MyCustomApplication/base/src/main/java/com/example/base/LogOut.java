package com.example.base;


import android.util.Log;



/**
 * createBy：chenjiayou
 * on: 2018/3/3 15:33
 * descript: 日志输出控制类
 */
public class LogOut {

    private static boolean LOG_FLAG = true;

    public static void init(boolean isDebug) {
        LOG_FLAG = isDebug;
    }

    public static void systemOut(String str) {
        if (LOG_FLAG && str != null) {
            System.out.println(str);
        }
    }

    public static void exceptionOut(String tag, String msg, Exception e) {
        if (LOG_FLAG) {
            Log.e(tag, msg, e);
        }
    }

    public static void v(String tag, String msg) {
        if (LOG_FLAG) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LOG_FLAG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LOG_FLAG) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LOG_FLAG) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LOG_FLAG) {
            Log.e(tag, msg);
        }
    }

    public static void printStackTrace(Exception e) {
        if (LOG_FLAG) {
            e.printStackTrace();
        }
    }
}
