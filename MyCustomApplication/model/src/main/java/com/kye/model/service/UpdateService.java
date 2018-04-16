package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.update.RequestAppUpGrade;
import com.kye.model.bean.update.ResponseAppUpGrade;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UpdateService {

    /**
     * 外部APP升级接口 (V1.0)
     */
    @Headers({"method:OpenApi_AppUpGrade"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseAppUpGrade>> checkUpdate(@Body RequestAppUpGrade request);
}
