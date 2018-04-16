package com.kye.model.bean.online.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 *
 *@Author chen
 *@Date 18/1/20 下午5:03
 *@descript 根据运单号查询支付账号入参
 */


public class GetPayAccountParams implements Parcelable{

    String phone;

    String waybill;

    public GetPayAccountParams(){

    }

    protected GetPayAccountParams(Parcel in) {
        phone = in.readString();
        waybill = in.readString();
    }

    public static final Creator<GetPayAccountParams> CREATOR = new Creator<GetPayAccountParams>() {
        @Override
        public GetPayAccountParams createFromParcel(Parcel in) {
            return new GetPayAccountParams(in);
        }

        @Override
        public GetPayAccountParams[] newArray(int size) {
            return new GetPayAccountParams[size];
        }
    };

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(phone);
        dest.writeString(waybill);
    }
}
