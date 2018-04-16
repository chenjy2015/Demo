package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.integral.request.RequestUserIntegral;
import com.kye.model.bean.integral.request.ResultGetIntegralModel;
import com.kye.model.bean.tcl.RequestTCLGoodsDetails;
import com.kye.model.bean.tcl.RequestTCLGoodsList;
import com.kye.model.bean.tcl.ResponseTCLGoodsDetailsBean;
import com.kye.model.bean.tcl.ResponseTCLGoodsListBean;
import com.kye.model.bean.welfare.RequestWelfareLiPinDH;
import com.kye.model.bean.welfare.ResponseWelfareLiPinDH;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 礼品 相关接口服务
 * <p>
 * Created by SkyYu on 2018/2/6
 */
public interface WelfareService {

    /**
     * 获取用户积分及当前积分汇率接口 (V1.0)
     */
    @Headers({"method:jd_obtainIntegral"})
    @POST("router/rest")
    Single<OpenApiResult<ResultGetIntegralModel>> getIntegral(@Body RequestUserIntegral requestUserIntegral);

    /**
     * 礼品兑换地址地址 (V1.0)
     */
    @Headers({"method:OpenApi_liPinDH"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseWelfareLiPinDH>> getWelfareList(@Body RequestWelfareLiPinDH requestJDOrderRouterInfo);
}