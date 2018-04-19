package com.example.base.config;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.github.moduth.blockcanary.BlockCanary;
import com.squareup.leakcanary.LeakCanary;

public class BaseDebug {

    public static void init(Application application) {
        BlockCanary.install(application, new AppBlockCanaryContext(application)).start();
        Stetho.initializeWithDefaults(application);

        if (LeakCanary.isInAnalyzerProcess(application)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(application);
    }
}
