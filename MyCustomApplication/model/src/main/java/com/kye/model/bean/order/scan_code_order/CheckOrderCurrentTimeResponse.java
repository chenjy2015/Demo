package com.kye.model.bean.order.scan_code_order;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenjiayou on 2018/3/29.
 */

public class CheckOrderCurrentTimeResponse implements Parcelable {

    @SerializedName("resultCode")
    String resultCode;

    @SerializedName("maxSize")
    String maxSize;

    @SerializedName("maxWeight")
    String maxWeight;

    protected CheckOrderCurrentTimeResponse(Parcel in) {
        resultCode = in.readString();
        maxSize = in.readString();
        maxWeight = in.readString();
    }

    public static final Creator<CheckOrderCurrentTimeResponse> CREATOR = new Creator<CheckOrderCurrentTimeResponse>() {
        @Override
        public CheckOrderCurrentTimeResponse createFromParcel(Parcel in) {
            return new CheckOrderCurrentTimeResponse(in);
        }

        @Override
        public CheckOrderCurrentTimeResponse[] newArray(int size) {
            return new CheckOrderCurrentTimeResponse[size];
        }
    };

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(resultCode);
        dest.writeString(maxSize);
        dest.writeString(maxWeight);
    }
}
