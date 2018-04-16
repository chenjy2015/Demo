package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.score.RequestCheckScore;
import com.kye.model.bean.score.RequestPostScore;
import com.kye.model.bean.score.ScoreCheckResultBean;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/01/2018
 * @updated : 19/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *      订单和运单评分相关服务
 */

public interface ScoreService {

    @Headers({"method:order_scoring"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> postScore(@Body RequestPostScore requestPostScore);

    @Headers({"method:order_checkScoring"})
    @POST("router/rest")
    Single<OpenApiResult<ScoreCheckResultBean>> checkScore(@Body RequestCheckScore requestCheckScore);

}
