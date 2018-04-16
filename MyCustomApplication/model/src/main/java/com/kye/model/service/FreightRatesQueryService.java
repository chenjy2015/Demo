package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.freight_rates_query.GetCustomerInfoResultBean;
import com.kye.model.bean.freight_rates_query.PermissionQueryCostResultBean;
import com.kye.model.bean.freight_rates_query.QueryAreaByCustomerCodeResultBean;
import com.kye.model.bean.freight_rates_query.QueryBillingMethodResultBean;
import com.kye.model.bean.freight_rates_query.QueryCostResultBean;
import com.kye.model.bean.freight_rates_query.QueryFreightRightsResultBean;
import com.kye.model.bean.freight_rates_query.QueryWaybillCostResultBean;
import com.kye.model.bean.freight_rates_query.RequestGetCustomerInfoBean;
import com.kye.model.bean.freight_rates_query.RequestPermissionQueryCostBean;
import com.kye.model.bean.freight_rates_query.RequestQueryAreaByCustomerCodeBean;
import com.kye.model.bean.freight_rates_query.RequestQueryBillingMethodBean;
import com.kye.model.bean.freight_rates_query.RequestQueryCostBean;
import com.kye.model.bean.freight_rates_query.RequestQueryFreightRightsBean;
import com.kye.model.bean.freight_rates_query.RequestQueryWaybillCostBean;
import com.kye.model.bean.president_online.PermissionForPresidentOnlineBean;
import com.kye.model.bean.president_online.RequestPermissionForPresidentOnlineBean;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface FreightRatesQueryService {

    @Headers({"method:pay_queryAreaCodeAdressByCustomerCode"})
    @POST("router/rest")
    Single<OpenApiResult<QueryAreaByCustomerCodeResultBean>> queryAreaCodeAdressByCustomerCode(@Body RequestQueryAreaByCustomerCodeBean requestPermissionForPresidentOnline);

    @Headers({"method:pay_queryBillingMethod"})
    @POST("router/rest")
    Single<OpenApiResult<QueryBillingMethodResultBean>> queryBillingMethod(@Body RequestQueryBillingMethodBean requestQueryBillingMethodBean);

    @Headers({"method:pay_queryCost"})
    @POST("router/rest")
    Single<OpenApiResult<QueryCostResultBean>> queryCost(@Body RequestQueryCostBean requestQueryCostBean);

    @Headers({"method:pay_queryWaybillCost"})
    @POST("router/rest")
    Single<OpenApiResult<QueryWaybillCostResultBean>> queryWaybillCost(@Body RequestQueryWaybillCostBean requestQueryWaybillCostBean);

    @Headers({"method:pay_judgeFreightCalculate"})
    @POST("router/rest")
    Single<OpenApiResult<PermissionQueryCostResultBean>> permissionQueryCost(@Body RequestPermissionQueryCostBean requestPermissionQueryCostBean);

    @Headers({"method:my_getCustomerInfoAutomatic"})
    @POST("router/rest")
    Single<OpenApiResult<GetCustomerInfoResultBean>> getCustomerInfo(@Body RequestGetCustomerInfoBean requestGetCustomerInfoBean);

    @Headers({"method:pay_queryFreightRights"})
    @POST("router/rest")
    Single<OpenApiResult<QueryFreightRightsResultBean>> queryFreightRights(@Body RequestQueryFreightRightsBean requestQueryFreightRightsBean);
}
