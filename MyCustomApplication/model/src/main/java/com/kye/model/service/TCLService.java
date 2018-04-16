package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.tcl.RequestTCLGoodsDetails;
import com.kye.model.bean.tcl.RequestTCLGoodsList;
import com.kye.model.bean.tcl.ResponseTCLGoodsDetailsBean;
import com.kye.model.bean.tcl.ResponseTCLGoodsListBean;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * TCL商城 相关接口服务
 * <p>
 * Created by SkyYu on 2018/2/1
 */
public interface TCLService {

    /**
     * TCL商品列表查询接口 (V1.0)
     */
    @Headers({"method:tcl_goodsList"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseTCLGoodsListBean>> getTCLGoodsList(@Body RequestTCLGoodsList requestJDOrderRouterInfo);

    /**
     * TCL商品详情接口接口 (V1.0)
     */
    @Headers({"method:tcl_goodsDetails"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseTCLGoodsDetailsBean>> getTCLGoodsDetails(@Body RequestTCLGoodsDetails model);
}