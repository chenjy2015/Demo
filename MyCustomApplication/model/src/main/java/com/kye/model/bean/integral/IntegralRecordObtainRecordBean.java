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

public class IntegralRecordObtainRecordBean implements Parcelable, BaseItem {

    /**
     * reason : 当天没有业务积分
     * integralTypeInstructions : 业务积分
     * state :
     * signIntegral : 0
     * integralType : YWJF001
     * integralTime : 2016-03-25
     */

    @SerializedName("reason")
    private String reason;
    @SerializedName("integralTypeInstructions")
    private String integralTypeInstructions;
    @SerializedName("state")
    private String state;
    @SerializedName("signIntegral")
    private int signIntegral;
    @SerializedName("integralType")
    private String integralType;
    @SerializedName("integralTime")
    private String integralTime;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIntegralTypeInstructions() {
        return integralTypeInstructions;
    }

    public void setIntegralTypeInstructions(String integralTypeInstructions) {
        this.integralTypeInstructions = integralTypeInstructions;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSignIntegral() {
        return signIntegral;
    }

    public void setSignIntegral(int signIntegral) {
        this.signIntegral = signIntegral;
    }

    public String getIntegralType() {
        return integralType;
    }

    public void setIntegralType(String integralType) {
        this.integralType = integralType;
    }

    public String getIntegralTime() {
        return integralTime;
    }

    public void setIntegralTime(String integralTime) {
        this.integralTime = integralTime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.reason);
        dest.writeString(this.integralTypeInstructions);
        dest.writeString(this.state);
        dest.writeInt(this.signIntegral);
        dest.writeString(this.integralType);
        dest.writeString(this.integralTime);
    }

    public IntegralRecordObtainRecordBean() {
    }

    protected IntegralRecordObtainRecordBean(Parcel in) {
        this.reason = in.readString();
        this.integralTypeInstructions = in.readString();
        this.state = in.readString();
        this.signIntegral = in.readInt();
        this.integralType = in.readString();
        this.integralTime = in.readString();
    }

    public static final Parcelable.Creator<IntegralRecordObtainRecordBean> CREATOR = new Parcelable.Creator<IntegralRecordObtainRecordBean>() {
        @Override
        public IntegralRecordObtainRecordBean createFromParcel(Parcel source) {
            return new IntegralRecordObtainRecordBean(source);
        }

        @Override
        public IntegralRecordObtainRecordBean[] newArray(int size) {
            return new IntegralRecordObtainRecordBean[size];
        }
    };
}
