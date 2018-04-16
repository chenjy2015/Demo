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

public class JDCheckConsumeAvailableResultBean implements Parcelable {

    /**
     *
     smsChannel	string	106906988888	短信通道
     type	string	2	是否黑名单,0-需要短信验证,1-符合要求,2-账号异常
     phone	string	13794274280	电话号码

     * smsChannel : 106906988888
     * type : 2
     * phone : 13794274280
     */

    @SerializedName("smsChannel")
    private String smsChannel;
    @SerializedName("type")
    private String type;
    @SerializedName("phone")
    private String phone;

    public String getSmsChannel() {
        return smsChannel;
    }

    public void setSmsChannel(String smsChannel) {
        this.smsChannel = smsChannel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.smsChannel);
        dest.writeString(this.type);
        dest.writeString(this.phone);
    }

    public JDCheckConsumeAvailableResultBean() {
    }

    protected JDCheckConsumeAvailableResultBean(Parcel in) {
        this.smsChannel = in.readString();
        this.type = in.readString();
        this.phone = in.readString();
    }

    public static final Parcelable.Creator<JDCheckConsumeAvailableResultBean> CREATOR = new Parcelable.Creator<JDCheckConsumeAvailableResultBean>() {
        @Override
        public JDCheckConsumeAvailableResultBean createFromParcel(Parcel source) {
            return new JDCheckConsumeAvailableResultBean(source);
        }

        @Override
        public JDCheckConsumeAvailableResultBean[] newArray(int size) {
            return new JDCheckConsumeAvailableResultBean[size];
        }
    };
}
