package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.redpacket.RequestRedPacketGetUserActivityInfo;
import com.kye.model.bean.redpacket.RequestRedPacketSendShareRedEnvelopes;
import com.kye.model.bean.redpacket.RequestRedPacketWinningPrizeResult;
import com.kye.model.bean.redpacket.ResponseRedPacketGetUserActivityInfo;
import com.kye.model.bean.redpacket.ResponseRedPacketSendShareRedEnvelopes;
import com.kye.model.bean.redpacket.ResponseRedPacketWinningPrizeResult;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 摇红包 相关接口服务
 * <p>
 * Created by SkyYu on 2018/3/27
 */
public interface RedPacketService {

    /**
     * 进入活动页面时调用，返回通讯录条数、openid、活动信息、是否中奖等信息 (V1.0)
     */
    @Headers({"method:red_getUserActivityInfo"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseRedPacketGetUserActivityInfo>> getUserActivityInfo(@Body RequestRedPacketGetUserActivityInfo request);

    /**
     * 获取下一次红包活动信息接口 (V1.0)
     */
    @Headers({"method:red_nextActivityInfo"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseRedPacketGetUserActivityInfo>> nextActivityInfo(@Body RequestRedPacketGetUserActivityInfo request);

    /**
     * 中奖后返回金额 (V1.0)
     */
    @Headers({"method:red_winningPrizeResult"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseRedPacketWinningPrizeResult>> winningPrizeResult(@Body RequestRedPacketWinningPrizeResult request);

    /**
     * 分享后返回分享红包信息 (V1.0)
     */
    @Headers({"method:red_sendShareRedEnvelopes"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseRedPacketSendShareRedEnvelopes>> sendShareRedEnvelopes(@Body RequestRedPacketSendShareRedEnvelopes request);
}