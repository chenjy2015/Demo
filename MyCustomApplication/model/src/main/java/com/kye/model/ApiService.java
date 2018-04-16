package com.kye.model;

import android.app.Application;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    private static ApiService sApiService;
    private ApiClient mApiClient;

    private ApiService() {}

    public static ApiService getInstance() {
        if (sApiService == null) throw new NullPointerException("ApiService hasn't been initialized");
        return sApiService;
    }

    public static void init(Application application) {
        sApiService = new ApiService();

        ApiBase.init(application);

        sApiService.initApiClient();
    }

    public static ApiClient getApiClient() {
        ApiClient apiClient = getInstance().mApiClient;
        if (apiClient == null) throw new NullPointerException("ApiClient hasn't been initialized");
        return apiClient;
    }

    private void initApiClient() {
        mApiClient = new Retrofit.Builder()
                .baseUrl(BuildConfig.HOST)
                .addConverterFactory(GsonConverterFactory.create(ApiBase.getInstance().getGson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(ApiBase.getInstance().getOkHttpClient())
                .build()
                .create(ApiClient.class);
    }

//    public static OrderService getOrderClient() {
//
//    }
}
