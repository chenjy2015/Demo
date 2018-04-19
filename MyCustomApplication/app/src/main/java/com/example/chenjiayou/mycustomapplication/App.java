package com.example.chenjiayou.mycustomapplication;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatDelegate;

import com.example.chenjiayou.mycustomapplication.utils.ActivityInitUtil;
import com.example.chenjiayou.mycustomapplication.utils.RefreshLoadViewUtils;
import com.example.horizontal_display.init.StaticInit;
import com.f2prateek.rx.preferences2.RxSharedPreferences;
import com.kye.model.ApiService;
import com.kye.model.SharedPreferencesManager;
import com.kye.model.base.RetrofitManager;

import java.util.concurrent.TimeUnit;

import cn.jpush.android.api.JPushInterface;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class App extends Application {

    /*
     * 在5.0以下的设备上使用SVG
     */
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    private static App instance;
    public static App getInstance() {
        return instance;
    }

    private static Context context;
    public static Context getContext() {
        return context;
    }

    /**
     * 创建主线程Handler
     */
    private static Handler mainHandler;
    /**
     * 获取主线程Handler（get方法）
     */
    public static Handler getMainHandler() {
        return mainHandler;
    }
    /**
     * 设置主线程（set方法）
     *
     * source : http://blog.csdn.net/jason0539/article/details/18055259
     */
    public void setHandler(Handler handler) {
        mainHandler = handler;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (!getPackageName().equals(getCurrentProcessName())) {
            return;
        }


        if (instance == null) {
            instance = this;
        }

        context = this;

        mainHandler = new Handler();

        StaticInit.init(this);

        ActivityInitUtil.init(getInstance());

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        RxSharedPreferences rxSharedPreferences = RxSharedPreferences.create(sharedPreferences);
        SharedPreferencesManager.setSharedPreferences(sharedPreferences);
        SharedPreferencesManager.setRxSharedPreferences(rxSharedPreferences);

        Logger.init();
        ApiService.init(this);
        RetrofitManager.init(this);
        RefreshLoadViewUtils.init();

//        SDKInitializer.initialize(getApplicationContext());

        //Jpush
        JPushInterface.setDebugMode(false);
        JPushInterface.init(this);

        AndroidSchedulers.mainThread().scheduleDirect(new Runnable() {
            @Override
            public void run() {
//                AddressUpdater.update();
            }
        }, 2000, TimeUnit.MILLISECONDS);

     }

    /**
     * 解决Android 5.0以下出现 java.lang.NoClassDefFoundError找不到类
     * <p>
     * source http://blog.csdn.net/cgq1030699125/article/details/72123793
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }

    /**
     * 获取当前进程名称
     *
     * @return 进程名称
     */
    private String getCurrentProcessName() {
        int pid = android.os.Process.myPid();
        ActivityManager mActivityManager = (ActivityManager) this
                .getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningAppProcessInfo appProcess : mActivityManager
                .getRunningAppProcesses()) {
            if (appProcess.pid == pid) {
                return appProcess.processName;
            }
        }
        return null;
    }
}