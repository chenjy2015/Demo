package com.kye.model.bean.integral;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.kye.model.base.BaseItem;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class IntegralRecordExchangeRecordBean implements Parcelable, BaseItem {

    /**
     * townName :
     * address : 中国广东省深圳市宝安路
     * town :
     * activeAddress :
     * city :
     * goodsId : 45766760020
     * mobile : 18924656687
     * county :
     * type : 0
     * picture : jfs/t1729/257/944560398/146403/27078bb4/55dc510bN1f00bf44.jpg
     * cityName :
     * province :
     * integral : 46549
     * name : 那里
     * goodsNeme : 九阳 Joyoung JK-30E07电饼铛煎烤机多功能电脑版一键通
     * time : 2016-11-28 17:49
     * provinceName :
     * state : 订单已申请退货
     * sku : 1583842
     * email : 571018437@qq.com
     * countyName :
     * merchantno :
     */

    @SerializedName("townName")
    private String townName;
    @SerializedName("address")
    private String address;
    @SerializedName("town")
    private String town;
    @SerializedName("activeAddress")
    private String activeAddress;
    @SerializedName("city")
    private String city;
    @SerializedName("goodsId")
    private String goodsId;
    @SerializedName("mobile")
    private String mobile;
    @SerializedName("county")
    private String county;
    @SerializedName("type")
    private String type;
    @SerializedName("picture")
    private String picture;
    @SerializedName("cityName")
    private String cityName;
    @SerializedName("province")
    private String province;
    @SerializedName("integral")
    private int integral;
    @SerializedName("name")
    private String name;
    @SerializedName("goodsNeme")
    private String goodsNeme;
    @SerializedName("time")
    private String time;
    @SerializedName("provinceName")
    private String provinceName;
    @SerializedName("state")
    private String state;
    @SerializedName("sku")
    private String sku;
    @SerializedName("email")
    private String email;
    @SerializedName("countyName")
    private String countyName;
    @SerializedName("merchantno")
    private String merchantno;

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getActiveAddress() {
        return activeAddress;
    }

    public void setActiveAddress(String activeAddress) {
        this.activeAddress = activeAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoodsNeme() {
        return goodsNeme;
    }

    public void setGoodsNeme(String goodsNeme) {
        this.goodsNeme = goodsNeme;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getMerchantno() {
        return merchantno;
    }

    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.townName);
        dest.writeString(this.address);
        dest.writeString(this.town);
        dest.writeString(this.activeAddress);
        dest.writeString(this.city);
        dest.writeString(this.goodsId);
        dest.writeString(this.mobile);
        dest.writeString(this.county);
        dest.writeString(this.type);
        dest.writeString(this.picture);
        dest.writeString(this.cityName);
        dest.writeString(this.province);
        dest.writeInt(this.integral);
        dest.writeString(this.name);
        dest.writeString(this.goodsNeme);
        dest.writeString(this.time);
        dest.writeString(this.provinceName);
        dest.writeString(this.state);
        dest.writeString(this.sku);
        dest.writeString(this.email);
        dest.writeString(this.countyName);
        dest.writeString(this.merchantno);
    }

    public IntegralRecordExchangeRecordBean() {
    }

    protected IntegralRecordExchangeRecordBean(Parcel in) {
        this.townName = in.readString();
        this.address = in.readString();
        this.town = in.readString();
        this.activeAddress = in.readString();
        this.city = in.readString();
        this.goodsId = in.readString();
        this.mobile = in.readString();
        this.county = in.readString();
        this.type = in.readString();
        this.picture = in.readString();
        this.cityName = in.readString();
        this.province = in.readString();
        this.integral = in.readInt();
        this.name = in.readString();
        this.goodsNeme = in.readString();
        this.time = in.readString();
        this.provinceName = in.readString();
        this.state = in.readString();
        this.sku = in.readString();
        this.email = in.readString();
        this.countyName = in.readString();
        this.merchantno = in.readString();
    }

    public static final Parcelable.Creator<IntegralRecordExchangeRecordBean> CREATOR = new Parcelable.Creator<IntegralRecordExchangeRecordBean>() {
        @Override
        public IntegralRecordExchangeRecordBean createFromParcel(Parcel source) {
            return new IntegralRecordExchangeRecordBean(source);
        }

        @Override
        public IntegralRecordExchangeRecordBean[] newArray(int size) {
            return new IntegralRecordExchangeRecordBean[size];
        }
    };
}
