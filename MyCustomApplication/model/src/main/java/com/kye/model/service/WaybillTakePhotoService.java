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
import com.kye.model.bean.waybill_take_photo.GetIsInternalUserResultBean;
import com.kye.model.bean.waybill_take_photo.QueryWaybillImageResultBean;
import com.kye.model.bean.waybill_take_photo.QueryWaybillTakePhotoHistoryResultBean;
import com.kye.model.bean.waybill_take_photo.RequestGetIsInternalUserBean;
import com.kye.model.bean.waybill_take_photo.RequestQueryWaybillImageBean;
import com.kye.model.bean.waybill_take_photo.RequestQueryWaybillTakePhotoHistoryBean;
import com.kye.model.bean.waybill_take_photo.RequestUploadWaybillPictureBean;
import com.kye.model.bean.waybill_take_photo.RequestValidateWaybillUploadBean;
import com.kye.model.bean.waybill_take_photo.UploadWaybillPictureResultBean;
import com.kye.model.bean.waybill_take_photo.ValidateWaybillUploadResultBean;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface WaybillTakePhotoService {

    @Headers({"method:waybill_validateWaybillUpload"})
    @POST("router/rest")
    Single<OpenApiResult<ValidateWaybillUploadResultBean>> validateWaybillUpload(@Body RequestValidateWaybillUploadBean requestValidateWaybillUploadBean);

    @Headers({"method:waybill_uploadWaybillPicture"})
    @POST("router/rest")
    Single<OpenApiResult<List<UploadWaybillPictureResultBean>>> uploadWaybillPicture(@Body RequestUploadWaybillPictureBean requestUploadWaybillPictureBean);

    @Headers({"method:my_queryPhotographDetails"})
    @POST("router/rest")
    Single<OpenApiResult<QueryWaybillTakePhotoHistoryResultBean>> queryWaybillTakephotoHistory(@Body RequestQueryWaybillTakePhotoHistoryBean requestQueryWaybillTakePhotoHistoryBean);

    @Headers({"method:my_queryWaybillImageByIntegral"})
    @POST("router/rest")
    Single<OpenApiResult<QueryWaybillImageResultBean>> queryWaybillImage(@Body RequestQueryWaybillImageBean requestQueryWaybillImageBean);

    @Headers({"method:waybill_isUser"})
    @POST("router/rest")
    Single<OpenApiResult<GetIsInternalUserResultBean>> getIsInternalUser(@Body RequestGetIsInternalUserBean requestGetIsInternalUserBean);

}
