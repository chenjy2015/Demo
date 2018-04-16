package com.kye.model.interceptor;

import android.text.TextUtils;

import com.google.gson.reflect.TypeToken;
import com.kye.base.Logger;
import com.kye.model.ApiBase;
import com.kye.model.BuildConfig;
import com.kye.model.UserSession;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.user.User;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class RefreshSigningInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Response originalResponse = chain.proceed(originalRequest);

        if (isTokenExpired(originalResponse) && refreshToken()) {
            Request newRequest = chain.request()
                    .newBuilder()
                    .build();
            return chain.proceed(newRequest);
        }
        return originalResponse;
    }

    private boolean isTokenExpired(Response response) {
        try {
            ResponseBody responseBody = response.peekBody(Long.MAX_VALUE);
            if (responseBody == null) return false;

            String jsonString = responseBody.string();

            JSONObject jsonObject = new JSONObject(jsonString);
            int code = jsonObject.getInt("code");

            return code == 6002;
        } catch (Throwable t) {
            Logger.e(t, "isTokenExpired");
            return false;
        }
    }

    private boolean refreshToken() {
        try {
            OkHttpClient okHttpClient = ApiBase.getInstance().getOkHttpClient();
            User user = UserSession.getInstance().getUser();
            if (user == null) return false;

            String refreshToken = user.getRefreshToken();
            if (TextUtils.isEmpty(refreshToken)) return false;

            ResponseBody body = okHttpClient.newCall(
                    new Request.Builder().url(BuildConfig.HOST + "security/refreshToken")
                            .header("Host", "openapi.ky-express.com")
                            .header("refresh_token", refreshToken)
                            .build()
            ).execute().body();

            if (body == null) return false;

            String string = body.string();
            OpenApiResult<User> result = ApiBase.getInstance().getGson().fromJson(string, new TypeToken<OpenApiResult<User>>() {
            }.getType());

            return UserSession.getInstance().refreshToken(result.getData());
        } catch (Throwable t) {
            Logger.e(t, "refreshToken");
            return false;
        }
    }
}
