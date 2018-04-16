package com.example.chenjiayou.mycustomapplication.utils;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 20/12/2017
 * @updated : 20/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     简单封装
 */

public class DialogUtils {

    public static DialogFragment show(DialogFragment dialogFragment, FragmentManager fragmentManager, String tag) {
        if (dialogFragment != null && dialogFragment.getDialog() != null
                && dialogFragment.getDialog().isShowing()) {
            //dialog is showing
        }
        if (dialogFragment != null) {
            dialogFragment.show(fragmentManager, tag);
        }
        return dialogFragment;
    }

    public static void dimiss(DialogFragment dialogFragment) {
        if (dialogFragment != null && dialogFragment.getDialog() != null
                && dialogFragment.getDialog().isShowing()) {
            //dialog is showing
            dialogFragment.dismiss();
        }
    }

    public static Dialog initDialog(Context context, int view, int style) {
        Dialog dialog = new Dialog(context, style);
        /*
        R.style.transparentFrameWindowStyle:（放在style.xml）
        <style name="transparentFrameWindowStyle" parent="android:style/Theme.Dialog">
        <item name="android:windowBackground">@drawable/photo_choose_bg</item>
        </style>
        */
        dialog.setContentView(view);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialog.setCanceledOnTouchOutside(true);

        return dialog;
    }

    public static void showDialog(Dialog dialog) {
        if (null != dialog && !dialog.isShowing()) {
            dialog.show();
        }
    }

    public static void dismissDialog(Dialog dialog) {
        if (null != dialog && dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
