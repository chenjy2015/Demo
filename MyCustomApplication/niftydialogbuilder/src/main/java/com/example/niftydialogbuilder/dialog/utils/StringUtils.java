package com.example.niftydialogbuilder.dialog.utils;

import android.text.TextUtils;

public class StringUtils {

    private static final String TAG = "StringUtils";

    public static boolean isNullOrEmpty(Object value) {
        return (value == null) || ("".equals(value)) || ("null".equals(value));
    }

    /**
     * 判断字符串是否可用 返回空字符串或字符串本身
     */
    public static String checkStringIsNull(String content) {
        if (TextUtils.isEmpty(content) || "null".equals(content)) {
            return "";
        } else {
            return content;
        }
    }

}
