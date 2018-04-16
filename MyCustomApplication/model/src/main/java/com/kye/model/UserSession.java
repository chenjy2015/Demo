package com.kye.model;

import android.app.Activity;
import android.app.ActivityManager;
import android.text.TextUtils;

import com.kye.model.bean.user.User;

import io.reactivex.Observable;
import io.reactivex.Single;

import static com.kye.model.SharedPreferencesConfig.KEY_INTEGRAL;

public class UserSession {
    private static final String KEY_USER = SharedPreferencesConfig.KEY_USER;

    private static volatile UserSession sInstance;

    private User mUser;

    public static UserSession getInstance() {
        if (sInstance == null) {
            synchronized (UserSession.class) {
                if (sInstance == null) {
                    sInstance = new UserSession();
                }
            }
        }
        return sInstance;
    }

    public boolean setUser(User user) {
        if (user != null && (TextUtils.isEmpty(user.getToken()) || TextUtils.isEmpty(user.getRefreshToken()))) {
            user.setToken(getUser().getToken());
            user.setRefreshToken(getUser().getToken());
        }
        return SharedPreferencesManager.commit(KEY_USER, user);
    }

    public Single<Boolean> setUserForRx(User user) {
        return SharedPreferencesManager.commitForRx(KEY_USER, user);
    }

    public User getUser() {
        return SharedPreferencesManager.get(KEY_USER, User.class);
    }

    public Observable<User> getUserForRx() {
        return SharedPreferencesManager.getForRx(KEY_USER, User.class);
    }

    public boolean refreshToken(User token) {
        User user = getUser();
        if (user == null) {
            return false;
        }

        user.setToken(token.getToken());
        user.setRefreshToken(token.getRefreshToken());

        return setUser(user);
    }

    public void logout() {
        UserSession.getInstance().setUser(null);
        SharedPreferencesManager.commit(KEY_INTEGRAL, 0);

        boolean guideHome     = SharedPreferencesManager.get(SharedPreferencesConfig.KEY_APP_GUIDE_HOME, false);
        boolean guideIntegral = SharedPreferencesManager.get(SharedPreferencesConfig.KEY_APP_GUIDE_INTEGRAL, false);
        SharedPreferencesManager.clear();
        /**
         * 保存新手导航标示
         */
        SharedPreferencesManager.commit(SharedPreferencesConfig.KEY_APP_GUIDE_HOME, guideHome);
        SharedPreferencesManager.commit(SharedPreferencesConfig.KEY_APP_GUIDE_INTEGRAL, guideIntegral);
    }
}
