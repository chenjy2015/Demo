package com.kye.model.bean.redpacket;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RequestRedPacketSendShareRedEnvelopes implements Serializable {

    @SerializedName("phone")
    private String phone;
    @SerializedName("money")
    private int money;
    @SerializedName("activitySn")
    private String activitySn;

    public RequestRedPacketSendShareRedEnvelopes(String phone, int money, String activitySn) {
        this.phone = phone;
        this.money = money;
        this.activitySn = activitySn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumber() {
        return money;
    }

    public void setNumber(int money) {
        this.money = money;
    }

    public String getActivitySn()                { return activitySn;}

    public void setActivitySn(String activitySn) { this.activitySn = activitySn;}
}