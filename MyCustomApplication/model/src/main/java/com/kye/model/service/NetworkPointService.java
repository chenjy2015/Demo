package com.kye.model.service;


import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.networkpoint_query.RequestQueryLatelyPointByUserCoordinate;
import com.kye.model.bean.networkpoint_query.RequestQueryWorkNet;
import com.kye.model.bean.networkpoint_query.ResultQueryWorkNet;

import java.util.ArrayList;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NetworkPointService {
    @Headers({"method:node_queryWorkNet"})
    @POST("router/rest")
    Single<OpenApiResult<ArrayList<ResultQueryWorkNet>>> queryWorkNet(@Body RequestQueryWorkNet requestQueryWorkNet);

    @Headers({"method:node_queryLatelyPointByUserCoordinate"})
    @POST("router/rest")
    Single<OpenApiResult<ResultQueryWorkNet>> queryLatelyPointByUserCoordinate(@Body RequestQueryLatelyPointByUserCoordinate requestQueryLatelyPointByUserCoordinate);

}
