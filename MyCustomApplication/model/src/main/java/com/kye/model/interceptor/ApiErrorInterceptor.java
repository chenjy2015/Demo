package com.kye.model.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

public class ApiErrorInterceptor implements Interceptor{
    @Override
    public Response intercept(Chain chain) throws IOException {
        return null;
    }
}
