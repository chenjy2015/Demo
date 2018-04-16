package com.example.chenjiayou.mycustomapplication.utils;

/**
 * 倒计时工具类
 * <p>
 * Created by SkyYu on 29/03/2018 11:37.
 */
public class CountDownUtil {

    private CountDownUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 毫秒格式化成分秒时
     * <p>
     * desc    400毫秒 = 0:6:40
     * <p>
     * source  https://blog.csdn.net/jky_yihuangxing/article/details/50952563
     */
    public static String formatLongToTimeStr(Long l) {
        int hour   = 0;
        int minute = 0;
        int second = l.intValue();
        if (second > 60) {
            minute = second / 60;         //取整
            second = second % 60;         //取余
        }
        if (minute > 60) {
            hour = minute / 60;
            minute = minute % 60;
        }
        return hour + ":" + minute + ":" + second;
    }
}
