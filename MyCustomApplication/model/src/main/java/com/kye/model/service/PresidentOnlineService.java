package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.president_online.PermissionForPresidentOnlineBean;
import com.kye.model.bean.president_online.PresidentOnlineAddResultBean;
import com.kye.model.bean.president_online.PresidentOnlineListBean;
import com.kye.model.bean.president_online.PresidentOnlineResBean;
import com.kye.model.bean.president_online.PresidentOnlineScoreBean;
import com.kye.model.bean.president_online.RequestPermissionForPresidentOnlineBean;
import com.kye.model.bean.president_online.RequestPresidentOnlineAddBean;
import com.kye.model.bean.president_online.RequestPresidentOnlineListBean;
import com.kye.model.bean.president_online.RequestPresidentOnlineResBean;
import com.kye.model.bean.president_online.RequestPresidentOnlineScoreBean;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface PresidentOnlineService {

    @Headers({"method:hotline_messageList"})
    @POST("router/rest")
    Single<OpenApiResult<PresidentOnlineListBean>> getMessageList(@Body RequestPresidentOnlineListBean requestPresidentOnlineListBean);

    @Headers({"method:hotline_message"})
    @POST("router/rest")
    Observable<OpenApiResult<PresidentOnlineAddResultBean>> addMessage(@Body RequestPresidentOnlineAddBean requestPresidentOnlineAddBean);

    @Headers({"method:hotline_obtainDate"})
    @POST("router/rest")
    Single<OpenApiResult<PresidentOnlineResBean>> getResDatas(@Body RequestPresidentOnlineResBean requestPresidentOnlineResBean);

    @Headers({"method:hotline_userSatisfaction"})
    @POST("router/rest")
    Single<OpenApiResult<PresidentOnlineScoreBean>> userScore(@Body RequestPresidentOnlineScoreBean requestPresidentOnlineScoreBean);

    @Headers({"method:hotline_judgeJurisdiction"})
    @POST("router/rest")
    Single<OpenApiResult<PermissionForPresidentOnlineBean>> judgeJurisdiction(@Body RequestPermissionForPresidentOnlineBean requestPermissionForPresidentOnline);
}
