package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.RequestUser;
import com.kye.model.bean.bill.BillListBean;
import com.kye.model.bean.bill.BillPermissions;
import com.kye.model.bean.bill.FinanceInfo;
import com.kye.model.bean.bill.MonthlyBalanceBillBean;
import com.kye.model.bean.bill.request.RequestConfirmBill;
import com.kye.model.bean.bill.request.RequestGetBill;
import com.kye.model.bean.bill.request.RequestGetBillDetail;
import com.kye.model.bean.bill.request.RequestGetBillList;

import java.util.List;
import java.util.Map;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface BillService {

    /**
     * 检查是否有新账单
     */
    @Headers({"method:bill_checkBill"})
    @POST("router/rest")
    Single<OpenApiResult<Map<String, Integer>>> hasNewBill(@Body RequestUser requestUser);

    /**
     * 获取月份账单列表
     */
    @Headers({"method:bill_obtainUserBill"})
    @POST("router/rest")
    Single<OpenApiResult<List<MonthlyBalanceBillBean>>> getMonthlyBalanceBillList(@Body RequestUser requestUser);

    /**
     * 获取月份账单详情
     */
    @Headers({"method:bill_obtainUserBillDetail"})
    @POST("router/rest")
    Single<OpenApiResult<MonthlyBalanceBillBean>> getMonthlyBalanceBill(@Body RequestGetBill requestGetBill);

    /**
     * 获取财务信息
     */
    @Headers({"method:bill_obtainPhone"})
    @POST("router/rest")
    Single<OpenApiResult<FinanceInfo>> getFinanceInfo(@Body RequestUser requestUser);

    /**
     * 确认账单
     */
    @Headers({"method:bill_determineBill"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> confirmMonthlyBalanceBill(@Body RequestConfirmBill requestConfirmBill);

    /**
     * 获取账单列表
     */
    @Headers({"method:bill_obtainBillDetail"})
    @POST("router/rest")
    Single<OpenApiResult<BillListBean>> getBillList(@Body RequestGetBillList requestGetBillList);

    /**
     * 获取账单详情
     */
    @Headers({"method:bill_obtainBillDetails"})
    @POST("router/rest")
    Single<OpenApiResult<BillListBean.BillBean>> getBillDetail(@Body RequestGetBillDetail requestGetBillDetail);

    /**
     * 检查是否有权限
     */
    @Headers({"method:bill_userType"})
    @POST("router/rest")
    Single<OpenApiResult<BillPermissions>> hasBillPermissions(@Body RequestUser requestUser);
}
