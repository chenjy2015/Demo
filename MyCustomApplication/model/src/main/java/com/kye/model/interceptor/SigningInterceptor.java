package com.kye.model.interceptor;

import android.text.TextUtils;

import com.kye.model.UserSession;
import com.kye.model.bean.user.User;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class SigningInterceptor implements Interceptor{

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = request.newBuilder();

        User user = UserSession.getInstance().getUser();
        if (user != null && !TextUtils.isEmpty(user.getToken()) && TextUtils.isEmpty(request.header("token"))) {
            builder = builder
                    .header("token", user.getToken());
        }

        Request build = builder.build();

        return chain.proceed(build);
    }
}
