package com.kye.model.service;


import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.waybill_search.RequestAcquiredQueryHistory;
import com.kye.model.bean.waybill_search.RequestDeleteHistoryRecord;
import com.kye.model.bean.waybill_search.RequestWaybillQuery;
import com.kye.model.bean.waybill_search.ResultAcquredQueryHistory;
import com.kye.model.bean.waybill_search.ResultDeleteHistoryRecord;
import com.kye.model.bean.waybill_search.ResultWaybillQuery;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface WaybillQueryService {
    @Headers({"method:logistics_waybillQuery"})
    @POST("router/rest")
    Single<OpenApiResult<ResultWaybillQuery>> waybillQuery(@Body RequestWaybillQuery requestWaybillQuery);

    @Headers({"method:logistics_acquiredQueryHistory"})
    @POST("router/rest")
    Single<OpenApiResult<ResultAcquredQueryHistory>> acquiredQueryHistory(@Body RequestAcquiredQueryHistory requestAcquiredQueryHistory);

    @Headers({"method:logistics_deleteHistoryRecord"})
    @POST("router/rest")
    Single<OpenApiResult<ResultDeleteHistoryRecord>> deleteHistoryRecord(@Body RequestDeleteHistoryRecord requestDeleteHistoryRecord);
}
