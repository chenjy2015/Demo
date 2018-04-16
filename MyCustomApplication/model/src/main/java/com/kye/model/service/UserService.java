package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.RequestUser;
import com.kye.model.bean.user.BirthDayGiftIntegral;
import com.kye.model.bean.user.PushSetting;
import com.kye.model.bean.user.User;
import com.kye.model.bean.user.request.RequestBindJpushIdBean;
import com.kye.model.bean.user.request.RequestCheckAuthorizedByUpdateCustomPassword;
import com.kye.model.bean.user.request.RequestCompleteInformation;
import com.kye.model.bean.user.request.RequestEditPersonalSetting;
import com.kye.model.bean.user.request.RequestGetBirthDay;
import com.kye.model.bean.user.request.RequestGetImageVerificationCode;
import com.kye.model.bean.user.request.RequestGetSmsVerificationCode;
import com.kye.model.bean.user.request.RequestGetUser;
import com.kye.model.bean.user.request.RequestLoginWithSmsVerificationCode;
import com.kye.model.bean.user.request.RequestModifyCustomerPassword;
import com.kye.model.bean.user.request.RequestPushSetting;
import com.kye.model.bean.user.request.RequestUserBindCustomerCode;
import com.kye.model.bean.user.request.RequestUserUnBindCustomerCode;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UserService {
    @Headers({"x-from:4"})
    @POST("smsCaptcha")
    Single<OpenApiResult<Object>> getSmsVerificationCode(@Body RequestGetSmsVerificationCode requestGetSmsVerificationCode);

    @Headers({"x-from:4"})
    @POST("security/app/accessToken")
    Single<OpenApiResult<User>> loginWithSmsVerificationCode(@Body RequestLoginWithSmsVerificationCode requestLoginWithSmsVerificationCode, @Header("x-device") String device, @Header("x-version") String version);

    @Headers({"x-from:4"})
    @POST("captcha")
    Single<OpenApiResult<byte[]>> getImageVerificationCode(@Body RequestGetImageVerificationCode requestGetImageVerificationCode);

    @Headers({"x-from:4"})
    @POST("security/app/logout")
    Single<OpenApiResult<Object>> logout();

    @Headers({"method:login_updateUserRegistInfo"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> completeInformation(@Body RequestCompleteInformation requestCompleteInformation, @Header("token") String token);

    @Headers({"method:login_findByTel"})
    @POST("router/rest")
    Single<OpenApiResult<User>> getUser(@Body RequestGetUser requestGetUser);

    @Headers({"method:login_findByTel"})
    @POST("router/rest")
    Single<OpenApiResult<User>> getUserWithToken(@Body RequestGetUser requestGetUser, @Header("token") String token);

    @Headers({"method:userCode_bindCode"})
    @POST("router/rest")
    Single<OpenApiResult<User>> bindCustomerCode(@Body RequestUserBindCustomerCode requestUserBindCustomerCode);

    @Headers({"method:userCode_unbindCode"})
    @POST("router/rest")
    Single<OpenApiResult<User>> unbindCustomerCode(@Body RequestUserUnBindCustomerCode requestUserUnBindCustomerCode);

    @Headers({"method:my_checkAuthorizedByUpdatePwd"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> checkAuthorizedByUpdateCustomPassword(@Body RequestCheckAuthorizedByUpdateCustomPassword requestCheckAuthorizedByUpdateCustomPassword);

    @Headers({"method:my_revisePersonalInformation"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> editPersonalSetting(@Body RequestEditPersonalSetting requestEditPersonalSetting);

    @Headers({"method:my_modifyCustomerPassword"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> modifyCustomerPassword(@Body RequestModifyCustomerPassword requestModifyCustomerPassword);

    @Headers({"method:login_push"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> bindJpushId(@Body RequestBindJpushIdBean requestBindJpushIdBean);

    @Headers({"method:my_whetherAcceptsMessages"})
    @POST("router/rest")
    Single<OpenApiResult<PushSetting>> getPushSetting(@Body RequestUser requestUser);

    @Headers({"method:my_updateAcceptsMessages"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> setPushSetting(@Body RequestPushSetting requestPushSetting);

    @Headers({"method:login_birthdayGiftIntegral"})
    @POST("router/rest")
    Single<OpenApiResult<BirthDayGiftIntegral>> birthdayGiftIntegral(@Body RequestGetBirthDay requestGetBirthDay);
}
