package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.deposit.RequestDepositConsumptionDetailed;
import com.kye.model.bean.deposit.RequestJudgeStoredQuery;
import com.kye.model.bean.deposit.RequestDepositDetailed;
import com.kye.model.bean.deposit.RequestJudgeLegalMoney;
import com.kye.model.bean.deposit.RequestQueryReserveBalance;
import com.kye.model.bean.deposit.RequestShowPaymentRecord;
import com.kye.model.bean.deposit.RequestIsNeedTicket;
import com.kye.model.bean.deposit.RequestTradeURL;
import com.kye.model.bean.deposit.RequestUploadVoucher;
import com.kye.model.bean.deposit.RequestWXPayOrder;
import com.kye.model.bean.deposit.ResultDepositConsumptionDetailedBean;
import com.kye.model.bean.deposit.ResultDepositDetailedBean;
import com.kye.model.bean.deposit.ResultIsNeedTicketBean;
import com.kye.model.bean.deposit.ResultJudgeLegalMoneyBean;
import com.kye.model.bean.deposit.ResultJudgeStoredQueryBean;
import com.kye.model.bean.deposit.ResultQueryReserveBalanceBean;
import com.kye.model.bean.deposit.ResultShowPaymentRecordBean;
import com.kye.model.bean.deposit.ResultTradeURLBean;
import com.kye.model.bean.deposit.ResultUploadVoucherBean;
import com.kye.model.bean.deposit.ResultWXPayOrderBean;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 预存运费 相关接口服务
 * <p>
 * Created by SkyYu on 2018/1/16
 */
public interface DepositService {

    // 判断能否进入预存查询接口
    @Headers({"method:my_judgeStoredQuery"})
    @POST("router/rest")
    Single<OpenApiResult<ResultJudgeStoredQueryBean>> judgeStoredQuery(@Body RequestJudgeStoredQuery requestJudgeStoredQuery);

    // 预存余额查询接口
    @Headers({"method:my_queryReserveBalance"})
    @POST("router/rest")
    Single<OpenApiResult<ResultQueryReserveBalanceBean>> queryReserveBalance(@Body RequestQueryReserveBalance requestQueryReserveBalance);

    // 查询微信支付记录接口（我的充值）
    @Headers({"method:my_showPaymentRecord"})
    @POST("router/rest")
    Single<OpenApiResult<ResultShowPaymentRecordBean>> showPaymentRecord(@Body RequestShowPaymentRecord requestShowPaymentRecord);

    // 预存运费明细接口（全部记录） todo SkyYu
    @Headers({"method:my_depositDetailed"})
    @POST("router/rest")
    Single<OpenApiResult<ResultDepositDetailedBean>> depositDetailed(@Body RequestDepositDetailed requestDepositDetailed);

    // 预存运费明细接口（全部记录）
    @Headers({"method:my_storageConsumptionDetails"})
    @POST("router/rest")
    Single<OpenApiResult<List<ResultDepositConsumptionDetailedBean>>> storageConsumptionDetails(@Body RequestDepositConsumptionDetailed requestDepositDetailed);

    // 是否需要开票接口
    @Headers({"method:my_isNeedTicket"})
    @POST("router/rest")
    Single<OpenApiResult<ResultIsNeedTicketBean>> isNeedTicket(@Body RequestIsNeedTicket requestIsNeedTicket);

    // 传转帐凭证接口
    @Headers({"method:my_uploadVoucher"})
    @POST("router/rest")
    Single<OpenApiResult<ResultUploadVoucherBean>> uploadVoucher(@Body RequestUploadVoucher requestUploadVoucher);

    // 判断预存运费金额是否合法接口
    @Headers({"method:my_judgeLegalMoney"})
    @POST("router/rest")
    Single<OpenApiResult<ResultJudgeLegalMoneyBean>> judgeLegalMoney(@Body RequestJudgeLegalMoney requestJudgeLegalMoney);

    // app微信充值下单接口
    @Headers({"method:OpenApi_WXPayOrder"})
    @POST("router/rest")
    Single<OpenApiResult<ResultWXPayOrderBean>> wxPayOrder(@Body RequestWXPayOrder requestWXPayOrder);

    // 获取支付宝充值完整的url信息
    @Headers({"method:OpenApi_TradeURL"})
    @POST("router/rest")
    Single<OpenApiResult<ResultTradeURLBean>> tradeURL(@Body RequestTradeURL requestTradeURL);
}
