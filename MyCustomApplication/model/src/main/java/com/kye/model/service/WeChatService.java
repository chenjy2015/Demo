package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.wechat.RequestWechatExchangableMoney;
import com.kye.model.bean.wechat.RequestWechatExchange;
import com.kye.model.bean.wechat.RequestWechatOpenIdAddress;
import com.kye.model.bean.wechat.WechatExchangableMoneyBean;
import com.kye.model.bean.wechat.WechatExchangeResultBean;
import com.kye.model.bean.wechat.WechatWechatOpenIdAddressBean;

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
 *     微信
 */

public interface WeChatService {

    /**
     * 微信红包兑换查询可兑换金额接口 (V1.0)
     * @param requestWechatExchangableMoney
     * @return
     */
    @Headers({"method:wechat_showMoney"})
    @POST("router/rest")
    Single<OpenApiResult<WechatExchangableMoneyBean>> getWechatExchangableMoney(@Body RequestWechatExchangableMoney requestWechatExchangableMoney);

    /**
     * 通过手机号获取openid和有效通讯录 (V1.0)
     * @param requestWechatOpenIdAddress
     * @return
     */
    @Headers({"method:red_getOpenidAddressBookByTel"})
    @POST("router/rest")
    Single<OpenApiResult<WechatWechatOpenIdAddressBean>> getWechatOpenIdAddress(@Body RequestWechatOpenIdAddress requestWechatOpenIdAddress);

    /**
     * 微信红包兑换接口接口 (V1.0)
     * @param requestWechatExchange
     * @return
     */
    @Headers({"method:wechat_exchangeMoney"})
    @POST("router/rest")
    Single<OpenApiResult<WechatExchangeResultBean>> exchange(@Body RequestWechatExchange requestWechatExchange);

}
