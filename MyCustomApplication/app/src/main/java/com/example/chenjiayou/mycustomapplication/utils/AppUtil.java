package com.example.chenjiayou.mycustomapplication.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;

import com.kye.express.App;
import com.kye.express.view.ToastManager;

import java.util.List;

/**
 * App相关辅助类
 * <p>
 * Desc  获取应用程序的相关设备信息
 * <p>
 * Created by SkyYu on 2018/1/15
 */
public class AppUtil {

    private static final String TAG = "AppUtil";

    private AppUtil() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 获取手机系统SDK版本
     *
     * @return 如API 17 则返回 17
     */
    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    /**
     * 获取系统版本号
     *
     * @return String 如4.0, 5.0, 5.1
     */
    public static String getDeviceOSVersion() {
        return Build.VERSION.RELEASE;
    }

    /**
     * 获取手机型号
     *
     * @param context 上下文
     *
     * @return model
     */
    public static String getModel(Context context) {
        return Build.MODEL;
    }

    /**
     * 获取手机产品制造商
     *
     * @param context context
     *
     * @return MANUFACTURER
     */
    public static String getManufacturer(Context context) {
        return Build.MANUFACTURER;
    }

    /**
     * 获取手机信息
     *
     * @return String
     */
    public String getPhoneInfo() {
        String phoneInfo = "Product: " + Build.PRODUCT;
        phoneInfo += ", CPU_ABI: " + Build.CPU_ABI;
        phoneInfo += ", TAGS: " + Build.TAGS;
        phoneInfo += ", VERSION_CODES.BASE: " + Build.VERSION_CODES.BASE;
        phoneInfo += ", MODEL: " + Build.MODEL;
        phoneInfo += ", SDK: " + Build.VERSION.SDK_INT;
        phoneInfo += ", VERSION.RELEASE: " + Build.VERSION.RELEASE;
        phoneInfo += ", DEVICE: " + Build.DEVICE;
        phoneInfo += ", DISPLAY: " + Build.DISPLAY;
        phoneInfo += ", BRAND: " + Build.BRAND;
        phoneInfo += ", BOARD: " + Build.BOARD;
        phoneInfo += ", FINGERPRINT: " + Build.FINGERPRINT;
        phoneInfo += ", ID: " + Build.ID;
        phoneInfo += ", MANUFACTURER: " + Build.MANUFACTURER;
        phoneInfo += ", USER: " + Build.USER;
        return phoneInfo;
    }

    /**
     * 获取系统状态栏高度
     **/
    public static int getStatusBarHeight() {
        int statusBarHeight = 0;
        // 获取status_bar_height资源的ID
        int resourceId = App.getContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            // 根据资源ID获取响应的尺寸值
            statusBarHeight = App.getContext().getResources().getDimensionPixelSize(resourceId);
        }
        return statusBarHeight;
    }

    /**
     * 判断 用户是否安装微信客户端
     */
    public static boolean isWXAvilible(Context context) {
        final PackageManager packageManager = context.getPackageManager();// 获取packagemanager
        List<PackageInfo>    pinfo          = packageManager.getInstalledPackages(0);// 获取所有已安装程序的包信息
        if (pinfo != null) {
            for (int i = 0; i < pinfo.size(); i++) {
                String pn = pinfo.get(i).packageName;
                if (pn.equals("com.tencent.mm")) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 通过包名 在应用商店打开应用
     *
     * @param packageName 包名
     */
    public static void openApplicationMarket(String packageName) {
        Intent intent;
        String uri;
        try {
            uri = "market://details?id=" + packageName;
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(uri));
            ActivityManager.getInstance().getCurrentActivity().startActivity(intent);
        } catch (Exception e) {
            // 打开应用商店失败 可能是没有手机没有安装应用市场
            // 方式2：打开第三方Activity前用用IntentIntent的resolveActivity来判断能否被解析
            // https://blog.csdn.net/zhangfei_jiayou/article/details/18954789
            // https://stackoverflow.com/questions/15407502/how-to-check-if-an-intent-can-be-handled-from-some-activity
            e.printStackTrace();
            ToastManager.show("打开应用商店失败，进入系统浏览器进入商城");
            uri = "http://sj.qq.com/myapp/detail.htm?apkName=com.tencent.mm"; // 应用宝的微信下载页面
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(uri));
            ActivityManager.getInstance().getCurrentActivity().startActivity(intent);
        }
    }

    public static boolean checkSDCard() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

}