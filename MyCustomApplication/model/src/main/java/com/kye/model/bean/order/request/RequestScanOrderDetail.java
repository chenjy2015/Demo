package com.kye.model.bean.order.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 17/01/2018
 * @updated : 17/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 */

public class RequestScanOrderDetail implements Parcelable {

    /**
     * phone : 18948167740
     * orderCode : XD1712-0002955
     * waybill : 20762248826
     * state : 5
     * openid : w06g
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("state")
    private String state;
    @SerializedName("openid")
    private String openid;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.phone);
        dest.writeString(this.orderCode);
        dest.writeString(this.waybill);
        dest.writeString(this.state);
        dest.writeString(this.openid);
    }

    public RequestScanOrderDetail() {
    }

    protected RequestScanOrderDetail(Parcel in) {
        this.phone = in.readString();
        this.orderCode = in.readString();
        this.waybill = in.readString();
        this.state = in.readString();
        this.openid = in.readString();
    }

    public static final Parcelable.Creator<RequestScanOrderDetail> CREATOR = new Parcelable.Creator<RequestScanOrderDetail>() {
        @Override
        public RequestScanOrderDetail createFromParcel(Parcel source) {
            return new RequestScanOrderDetail(source);
        }

        @Override
        public RequestScanOrderDetail[] newArray(int size) {
            return new RequestScanOrderDetail[size];
        }
    };
}
