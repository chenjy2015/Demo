package com.example.pullrefreshlistview.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Administrator on 2017/5/10.
 */

public class NetWorkUtils {

    /**
     * 判断当前网络是否可用
     **/
    public static boolean isNetWorkEnable(Context context) {

        ConnectivityManager manager = (ConnectivityManager) context.getApplicationContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager == null) {
            return false;
        }

        NetworkInfo networkinfo = manager.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isAvailable()) {
            return false;
        }
        return true;
    }

    public static boolean isWifiEnable(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (manager == null) {
            return false;
        } else {
            NetworkInfo mWifi = manager.getNetworkInfo(1);
            return mWifi != null && mWifi.isConnected();
        }
    }
}
