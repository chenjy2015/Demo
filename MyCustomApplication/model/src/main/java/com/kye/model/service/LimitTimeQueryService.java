package com.kye.model.service;


import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.limit_time_query.RequestFindServiceAging;
import com.kye.model.bean.limit_time_query.ResultFindServiceAging;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface LimitTimeQueryService {

    @Headers({"method:aging_findServiceAging"})
    @POST("router/rest")
    Single<OpenApiResult<ResultFindServiceAging>> findServiceAging(@Body RequestFindServiceAging requestFindServiceAging);
}
