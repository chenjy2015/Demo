package com.kye.model.bean.order.scan_code_order;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chenjiayou on 2018/3/29.
 */

public class CheckOrderCurrentTimeRequest implements Parcelable {

     String companyCode;

     String goodTime;

     String orderMan;

     String type;

     String orderCode;

    public CheckOrderCurrentTimeRequest(String companyCode, String goodTime, String orderMan, String type, String orderCode) {
        this.companyCode = companyCode;
        this.goodTime = goodTime;
        this.orderMan = orderMan;
        this.type = type;
        this.orderCode = orderCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(String goodTime) {
        this.goodTime = goodTime;
    }

    public String getOrderMan() {
        return orderMan;
    }

    public void setOrderMan(String orderMan) {
        this.orderMan = orderMan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    protected CheckOrderCurrentTimeRequest(Parcel in) {
        companyCode = in.readString();
        goodTime = in.readString();
        orderMan = in.readString();
        type = in.readString();
        orderCode = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(companyCode);
        dest.writeString(goodTime);
        dest.writeString(orderMan);
        dest.writeString(type);
        dest.writeString(orderCode);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CheckOrderCurrentTimeRequest> CREATOR = new Creator<CheckOrderCurrentTimeRequest>() {
        @Override
        public CheckOrderCurrentTimeRequest createFromParcel(Parcel in) {
            return new CheckOrderCurrentTimeRequest(in);
        }

        @Override
        public CheckOrderCurrentTimeRequest[] newArray(int size) {
            return new CheckOrderCurrentTimeRequest[size];
        }
    };
}
