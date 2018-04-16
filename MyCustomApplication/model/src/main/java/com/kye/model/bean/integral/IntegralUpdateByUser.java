package com.kye.model.bean.integral;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/01/2018
 * @updated : 15/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class IntegralUpdateByUser implements Parcelable {

    /**
     * errMsg : 消费积分
     */

    @SerializedName("errMsg")
    private String errMsg;

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.errMsg);
    }

    public IntegralUpdateByUser() {
    }

    protected IntegralUpdateByUser(Parcel in) {
        this.errMsg = in.readString();
    }

    public static final Creator<IntegralUpdateByUser> CREATOR = new Creator<IntegralUpdateByUser>() {
        @Override
        public IntegralUpdateByUser createFromParcel(Parcel source) {
            return new IntegralUpdateByUser(source);
        }

        @Override
        public IntegralUpdateByUser[] newArray(int size) {
            return new IntegralUpdateByUser[size];
        }
    };
}
