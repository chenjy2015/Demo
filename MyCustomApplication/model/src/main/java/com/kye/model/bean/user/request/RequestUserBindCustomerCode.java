package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestUserBindCustomerCode {

    @SerializedName("phone")
    private String phone;
    @SerializedName("customCode")
    private String customCode;
    @SerializedName("customPwd")
    private String customPwd;
    @SerializedName("from")
    private String from = "2";

    public RequestUserBindCustomerCode(String phone, String customCode, String customPwd) {
        this.phone = phone;
        this.customCode = customCode;
        this.customPwd = customPwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public String getCustomPwd() {
        return customPwd;
    }

    public void setCustomPwd(String customPwd) {
        this.customPwd = customPwd;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
