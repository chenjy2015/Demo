package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestUserUnBindCustomerCode {
    @SerializedName("phone")
    private String phone;
    @SerializedName("customCode")
    private String customCode;
    @SerializedName("from")
    private String from = "2";

    public RequestUserUnBindCustomerCode(String phone, String customCode) {
        this.phone = phone;
        this.customCode = customCode;
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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
