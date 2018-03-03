package com.example.base.utils;

/**
 * @version V1.0
 * @createAuthor chenxiaoping
 * @createDate 2016/4/28 21:17
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description 判断是否可以点击, 过滤快速点击
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public class ClickUtils {
    private static long lastClickTime;

    /**
     * 判断是否可以点击
     *
     * @return true可以点击，false 说明是快速点击，不相应点击事件
     */
    public static boolean isClickable() {
        long time = System.currentTimeMillis();
        if ((time - lastClickTime) > 500) {
            lastClickTime = time;
            return true;
        }
        return false;
    }

    /**
     * 判断是否可以点击
     *
     * @return true可以执行点击操作，false 说明是快速点击，不响应点击事件（不执行点击操作）
     */
    public static boolean isClickable(int t) {
        long time = System.currentTimeMillis();
        if ((time - lastClickTime) > t) {
            lastClickTime = time;
            return true;
        }
        return false;
    }
}
