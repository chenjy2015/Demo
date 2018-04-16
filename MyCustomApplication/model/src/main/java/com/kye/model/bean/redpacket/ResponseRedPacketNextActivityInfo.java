package com.kye.model.bean.redpacket;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseRedPacketNextActivityInfo implements Parcelable {

    /**
     * errorCode : 1
     * serviceDateTime : 2018-01-10 22:52:29
     * activityBeginTime : 2018-01-10 23:10:00
     * activityEndTime : 2018-01-10 23:20:00
     * activitySn : 180110225206
     * bannerImgUrl : ["http://img.ky-express.com/App/Shake/1.png","http://img.ky-express.com/App/Shake/2.png","http://img.ky-express
     * .com/App/Shake/3.png","http://img.ky-express.com/App/Shake/4.png","http://img.ky-express.com/App/Shake/5.png","http://img.ky-express
     * .com/App/Shake/6.png","http://img.ky-express.com/App/Shake/7.png"]
     * advertisement : ["首寄免费！","首寄免费！","跨省8小时达！","24小时免费取派！","介绍客户送现金！","跨省快递用跨越！"]
     * onlineNumber : 3232323
     * prizeCount : 3232323
     */

    @SerializedName("errorCode")
    private int          errorCode;
    @SerializedName("serviceDateTime")
    private String       serviceDateTime;
    @SerializedName("activityBeginTime")
    private String       activityBeginTime;
    @SerializedName("activityEndTime")
    private String       activityEndTime;
    @SerializedName("activitySn")
    private String       activitySn;
    @SerializedName("onlineNumber")
    private int          onlineNumber;
    @SerializedName("prizeCount")
    private int          prizeCount;
    @SerializedName("bannerImgUrl")
    private List<String> bannerImgUrl;
    @SerializedName("advertisement")
    private List<String> advertisement;

    public int getErrorCode()                                  { return errorCode;}

    public void setErrorCode(int errorCode)                    { this.errorCode = errorCode;}

    public String getServiceDateTime()                         { return serviceDateTime;}

    public void setServiceDateTime(String serviceDateTime)     { this.serviceDateTime = serviceDateTime;}

    public String getActivityBeginTime()                       { return activityBeginTime;}

    public void setActivityBeginTime(String activityBeginTime) { this.activityBeginTime = activityBeginTime;}

    public String getActivityEndTime()                         { return activityEndTime;}

    public void setActivityEndTime(String activityEndTime)     { this.activityEndTime = activityEndTime;}

    public String getActivitySn()                              { return activitySn;}

    public void setActivitySn(String activitySn)               { this.activitySn = activitySn;}

    public int getOnlineNumber()                               { return onlineNumber;}

    public void setOnlineNumber(int onlineNumber)              { this.onlineNumber = onlineNumber;}

    public int getPrizeCount()                                 { return prizeCount;}

    public void setPrizeCount(int prizeCount)                  { this.prizeCount = prizeCount;}

    public List<String> getBannerImgUrl()                      { return bannerImgUrl;}

    public void setBannerImgUrl(List<String> bannerImgUrl)     { this.bannerImgUrl = bannerImgUrl;}

    public List<String> getAdvertisement()                     { return advertisement;}

    public void setAdvertisement(List<String> advertisement)   { this.advertisement = advertisement;}

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.errorCode);
        dest.writeString(this.serviceDateTime);
        dest.writeString(this.activityBeginTime);
        dest.writeString(this.activityEndTime);
        dest.writeString(this.activitySn);
        dest.writeInt(this.onlineNumber);
        dest.writeInt(this.prizeCount);
        dest.writeStringList(this.bannerImgUrl);
        dest.writeStringList(this.advertisement);
    }

    public ResponseRedPacketNextActivityInfo() {}

    protected ResponseRedPacketNextActivityInfo(Parcel in) {
        this.errorCode = in.readInt();
        this.serviceDateTime = in.readString();
        this.activityBeginTime = in.readString();
        this.activityEndTime = in.readString();
        this.activitySn = in.readString();
        this.onlineNumber = in.readInt();
        this.prizeCount = in.readInt();
        this.bannerImgUrl = in.createStringArrayList();
        this.advertisement = in.createStringArrayList();
    }

    public static final Creator<ResponseRedPacketNextActivityInfo> CREATOR = new Creator<ResponseRedPacketNextActivityInfo>() {
        @Override
        public ResponseRedPacketNextActivityInfo createFromParcel(Parcel source) {return new ResponseRedPacketNextActivityInfo(source);}

        @Override
        public ResponseRedPacketNextActivityInfo[] newArray(int size) {return new ResponseRedPacketNextActivityInfo[size];}
    };
}