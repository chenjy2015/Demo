package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

public class RequestDeleteTempAddress {
    @SerializedName("phone")
    private String phone;
    @SerializedName("guid")
    private String guid;

    public RequestDeleteTempAddress(String phone, String guid) {
        this.phone = phone;
        this.guid = guid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
