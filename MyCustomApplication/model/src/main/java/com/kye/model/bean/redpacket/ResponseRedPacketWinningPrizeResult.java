package com.kye.model.bean.redpacket;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ResponseRedPacketWinningPrizeResult implements Parcelable {

    /**
     * activitySn : 123456
     * money : 5.66
     * isShow : true
     * description : 分享描述
     * isHasTime : false
     * sponsor : 跨越速运集团
     * serviceDateTime : 2017-12-27 11:21:00
     */

    @SerializedName("activitySn")
    private String  activitySn;
    @SerializedName("money")
    private double  money;
    @SerializedName("isShow")
    private boolean isShow;
    @SerializedName("description")
    private String  description;
    @SerializedName("isHasTime")
    private boolean isHasTime;
    @SerializedName("sponsor")
    private String  sponsor;
    @SerializedName("serviceDateTime")
    private String  serviceDateTime;

    public String getActivitySn()                          { return activitySn;}

    public void setActivitySn(String activitySn)           { this.activitySn = activitySn;}

    public double getMoney()                               { return money;}

    public void setMoney(double money)                     { this.money = money;}

    public boolean isIsShow()                              { return isShow;}

    public void setIsShow(boolean isShow)                  { this.isShow = isShow;}

    public String getDescription()                         { return description;}

    public void setDescription(String description)         { this.description = description;}

    public boolean isIsHasTime()                           { return isHasTime;}

    public void setIsHasTime(boolean isHasTime)            { this.isHasTime = isHasTime;}

    public String getSponsor()                             { return sponsor;}

    public void setSponsor(String sponsor)                 { this.sponsor = sponsor;}

    public String getServiceDateTime()                     { return serviceDateTime;}

    public void setServiceDateTime(String serviceDateTime) { this.serviceDateTime = serviceDateTime;}


    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.activitySn);
        dest.writeDouble(this.money);
        dest.writeByte(this.isShow ? (byte) 1 : (byte) 0);
        dest.writeString(this.description);
        dest.writeByte(this.isHasTime ? (byte) 1 : (byte) 0);
        dest.writeString(this.sponsor);
        dest.writeString(this.serviceDateTime);
    }

    public ResponseRedPacketWinningPrizeResult() {}

    protected ResponseRedPacketWinningPrizeResult(Parcel in) {
        this.activitySn = in.readString();
        this.money = in.readDouble();
        this.isShow = in.readByte() != 0;
        this.description = in.readString();
        this.isHasTime = in.readByte() != 0;
        this.sponsor = in.readString();
        this.serviceDateTime = in.readString();
    }

    public static final Creator<ResponseRedPacketWinningPrizeResult> CREATOR = new Creator<ResponseRedPacketWinningPrizeResult>() {
        @Override
        public ResponseRedPacketWinningPrizeResult createFromParcel(Parcel source) {return new ResponseRedPacketWinningPrizeResult(source);}

        @Override
        public ResponseRedPacketWinningPrizeResult[] newArray(int size) {return new ResponseRedPacketWinningPrizeResult[size];}
    };
}