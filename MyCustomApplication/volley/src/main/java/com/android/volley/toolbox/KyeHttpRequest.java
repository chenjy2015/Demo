package com.android.volley.toolbox;

import android.text.TextUtils;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.InternalUtils;
import com.android.volley.IoUtils;
import com.google.gson.GsonBuilder;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yzw
 * @version V1.0
 * @company 跨越速运
 * @Description
 * @date 2015/12/14
 */
public class KyeHttpRequest extends HttpRequest {

    private final String tag = KyeHttpRequest.class.getSimpleName();

    public static String K = "12714484946C8B35145FE5C02C1D92BB";

    public static String Ke = "B436065254F82C292978CAB3AA4A181F";

    public static String ORGANIZATION = "10001";

    public boolean isFirst = true;

    public KyeHttpRequest(int method, String url, Map<String, String> params, ResponseCallback callback) {
        super(method, url, params, callback);
        gson = new GsonBuilder().disableHtmlEscaping().create();
    }

    public KyeHttpRequest(int method, String url, ResponseCallback callback) {
        super(method, url, callback);
        gson = new GsonBuilder().disableHtmlEscaping().create();
    }

    @Override
    public String getBodyContentType() {
        return "application/json; charset=" + getParamsEncoding();
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> headers = new HashMap<String, String>();
        String accessToken = createIdentifier();
        if (printLog && isFirst) {
            Log.w(tag, "accessToken = " + accessToken + " url =" + getOriginUrl());
            isFirst = false;
        }
        if (accessToken != null) {
            headers.put("access-token", accessToken);
            headers.put("kye", ORGANIZATION);
        }
        return headers;
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        Map<String, String> params = getParams();
        if (params != null && params.size() > 0) {
            return encodeParameters(params, getParamsEncoding());
        }
        return null;
    }

    /**
     * Converts <code>params</code> into an application/x-www-form-urlencoded encoded string.
     */
    private byte[] encodeParameters(Map<String, String> params, String paramsEncoding) {
        try {
            String data = gson.toJson(params);
            String currentTime = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(new Date());
            IoUtils.writeFileToLocal("请求  " + currentTime+"    " + getOriginUrl() + "     " + data);
            if (printLog) {
                Log.w(tag, getOriginUrl() + "  data:  " + data);
            }
             return data.getBytes(paramsEncoding);
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException("Encoding not supported: " + paramsEncoding, uee);
        }
    }

    /**
     * 鉴权
     *
     * @return 鉴权后的字符
     */
    public String createIdentifier() {
        Map<String, String> parmas = getParams();
        if (parmas == null) {
            return null;
        }
        Set<String> keySet = parmas.keySet();
        String[] keys = new String[keySet.size()];
        parmas.keySet().toArray(keys);
        Arrays.sort(keys);
        StringBuilder sb = new StringBuilder();
        sb.append(K);
        for (String key : keys) {
            String value = parmas.get(key);
            if (!TextUtils.isEmpty(value)&&!TextUtils.isEmpty(value.trim())) {
                sb.append(key + value);
            }
        }
        return InternalUtils.encryptionMD5(sb.toString()).toUpperCase();
    }
}
