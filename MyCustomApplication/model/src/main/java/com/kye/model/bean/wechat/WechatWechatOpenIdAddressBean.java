package com.kye.model.bean.wechat;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 09/02/2018
 * @updated : 09/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class WechatWechatOpenIdAddressBean implements Parcelable {

    /**
     * openid : oUT8Xw1rIt0F0c6OHCYh5RUo6ck4
     * addressBookControl : 30
     * addressBook : 100
     */

    @SerializedName("openid")
    private String openid;
    @SerializedName("addressBookControl")
    private int addressBookControl;
    @SerializedName("addressBook")
    private int addressBook;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public int getAddressBookControl() {
        return addressBookControl;
    }

    public void setAddressBookControl(int addressBookControl) {
        this.addressBookControl = addressBookControl;
    }

    public int getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(int addressBook) {
        this.addressBook = addressBook;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.openid);
        dest.writeInt(this.addressBookControl);
        dest.writeInt(this.addressBook);
    }

    public WechatWechatOpenIdAddressBean() {
    }

    protected WechatWechatOpenIdAddressBean(Parcel in) {
        this.openid = in.readString();
        this.addressBookControl = in.readInt();
        this.addressBook = in.readInt();
    }

    public static final Parcelable.Creator<WechatWechatOpenIdAddressBean> CREATOR = new Parcelable.Creator<WechatWechatOpenIdAddressBean>() {
        @Override
        public WechatWechatOpenIdAddressBean createFromParcel(Parcel source) {
            return new WechatWechatOpenIdAddressBean(source);
        }

        @Override
        public WechatWechatOpenIdAddressBean[] newArray(int size) {
            return new WechatWechatOpenIdAddressBean[size];
        }
    };
}
