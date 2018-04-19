package com.example.base.config;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.PrettyFormatStrategy;

public class Logger {

    public static void init() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                                                            .methodCount(3)         // (Optional) How many method line to show. Default 2
                                                            .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
                                                            .build();
        com.orhanobut.logger.Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy) {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });
    }

    public static void d(String message, Object... args) {
        com.orhanobut.logger.Logger.d(message, args);
    }

    public static void d(Object object) {
        com.orhanobut.logger.Logger.d(object);
    }

    public static void e(String message, Object... args) {
        com.orhanobut.logger.Logger.e(message, args);
    }

    public static void e(Throwable throwable, String message, Object... args) {
        com.orhanobut.logger.Logger.e(throwable,message,args);
    }

    public static void i(String message, Object... args) {
        com.orhanobut.logger.Logger.i(message, args);
    }

    public static void v(String message, Object... args) {
        com.orhanobut.logger.Logger.v(message, args);
    }

    public static void w(String message, Object... args) {
        com.orhanobut.logger.Logger.w(message, args);
    }

    /**
     * Tip: Use this for exceptional situations to log
     * ie: Unexpected errors etc
     */
    public static void wtf(String message, Object... args) {
        com.orhanobut.logger.Logger.wtf(message, args);
    }

    /**
     * Formats the given json content and print it
     */
    public static void json(String json) {
        com.orhanobut.logger.Logger.json(json);
    }

    /**
     * Formats the given xml content and print it
     */
    public static void xml(String xml) {
        com.orhanobut.logger.Logger.xml(xml);
    }

}
