package com.kye.model.bean.integral.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 25/01/2018
 * @updated : 25/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class IntegralItemDataBean implements Parcelable {

    /**
     * integralScore : 645
     * waybill : 51201225876
     * remark :
     * createDate : 2016-11-21 22:52
     * status :
     */

    @SerializedName("integralScore")
    private String integralScore;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("remark")
    private String remark;
    @SerializedName("createDate")
    private String createDate;
    @SerializedName("status")
    private String status;

    public String getIntegralScore() {
        return integralScore;
    }

    public void setIntegralScore(String integralScore) {
        this.integralScore = integralScore;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.integralScore);
        dest.writeString(this.waybill);
        dest.writeString(this.remark);
        dest.writeString(this.createDate);
        dest.writeString(this.status);
    }

    public IntegralItemDataBean() {
    }

    protected IntegralItemDataBean(Parcel in) {
        this.integralScore = in.readString();
        this.waybill = in.readString();
        this.remark = in.readString();
        this.createDate = in.readString();
        this.status = in.readString();
    }

    public static final Parcelable.Creator<IntegralItemDataBean> CREATOR = new Parcelable.Creator<IntegralItemDataBean>() {
        @Override
        public IntegralItemDataBean createFromParcel(Parcel source) {
            return new IntegralItemDataBean(source);
        }

        @Override
        public IntegralItemDataBean[] newArray(int size) {
            return new IntegralItemDataBean[size];
        }
    };
}
