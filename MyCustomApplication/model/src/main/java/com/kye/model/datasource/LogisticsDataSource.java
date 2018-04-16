package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
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
import com.kye.model.service.LogisticsService;

import io.reactivex.Single;
import retrofit2.http.Body;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/01/2018
 * @updated : 15/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsDataSource {

    private LogisticsService service;

    public LogisticsDataSource() {
        service = RetrofitManager.getInstance().createOpenApiService(LogisticsService.class);
    }

    public Single<OpenApiResult<LogisticsSendAndReceiveRecordBean>> getLogisticsSendAndReceiveRecords(RequestLogisticsSendAndReceiveRecords requestLogisticsSendAndReceiveRecords) {
        return service.getLogisticsSendAndReceiveRecords(requestLogisticsSendAndReceiveRecords);
    }

    public Single<OpenApiResult<LogisticsListResultBean>> getLogisticsList(RequestLogisticsList requestLogisticsList) {
        return service.getLogisticsList(requestLogisticsList);
    }

    public Single<OpenApiResult<LogisticsUrgeResultBean>> postLogisticsUrge(RequestLogisticsUrge requestLogisticsUrge) {
        return service.postLogisticsUrge(requestLogisticsUrge);
    }

    public Single<OpenApiResult<Object>> postLogisticsUrgeMessage(RequestPostLogisticsUrgeMessage requestPostLogisticsUrgeMessage) {
        return service.postLogisticsUrgeMessage(requestPostLogisticsUrgeMessage);
    }

    public Single<OpenApiResult<LogisticsDriverInfoBean>> getLogisticsDriverInfo(RequestLogisticsDriverInfo requestLogisticsDriverInfo) {
        return service.getLogisticsDriverInfo(requestLogisticsDriverInfo);
    }

    public Single<OpenApiResult<LogisticsWayBillDetailResultBean>> getLogisticsWayBillDetail(@Body RequestLogisticsWayBillDetail requestLogisticsWayBillDetail) {
        return service.getLogisticsWayBillDetail(requestLogisticsWayBillDetail);
    }

    public Single<OpenApiResult<DstanceBean>> getLogisticsSendDistance(RequestLogisticsSendDistance requestLogisticsSendDistance) {
        return service.getLogisticsSendDistance(requestLogisticsSendDistance);
    }

    public Single<OpenApiResult<Object>> modifySpecifiedTime(@Body RequestLogisticsPlanReceiveTime requestLogisticsPlanReceiveTime) {
        return service.modifySpecifiedTime(requestLogisticsPlanReceiveTime);
    }

    public Single<OpenApiResult<LogisticsReceiptInfomationBean>> getReceiptsInfomation(RequestReceiptsInfomation requestReceiptsInfomation) {
        return service.getReceiptsInfomation(requestReceiptsInfomation);
    }

    public Single<OpenApiResult<LogisticsDriverVirtualPhoneBean>> getVirtualPhone(@Body RequestVirtualPhone requestVirtualPhone) {
        return service.getVirtualPhone(requestVirtualPhone);
    }

}
