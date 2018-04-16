package com.example.chenjiayou.mycustomapplication.utils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import io.reactivex.annotations.NonNull;

/**
 * 货币相关工具类
 * 
 * Created by SkyYu on 19/03/2018 12:13
 */

public class CurrencyUtil {

    /**
     * 金钱数字格式化为中国货币格式
     * 如：1000转换为：1,000.00
     */
    public static String getMoneyFormatChina(@NonNull double number) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        return format.format(number);
    }

    /**
     * 小于10000的不转换，大于或等于10000的转换为1万，以此类推，110000转为11万，112000为11.2万
     *
     * @return 大于10000就返回后面保留2位小数点的double
     */
    public static double transitionTenThousand(long number) {
        if (number < 10000) {
            return number;
        } else {
            double n = (double) number / 10000;
            BigDecimal b = new BigDecimal(n);
            n = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();//2.转换后的数字四舍五入保留小数点后2位
            return n;
        }
    }

    public static double transitionTenThousand2(long  number) {
        number =  number / 100;
        float value  = (float) (number / 100.00);
        if (value == 0) {
            return value;
        }else {
            BigDecimal b = new BigDecimal(value);
            return b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    }
}
