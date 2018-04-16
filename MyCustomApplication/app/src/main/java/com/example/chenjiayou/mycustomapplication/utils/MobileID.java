package com.example.chenjiayou.mycustomapplication.utils;

public class MobileID {
    public static String get() {
        return new MD5().getMD5(android.os.Build.SERIAL);
    }
}
