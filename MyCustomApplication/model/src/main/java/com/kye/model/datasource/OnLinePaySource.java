package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.online.request.RequestGetUnpaidFreightListBean;
import com.kye.model.bean.online.GetUnpaidFreightListResultBean;
import com.kye.model.service.OnlinePayService;

import io.reactivex.Single;

/**
 * Created by chen on 18/1/18.
 */

public class OnLinePaySource {

    private OnlinePayService onlinePayService;

    public OnLinePaySource() {
        onlinePayService = RetrofitManager.getInstance().createService(OnlinePayService.class);
    }
}
