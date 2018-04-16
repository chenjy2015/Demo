package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.vip.RequestVipExchangableMoney;
import com.kye.model.bean.vip.RequestVipExchange;
import com.kye.model.bean.vip.VipExchangableMoneyBean;
import com.kye.model.bean.vip.VipExchangeResultBean;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 09/02/2018
 * @updated : 09/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     唯品会兑换
 */

public interface VipService {

    /**
     * 唯品会兑换查询可兑换金额接口
     * @param requestVipExchangableMoney
     * @return
     */
    @Headers({"method:vip_queryMoney"})
    @POST("router/rest")
    Single<OpenApiResult<VipExchangableMoneyBean>> getVipExchangableMoney(@Body RequestVipExchangableMoney requestVipExchangableMoney);

    /**
     * 微信红包兑换查询可兑换金额接口 (V1.0)
     * @param requestVipExchange
     * @return
     */
    @Headers({"method:vip_exchange"})
    @POST("router/rest")
    Single<OpenApiResult<VipExchangeResultBean>> exchange(@Body RequestVipExchange requestVipExchange);

}
