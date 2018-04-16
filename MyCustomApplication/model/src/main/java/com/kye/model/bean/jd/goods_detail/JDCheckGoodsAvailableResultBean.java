package com.kye.model.bean.jd.goods_detail;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 31/01/2018
 * @updated : 31/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDCheckGoodsAvailableResultBean implements Parcelable {

    /**
     * area : 1_0_0_0
     * sku : 1036259
     * status : 1
     */

    @SerializedName("area")
    private String area;
    @SerializedName("sku")
    private String sku;
    @SerializedName("status")
    private String status;
    @SerializedName("isCancelable")
    private boolean isCancelable;

    public boolean isCancelable() {
        return isCancelable;
    }

    public void setCancelable(boolean cancelable) {
        isCancelable = cancelable;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JDCheckGoodsAvailableResultBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.area);
        dest.writeString(this.sku);
        dest.writeString(this.status);
        dest.writeByte(this.isCancelable ? (byte) 1 : (byte) 0);
    }

    protected JDCheckGoodsAvailableResultBean(Parcel in) {
        this.area = in.readString();
        this.sku = in.readString();
        this.status = in.readString();
        this.isCancelable = in.readByte() != 0;
    }

    public static final Creator<JDCheckGoodsAvailableResultBean> CREATOR = new Creator<JDCheckGoodsAvailableResultBean>() {
        @Override
        public JDCheckGoodsAvailableResultBean createFromParcel(Parcel source) {
            return new JDCheckGoodsAvailableResultBean(source);
        }

        @Override
        public JDCheckGoodsAvailableResultBean[] newArray(int size) {
            return new JDCheckGoodsAvailableResultBean[size];
        }
    };
}
