package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestGetUser {

    /**
     * phone : 1242351
     * from : 2
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("from")
    private String from = "2";

    public RequestGetUser(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
