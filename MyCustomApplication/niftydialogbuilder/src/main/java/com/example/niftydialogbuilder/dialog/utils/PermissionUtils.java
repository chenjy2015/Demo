package com.example.niftydialogbuilder.dialog.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.widget.Toast;

import com.example.niftydialogbuilder.dialog.helper.DialogButtonType;
import com.example.niftydialogbuilder.dialog.helper.DialogHelper;
import com.example.niftydialogbuilder.dialog.ie.DialogSinpleCallback;

/**
 * @version V1.0
 * @createAuthor chenxiaoping
 * @createDate 2017/3/29 16:36
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public class PermissionUtils {

    private static final int DEFAULT_VALUES = 5;//为了和系统定义的权限状态标识，另外自定义一个值表示我们自己的手动调用的
    private static Context mContext;
    private static String mDialogMsg;
    private static String mPermission;
    private static OnPermissionsOkListener mPermissoklistener;


    /**
     * 检查权限，6.0以上会按新权限处理逻辑执行，
     * 6.0以下因为无法获取权限的状态，默认执行OnPermissionsOkListener的操作逻辑
     * 注：如果需要在Dialog上动态申请权限，请在Dialog弹出前进行权限检查，防止Dilag和权限申请框发生冲突
     *
     * @param context           上下文 必传
     * @param permission        权限标识，如需检查打电话的权限时传（Manifest.permission.CALL_PHONE）；必传
     * @param dialogMsg         申请权限时，用户勾了“不在提示”后的交互弹框提示内容，可为空（“”或null）；为空时当勾了“不在提示”时，无任何交互提示框
     * @param permissoklistener 权限状态为允许时的监听  必传； 注：如果需要在Dialog上动态申请权限，请在Dialog弹出前进行权限检查，防止Dilag和权限申请框发生冲突
     */
    public static synchronized void checkPermission(Activity context, String permission, String dialogMsg,
                                                    OnPermissionsOkListener permissoklistener) {

        mDialogMsg = dialogMsg;
        mPermission = permission;
        mContext = context;
        mDialogMsg = dialogMsg;
        mPermissoklistener = permissoklistener;

        if (Build.VERSION.SDK_INT >= 23) {
            if (ActivityCompat.checkSelfPermission(mContext, permission) == PackageManager.PERMISSION_GRANTED) {
                // 已获取权限
                if (mPermissoklistener != null) {
                    mPermissoklistener.onPermissionsOkListener();
                }
            } else {
                // 申请权限
                ActivityCompat.requestPermissions((Activity) mContext, new String[]{permission}, 0);

                context.onRequestPermissionsResult(0, new String[]{permission}, new int[]{DEFAULT_VALUES});
            }
        } else {
            // 6.0之前的系统，因为无法获取权限的状态，直接执行需要权限的操作
            if (mPermissoklistener != null) {
                mPermissoklistener.onPermissionsOkListener();
            }
        }
    }


    public static void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            //            用户允许了权限,   注：拨号权限一般都是在拨号弹框后申请，为了避免和申请权限弹框发生冲突，屏蔽拨号权限允许后直接执行拨号行为
            if (mPermissoklistener != null && !permissions[0].equals(Manifest.permission.CALL_PHONE)) {
                mPermissoklistener.onPermissionsOkListener();
            }
        } else if (grantResults.length > 0 && grantResults[0] != DEFAULT_VALUES) {
            //            用户拒绝了权限

            if (!TextUtils.isEmpty(mDialogMsg) && !ActivityCompat.shouldShowRequestPermissionRationale((Activity) mContext, mPermission)) {
                showMessageOKCancel(mDialogMsg, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        // 去应用信息
                        Intent localIntent = new Intent();
                        localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        if (Build.VERSION.SDK_INT >= 9) {
                            localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            localIntent.setData(Uri.fromParts("package", mContext.getPackageName(), null));
                        } else if (Build.VERSION.SDK_INT <= 8) {
                            localIntent.setAction(Intent.ACTION_VIEW);
                            localIntent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                            localIntent.putExtra("com.android.settings.ApplicationPkgName", mContext.getPackageName());
                        }
                    }
                });
            } else {
                Toast.makeText(mContext, "权限被拒绝", Toast.LENGTH_SHORT).show();
            }

        }
    }

    private static void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {

        //勾选了“不再询问”，弹出温馨提示框
        DialogHelper.showHintDialog(mContext, "温馨提示", message, "去设置", 0, new DialogSinpleCallback() {
            @Override
            public void onButtonClick(int tag, DialogButtonType dialogButtonType, Object object) {

                DialogHelper.dismiss();
                // 去应用信息
                Intent localIntent = new Intent();
                localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                if (Build.VERSION.SDK_INT >= 9) {
                    localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    localIntent.setData(Uri.fromParts("package", mContext.getPackageName(), null));
                } else if (Build.VERSION.SDK_INT <= 8) {
                    localIntent.setAction(Intent.ACTION_VIEW);
                    localIntent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                    localIntent.putExtra("com.android.settings.ApplicationPkgName", mContext.getPackageName());
                }
                mContext.startActivity(localIntent);
            }
        }, null);

    }

    /**
     * 权限状态为允许的监听
     */
    public interface OnPermissionsOkListener {
        void onPermissionsOkListener();
    }

    /**
     *  返回true 表示可以使用  返回false表示不可以使用
     */
    /**
     * 返回true 表示可以使用  返回false表示不可以使用
     */
    public static boolean cameraIsCanUse() {
        boolean isCanUse = false;
        Camera camera = null;
        try {
            camera = Camera.open();
            isCanUse = true;
        } catch (Exception e) {
            isCanUse = false;
        }
        if (camera != null) {
            try {
                camera.release();
            } catch (Exception e) {
                e.printStackTrace();
                isCanUse = false;
            }
        }
        return isCanUse;
    }

}
