package com.kye.model;

import com.kye.base.Logger;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.gson_adapter.ApiException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/**
 * Created by yzw on 2018/4/3.
 */
public abstract class SingleApiResultObserver<T> implements SingleObserver<OpenApiResult<T>>, IResponseCallback<T> {

    public final static String NET_ERROR_MSG = "无法连接服务器，请检查你的网络设置";

    public final static String TIME_OUT_MSG = "连接超时，请稍候重试";

    public final static String SERVER_ERR_MSG = "服务器异常，请稍候重试";

    @Override
    public void onSubscribe(Disposable d) {
        onResponseLoading(d);
    }

    @Override
    public void onSuccess(OpenApiResult<T> result) {
        if (result != null && result.isSuccess()) {
            onResponseSuccess(result.getData(), result.getCode(), result.getMsg());
        } else {
            onResponseError(new ApiException(result), result.getCode(), result.getMsg());
        }
    }

    @Override
    public void onError(Throwable e) {

        Logger.e(e.getMessage());
        String errMsg  = "";
        int    errCode = -1;
        if (e instanceof CancellationException) {
            onResponseCancel(e);
            return;
        } else if (e instanceof SocketTimeoutException) {
            errMsg = TIME_OUT_MSG;
        } else if (e instanceof ConnectException) {
            errMsg = NET_ERROR_MSG;
        } else if (e instanceof ApiException) {
            ApiException  apiException  = (ApiException) e;
            OpenApiResult openApiResult = apiException.getOpenApiResult();
            onResponseError(e, openApiResult.getCode(), openApiResult.getMsg());
            return;
        } else {
            errMsg = SERVER_ERR_MSG;

        }
        onResponseError(e, errCode, errMsg);
    }

    @Override
    public void onResponseCancel(Throwable e) {

    }
}
