package com.example.chenjiayou.mycustomapplication.utils;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

import com.kye.express.App;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 18/12/2017
 * @updated : 18/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class ScreenUtils {

    public static int getScreenWidth() {
        WindowManager wm = (WindowManager) App.getInstance().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        int width = outMetrics.widthPixels;
        int height = outMetrics.heightPixels;
        return width;
    }

    public static int getScreenHeight() {
        WindowManager wm = (WindowManager) App.getInstance().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        int width = outMetrics.widthPixels;
        int height = outMetrics.heightPixels;
        return width;
    }

    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static int dp2px(Context context, int dp) {
        return (int) (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics()) + 0.5);
    }

    public static void setBackgroundDefaultAlph(AppCompatActivity activity) {
        WindowManager.LayoutParams lp= activity.getWindow().getAttributes();
        lp.alpha = 0.5f;
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        activity.getWindow().setAttributes(lp);
    }


    public static void resetBackgroundDefaultAlph(AppCompatActivity activity) {
        WindowManager.LayoutParams lp= activity.getWindow().getAttributes();
        lp.alpha = 1f;
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        activity.getWindow().setAttributes(lp);
    }
}
