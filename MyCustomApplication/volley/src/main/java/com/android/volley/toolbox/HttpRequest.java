package com.android.volley.toolbox;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

import com.android.volley.IoUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author yzw
 * @version V1.0
 * @company 跨越速运
 * @Description 跨越速运 默认是RESPONSE_DATA_STRING
 * @date 2015/12/9
 */
public class HttpRequest extends Request {

    private final String tag = "HttpRequest";
    public static final int RESPONSE_DATA_TYPE_STRING = 1;
    public static final int RESPONSE_DATA_TYPE_OBJECT = 2;
    public static final int RESPONSE_DATA_TYPE_ARRAY = 3;
    public static final int RESPONSE_DATA_TYPE_XML_HANDLER = 4;
    public static final int RESPONSE_DATA_TYPE_NORMAL = 5;
    private static Application mApplication;
    private int mResponseDataType = 1;
    protected static Gson gson = new Gson();
    private Response.Listener<Object> listener;
    private Map<String, String> params = null;
    private Priority priority;
    private Class<?> responseClazz;
    private Type responseType;
    private HttpRequest.ResponseCallback mCallback;
    private Response.ErrorListener mErrorListener;
    private static final String USER_INFO_DISABLED = "-9";
    public static boolean printLog = true;


    /**
     * 解析编码 默认UTF-8
     */
    private String mDecodeCharset = Request.DEFAULT_PARAMS_ENCODING;

