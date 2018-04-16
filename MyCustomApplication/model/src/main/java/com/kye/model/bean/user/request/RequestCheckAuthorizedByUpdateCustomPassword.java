package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestCheckAuthorizedByUpdateCustomPassword {
    @SerializedName("phone")
    private String phone;
    @SerializedName("customCode")
    private String customCode;

    public RequestCheckAuthorizedByUpdateCustomPassword(String phone, String customCode) {
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
}
