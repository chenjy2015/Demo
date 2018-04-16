package com.kye.model;

import android.text.TextUtils;
import android.util.Log;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.kye.base.Logger;

import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

public class ModelDebug {

    private static final String OK_HTTP_LOG = "OkHttpLog";

    public static Interceptor getHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                if (BuildConfig.DEBUG) {
                    if (!TextUtils.isEmpty(message) && message.startsWith("{")) {
                        Logger.json(message);
                    }
                    Log.i(OK_HTTP_LOG, message);
                }
            }
        });

        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return httpLoggingInterceptor;
    }

    public static Interceptor getDebugInterceptor() {
        return new StethoInterceptor();
    }
}
