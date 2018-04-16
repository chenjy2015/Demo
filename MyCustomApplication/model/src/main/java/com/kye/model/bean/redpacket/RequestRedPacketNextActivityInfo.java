package com.kye.model.bean.redpacket;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RequestRedPacketNextActivityInfo implements Serializable {

    @SerializedName("phone")
    private String phone;

    public RequestRedPacketNextActivityInfo(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}