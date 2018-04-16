package com.kye.model.interceptor;

import com.kye.model.BuildConfig;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HeadersInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Request.Builder builder = request
                .newBuilder()
                .header("Content-type", "application/json; charset=UTF-8")
                .addHeader("format", "JSON")
                .addHeader("appkey", "10001");

        if ("debug".equals(BuildConfig.BUILD_TYPE)) {
            builder = builder.addHeader("host", "openapi.ky-express.com");
        }

        Request build = builder
                .build();

        return chain.proceed(build);
    }
}
