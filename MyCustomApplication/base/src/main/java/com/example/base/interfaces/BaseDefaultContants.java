package com.example.base.interfaces;

/**
 * Created by chenjiayou on 2018/3/3.
 * BaseActivity 生命周期默认方法在此添加
 */

public interface BaseDefaultContants {

    default void setContentView(){

    }

    default int setView() {
        return 0;
    }

    default void initView() {
    }

    default void initEvent() {
    }

    default void init() {
    }

    default void initData() {
    }

    static void inits() {
    }

}

