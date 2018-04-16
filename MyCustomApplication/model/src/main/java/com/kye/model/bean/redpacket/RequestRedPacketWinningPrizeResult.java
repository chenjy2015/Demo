package com.kye.model.bean.redpacket;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RequestRedPacketWinningPrizeResult implements Serializable {

    @SerializedName("phone")
    private String phone;
    @SerializedName("activitySn")
    private String activitySn;

    public RequestRedPacketWinningPrizeResult(String phone, String activitySn) {
        this.phone = phone;
        this.activitySn = activitySn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getActivitySn()                { return activitySn;}

    public void setActivitySn(String activitySn) { this.activitySn = activitySn;}
}