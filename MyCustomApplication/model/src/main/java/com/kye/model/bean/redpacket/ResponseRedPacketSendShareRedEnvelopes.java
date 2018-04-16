package com.kye.model.bean.redpacket;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseRedPacketSendShareRedEnvelopes implements Serializable {

    /**
     * activitySn : 160421134210
     * money : 20.1
     * sponsor : 跨越速运集团
     */

    @SerializedName("activitySn")
    private String activitySn;
    @SerializedName("money")
    private double money;
    @SerializedName("sponsor")
    private String sponsor;

    public String getActivitySn()                { return activitySn;}

    public void setActivitySn(String activitySn) { this.activitySn = activitySn;}

    public double getMoney()                     { return money;}

    public void setMoney(double money)           { this.money = money;}

    public String getSponsor()                   { return sponsor;}

    public void setSponsor(String sponsor)       { this.sponsor = sponsor;}
}