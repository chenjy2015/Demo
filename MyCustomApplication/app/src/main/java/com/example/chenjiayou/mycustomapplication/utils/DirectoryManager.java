package com.example.chenjiayou.mycustomapplication.utils;

import android.os.Environment;

import java.io.File;

/**
 * 路径管理类
 *
 * Created by StarSkyYu on 2018/04/11
 */
public class DirectoryManager {

    private static final String KYE_UPDATE_APK = "KYE_UPDATE_APK";

    public static String getDownloadApkCachePath() {
        String appCachePath;
        if (AppUtil.checkSDCard()) {
            appCachePath = Environment.getExternalStorageDirectory() + "/" + KYE_UPDATE_APK + "/";
        } else {
            appCachePath = Environment.getDataDirectory().getPath() + "/" + KYE_UPDATE_APK + "/";
        }
        File file = new File(appCachePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return appCachePath;
    }

}
