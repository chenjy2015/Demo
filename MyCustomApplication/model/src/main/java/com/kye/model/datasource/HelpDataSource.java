package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.help.RequestGetHelpList;
import com.kye.model.bean.help.RequestQueryHelpHotList;
import com.kye.model.bean.help.RequestQueryHelpList;
import com.kye.model.bean.help.ResultGetHelpListBean;
import com.kye.model.bean.help.ResultQueryHelpHotListBean;
import com.kye.model.bean.help.ResultQueryHelpListBean;
import com.kye.model.service.HelpService;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 帮助 数据源
 *
 * Created by SkyYu on 2018/1/10
 */
public class HelpDataSource {

    private HelpService helpService;

    public HelpDataSource() {
        helpService = RetrofitManager.getInstance().createService(HelpService.class);
    }

    public Single<OpenApiResult<List<ResultGetHelpListBean>>> getHelpDataList(RequestGetHelpList requestGetHelpList) {
        return helpService.getHelpDataList(requestGetHelpList);
    }

    public Single<OpenApiResult<List<ResultQueryHelpListBean>>> queryHelpInfoList(RequestQueryHelpList requestQueryHelpList) {
        return helpService.queryHelpInfoList(requestQueryHelpList);
    }

    public Single<OpenApiResult<ResultQueryHelpHotListBean>> queryHotSearch(RequestQueryHelpHotList requestQueryHelpList) {
        return helpService.queryHotSearch(requestQueryHelpList);
    }

}
