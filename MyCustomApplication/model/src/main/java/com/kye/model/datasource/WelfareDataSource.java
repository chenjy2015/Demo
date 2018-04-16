package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.integral.request.RequestUserIntegral;
import com.kye.model.bean.integral.request.ResultGetIntegralModel;
import com.kye.model.bean.tcl.RequestTCLGoodsDetails;
import com.kye.model.bean.tcl.RequestTCLGoodsList;
import com.kye.model.bean.tcl.ResponseTCLGoodsDetailsBean;
import com.kye.model.bean.tcl.ResponseTCLGoodsListBean;
import com.kye.model.bean.welfare.RequestWelfareLiPinDH;
import com.kye.model.bean.welfare.ResponseWelfareLiPinDH;
import com.kye.model.service.TCLService;
import com.kye.model.service.WelfareService;

import io.reactivex.Single;
import retrofit2.http.Body;

/**
 * 礼品 数据源
 * <p>
 * Created by SkyYu on 2018/2/1
 */
public class WelfareDataSource {

    private WelfareService service;

    public WelfareDataSource() {
        service = RetrofitManager.getInstance().createOpenApiService(WelfareService.class);
    }

    public Single<OpenApiResult<ResultGetIntegralModel>> getWelfareList(@Body RequestUserIntegral data) {
        return service.getIntegral(data);
    }

    public Single<OpenApiResult<ResponseWelfareLiPinDH>> getWelfareList(@Body RequestWelfareLiPinDH data) {
        return service.getWelfareList(data);
    }
}