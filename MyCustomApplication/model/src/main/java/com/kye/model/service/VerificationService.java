package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.verification.PictureVerificationResultBean;
import com.kye.model.bean.verification.request.RequestAutoSendMessage;
import com.kye.model.bean.verification.request.RequestPictureVerification;
import com.kye.model.bean.verification.request.RequestSmsVerification;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/02/2018
 * @updated : 06/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public interface VerificationService {

    /**
     * 获取验证码接口 (V1.0)
     * 类型（
     * type=0为新用户注册时获取验证码
     * type=1为找回密码获取验证码
     * type=2为兑换礼品获取验证码
     * type=3为红包获取验证码
     * type=4为提现获取验证码
     * type=5为登录获取验证码(不需要图型动态码)
     * type=6为登录获取验证码
     * type=7为查询运费获取验证码）
     * @param requestSmsVerification
     * @return
     */
    @Headers({"method:exchange_smsVerification"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> getSmsVerification(@Body RequestSmsVerification requestSmsVerification);

    /**
     * 获取动态验证码接口 (V1.0) 历史版本
     * @param requestPictureVerification
     * @return
     */
    @Headers({"method:exchange_pictureVerification"})
    @POST("router/rest")
    Single<OpenApiResult<PictureVerificationResultBean>> getPictureVerification(@Body RequestPictureVerification requestPictureVerification);

    /**
     * 收到用户绑定兑换账号短信后自动发送短信验证码接口 (V1.0)
     * @param requestAutoSendMessage
     * @return
     */
    @Headers({"method:exchange_autoSendMessage"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> getAutoSendMessage(@Body RequestAutoSendMessage requestAutoSendMessage);

}
