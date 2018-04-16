package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.deposit.RequestDepositConsumptionDetailed;
import com.kye.model.bean.deposit.RequestDepositDetailed;
import com.kye.model.bean.deposit.RequestJudgeLegalMoney;
import com.kye.model.bean.deposit.RequestJudgeStoredQuery;
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
import com.kye.model.service.DepositService;

import java.util.List;

import io.reactivex.Single;

/**
 * 预存运费 数据源
 * <p>
 * Created by SkyYu on 2018/1/16
 */
public class DepositDataSource {

    private DepositService depositService;

    public DepositDataSource() {
        depositService = RetrofitManager.getInstance().createService(DepositService.class);
    }

    public Single<OpenApiResult<ResultJudgeStoredQueryBean>> judgeStoredQuery(RequestJudgeStoredQuery requestJudgeStoredQuery) {
        return depositService.judgeStoredQuery(requestJudgeStoredQuery);
    }

    public Single<OpenApiResult<ResultQueryReserveBalanceBean>> queryReserveBalance(RequestQueryReserveBalance requestQueryReserveBalance) {
        return depositService.queryReserveBalance(requestQueryReserveBalance);
    }

    public Single<OpenApiResult<ResultShowPaymentRecordBean>> showPaymentRecord(RequestShowPaymentRecord requestShowPaymentRecord) {
        return depositService.showPaymentRecord(requestShowPaymentRecord);
    }

    public Single<OpenApiResult<ResultDepositDetailedBean>> depositDetailed(RequestDepositDetailed requestDepositDetailed) {
        return depositService.depositDetailed(requestDepositDetailed);
    }

    public Single<OpenApiResult<List<ResultDepositConsumptionDetailedBean>>> storageConsumptionDetails(RequestDepositConsumptionDetailed requestDepositDetailed) {
        return depositService.storageConsumptionDetails(requestDepositDetailed);
    }

    public Single<OpenApiResult<ResultIsNeedTicketBean>> isNeedTicket(RequestIsNeedTicket requestIsNeedTicket) {
        return depositService.isNeedTicket(requestIsNeedTicket);
    }

    public Single<OpenApiResult<ResultUploadVoucherBean>> uploadVoucher(RequestUploadVoucher requestUploadVoucher) {
        return depositService.uploadVoucher(requestUploadVoucher);
    }

    public Single<OpenApiResult<ResultJudgeLegalMoneyBean>> judgeLegalMoney(RequestJudgeLegalMoney requestJudgeLegalMoney) {
        return depositService.judgeLegalMoney(requestJudgeLegalMoney);
    }

    public Single<OpenApiResult<ResultWXPayOrderBean>> wxPayOrder(RequestWXPayOrder requestWXPayOrder) {
        return depositService.wxPayOrder(requestWXPayOrder);
    }

    public Single<OpenApiResult<ResultTradeURLBean>> tradeURL(RequestTradeURL requestTradeURL) {
        return depositService.tradeURL(requestTradeURL);
    }

}
