package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.comment.notice.PvBean;
import com.kye.model.bean.comment.notice.RequestPvBean;
import com.kye.model.bean.comment.notice.RequestUploadPvBean;
import com.kye.model.bean.notice.NotificationDetailBasicInfoBean;
import com.kye.model.bean.notice.NotificationListResultBean;
import com.kye.model.bean.notice.request.NotificationDetailRequestParam;
import com.kye.model.bean.notice.request.NotificationListRequestParam;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/01/2018
 * @updated : 06/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 */

public interface NotificationService {

    @Headers({"method:OpenApi_NotificationList"})
    @POST("router/rest")
    Single<OpenApiResult<NotificationListResultBean>> getNotificationList(@Body NotificationListRequestParam notificationListRequestParam);

    @Headers({"method:OpenApi_QueryNotification"})
    @POST("router/rest")
    Single<OpenApiResult<NotificationDetailBasicInfoBean>> getNotificationDetail(@Body NotificationDetailRequestParam notificationDetailRequestParam);

    // 阅读量
    @Headers({"method:log_queryExternalAppModule"})
    @POST("router/rest")
    Single<OpenApiResult<PvBean>> getNotificationPv(@Body RequestPvBean requestPvBean);

    // 上报阅读
    @Headers("method:OpenApi_SaveUserBrowser")
    @POST("router/rest")
    Single<OpenApiResult<Object>> uploadPV(@Body RequestUploadPvBean requestUploadPvBean);
}
