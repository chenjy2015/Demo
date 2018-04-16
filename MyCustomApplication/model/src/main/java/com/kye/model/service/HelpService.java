package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.help.RequestGetHelpList;
import com.kye.model.bean.help.RequestQueryHelpHotList;
import com.kye.model.bean.help.RequestQueryHelpList;
import com.kye.model.bean.help.ResultGetHelpListBean;
import com.kye.model.bean.help.ResultQueryHelpHotListBean;
import com.kye.model.bean.help.ResultQueryHelpListBean;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 帮助 相关接口服务
 *
 * Created by SkyYu on 2018/1/10
 */
public interface HelpService {

    // 帮助列表
    @Headers({"method:OpenApi_QueryHelpInfoList"})
    @POST("router/rest")
    Single<OpenApiResult<List<ResultGetHelpListBean>>> getHelpDataList(@Body RequestGetHelpList requestGetHelpList);

    // 帮助搜索
    @Headers({"method:OpenApi_QueryHelpInfoList"})
    @POST("router/rest")
    Single<OpenApiResult<List<ResultQueryHelpListBean>>> queryHelpInfoList(@Body RequestQueryHelpList requestQueryHelpListActivityInfoList);

    // 热门搜索
    @Headers({"method:OpenApi_Hotsearch"})
    @POST("router/rest")
    Single<OpenApiResult<ResultQueryHelpHotListBean>> queryHotSearch(@Body RequestQueryHelpHotList requestQueryHelpHotList);
}
