package com.example.chenjiayou.mycustomapplication.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;

import com.kye.express.App;
import com.kye.express.R;
import com.kye.express.view.ToastManager;

public class NetUtils {

    private static final String NETWORK_TYPE_1xRTT = "1xRTT";
    private static final String NETWORK_TYPE_CDMA = "CDMA";
    private static final String NETWORK_TYPE_EDGE = "EDGE";
    private static final String NETWORK_TYPE_EHRPD = "eHRPD";

    // Network Type
    private static final String NETWORK_TYPE_EVDO_0 = "EVDO revision 0";
    private static final String NETWORK_TYPE_EVDO_A = "EVDO revision A";
    private static final String NETWORK_TYPE_EVDO_B = "EVDO revision B";
    private static final String NETWORK_TYPE_GPRS = "GPRS";
    private static final String NETWORK_TYPE_HSDPA = "HSDPA";
    private static final String NETWORK_TYPE_HSPA = "HSPA";
    private static final String NETWORK_TYPE_HSPAP = "HSPA+";
    private static final String NETWORK_TYPE_HSUPA = "HSUPA";
    private static final String NETWORK_TYPE_IDEN = "iDen";
    private static final String NETWORK_TYPE_LTE = "LTE";
    private static final String NETWORK_TYPE_UMTS = "UMTS";
    private static final String NETWORK_TYPE_UNKNOWN = "unknown";

    public static boolean isNetworkAvailable(@Nullable final Context context) {
        if (context == null) return false;

        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (manager == null) return false;

        NetworkInfo activeNetworkInfo = manager.getActiveNetworkInfo();

        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /**
     * 获得网络类型
     */
    public static int getNetWorkStatus(Context context) {
        if (context == null) return -1;

        ConnectivityManager lConnectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if (null != lConnectivity) {
            NetworkInfo info = lConnectivity.getActiveNetworkInfo();
            if (info != null) {
                if (info.getTypeName().toLowerCase().equals("wifi")) {
                    if (info.getState() == NetworkInfo.State.CONNECTED) {
                        return NetworkType.NETWORK_TYPE_WIFI.ordinal();
                    } else {
                        return NetworkType.NETWORK_UNAVAILABLE.ordinal();
                    }
                } else if (info.getTypeName().toLowerCase().equals("mobile")) {
                    if (info.getState() == NetworkInfo.State.CONNECTED) {
                        if (info.getExtraInfo() != null && info.getExtraInfo().contains("wap"))
                            return NetworkType.NETWORK_TYPE_WAP.ordinal();
                        else
                            return NetworkType.NETWORK_TYPE_NET.ordinal();
                    }
                }
            }
        }
        return NetworkType.NETWORK_UNAVAILABLE.ordinal();
    }

    public static boolean isWifi(Context context) {
        return getNetWorkStatus(context) == NetworkType.NETWORK_TYPE_WIFI.ordinal();
    }

    public static String getNetworkType(Context context) {
        if (context == null) return "";

        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        if (tm == null) return "";

        switch (tm.getNetworkType()) {
            case TelephonyManager.NETWORK_TYPE_1xRTT:
                return NETWORK_TYPE_1xRTT;
            case TelephonyManager.NETWORK_TYPE_CDMA:
                return NETWORK_TYPE_CDMA;
            case TelephonyManager.NETWORK_TYPE_EDGE:
                return NETWORK_TYPE_EDGE;
            case TelephonyManager.NETWORK_TYPE_EHRPD:
                return NETWORK_TYPE_EHRPD;
            case TelephonyManager.NETWORK_TYPE_EVDO_0:
                return NETWORK_TYPE_EVDO_0;
            case TelephonyManager.NETWORK_TYPE_EVDO_A:
                return NETWORK_TYPE_EVDO_A;
            case TelephonyManager.NETWORK_TYPE_EVDO_B:
                return NETWORK_TYPE_EVDO_B;
            case TelephonyManager.NETWORK_TYPE_GPRS:
                return NETWORK_TYPE_GPRS;
            case TelephonyManager.NETWORK_TYPE_HSDPA:
                return NETWORK_TYPE_HSDPA;
            case TelephonyManager.NETWORK_TYPE_HSPA:
                return NETWORK_TYPE_HSPA;
            case TelephonyManager.NETWORK_TYPE_HSPAP:
                return NETWORK_TYPE_HSPAP;
            case TelephonyManager.NETWORK_TYPE_HSUPA:
                return NETWORK_TYPE_HSUPA;
            case TelephonyManager.NETWORK_TYPE_IDEN:
                return NETWORK_TYPE_IDEN;
            case TelephonyManager.NETWORK_TYPE_LTE:
                return NETWORK_TYPE_LTE;
            case TelephonyManager.NETWORK_TYPE_UMTS:
                return NETWORK_TYPE_UMTS;
            case TelephonyManager.NETWORK_TYPE_UNKNOWN:
                return NETWORK_TYPE_UNKNOWN;
        }
        return "";
    }

    public static boolean isNetworkAvailable(){
        Activity currentActivity = ActivityManager.getInstance().getCurrentActivity();
        if (NetUtils.isNetworkAvailable(currentActivity)) {
            return true;
        }else{
            ToastManager.show(App.getContext().getString(R.string.common_net_error));
            return false;
        }
    }

    public enum NetworkType {

        NETWORK_UNAVAILABLE(-1), NETWORK_TYPE_WAP(0), NETWORK_TYPE_NET(1), NETWORK_TYPE_WIFI(2);

        private int code;

        // 构造函数，枚举类型只能为私有
        NetworkType(int nCode) {
            this.code = nCode;
        }

        @Override
        public String toString() {
            return String.valueOf(this.code);
        }
    }
}
