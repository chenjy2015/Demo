package com.kye.model;

import com.kye.base.Logger;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.gson_adapter.ApiException;

import java.util.concurrent.CancellationException;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public abstract class OpenApiResultObserver<T> implements SingleObserver<OpenApiResult<T>> {

    @Override
    public void onSubscribe(Disposable d) {
        onLoading(d);
    }

    @Override
    public final void onSuccess(OpenApiResult<T> result) {
        onLoaded();

        if (result != null && result.isSuccess()) {
            onSuccess(result, result.getData());
        } else {
            onApiError(result, result.getCode(), result.getMsg());
        }
//        onSuccess(result, result.getData());
    }

    @Override
    public final void onError(Throwable e) {
        if (!(e instanceof CancellationException)){
            onLoaded();
        }
        Logger.e(e, "onOtherError");

        if (e instanceof ApiException) {
            //noinspection unchecked
            onApiError(((ApiException) e).getOpenApiResult(), ((ApiException) e).getOpenApiResult().getCode(), ((ApiException) e).getOpenApiResult().getMsg());
        } else if (e instanceof CancellationException) {
            onDisposed(e);
        } else {
            onOtherError(e);
        }
    }

    public abstract void onLoading(Disposable d);

    /**
     * 对应 onLoading
     */
    public abstract void onLoaded();

    public abstract void onSuccess(OpenApiResult<T> result, T t);

    public abstract void onApiError(OpenApiResult<T> result, int code, String msg);

    public abstract void onOtherError(Throwable e);

    public void onDisposed(Throwable e) {

    }
}
