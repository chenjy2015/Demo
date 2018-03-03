package com.example.base.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by chenjiayou on 2018/3/3.
 */

public class SizeUtils {
    /**
     * 获取图片屏幕对应的DP值
     *
     * @param dp
     * @param context
     * @return
     */
    public static int dp2px(int dp, Context context) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                context.getResources().getDisplayMetrics());
    }
}
