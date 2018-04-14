package com.example.chenjiayou.mycustomapplication;

import android.content.Context;


/**
 * Created by chenjiayou on 2018/3/20.
 */

public class SizeUtils {

    /**
     * dip2px
     *
     * @param size
     * @return
     */
    public static int dip2px(Context context, int size) {
        float f = context.getResources().getDisplayMetrics().density;
        return (int) (size * f + 0.5F);
    }

    /**
     * px2dip
     *
     * @param size
     * @return
     */
    public static int px2dip(Context context, int size) {
        float f = context.getResources().getDisplayMetrics().density;
        return (int) (size / f + 0.5F);
    }

}
