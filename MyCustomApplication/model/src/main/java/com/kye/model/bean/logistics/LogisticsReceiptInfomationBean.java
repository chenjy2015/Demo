package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/03/2018
 * @updated : 19/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsReceiptInfomationBean implements Parcelable {

    /**
     * waybill : 01000492683
     * receiptCode : 1708888888
     * receiptSendCompany : 北京辉杨时代
     * receiptCompany : 个人邹源洪
     * sendTime : 2017-04-14 15:39
     * receiptTime : 2017-12-12 14:28
     * receiptPeople : 01000306388
     * img : []
     */

    @SerializedName("waybill")
    private String waybill;
    @SerializedName("receiptCode")
    private String  receiptCode;
    @SerializedName("receiptSendCompany")
    private String  receiptSendCompany;
    @SerializedName("receiptCompany")
    private String  receiptCompany;
    @SerializedName("sendTime")
    private String  sendTime;
    @SerializedName("receiptTime")
    private String  receiptTime;
    @SerializedName("receiptPeople")
    private String  receiptPeople;
    @SerializedName("img")
    private List<String> img;

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getReceiptCode() {
        return receiptCode;
    }

    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode;
    }

    public String getReceiptSendCompany() {
        return receiptSendCompany;
    }

    public void setReceiptSendCompany(String receiptSendCompany) {
        this.receiptSendCompany = receiptSendCompany;
    }

    public String getReceiptCompany() {
        return receiptCompany;
    }

    public void setReceiptCompany(String receiptCompany) {
        this.receiptCompany = receiptCompany;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(String receiptTime) {
        this.receiptTime = receiptTime;
    }

    public String getReceiptPeople() {
        return receiptPeople;
    }

    public void setReceiptPeople(String receiptPeople) {
        this.receiptPeople = receiptPeople;
    }

    public List<String> getImg() {
        return img;
    }

    public void setImg(List<String> img) {
        this.img = img;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.waybill);
        dest.writeString(this.receiptCode);
        dest.writeString(this.receiptSendCompany);
        dest.writeString(this.receiptCompany);
        dest.writeString(this.sendTime);
        dest.writeString(this.receiptTime);
        dest.writeString(this.receiptPeople);
        dest.writeStringList(this.img);
    }

    public LogisticsReceiptInfomationBean() {
    }

    protected LogisticsReceiptInfomationBean(Parcel in) {
        this.waybill = in.readString();
        this.receiptCode = in.readString();
        this.receiptSendCompany = in.readString();
        this.receiptCompany = in.readString();
        this.sendTime = in.readString();
        this.receiptTime = in.readString();
        this.receiptPeople = in.readString();
        this.img = in.createStringArrayList();
    }

    public static final Parcelable.Creator<LogisticsReceiptInfomationBean> CREATOR = new Parcelable.Creator<LogisticsReceiptInfomationBean>() {
        @Override
        public LogisticsReceiptInfomationBean createFromParcel(Parcel source) {
            return new LogisticsReceiptInfomationBean(source);
        }

        @Override
        public LogisticsReceiptInfomationBean[] newArray(int size) {
            return new LogisticsReceiptInfomationBean[size];
        }
    };
}
