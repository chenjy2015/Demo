package com.kye.model.bean.jd.shop;

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

public class JDCheckUploadAddressAvailableResultBean implements Parcelable {

    /**

     type	string	1	类型0-不可兑换，1-可以兑换
     commTypeMsg	string		类型消息

     * type : 1
     * commTypeMsg : 8t4g
     */

    @SerializedName("type")
    private String type;
    @SerializedName("commTypeMsg")
    private String commTypeMsg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCommTypeMsg() {
        return commTypeMsg;
    }

    public void setCommTypeMsg(String commTypeMsg) {
        this.commTypeMsg = commTypeMsg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeString(this.commTypeMsg);
    }

    public JDCheckUploadAddressAvailableResultBean() {
    }

    protected JDCheckUploadAddressAvailableResultBean(Parcel in) {
        this.type = in.readString();
        this.commTypeMsg = in.readString();
    }

    public static final Parcelable.Creator<JDCheckUploadAddressAvailableResultBean> CREATOR = new Parcelable.Creator<JDCheckUploadAddressAvailableResultBean>() {
        @Override
        public JDCheckUploadAddressAvailableResultBean createFromParcel(Parcel source) {
            return new JDCheckUploadAddressAvailableResultBean(source);
        }

        @Override
        public JDCheckUploadAddressAvailableResultBean[] newArray(int size) {
            return new JDCheckUploadAddressAvailableResultBean[size];
        }
    };
}
