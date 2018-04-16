package com.kye.model.bean.online;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chen on 18/1/19.
 */

public class WechatPayAccountBean implements Parcelable{

    String sign;
    String timestamp;
    String noncestr;
    String partnerid;
    String prepayid;

    /**
     * package 关键字
     */
    @SerializedName("package")
    String payType;

    String appid;
    String sellerid;
    String out_trade_no;

    protected WechatPayAccountBean(Parcel in) {
        sign = in.readString();
        timestamp = in.readString();
        noncestr = in.readString();
        partnerid = in.readString();
        prepayid = in.readString();
        payType = in.readString();
        appid = in.readString();
        sellerid = in.readString();
        out_trade_no = in.readString();
    }

    public static final Creator<WechatPayAccountBean> CREATOR = new Creator<WechatPayAccountBean>() {
        @Override
        public WechatPayAccountBean createFromParcel(Parcel in) {
            return new WechatPayAccountBean(in);
        }

        @Override
        public WechatPayAccountBean[] newArray(int size) {
            return new WechatPayAccountBean[size];
        }
    };

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNoncestr() {
        return noncestr;
    }

    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(sign);
        dest.writeString(timestamp);
        dest.writeString(noncestr);
        dest.writeString(partnerid);
        dest.writeString(prepayid);
        dest.writeString(payType);
        dest.writeString(appid);
        dest.writeString(sellerid);
        dest.writeString(out_trade_no);
    }
}
