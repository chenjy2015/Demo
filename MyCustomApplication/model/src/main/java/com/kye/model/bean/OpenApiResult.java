package com.kye.model.bean;

import com.google.gson.annotations.SerializedName;

public class OpenApiResult<T> {

    /**
     * code : 0
     * msg : OK
     * data : {"retStatus":0,"errCode":"002","errMsg":"手机号未注册"}
     * success : true
     */

    @SerializedName("code")
    private int code;
    @SerializedName("msg")
    private String msg = "";
    @SerializedName("data")
    private T data;
    @SerializedName("success")
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
