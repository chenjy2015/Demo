package com.kye.model.bean.vip;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 11/02/2018
 * @updated : 11/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class VipExchangableMoneyBean implements Parcelable {

    /**
     * money : 34
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

    public VipExchangableMoneyBean() {
    }

    protected VipExchangableMoneyBean(Parcel in) {
        this.money = in.readString();
    }

    public static final Parcelable.Creator<VipExchangableMoneyBean> CREATOR = new Parcelable.Creator<VipExchangableMoneyBean>() {
        @Override
        public VipExchangableMoneyBean createFromParcel(Parcel source) {
            return new VipExchangableMoneyBean(source);
        }

        @Override
        public VipExchangableMoneyBean[] newArray(int size) {
            return new VipExchangableMoneyBean[size];
        }
    };
}
