package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.popularity.HelpInfo;
import com.kye.model.bean.popularity.PhoneNumber;
import com.kye.model.bean.popularity.request.RequestAddContacts;
import com.kye.model.bean.popularity.request.RequestGetContacts;
import com.kye.model.bean.popularity.request.RequestGetPhoneData;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface PopularityService {
    @Headers({"method:support_mobileNo"})
    @POST("router/rest")
    Single<OpenApiResult<List<PhoneNumber>>> getContacts(@Body RequestGetContacts requestGetAddressBook);

    @Headers({"method:support_communicationRecordPL"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> addContacts(@Body RequestAddContacts requestAddAddressBook);

    @Headers({"method:OpenApi_QueryHelpInfoList"})
    @POST("router/rest")
    Single<OpenApiResult<List<HelpInfo>>> getPhoneDatas(@Body RequestGetPhoneData requestGetPhoneData);

}
