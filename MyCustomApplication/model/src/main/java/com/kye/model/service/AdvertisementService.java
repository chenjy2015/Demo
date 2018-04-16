package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.advertisement.AdvertisementBean;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/01/2018
 * @updated : 06/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     广告相关接口服务
 */

public interface AdvertisementService {

    @GET
    Single<List<AdvertisementBean>> getAdvertisementList(@Url String url);

    @Headers({"method:OpenApi_Advertisement"})
    @POST("router/rest")
    Single<OpenApiResult<List<AdvertisementBean>>> getAdvertisementList(@Body Object requestAdvertisementList);
}
