package com.kye.model.bean.deposit;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SkyYu on 2018/3/6
 */
public class ResultDepositConsumptionDetailedBean implements Parcelable {

    /**
     * consumType : 扣除运费
     * lockTime : 2018/1/26 11:39:09
     * sendAmount : -42.00
     * giveAmount :
     * waybill : 运单号75504847619
     * withdrawalAmount :
     */

    @SerializedName("consumType")
    private String consumType;
    @SerializedName("lockTime")
    private String lockTime;
    @SerializedName("sendAmount")
    private String sendAmount;
    @SerializedName("giveAmount")
    private String giveAmount;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("withdrawalAmount")
    private String withdrawalAmount;

    public String getConsumType() {
        return consumType;
    }

    public void setConsumType(String consumType) {
        this.consumType = consumType;
    }

    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public String getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(String sendAmount) {
        this.sendAmount = sendAmount;
    }

    public String getGiveAmount() {
        return giveAmount;
    }

    public void setGiveAmount(String giveAmount) {
        this.giveAmount = giveAmount;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(String withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.consumType);
        dest.writeString(this.lockTime);
        dest.writeString(this.sendAmount);
        dest.writeString(this.giveAmount);
        dest.writeString(this.waybill);
        dest.writeString(this.withdrawalAmount);
    }

    public ResultDepositConsumptionDetailedBean() {
    }

    protected ResultDepositConsumptionDetailedBean(Parcel in) {
        this.consumType = in.readString();
        this.lockTime = in.readString();
        this.sendAmount = in.readString();
        this.giveAmount = in.readString();
        this.waybill = in.readString();
        this.withdrawalAmount = in.readString();
    }

    public static final Parcelable.Creator<ResultDepositConsumptionDetailedBean> CREATOR = new Parcelable.Creator<ResultDepositConsumptionDetailedBean>() {
        @Override
        public ResultDepositConsumptionDetailedBean createFromParcel(Parcel source) {
            return new ResultDepositConsumptionDetailedBean(source);
        }

        @Override
        public ResultDepositConsumptionDetailedBean[] newArray(int size) {
            return new ResultDepositConsumptionDetailedBean[size];
        }
    };
}