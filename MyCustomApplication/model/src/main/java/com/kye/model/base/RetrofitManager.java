package com.kye.model.base;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kye.model.BuildConfig;
import com.kye.model.ModelDebug;
import com.kye.model.gson_adapter.BooleanTypeAdapter;
import com.kye.model.gson_adapter.ByteArrayTypeAdapter;
import com.kye.model.gson_adapter.CustomConverterFactory;
import com.kye.model.interceptor.HeadersInterceptor;
import com.kye.model.interceptor.RefreshSigningInterceptor;
import com.kye.model.interceptor.SigningInterceptor;

import java.io.File;

import io.reactivex.schedulers.Schedulers;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 04/01/2018
 * @updated : 04/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RetrofitManager {

    public static final String OK_HTTP_CACHE_FILE_NAME = "OkHttpCache";
    public static final int OK_HTTP_CACHE_FILE_SIZE = 1024 * 1024 * 10;

    public static final String PATTERN = "yyyy-MM-dd HH:mm";

    // default okhttp client
    private OkHttpClient mDefaultOkHttpClient;
    private OkHttpClient mResourceOkHttpClient;
    // default retrofit
    private Retrofit mOpenApiRetrofit;
    private Retrofit mDefaultRetrofit;
    private Retrofit mResourceRetrofit;
    private Gson mGson;

    private static RetrofitManager mRetrofitManager;

    private RetrofitManager() {

    }

    public static synchronized void init(Application application) {
        mRetrofitManager = new RetrofitManager();
        mRetrofitManager.initOkHttp(application);
        mRetrofitManager.initRetrofit();
    }

    public static synchronized RetrofitManager getInstance() {
        if (mRetrofitManager == null) {
            throw new NullPointerException("RetrofitManager hasn't been initialized");
        }
        return mRetrofitManager;
    }

    private void initOkHttp(Context context) {
        File cacheFile = new File(context.getCacheDir(), OK_HTTP_CACHE_FILE_NAME);
        Cache mCache = new Cache(cacheFile, OK_HTTP_CACHE_FILE_SIZE);
        OkHttpClient.Builder builder = new OkHttpClient.Builder().cache(mCache);
        builder.addInterceptor(new HeadersInterceptor())
                .addInterceptor(new SigningInterceptor())
                .addInterceptor(new RefreshSigningInterceptor());
        if (BuildConfig.DEBUG) {
            builder = builder.addInterceptor(ModelDebug.getHttpLoggingInterceptor())
                    .addNetworkInterceptor(ModelDebug.getDebugInterceptor());
//                    .addInterceptor(new LoggingJsonInterceptor());
        }
        OkHttpClient.Builder builderResource = new OkHttpClient.Builder().cache(mCache);
        if (BuildConfig.DEBUG) {
            builderResource = builderResource.addInterceptor(ModelDebug.getHttpLoggingInterceptor())
                    .addNetworkInterceptor(ModelDebug.getDebugInterceptor());
//                    .addInterceptor(new LoggingJsonInterceptor());
        }
        mDefaultOkHttpClient = builder.build();
        mResourceOkHttpClient = builderResource.build();
    }

    private void initRetrofit() {
        mDefaultRetrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.HOST)
                .addConverterFactory(GsonConverterFactory.create(getGsonInstance()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(mDefaultOkHttpClient)
                .build();
        mOpenApiRetrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.HOST)
                .addConverterFactory(CustomConverterFactory.create(getGsonInstance()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(mDefaultOkHttpClient)
                .build();
        mResourceRetrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.HOST_RES)
                .addConverterFactory(GsonConverterFactory.create(getGsonInstance()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(mResourceOkHttpClient)
                .build();
    }

    public synchronized OkHttpClient getDefaultOkHttpClientInstance(Context context) {
        if (mDefaultOkHttpClient == null) {
            initOkHttp(context);
        }
        return mDefaultOkHttpClient;
    }

    public synchronized Retrofit getDefaultRetrofitInstance(Context context) {
        if (mDefaultRetrofit == null && mDefaultOkHttpClient == null) {
            initOkHttp(context);
        } else if (mDefaultRetrofit == null) {
            initRetrofit();
        }
        return mDefaultRetrofit;
    }

    public synchronized Gson getGsonInstance() {
        if (mGson == null) {
            mGson = new GsonBuilder()
                    .registerTypeAdapter(boolean.class, new BooleanTypeAdapter())
                    .registerTypeAdapter(byte[].class, new ByteArrayTypeAdapter())
                    .setDateFormat(PATTERN)
                    .create();
        }
        return mGson;
    }

    public Gson newGsonIntance() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(boolean.class, new BooleanTypeAdapter())
                .registerTypeAdapter(byte[].class, new ByteArrayTypeAdapter())
                .create();
        return gson;
    }

    public OkHttpClient newOkHttpClientInstance(Context context) {
        File cacheFile = new File(context.getCacheDir(), OK_HTTP_CACHE_FILE_NAME);
        Cache mCache = new Cache(cacheFile, OK_HTTP_CACHE_FILE_SIZE);
        OkHttpClient.Builder builder = new OkHttpClient.Builder().cache(mCache);
        builder.addInterceptor(new HeadersInterceptor())
                .addInterceptor(new SigningInterceptor())
                .addInterceptor(new RefreshSigningInterceptor());
        if (BuildConfig.DEBUG) {
            builder = builder.addInterceptor(ModelDebug.getHttpLoggingInterceptor())
                    .addNetworkInterceptor(ModelDebug.getDebugInterceptor());
        }
        return builder.build();
    }

    public Retrofit newRetrofitInstance(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.HOST)
                .addConverterFactory(GsonConverterFactory.create(getGsonInstance()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(okHttpClient)
                .build();
        return  retrofit;
    }

    /**
     * 创建默认请求接口服务
     * @param service
     * @param <S>
     * @return
     */
    public <S> S createOpenApiService(Class<S> service) {
        return mOpenApiRetrofit.create(service);
    }

    /**
     * 创建默认请求接口服务
     * @param service
     * @param <S>
     * @return
     */
    public <S> S createService(Class<S> service) {
        return mDefaultRetrofit.create(service);
    }

    /**
     * 创建静态资源请求接口服务
     * @param service
     * @param <S>
     * @return
     */
    public <S> S createResourceService(Class<S> service) {
        return mResourceRetrofit.create(service);
    }

}
