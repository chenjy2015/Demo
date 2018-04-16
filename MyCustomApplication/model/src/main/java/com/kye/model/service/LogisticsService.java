package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.dstance.DstanceBean;
import com.kye.model.bean.logistics.LogisticsDriverInfoBean;
import com.kye.model.bean.logistics.LogisticsDriverVirtualPhoneBean;
import com.kye.model.bean.logistics.LogisticsListResultBean;
import com.kye.model.bean.logistics.LogisticsReceiptInfomationBean;
import com.kye.model.bean.logistics.LogisticsSendAndReceiveRecordBean;
import com.kye.model.bean.logistics.LogisticsUrgeResultBean;
import com.kye.model.bean.logistics.LogisticsWayBillDetailResultBean;
import com.kye.model.bean.logistics.RequestLogisticsDriverInfo;
import com.kye.model.bean.logistics.request.RequestLogisticsList;
import com.kye.model.bean.logistics.request.RequestLogisticsPlanReceiveTime;
import com.kye.model.bean.logistics.request.RequestLogisticsSendAndReceiveRecords;
import com.kye.model.bean.logistics.request.RequestLogisticsSendDistance;
import com.kye.model.bean.logistics.request.RequestLogisticsUrge;
import com.kye.model.bean.logistics.request.RequestLogisticsWayBillDetail;
import com.kye.model.bean.logistics.request.RequestPostLogisticsUrgeMessage;
import com.kye.model.bean.logistics.request.RequestReceiptsInfomation;
import com.kye.model.bean.logistics.request.RequestVirtualPhone;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 04/01/2018
 * @updated : 04/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     物流相关服务接口
 */

public interface LogisticsService {

    /**
     * Logistics 15查询询用户寄收记录接口
     * @param requestLogisticsSendAndReceiveRecords
     * @return
     */
    @Headers({"method:logistics_queryUsersSendRecord"})
    @POST("router/rest")
    Single<OpenApiResult<LogisticsSendAndReceiveRecordBean>> getLogisticsSendAndReceiveRecords(@Body RequestLogisticsSendAndReceiveRecords requestLogisticsSendAndReceiveRecords);

    /**
     * 寄收件查询（已、未签收）接口V5 (V1.0)
     * @param requestLogisticsList
     * @return
     */
    @Headers({"method:logistics_sendToReceiveQuery"})
    @POST("router/rest")
    Single<OpenApiResult<LogisticsListResultBean>> getLogisticsList(@Body RequestLogisticsList requestLogisticsList);

    /**
     * 催件(取派整合)接口 (V1.0)
     * @param requestLogisticsUrge
     * @return
     */
    @Headers({"method:logistics_pushCollectionIntegration"})
    @POST("router/rest")
    Single<OpenApiResult<LogisticsUrgeResultBean>> postLogisticsUrge(@Body RequestLogisticsUrge requestLogisticsUrge);

    /**
     * 客户催件备注接口 (V1.0)
     * 催件留言接口
     * @param requestPostLogisticsUrgeMessage
     * @return
     */
    @Headers({"method:logistics_customerReminders"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> postLogisticsUrgeMessage(@Body RequestPostLogisticsUrgeMessage requestPostLogisticsUrgeMessage);

    /**
     * 获取司机信息
     * @param requestLogisticsDriverInfo
     * @return
     */
    @Headers({"method:logistics_displayPicture"})
    @POST("router/rest")
    Single<OpenApiResult<LogisticsDriverInfoBean>> getLogisticsDriverInfo(@Body RequestLogisticsDriverInfo requestLogisticsDriverInfo);

    /**
     * 运单查询接口 (V1.0)
     * 运单详情
     * @param requestLogisticsWayBillDetail
     * @return
     */
    @Headers({"method:logistics_waybillQuery"})
    @POST("router/rest")
    Single<OpenApiResult<LogisticsWayBillDetailResultBean>> getLogisticsWayBillDetail(@Body RequestLogisticsWayBillDetail requestLogisticsWayBillDetail);

    /**
     *  派货距离
     * @return
     */
    @Headers({"method:logistics_sendDistance"})
    @POST("router/rest")
    Single<OpenApiResult<DstanceBean>> getLogisticsSendDistance(@Body RequestLogisticsSendDistance requestLogisticsSendDistance);

    /**
     * 修改指定时间接口 (V1.0)
     * @param requestLogisticsPlanReceiveTime
     * @return
     */
    @Headers({"method:logistics_changeSpecifiedTime"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> modifySpecifiedTime(@Body RequestLogisticsPlanReceiveTime requestLogisticsPlanReceiveTime);

    /**
     * 查看回单信息接口 (V1.0)
     * @param requestReceiptsInfomation
     * @return
     */
    @Headers({"method:logistics_queryReceiptsInformation"})
    @POST("router/rest")
    Single<OpenApiResult<LogisticsReceiptInfomationBean>> getReceiptsInfomation(@Body RequestReceiptsInfomation requestReceiptsInfomation);


    /**
     * 查询虚拟号 (V1.0)
     * @param requestVirtualPhone
     * @return
     */
    @Headers({"method:my_queryVirtualPhone"})
    @POST("router/rest")
    Single<OpenApiResult<LogisticsDriverVirtualPhoneBean>> getVirtualPhone(@Body RequestVirtualPhone requestVirtualPhone);

}
