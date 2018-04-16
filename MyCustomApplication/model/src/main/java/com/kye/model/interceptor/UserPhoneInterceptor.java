package com.kye.model.interceptor;

import android.text.TextUtils;

import com.kye.base.Logger;
import com.kye.model.UserSession;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.Charset;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/**
 * 每次都需要 phone 参数，太烦了
 */
public class UserPhoneInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private static final String KEY_PHONE = "phone";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        try {
            Buffer sink = new Buffer();
            RequestBody body = request.body();
            if (UserSession.getInstance().getUser().isLogin() && body != null) {
                body.writeTo(sink);

                String s = sink.readString(UTF8);

                JSONObject jsonObject = new JSONObject(s);
                String phone = jsonObject.optString(KEY_PHONE);
                if (TextUtils.isEmpty(phone)) {
                    jsonObject.put(KEY_PHONE, UserSession.getInstance().getUser().getPhone());
                }

                RequestBody.create(body.contentType(), jsonObject.toString());

                return chain.proceed(request.newBuilder()
                        .method(request.method(), RequestBody.create(body.contentType(), jsonObject.toString()))
                        .build());
            }
        } catch (Throwable throwable) {
            Logger.e(throwable, "UserPhoneInterceptor");
        }
        return chain.proceed(request);
    }
}
