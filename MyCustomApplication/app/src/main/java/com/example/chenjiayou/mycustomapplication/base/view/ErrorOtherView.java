package com.example.chenjiayou.mycustomapplication.base.view;

/**
 * 为OpenApiResultObserver的回调函数(onApiError和onOtherError）定制的错误类型View
 *
 * Created by SkyYu on 2018/4/11
 */
public interface ErrorOtherView {

    void onApiError(Object result, int code, String msg);

    void onOtherError(Throwable e);
}
