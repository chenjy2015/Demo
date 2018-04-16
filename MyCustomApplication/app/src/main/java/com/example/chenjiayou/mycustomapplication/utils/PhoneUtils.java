package com.example.chenjiayou.mycustomapplication.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.kye.express.R;
import com.kye.express.business.base.BaseAppCompatActivity;
import com.kye.express.view.ToastManager;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/01/2018
 * @updated : 27/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class PhoneUtils {

    public static void call(Activity activity, String phone, RxPermissions rxPermissions) {
        Observable<Permission> permissionObservable = rxPermissions.requestEach(Manifest.permission.CALL_PHONE);

        if (activity instanceof BaseAppCompatActivity) {
            permissionObservable = permissionObservable.compose(((BaseAppCompatActivity) activity).bindToLifecycleDestroy());
        }
        permissionObservable.subscribe(new Consumer<Permission>() {
            @Override
            public void accept(Permission permission) throws Exception {
                if (permission.granted) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    activity.startActivity(intent);
                } else {
                    ToastManager.show(R.string.personal_commissioner_reject_permissions);
                }
            }
        });
    }

    public static void call(Activity activity, String phone) {
        call(activity, phone, new RxPermissions(activity));
    }
}
