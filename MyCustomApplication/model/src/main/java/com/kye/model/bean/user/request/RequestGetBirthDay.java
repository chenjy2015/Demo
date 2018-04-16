package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by harry on 2018/3/27 18:53.
 */

public class RequestGetBirthDay {
    @SerializedName("phone")
    private String phone;

    public RequestGetBirthDay(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
