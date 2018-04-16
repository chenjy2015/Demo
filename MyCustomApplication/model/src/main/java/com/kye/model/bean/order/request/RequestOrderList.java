package com.kye.model.bean.order.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 03/01/2018
 * @updated : 03/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestOrderList implements Parcelable {


    /**
     * companyCode : 75519398828
     * startTime : 2016-12-14
     * endTime : 2017-12-14
     * stateSelect : 0
     * phone : 18681438009
     * pageSize : 2
     * pageIndex : 2
     */

    @SerializedName("companyCode")
    private String companyCode;
    @SerializedName("startTime")
    private String startTime;
    @SerializedName("endTime")
    private String endTime;
    @SerializedName("stateSelect")
    private String stateSelect;
    @SerializedName("phone")
    private String phone;
    @SerializedName("pageSize")
    private int pageSize;
    @SerializedName("pageIndex")
    private int pageIndex;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStateSelect() {
        return stateSelect;
    }

    public void setStateSelect(String stateSelect) {
        this.stateSelect = stateSelect;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.companyCode);
        dest.writeString(this.startTime);
        dest.writeString(this.endTime);
        dest.writeString(this.stateSelect);
        dest.writeString(this.phone);
        dest.writeInt(this.pageSize);
        dest.writeInt(this.pageIndex);
    }

    public RequestOrderList() {
    }

    protected RequestOrderList(Parcel in) {
        this.companyCode = in.readString();
        this.startTime = in.readString();
        this.endTime = in.readString();
        this.stateSelect = in.readString();
        this.phone = in.readString();
        this.pageSize = in.readInt();
        this.pageIndex = in.readInt();
    }

    public static final Parcelable.Creator<RequestOrderList> CREATOR = new Parcelable.Creator<RequestOrderList>() {
        @Override
        public RequestOrderList createFromParcel(Parcel source) {
            return new RequestOrderList(source);
        }

        @Override
        public RequestOrderList[] newArray(int size) {
            return new RequestOrderList[size];
        }
    };
}
