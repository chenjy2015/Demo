package com.example.chenjiayou.mycustomapplication.view.webview;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.kye.base.Logger;
import com.kye.express.R;
import com.kye.express.utils.PhoneUtils;

public abstract class CallPhoneJavascriptInterface {
    public final static String TAG = CallPhoneJavascriptInterface.class.getName();

    private final Activity mActivity;

    public CallPhoneJavascriptInterface(Activity activity) {
        mActivity = activity;
    }

    @JavascriptInterface
    public void callPhone(String phoneNumber) {
        Logger.d("callPhone");

        if (onNeedBuildDialog()) {
            final Dialog dialog = new MaterialDialog.Builder(mActivity)
                    .title(phoneNumber)
                    .positiveText(R.string.common_call)
                    .negativeText(mActivity.getString(R.string.common_cancel))
                    .onPositive(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                            if (!TextUtils.isEmpty(phoneNumber)) PhoneUtils.call(mActivity, phoneNumber);
                        }
                    })
                    .build();

            onBuildDialog(dialog);
        }
    }

    protected abstract boolean onNeedBuildDialog();

    protected abstract void onBuildDialog(Dialog dialog);
}

