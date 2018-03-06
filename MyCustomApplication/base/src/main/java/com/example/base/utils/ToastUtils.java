package com.example.base.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.base.R;

public class ToastUtils {


    public static Toast mToast;

    /**
     * 圆角黑色半透明背景白色字体吐司
     *
     * @param context
     * @param content
     */
    @SuppressLint("ResourceAsColor")
    public static void showBlackWhiteToastOnCenter(Context context, String content) {
        if (mToast == null) {
            mToast = new Toast(context);
        } else {
            mToast.cancel();
            mToast = new Toast(context);
        }
        if (TextUtils.isEmpty(content) || "null".equals(content)) {
            return;
        }
        mToast.setGravity(Gravity.CENTER, 0, 90);
        LinearLayout view = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.item_order_toast, null);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(params);

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                view.setBackground(context.getDrawable(R.drawable.background_toast_black));
            } else {
                view.setBackgroundResource(R.drawable.background_toast_black);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextView tv = (TextView) view.findViewById(R.id.id_toast_text);
        TextPaint tp = tv.getPaint();
        tp.setFakeBoldText(false);
        tv.setText(content);
        tv.setTextColor(Color.parseColor("#ffffff"));
//        tv.setTextSize(20.0f);
        tv.setGravity(Gravity.CENTER);
        mToast.setView(view);
        mToast.setDuration(Toast.LENGTH_LONG);
        mToast.show();
    }


}