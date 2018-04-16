package com.kye.model.bean.redpacket;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseRedPacketGetUserActivityInfo implements Parcelable {

    /**
     * addressBook : 100
     * addressBookControl : 3
     * openid : oUT8Xw1rIt0F0c6OHCYh5RUo6ck4
     * activitySn : 180113123507
     * activityBeginTime : 2018-01-13 12:40:00
     * activityEndTime : 2018-01-13 12:59:00
     * prizeCount : 54545
     * bannerImgUrl : ["跨越速运广州分公司","跨越速运北京分公司","跨越速运东莞分公司","跨越速运南宁分公司","跨越速运南京分公司","跨越速运天津分公司","跨越速运杭州分公司"]
     * advertisement : ["首寄免费！","首寄免费！","跨省8小时达！","24小时免费取派！","介绍客户送现金！","跨省快递用跨越！"]
     * onlineNumber : 343232
     * serviceDateTime : 2018-01-13 12:47:56
     * activityStatus : 1
     * isHasPrize : true
     * minNum : 3
     * maxNum : 8
     */

    @SerializedName("addressBook")          // 通讯录条数,没有通讯录返回 0；
    private int          addressBook;
    @SerializedName("addressBookControl")   // 限制的通讯录条数
    private int          addressBookControl;
    @SerializedName("openid")               // openid，没有openid返回 ””
    private String       openid;
    @SerializedName("activitySn")           // 批号
    private String       activitySn;
    @SerializedName("activityBeginTime")    // 当前最近活动开始时间
    private String       activityBeginTime;
    @SerializedName("activityEndTime")      // 当前最近活动结束时间
    private String       activityEndTime;
    @SerializedName("prizeCount")           // 红包数
    private int          prizeCount;
    @SerializedName("onlineNumber")         // 虚拟在线人数
    private int          onlineNumber;
    @SerializedName("serviceDateTime")      // 当前系统时间
    private String       serviceDateTime;
    @SerializedName("activityStatus")
    private int          activityStatus;
    @SerializedName("isHasPrize")           // 是否中奖  1表示有中奖机会，0表示没有中奖机会
    private boolean      isHasPrize;
    @SerializedName("minNum")               // 最小摇动次数
    private int          minNum;
    @SerializedName("maxNum")               // 最大摇动次数
    private int          maxNum;
    @SerializedName("bannerImgUrl")         // 活动页面图片
    private List<String> bannerImgUrl;
    @SerializedName("advertisement")
    private List<String> advertisement;

    public int getAddressBook()                                { return addressBook;}

    public void setAddressBook(int addressBook)                { this.addressBook = addressBook;}

    public int getAddressBookControl()                         { return addressBookControl;}

    public void setAddressBookControl(int addressBookControl)  { this.addressBookControl = addressBookControl;}

    public String getOpenid()                                  { return openid;}

    public void setOpenid(String openid)                       { this.openid = openid;}

    public String getActivitySn()                              { return activitySn;}

    public void setActivitySn(String activitySn)               { this.activitySn = activitySn;}

    public String getActivityBeginTime()                       { return activityBeginTime;}

    public void setActivityBeginTime(String activityBeginTime) { this.activityBeginTime = activityBeginTime;}

    public String getActivityEndTime()                         { return activityEndTime;}

    public void setActivityEndTime(String activityEndTime)     { this.activityEndTime = activityEndTime;}

    public int getPrizeCount()                                 { return prizeCount;}

    public void setPrizeCount(int prizeCount)                  { this.prizeCount = prizeCount;}

    public int getOnlineNumber()                               { return onlineNumber;}

    public void setOnlineNumber(int onlineNumber)              { this.onlineNumber = onlineNumber;}

    public String getServiceDateTime()                         { return serviceDateTime;}

    public void setServiceDateTime(String serviceDateTime)     { this.serviceDateTime = serviceDateTime;}

    public int getActivityStatus()                             { return activityStatus;}

    public void setActivityStatus(int activityStatus)          { this.activityStatus = activityStatus;}

    public boolean isIsHasPrize()                              { return isHasPrize;}

    public void setIsHasPrize(boolean isHasPrize)              { this.isHasPrize = isHasPrize;}

    public int getMinNum()                                     { return minNum;}

    public void setMinNum(int minNum)                          { this.minNum = minNum;}

    public int getMaxNum()                                     { return maxNum;}

    public void setMaxNum(int maxNum)                          { this.maxNum = maxNum;}

    public List<String> getBannerImgUrl()                      { return bannerImgUrl;}

    public void setBannerImgUrl(List<String> bannerImgUrl)     { this.bannerImgUrl = bannerImgUrl;}

    public List<String> getAdvertisement()                     { return advertisement;}

    public void setAdvertisement(List<String> advertisement)   { this.advertisement = advertisement;}


    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.addressBook);
        dest.writeInt(this.addressBookControl);
        dest.writeString(this.openid);
        dest.writeString(this.activitySn);
        dest.writeString(this.activityBeginTime);
        dest.writeString(this.activityEndTime);
        dest.writeInt(this.prizeCount);
        dest.writeInt(this.onlineNumber);
        dest.writeString(this.serviceDateTime);
        dest.writeInt(this.activityStatus);
        dest.writeByte(this.isHasPrize ? (byte) 1 : (byte) 0);
        dest.writeInt(this.minNum);
        dest.writeInt(this.maxNum);
        dest.writeStringList(this.bannerImgUrl);
        dest.writeStringList(this.advertisement);
    }

    public ResponseRedPacketGetUserActivityInfo() {}

    protected ResponseRedPacketGetUserActivityInfo(Parcel in) {
        this.addressBook = in.readInt();
        this.addressBookControl = in.readInt();
        this.openid = in.readString();
        this.activitySn = in.readString();
        this.activityBeginTime = in.readString();
        this.activityEndTime = in.readString();
        this.prizeCount = in.readInt();
        this.onlineNumber = in.readInt();
        this.serviceDateTime = in.readString();
        this.activityStatus = in.readInt();
        this.isHasPrize = in.readByte() != 0;
        this.minNum = in.readInt();
        this.maxNum = in.readInt();
        this.bannerImgUrl = in.createStringArrayList();
        this.advertisement = in.createStringArrayList();
    }

    public static final Creator<ResponseRedPacketGetUserActivityInfo> CREATOR = new Creator<ResponseRedPacketGetUserActivityInfo>() {
        @Override
        public ResponseRedPacketGetUserActivityInfo createFromParcel(Parcel source) {return new ResponseRedPacketGetUserActivityInfo(source);}

        @Override
        public ResponseRedPacketGetUserActivityInfo[] newArray(int size) {return new ResponseRedPacketGetUserActivityInfo[size];}
    };
}