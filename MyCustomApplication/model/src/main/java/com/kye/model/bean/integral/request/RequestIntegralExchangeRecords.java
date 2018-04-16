package com.kye.model.bean.integral.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     获取'兑换记录'列表
 */

public class RequestIntegralExchangeRecords implements Parcelable {


    public RequestIntegralExchangeRecords(String phone, int pageIndex, int pageSize) {
        this.phone = phone;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    /**
     * phone : 18924656687
     * pageIndex : 1
     * pageSize : 1
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("pageIndex")
    private int pageIndex;
    @SerializedName("pageSize")
    private int pageSize;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.phone);
        dest.writeInt(this.pageIndex);
        dest.writeInt(this.pageSize);
    }

    public RequestIntegralExchangeRecords() {
    }

    protected RequestIntegralExchangeRecords(Parcel in) {
        this.phone = in.readString();
        this.pageIndex = in.readInt();
        this.pageSize = in.readInt();
    }

    public static final Creator<RequestIntegralExchangeRecords> CREATOR = new Creator<RequestIntegralExchangeRecords>() {
        @Override
        public RequestIntegralExchangeRecords createFromParcel(Parcel source) {
            return new RequestIntegralExchangeRecords(source);
        }

        @Override
        public RequestIntegralExchangeRecords[] newArray(int size) {
            return new RequestIntegralExchangeRecords[size];
        }
    };

    @Override
    public String toString() {
        return "RequestIntegralExchangeRecords{" +
                "phone='" + phone + '\'' +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                '}';
    }
}
