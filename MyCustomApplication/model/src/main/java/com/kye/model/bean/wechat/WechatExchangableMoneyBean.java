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

public class WechatExchangableMoneyBean implements Parcelable {

    /**
     * money : 5
     */

    @SerializedName("money")
    private String money;

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.money);
    }

    public WechatExchangableMoneyBean() {
    }

    protected WechatExchangableMoneyBean(Parcel in) {
        this.money = in.readString();
    }

    public static final Parcelable.Creator<WechatExchangableMoneyBean> CREATOR = new Parcelable.Creator<WechatExchangableMoneyBean>() {
        @Override
        public WechatExchangableMoneyBean createFromParcel(Parcel source) {
            return new WechatExchangableMoneyBean(source);
        }

        @Override
        public WechatExchangableMoneyBean[] newArray(int size) {
            return new WechatExchangableMoneyBean[size];
        }
    };
}
