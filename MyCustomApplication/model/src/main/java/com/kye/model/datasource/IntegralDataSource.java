package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
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
import com.kye.model.service.IntegralService;

import io.reactivex.Single;
import retrofit2.http.Body;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class IntegralDataSource {

    private IntegralService service;

    public IntegralDataSource() {
        service = RetrofitManager.getInstance().createOpenApiService(IntegralService.class);
    }

    /**
     * 获取用户积分信息
     * @param requestUserIntegral
     * @return
     */
    public Single<OpenApiResult<IntegralUserBean>> getUserIntegral(@Body RequestUserIntegral requestUserIntegral) {
        return service.getUserIntegral(requestUserIntegral);
    }

    /**
     * 获取'兑换记录'
     * @param requestIntegralExchangeRecords
     * @return
     */
    public Single<OpenApiResult<IntegralRecordExchangeResultBean>> getIntegralExchangeRecords(@Body RequestIntegralExchangeRecords requestIntegralExchangeRecords) {
        return service.getIntegralExchangeRecords(requestIntegralExchangeRecords);
    }

    /**
     * 获取'获取记录'
     * @param requestIntegralObtainRecords
     * @return
     */
    public Single<OpenApiResult<IntegralRecordObtainResultBean>> getIntegralObtainRecords(@Body RequestIntegralObtainRecords requestIntegralObtainRecords) {
        return service.getIntegralObtainRecords(requestIntegralObtainRecords);
    }

    /**
     * 积分签到
     * @param requestUpdateIntegralByUser
     * @return
     */
    public Single<OpenApiResult<IntegralUpdateByUser>> updateIntegralByUser(@Body RequestUpdateIntegralByUser requestUpdateIntegralByUser) {
        return service.updateIntegralByUser(requestUpdateIntegralByUser);
    }

    /**
     * 积分中心获取记录列表
     * @param requestIntegralItemList
     * @return
     */
    public Single<OpenApiResult<IntegralItemListResultDataBean>> getIntegralDetailList(@Body RequestIntegralItemList requestIntegralItemList) {
        return service.getIntegralDetailList(requestIntegralItemList);
    }

}
