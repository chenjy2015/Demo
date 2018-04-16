package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.online.AliPayAccountBean;
import com.kye.model.bean.online.GetPayRecordDetailsResultBean;
import com.kye.model.bean.online.GetPayRecordResultBean;
import com.kye.model.bean.online.GetPayResultResultBean;
import com.kye.model.bean.online.GetWaybillPayMoneyResultBean;
import com.kye.model.bean.online.PayAccountBean;
import com.kye.model.bean.online.WechatPayAccountBean;
import com.kye.model.bean.online.request.GetAliPayUrlParams;
import com.kye.model.bean.online.request.GetFreightAliPayUrlParams;
import com.kye.model.bean.online.request.GetFreightPayAccountParams;
import com.kye.model.bean.online.request.GetFreightWechatPayParams;
import com.kye.model.bean.online.request.GetPayAccountParams;
import com.kye.model.bean.online.request.GetTargeNoByWechatParams;
import com.kye.model.bean.online.request.RequestGetPayRecordBean;
import com.kye.model.bean.online.request.RequestGetPayRecordDetailsBean;
import com.kye.model.bean.online.request.RequestGetPayResultBean;
import com.kye.model.bean.online.request.RequestGetUnpaidFreightListBean;
import com.kye.model.bean.online.GetUnpaidFreightListResultBean;
import com.kye.model.bean.online.request.RequestGetWaybillPayMoneyBean;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by chen on 18/1/18.
 */

public interface OnlinePayService {

    @Headers({"method:pay_weChatPaidUnpaidFreight"})
    @POST("router/rest")
    Single<OpenApiResult<GetUnpaidFreightListResultBean>> getUnpaidFerigetList(@Body RequestGetUnpaidFreightListBean requestGetUnpaidFreightListBean);

    @Headers({"method:pay_obtainPayMoney"})
    @POST("router/rest")
    Single<OpenApiResult<List<GetWaybillPayMoneyResultBean>>> getWaybillPayMoney(@Body RequestGetWaybillPayMoneyBean requestGetWaybillPayMoneyBean);

    @Headers({"method:pay_payRecord"})
    @POST("router/rest")
    Single<OpenApiResult<GetPayRecordResultBean>> getPayRecord(@Body RequestGetPayRecordBean requestGetPayRecordBean);

    @Headers({"method:pay_payRecordDetails"})
    @POST("router/rest")
    Single<OpenApiResult<GetPayRecordDetailsResultBean>> getPayRecordDetail(@Body RequestGetPayRecordDetailsBean requestGetPayRecordDetailsBean);

    @Headers({"method:pay_judgeIsPay"})
    @POST("router/rest")
    Single<OpenApiResult<GetPayResultResultBean>> getPayResult(@Body RequestGetPayResultBean requestGetPayResultBean);


    /**
     * 获取运单支付账号
     *
     * @param getPayAccountParams
     * @return
     */
    @Headers({"method:pay_waybillObtainAccount"})
    @POST("router/rest")
    Single<OpenApiResult<List<PayAccountBean>>> getPayAccount(@Body GetPayAccountParams getPayAccountParams);


    /**
     * 获取运单支付 微信支付 获取参数
     *
     * @param getTargeNoByWechatParams
     * @return
     */
    @Headers({"method:OpenApi_WayBillPayOrder"})
    @POST("router/rest")
    Single<OpenApiResult<WechatPayAccountBean>> getPayByWechatInfor(@Body GetTargeNoByWechatParams getTargeNoByWechatParams);


    /**
     * 获取运单支付 支付宝支付 获取参数
     *
     * @param getTargeNoByWechatParams
     * @return
     */
    @Headers({"method:OpenApi_TradeOrderURL"})
    @POST("router/rest")
    Single<OpenApiResult<AliPayAccountBean>> getPayByAliInfor(@Body GetAliPayUrlParams getTargeNoByWechatParams);


    /**
     * 获取预存运费账号
     *
     * @param getFreightPayAccountParams
     * @return
     */
    @Headers({"method:pay_obtainAccount"})
    @POST("router/rest")
    Single<OpenApiResult<List<PayAccountBean>>> getFreightPayAccount(@Body GetFreightPayAccountParams getFreightPayAccountParams);


    /**
     * 预存运费 微信充值 获取支付参数
     *
     * @param getFreightWechatPayParams
     * @return
     */
    @Headers({"method:OpenApi_WXPayOrder"})
    @POST("router/rest")
    Single<OpenApiResult<WechatPayAccountBean>> getFreightPayByWechatInfor(@Body GetFreightWechatPayParams getFreightWechatPayParams);


    /**
     * 运存运费 支付宝充值 获取支付参数
     *
     * @param getFreightAliPayUrlParams
     * @return
     */
    @Headers({"method:OpenApi_TradeURL"})
    @POST("router/rest")
    Single<OpenApiResult<AliPayAccountBean>> getFreightPayByAliInfor(@Body GetFreightAliPayUrlParams getFreightAliPayUrlParams);


}
