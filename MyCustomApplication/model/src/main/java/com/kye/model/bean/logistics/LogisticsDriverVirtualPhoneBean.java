package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/03/2018
 * @updated : 19/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsDriverVirtualPhoneBean implements Parcelable {

    /**
     * virtualPhone : 17093430393
     */

    @SerializedName("virtualPhone")
    private String virtualPhone;

    public String getVirtualPhone() {
        return virtualPhone;
    }

    public void setVirtualPhone(String virtualPhone) {
        this.virtualPhone = virtualPhone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.virtualPhone);
    }

    public LogisticsDriverVirtualPhoneBean() {
    }

    protected LogisticsDriverVirtualPhoneBean(Parcel in) {
        this.virtualPhone = in.readString();
    }

    public static final Parcelable.Creator<LogisticsDriverVirtualPhoneBean> CREATOR = new Parcelable.Creator<LogisticsDriverVirtualPhoneBean>() {
        @Override
        public LogisticsDriverVirtualPhoneBean createFromParcel(Parcel source) {
            return new LogisticsDriverVirtualPhoneBean(source);
        }

        @Override
        public LogisticsDriverVirtualPhoneBean[] newArray(int size) {
            return new LogisticsDriverVirtualPhoneBean[size];
        }
    };
}
