package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.freight_rates_query.GetCustomerInfoResultBean;
import com.kye.model.bean.freight_rates_query.RequestGetCustomerInfoBean;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by chenjiayou on 2018/4/16.
 */

public interface ElecOrderService {

    /**
     * 自动带出客户编码及密码
     * @param requestGetCustomerInfoBean
     * @return
     */
    @Headers({"method:order_electronicWaybill"})
    @POST("router/rest")
    Single<OpenApiResult<GetCustomerInfoResultBean>> getCustomerInfo(@Body RequestGetCustomerInfoBean requestGetCustomerInfoBean);

}
