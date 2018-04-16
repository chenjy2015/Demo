package com.kye.model.service;


import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.found.RequestQueryActivityInfoList;
import com.kye.model.bean.found.RequestQueryNewsList;
import com.kye.model.bean.found.RequestQueryVideoInfoList;
import com.kye.model.bean.found.ResultQueryActivityInfoList;
import com.kye.model.bean.found.ResultQueryNewsList;
import com.kye.model.bean.found.ResultQueryVideoInfoList;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface FoundService {

    @Headers({"method:OpenApi_QueryActivityInfoList"})
    @POST("router/rest")
    Single<OpenApiResult<List<ResultQueryActivityInfoList>>> queryActivityInfoList(@Body RequestQueryActivityInfoList requestQueryActivityInfoList);

    @Headers({"method:OpenApi_QueryNewsList"})
    @POST("router/rest")
    Single<OpenApiResult<List<ResultQueryNewsList>>> queryNewsList(@Body RequestQueryNewsList requestQueryNewsList);

    @Headers({"method:OpenApi_QueryVideoInfoList"})
    @POST("router/rest")
    Single<OpenApiResult<List<ResultQueryVideoInfoList>>> queryVideoInfoList(@Body RequestQueryVideoInfoList requestQueryVideoInfoList);

}
