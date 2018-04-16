package com.kye.model.bean.popularity.request;

import com.google.gson.annotations.SerializedName;

public class RequestGetContacts {
    @SerializedName("phone")
    private String phone;

    public RequestGetContacts(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
