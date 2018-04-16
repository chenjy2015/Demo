package com.example.chenjiayou.mycustomapplication.view;

import android.support.annotation.IntDef;
import android.support.annotation.StringRes;
import android.widget.Toast;

import com.kye.express.App;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ToastManager {

    private static Toast toast = null;

    public static void show(@StringRes int resId) {
        show(resId, Toast.LENGTH_SHORT);
    }

    public static void show(CharSequence text) {
        show(text, Toast.LENGTH_SHORT);
    }

    public static void show(@StringRes int resId, @Duration int duration) {
        Toast.makeText(App.getContext(), resId, duration).show();
    }

    public static void show(CharSequence text, int duration) {
        String msg = (String) text;
        if (null != msg  && msg.contains("token")) {
            //Toast.makeText(App.getContext(), "请重新登录", duration).show();
            return;
        }
        Toast.makeText(App.getContext(), text, duration).show();
    }

    public static void dismiss() {
        if (toast != null) {
            toast.cancel();
        }
    }

    @IntDef({Toast.LENGTH_SHORT, Toast.LENGTH_LONG})
    @Retention(RetentionPolicy.SOURCE)
    @interface Duration {
    }
}