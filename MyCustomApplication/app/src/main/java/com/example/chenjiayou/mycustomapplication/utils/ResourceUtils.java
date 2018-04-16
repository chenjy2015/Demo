package com.example.chenjiayou.mycustomapplication.utils;

import android.content.Context;
import android.content.res.TypedArray;

public class ResourceUtils {

    /**
     * 获取本地资源
     * @param context
     * @return
     */
    public static int[] getResouceByArray(Context context, int resourceId) {
        TypedArray ar = context.getResources().obtainTypedArray(resourceId);
        int len = ar.length();
        int[] resIds = new int[len];
        for (int i = 0; i < len; i++) {
            resIds[i] = ar.getResourceId(i, 0);
        }
        ar.recycle();
        return resIds;
    }
}