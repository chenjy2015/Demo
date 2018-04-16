package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.tcl.RequestTCLGoodsDetails;
import com.kye.model.bean.tcl.RequestTCLGoodsList;
import com.kye.model.bean.tcl.ResponseTCLGoodsDetailsBean;
import com.kye.model.bean.tcl.ResponseTCLGoodsListBean;
import com.kye.model.service.TCLService;

import io.reactivex.Single;
import retrofit2.http.Body;

/**
 * TCL商城 数据源
 * <p>
 * Created by SkyYu on 2018/2/1
 */
public class TCLDataSource {

    private TCLService service;

    public TCLDataSource() {
        service = RetrofitManager.getInstance().createOpenApiService(TCLService.class);
    }

    public Single<OpenApiResult<ResponseTCLGoodsListBean>> getTCLGoodsList(@Body RequestTCLGoodsList data) {
        return service.getTCLGoodsList(data);
    }

    public Single<OpenApiResult<ResponseTCLGoodsDetailsBean>> getTCLGoodsDetail(@Body RequestTCLGoodsDetails data) {
        return service.getTCLGoodsDetails(data);
    }


}
