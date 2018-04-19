package com.example.base.config;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.example.base.BuildConfig;
import com.github.moduth.blockcanary.BlockCanaryContext;

public class AppBlockCanaryContext extends BlockCanaryContext {

    private static final String TAG = "AppBlockCanaryContext";
    private final Context mContext;

    public AppBlockCanaryContext(Context context) {
        mContext = context;
    }

    @Override
    public String provideQualifier() {
        String qualifier = "";
        try {
            PackageInfo info = mContext.getPackageManager()
                    .getPackageInfo(mContext.getPackageName(), 0);
            qualifier += info.versionCode + "_" + info.versionName + "_YYB";
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "provideQualifier exception", e);
        }
        return qualifier;
    }

    @Override
    public String provideUid() {
        return "8964";
    }

    @Override
    public int provideMonitorDuration() {
        return 9999;
    }

    @Override
    public int provideBlockThreshold() {
        return 500;
    }

    @Override
    public boolean displayNotification() {
        return BuildConfig.DEBUG;
    }

    @Override
    public boolean stopWhenDebugging() {
        return true;
    }
}
