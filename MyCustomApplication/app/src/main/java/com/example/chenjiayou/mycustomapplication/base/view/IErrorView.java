package com.example.chenjiayou.mycustomapplication.base.view;

/**
 * Created by chenjiayou on 2018/3/30.
 */

public interface IErrorView extends ErrorView {

    void onError(int code, String msg);
    void onEditOrderError(int code, String msg);
}
