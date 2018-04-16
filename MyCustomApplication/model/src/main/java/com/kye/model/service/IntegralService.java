package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.integral.IntegralItemListResultDataBean;
import com.kye.model.bean.integral.IntegralRecordExchangeResultBean;
import com.kye.model.bean.integral.IntegralRecordObtainResultBean;
import com.kye.model.bean.integral.IntegralUpdateByUser;
import com.kye.model.bean.integral.IntegralUserBean;
import com.kye.model.bean.integral.request.RequestIntegralExchangeRecords;
import com.kye.model.bean.integral.request.RequestIntegralItemList;
import com.kye.model.bean.integral.request.RequestIntegralObtainRecords;
import com.kye.model.bean.integral.request.RequestUpdateIntegralByUser;
import com.kye.model.bean.integral.request.RequestUserIntegral;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     积分相关服务
 */

public interface IntegralService {

    /**
     * 获取用户积分信息
     * @param requestUserIntegral
     * @return
     */
    @Headers({"method:jd_obtainIntegral"})
    @POST("router/rest")
    Single<OpenApiResult<IntegralUserBean>> getUserIntegral(@Body RequestUserIntegral requestUserIntegral);

    /**
     * 获取'兑换记录'
     * @param requestIntegralExchangeRecords
     * @return
     */
    @Headers({"method:jd_exchangeRecord"})
    @POST("router/rest")
    Single<OpenApiResult<IntegralRecordExchangeResultBean>> getIntegralExchangeRecords(@Body RequestIntegralExchangeRecords requestIntegralExchangeRecords);

    /**
     * 获取'获取记录'
     * @param requestIntegralObtainRecords
     * @return
     */
    @Headers({"method:my_getIntegralDetail"})
    @POST("router/rest")
    Single<OpenApiResult<IntegralRecordObtainResultBean>> getIntegralObtainRecords(@Body RequestIntegralObtainRecords requestIntegralObtainRecords);

    /**
     * 积分签到
     * @param requestUpdateIntegralByUser
     * @return
     */
    @Headers({"method:my_updateIntegralByUser"})
    @POST("router/rest")
    Single<OpenApiResult<IntegralUpdateByUser>> updateIntegralByUser(@Body RequestUpdateIntegralByUser requestUpdateIntegralByUser);

    /**
     * 查询拍照明细接口 (V1.0)
     * 积分中心获取记录列表
     * @param requestIntegralItemList
     * @return
     */
    @Headers({"method:my_queryPhotographDetails"})
    @POST("router/rest")
    Single<OpenApiResult<IntegralItemListResultDataBean>> getIntegralDetailList(@Body RequestIntegralItemList requestIntegralItemList);

}
