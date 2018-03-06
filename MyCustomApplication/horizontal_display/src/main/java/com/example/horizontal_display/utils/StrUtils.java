package com.example.horizontal_display.utils;

public class StrUtils {

    private static final String TAG = "StrUtils";

    public static boolean isNullOrEmpty(Object value) {
        return (value == null) || ("".equals(value)) || ("null".equals(value));
    }

}
