package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.customer_intro.AddCustomerIntroResultBean;
import com.kye.model.bean.customer_intro.CustomerAppealResultBean;
import com.kye.model.bean.customer_intro.CustomerIntroHistoryResultBean;
import com.kye.model.bean.customer_intro.GetCashCountResultBean;
import com.kye.model.bean.customer_intro.GetCustomerIntroDetailResultBean;
import com.kye.model.bean.customer_intro.GetIntroInfoResultBean;
import com.kye.model.bean.customer_intro.GetOpenIdResultBean;
import com.kye.model.bean.customer_intro.GetSMSVerificationCodeResultBean;
import com.kye.model.bean.customer_intro.GetVerificationCodeResultBean;
import com.kye.model.bean.customer_intro.RequestAddCustomerIntroBean;
import com.kye.model.bean.customer_intro.RequestCustomerAppealBean;
import com.kye.model.bean.customer_intro.RequestCustomerIntroHistoryBean;
import com.kye.model.bean.customer_intro.RequestGetCashCountBean;
import com.kye.model.bean.customer_intro.RequestGetCustomerIntroDetailBean;
import com.kye.model.bean.customer_intro.RequestGetIntroInfoBean;
import com.kye.model.bean.customer_intro.RequestGetOpenIdBean;
import com.kye.model.bean.customer_intro.RequestGetSMSVerificationCodeBean;
import com.kye.model.bean.customer_intro.RequestGetVerificationCodeBean;
import com.kye.model.bean.customer_intro.RequestWithdrawBean;
import com.kye.model.bean.customer_intro.RequestWithdrawHistoryBean;
import com.kye.model.bean.customer_intro.WithdrawHistoryResultBean;
import com.kye.model.bean.customer_intro.WithdrawResultBean;
import com.kye.model.bean.user.request.RequestGetImageVerificationCode;
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

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface CustomerIntroService {

    @Headers({"method:jd_obtainIntegral"})
    @POST("router/rest")
    Single<OpenApiResult<GetCashCountResultBean>> getCashCount(@Body RequestGetCashCountBean requestGetCashCountBean);

    @POST("router/rest")
    Single<OpenApiResult<AddCustomerIntroResultBean>> addCustomerIntro(@Header("method") String method, @Body RequestAddCustomerIntroBean requestAddCustomerIntroBean);

    @Headers({"method:client_findCustomers"})
    @POST("router/rest")
    Single<OpenApiResult<CustomerIntroHistoryResultBean>> getCustomerIntroHistory(@Body RequestCustomerIntroHistoryBean requestCustomerIntroHistoryBean);

    @Headers({"method:client_findCustomersRemark"})
    @POST("router/rest")
    Single<OpenApiResult<GetCustomerIntroDetailResultBean>> getCustomerIntroDetail(@Body RequestGetCustomerIntroDetailBean requestGetCustomerIntroDetailBean);

    @Headers({"method:client_customersSubmitComplaint"})
    @POST("router/rest")
    Single<OpenApiResult<CustomerAppealResultBean>> customerAppeal(@Body RequestCustomerAppealBean requestCustomerAppealBean);

    @Headers({"method:red_getOpenidAddressBookByTel"})
    @POST("router/rest")
    Single<OpenApiResult<GetOpenIdResultBean>> getOpenId(@Body RequestGetOpenIdBean requestGetOpenIdBean);

    @Headers({"method:exchange_pictureVerification"})
    @POST("router/rest")
    Single<OpenApiResult<GetVerificationCodeResultBean>> getVerificationCode(@Body RequestGetVerificationCodeBean requestGetVerificationCodeBean);

    @Headers({"method:exchange_smsVerification"})
    @POST("router/rest")
    Single<OpenApiResult<GetSMSVerificationCodeResultBean>> getSMSVerificationCode(@Body RequestGetSMSVerificationCodeBean requestGetSMSVerificationCodeBean);

    @Headers({"method:client_customersWithdrawal"})
    @POST("router/rest")
    Single<OpenApiResult<WithdrawResultBean>> withDraw(@Body RequestWithdrawBean requestWithdrawBean);

    @Headers({"method:client_findWithdrawalRecord"})
    @POST("router/rest")
    Single<OpenApiResult<WithdrawHistoryResultBean>> getWithDrawHistory(@Body RequestWithdrawHistoryBean requestWithdrawHistoryBean);

    @Headers({"method:client_getIntroduceModify"})
    @POST("router/rest")
    Single<OpenApiResult<GetIntroInfoResultBean>> getIntroInfo(@Body RequestGetIntroInfoBean requestGetIntroInfoBean);

}
