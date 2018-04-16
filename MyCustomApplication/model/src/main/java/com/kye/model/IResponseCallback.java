package com.kye.model;

import io.reactivex.disposables.Disposable;

/**
 * @version V1.0
 * @createAuthor yzw
 * @createDate 2016/9/8 17:24
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description 网络回调接口
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public interface IResponseCallback<T> {

    /**
     * 网络请求中
     * @param d
     */
    public abstract void onResponseLoading(Disposable d);

    /**
     * 框架成功的回调
     * @param responseData 数据
     * @param code  成功码
     * @param successMsg   成功后的备注信息
     */
    public abstract void onResponseSuccess(T responseData, int code, String successMsg);

    /**
     * 网络框架失败回调。 以下三种情况至少出现一种，框架会回调这个onError方法
     * 1. retStatus = 0
     * 2. 网络超时,网络无连接，服务器端程序异常
     * 3. 框架解析过程中出现异常如 json格式不对，导致解析json数据抛异常
     * @param error 异常
     * @param errorCode 错误码
     * @param errMsg 错误信息
     */
    public abstract void onResponseError(Throwable error, int errorCode, String errMsg);

    /**
     * 取消
     * @param e
     */
    public void onResponseCancel(Throwable e);

}
