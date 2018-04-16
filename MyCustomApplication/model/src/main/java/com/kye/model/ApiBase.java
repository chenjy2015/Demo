package com.kye.model;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kye.model.gson_adapter.BooleanTypeAdapter;
import com.kye.model.gson_adapter.ByteArrayTypeAdapter;
import com.kye.model.interceptor.HeadersInterceptor;
import com.kye.model.interceptor.RefreshSigningInterceptor;
import com.kye.model.interceptor.SigningInterceptor;

import java.io.File;

import okhttp3.Cache;
import okhttp3.OkHttpClient;

public class ApiBase {

    public static final String OK_HTTP_CACHE_FILE_NAME = "OkHttpCache";
    public static final int OK_HTTP_CACHE_FILE_SIZE = 1024 * 1024 * 10;

    private static ApiBase sApiBase;

    private Cache mCache;

    private OkHttpClient mOkHttpClient;
    private Gson mGson;

    private ApiBase() {}

    public static void init(Application application) {
        sApiBase = new ApiBase();

        sApiBase.initGson();

        sApiBase.initCache(application);
        sApiBase.initOkHttp();
    }

    public static ApiBase getInstance() {
        if (sApiBase == null) throw new NullPointerException("ApiBase hasn't been initialized");
        return sApiBase;
    }

    private void initGson() {
        mGson = new GsonBuilder()
                .registerTypeAdapter(boolean.class, new BooleanTypeAdapter())
                .registerTypeAdapter(byte[].class, new ByteArrayTypeAdapter())
                .create();
    }

    private void initCache(Context context) {
        File cacheFile = new File(context.getCacheDir(), OK_HTTP_CACHE_FILE_NAME);
        mCache = new Cache(cacheFile, OK_HTTP_CACHE_FILE_SIZE);
    }

    private void initOkHttp() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .cache(mCache);

        builder = builder.addInterceptor(new HeadersInterceptor())
                .addInterceptor(new SigningInterceptor())
                .addInterceptor(new RefreshSigningInterceptor());

        if (BuildConfig.DEBUG) {
            if (ModelDebug.getHttpLoggingInterceptor() != null && ModelDebug.getDebugInterceptor() != null) {
                builder = builder.addInterceptor(ModelDebug.getHttpLoggingInterceptor())
                        .addNetworkInterceptor(ModelDebug.getDebugInterceptor());
            }
        }

        mOkHttpClient = builder.build();
    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }

    public Gson getGson() {
        return mGson;
    }
}
