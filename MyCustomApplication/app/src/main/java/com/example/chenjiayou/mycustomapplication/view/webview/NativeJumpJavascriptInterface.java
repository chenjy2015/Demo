package com.example.chenjiayou.mycustomapplication.view.webview;

import android.Manifest;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import com.kye.express.BuildConfig;
import com.kye.express.R;
import com.kye.express.view.ToastManager;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.functions.Consumer;

public abstract class NativeJumpJavascriptInterface {

    private final Activity mActivity;

    public NativeJumpJavascriptInterface(Activity activity) {
        mActivity = activity;
    }

    /**
     * 跳入帮助方法
     *
     * @param type         1 跳入权限管理 2 跳入联系人
     * @param manufacturer 2 手机厂商
     */
    @JavascriptInterface
    public void callBackNative(String type, String manufacturer) {
        if ("1".equals(type)) {
//                String MANUFACTURER = Build.MANUFACTURER;
            if (manufacturer.contains("Huawei") || manufacturer.equalsIgnoreCase("huawei")) {
                try {
                    Intent intent = new Intent();
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
                    ComponentName comp = new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity");//华为权限管理
                    intent.setComponent(comp);
                    mActivity.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                    goToSetTing();
                }
            } else if (manufacturer.contains("Meizu") || manufacturer.equalsIgnoreCase("meizu")) {
                try {
                    Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                    intent.addCategory(Intent.CATEGORY_DEFAULT);
                    intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
                    mActivity.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                    goToAppInfo();
                }
            } else if (manufacturer.contains("Xiaomi") || manufacturer.equalsIgnoreCase("xiaomi")) {
                try {
                    Intent i = new Intent("miui.intent.action.APP_PERM_EDITOR");
                    ComponentName componentName = new ComponentName("com.miui.securitycenter",
                                                                    "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                    i.setComponent(componentName);
                    i.putExtra("extra_pkgname", BuildConfig.APPLICATION_ID);
                    mActivity.startActivity(i);
                } catch (Exception e) {
                    e.printStackTrace();
                    goToAppInfo();
                }
            } else if (manufacturer.contains("Sony") || manufacturer.equalsIgnoreCase("Sony")) {
                try {
                    Intent intent = new Intent();
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
                    ComponentName comp = new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity");
                    intent.setComponent(comp);
                    mActivity.startActivity(intent);
                } catch (Exception e) {
                    goToSetTing();
                }
            } else if (manufacturer.contains("OPPO") || manufacturer.equalsIgnoreCase("oppo")) {
                try {
                    Intent intent = new Intent();
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
                    ComponentName comp = new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity");
                    intent.setComponent(comp);
                    mActivity.startActivity(intent);
                } catch (Exception e) {
                    goToSetTing();
                }
            } else if (manufacturer.contains("LG") || manufacturer.equalsIgnoreCase("lg")) {
                try {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
                    ComponentName comp = new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity");
                    intent.setComponent(comp);
                    mActivity.startActivity(intent);
                } catch (Exception e) {
                    goToSetTing();
                }
            } else if (manufacturer.contains("vivo") || manufacturer.equalsIgnoreCase("vivo")) {
                goToAppInfo();
            } else if (manufacturer.contains("samsung") || manufacturer.equalsIgnoreCase("samsung")) {
                goToAppInfo();
            } else if (manufacturer.contains("QiKU") || manufacturer.equalsIgnoreCase("QiKU")) {
                try {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
                    ComponentName comp = new ComponentName("com.qihoo360.mobilesafe", "com.qihoo360.mobilesafe.ui.index.AppEnterActivity");
                    intent.setComponent(comp);
                    mActivity.startActivity(intent);
                } catch (Exception e) {
                    goToSetTing();
                }
            } else if (manufacturer.contains("Letv") || manufacturer.equalsIgnoreCase("Letv")) {
                try {
                    Intent intent = new Intent();
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("packageName", BuildConfig.APPLICATION_ID);
                    ComponentName comp = new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.PermissionAndApps");
                    intent.setComponent(comp);
                    mActivity.startActivity(intent);
                } catch (Exception e) {
                    goToSetTing();
                }
            } else if (manufacturer.contains("ZTE") || manufacturer.equalsIgnoreCase("ZTE")) {
                goToAppInfo();
            } else if (manufacturer.contains("YuLong") || manufacturer.equalsIgnoreCase("YuLong")) {
//                    酷派手机
                goToAppInfo();
            } else {
//                    其他品牌手机直接跳到设置
                goToSetTing();
            }

        } else if ("2".equals(type)) {
//               打开通讯录
            new RxPermissions(mActivity).requestEach(Manifest.permission.READ_CONTACTS)
                                        .subscribe(new Consumer<Permission>() {
                                            @Override
                                            public void accept(Permission permission) throws Exception {
                                                if (permission.granted) {
                                                    Uri    uri    = ContactsContract.Contacts.CONTENT_URI;
                                                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                                    mActivity.startActivity(intent);
                                                } else {
                                                    ToastManager.show(R.string.customer_intro_no_read_contacts_permission, Toast.LENGTH_SHORT);
                                                }

                                            }
                                        });
        }
    }


    /**
     * 跳到系统设置
     */
    private void goToSetTing() {
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        mActivity.startActivity(intent);
    }

    /**
     * 跳到应用信息
     */
    private void goToAppInfo() {
        Intent localIntent = new Intent();
        localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (Build.VERSION.SDK_INT >= 9) {
            localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            localIntent.setData(Uri.fromParts("package", mActivity.getPackageName(), null));
        } else if (Build.VERSION.SDK_INT <= 8) {
            localIntent.setAction(Intent.ACTION_VIEW);
            localIntent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            localIntent.putExtra("com.android.settings.ApplicationPkgName", mActivity.getPackageName());
        }
        mActivity.startActivity(localIntent);

    }
}
