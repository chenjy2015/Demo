package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.comment.notice.PvBean;
import com.kye.model.bean.comment.notice.RequestPvBean;
import com.kye.model.bean.comment.notice.RequestUploadPvBean;
import com.kye.model.bean.notice.NotificationDetailBasicInfoBean;
import com.kye.model.bean.notice.NotificationListResultBean;
import com.kye.model.bean.notice.request.NotificationDetailRequestParam;
import com.kye.model.bean.notice.request.NotificationListRequestParam;
import com.kye.model.service.NotificationService;

import io.reactivex.Single;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 26/12/2017
 * @updated : 26/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class NotificationDataSource {

    private NotificationService notificationService;

    public NotificationDataSource() {
        notificationService = RetrofitManager.getInstance().createOpenApiService(NotificationService.class);
    }

    public Single<OpenApiResult<NotificationListResultBean>> getNotificationList(NotificationListRequestParam notificationListRequestParam) {
        return notificationService.getNotificationList(notificationListRequestParam);
    }

    public Single<OpenApiResult<NotificationDetailBasicInfoBean>> getNotificationDetail(NotificationDetailRequestParam notificationDetailRequestParam) {
        return notificationService.getNotificationDetail(notificationDetailRequestParam);
    }

    public Single<OpenApiResult<PvBean>> getNotificationPV(RequestPvBean requestPvBean) {
        return notificationService.getNotificationPv(requestPvBean);
    }

    public Single<OpenApiResult<Object>> uploadPv(RequestUploadPvBean requestUploadPvBean) {
        return notificationService.uploadPV(requestUploadPvBean);
    }
}
