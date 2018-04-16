package com.kye.model.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RequestUser implements Serializable{
    @SerializedName("phone")
    private String phone;

    public RequestUser(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