    public HttpRequest(int method, String url, Map<String, String> params, HttpRequest.ResponseCallback callback) {
        super(method, url);
        this.priority = Priority.HIGH;
        this.mErrorListener = new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                if (HttpRequest.this.mCallback != null) {
                    HttpRequest.this.mCallback.error(error, "-1", error.getMessage());
                }
            }
        };
        this.mCallback = callback;
        this.params = params;
        this.init();
    }

    /**
     * 设置解析编码
     *
     * @param charset
     */
    public void setDecodeCharset(String charset) {
        mDecodeCharset = charset;
    }

    public HttpRequest(int method, String url, HttpRequest.ResponseCallback callback) {
        super(method, url);
        if(Request.Method.GET==method){
            String currentTime = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(new Date());
            IoUtils.writeFileToLocal("请求(GET):" + currentTime+"   " + url);
        }
        this.priority = Priority.HIGH;
        this.mErrorListener = new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                if (HttpRequest.this.mCallback != null) {
                    HttpRequest.this.mCallback.error(error, "-1", error.getMessage());
                    String currentTime = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(new Date());
                    IoUtils.writeFileToLocal("响应_ERROR:" + currentTime+"   " + getOriginUrl() + "   " + error.getMessage());
                }
            }
        };
        this.mCallback = callback;
        this.init();
    }

    public Priority getPriority() {
        return this.priority;
    }

    public int compareTo(Object another) {
        return 0;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    @Override
    protected void deliverResponse(Object o) {
        this.listener.onResponse(o);
    }

    public static Application getApplication() {
        return mApplication;
    }

    public static void setApplication(Application application) {
        mApplication = application;
    }

    public static void jumpToLoginAct() {
        String action = "android.intent.action.kyelogin";
        Intent in = new Intent(action);
        in.putExtra("IS_CLEAR", true);
        in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mApplication.startActivity(in);
    }

    public void setResponseDataType(int responseDataType) {
        this.mResponseDataType = responseDataType;
    }

    public void setResponseClazz(Class<?> responseClazz) {
        this.responseClazz = responseClazz;
    }

    public void setResponseType(Type responseType) {
        this.responseType = responseType;
    }

    @Override
    protected Response parseNetworkResponse(NetworkResponse networkResponse) {
        byte[] data = networkResponse.data;

        String parsed;
        try {
            parsed = new String(data, HttpHeaderParser.parseCharset(networkResponse.headers, mDecodeCharset));
            String currentTime = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(new Date());
            IoUtils.writeFileToLocal("响应("+networkResponse.networkTimeMs+")  "+currentTime+"   "+getUrl()+"   "+parsed);
            if(printLog){
                Log.w(tag,getUrl()+"  "+parsed);
            }
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
            parsed = new String(data);
        }

        if (this.mResponseDataType == RESPONSE_DATA_TYPE_STRING) {
            return Response.success(parsed, HttpHeaderParser.parseCacheHeaders(networkResponse));
        } else if (this.mResponseDataType == RESPONSE_DATA_TYPE_OBJECT) {
            try {
                return Response.success(new JSONObject(parsed), HttpHeaderParser.parseCacheHeaders(networkResponse));
            } catch (JSONException var5) {
                var5.printStackTrace();
                return Response.error(new ParseError(var5));
            }
        } else if (this.mResponseDataType == RESPONSE_DATA_TYPE_NORMAL) {
            try {
                return Response.success(new JSONObject(parsed), HttpHeaderParser.parseCacheHeaders(networkResponse));
            } catch (JSONException var5) {
                var5.printStackTrace();
                return Response.error(new ParseError(var5));
            }
        } else {
            if (this.mResponseDataType == RESPONSE_DATA_TYPE_ARRAY) {
                try {
                    return Response.success(new JSONObject(parsed), HttpHeaderParser.parseCacheHeaders(networkResponse));
                } catch (JSONException var7) {
                    var7.printStackTrace();
                }
            }

            return null;
        }
    }

    private void init() {
//        GsonBuilder gb = new GsonBuilder();
//        gb.registerTypeAdapter(String.class, new StringConverter());
//        this.gson = gb.create();
        this.setErrorListener(this.mErrorListener);
        this.listener = new Response.Listener() {
            public void onResponse(Object response) {
                if (HttpRequest.this.mResponseDataType == RESPONSE_DATA_TYPE_STRING) {
                    if (HttpRequest.this.mCallback != null) {
                        HttpRequest.this.mCallback.success(response.toString());
                    }
                } else if (HttpRequest.this.mResponseDataType == RESPONSE_DATA_TYPE_OBJECT) {
                    try {
                        JSONObject e = (JSONObject) response;
                        int retStatus = e.optInt("retStatus", 1);
                        String errMsg = e.optString("errMsg", "");
                        String errCode = e.optString("errCode", "");
                        Object object = null;
                        if (retStatus == 1) {
                            if (e.has("result")) {
                                String result = e.getString("result");
                                if(!TextUtils.isEmpty(result)){
                                    if (HttpRequest.this.responseClazz != null) {
                                        object = HttpRequest.this.gson.fromJson(result, HttpRequest.this.responseClazz);
                                    } else if (HttpRequest.this.responseType != null) {
                                        object = HttpRequest.this.gson.fromJson(result, HttpRequest.this.responseType);
                                    } else {
                                        object = result;
                                    }
                                }
                            }
                            HttpRequest.this.mCallback.success(object, retStatus, errCode, errMsg);
                        } else {
                            if (USER_INFO_DISABLED.equals(errCode)) {
                                HttpRequest.jumpToLoginAct();
                            }
                            HttpRequest.this.mCallback.error(new VolleyError(errMsg), errCode, errMsg);
                        }
                    } catch (Exception var8) {
                        var8.printStackTrace();
                        HttpRequest.this.mCallback.error(new VolleyError(var8), "-1", var8.getMessage());
                    }
                } else if (HttpRequest.this.mResponseDataType == RESPONSE_DATA_TYPE_NORMAL) {
                    Object object = gson.fromJson(response.toString(), HttpRequest.this.responseClazz);
                    HttpRequest.this.mCallback.success(object, 1, "", "");
                } else if (HttpRequest.this.mResponseDataType == RESPONSE_DATA_TYPE_ARRAY) {
                }

            }
        };
    }

    public abstract static class ResponseCallback {
        public ResponseCallback() {
        }

        public void success(String responseStr) {
        }

        public void success(Object obj, int retStatus, String errorCode, String errMsg) {
        }

        public void error(VolleyError error, String errorCode, String errMsg) {
        }
    }
}
