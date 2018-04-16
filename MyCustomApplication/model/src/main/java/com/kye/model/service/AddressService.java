package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.address.AddressUpdateBean;
import com.kye.model.bean.address.request.RequestAddressAndLatticePoint;
import com.kye.model.bean.address.request.RequestAddressCity;
import com.kye.model.bean.address.request.RequestAddressCountry;
import com.kye.model.bean.address.request.RequestAddressProvince;
import com.kye.model.bean.address.request.RequestAddressTown;

import java.util.TreeMap;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 31/01/2018
 * @updated : 31/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     跨越服务器地址接口服务
 */

public interface AddressService {

    @Headers({"method:jd_obtainProvince"})
    @POST("router/rest")
    Single<OpenApiResult<TreeMap<String, TreeMap<String, Integer>>>> getProvince(@Body RequestAddressProvince requestProvince);

    @Headers({"method:jd_obtainCity"})
    @POST("router/rest")
    Single<OpenApiResult<TreeMap<String, TreeMap<String, Integer>>>> getCity(@Body RequestAddressCity requestCity);

    @Headers({"method:jd_obtainCounty"})
    @POST("router/rest")
    Single<OpenApiResult<TreeMap<String, TreeMap<String, Integer>>>> getCountry(@Body RequestAddressCountry requestCountry);

    @Headers({"method:jd_obtainTown"})
    @POST("router/rest")
    Single<OpenApiResult<TreeMap<String, TreeMap<String, Integer>>>> getTown(@Body RequestAddressTown requestTown);

    @Headers({"method:login_getAddressAndLatticePoint"})
    @POST("router/rest")
    Single<OpenApiResult<AddressUpdateBean>> login_getAddressAndLatticePoint(@Body RequestAddressAndLatticePoint requestAddressAndLatticePoint);
}
