package com.example.chenjiayou.mycustomapplication;

import android.app.Application;

import com.example.horizontal_display.init.StaticInit;


/**
 * Created by chenjiayou on 2018/3/5.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        StaticInit.init(this);
    }

}
