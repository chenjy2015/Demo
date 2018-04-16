package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 20/01/2018
 * @updated : 20/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsDriverInfoBean implements Parcelable {

    /**
     * driverName : 1p45
     * driverId : 9o68
     * driverImage : l311
     * driverType : 1
     * tel : 18938694014
     */

    @SerializedName("driverName")
    private String driverName;
    @SerializedName("driverId")
    private String driverId;
    @SerializedName("driverImage")
    private String driverImage;
    @SerializedName("driverType")
    private String driverType;
    @SerializedName("tel")
    private String tel;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverImage() {
        return driverImage;
    }

    public void setDriverImage(String driverImage) {
        this.driverImage = driverImage;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.driverName);
        dest.writeString(this.driverId);
        dest.writeString(this.driverImage);
        dest.writeString(this.driverType);
        dest.writeString(this.tel);
    }

    public LogisticsDriverInfoBean() {
    }

    protected LogisticsDriverInfoBean(Parcel in) {
        this.driverName = in.readString();
        this.driverId = in.readString();
        this.driverImage = in.readString();
        this.driverType = in.readString();
        this.tel = in.readString();
    }

    public static final Parcelable.Creator<LogisticsDriverInfoBean> CREATOR = new Parcelable.Creator<LogisticsDriverInfoBean>() {
        @Override
        public LogisticsDriverInfoBean createFromParcel(Parcel source) {
            return new LogisticsDriverInfoBean(source);
        }

        @Override
        public LogisticsDriverInfoBean[] newArray(int size) {
            return new LogisticsDriverInfoBean[size];
        }
    };
}
