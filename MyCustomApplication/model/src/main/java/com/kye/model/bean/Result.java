package com.kye.model.bean;

import com.google.gson.annotations.SerializedName;

public class Result<T> {
    /**
     * retStatus : 0
     * errCode : 002
     * errMsg : 手机号未注册
     */

    @SerializedName("retStatus")
    private boolean retStatus;
    @SerializedName("errCode")
    private int errCode;
    @SerializedName("errMsg")
    private String errMsg;
    @SerializedName("result")
    private T result;

    public boolean getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(boolean retStatus) {
        this.retStatus = retStatus;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
