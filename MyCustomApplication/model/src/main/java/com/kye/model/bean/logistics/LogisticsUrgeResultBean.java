package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 04/01/2018
 * @updated : 04/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     催件返回结果
 */

public class LogisticsUrgeResultBean implements Parcelable {

    /**
     * retMsg : 已收到您的催单请求，正在优先处理您的订单
     */

    @SerializedName("retMsg")
    private String retMsg;

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.retMsg);
    }

    public LogisticsUrgeResultBean() {
    }

    protected LogisticsUrgeResultBean(Parcel in) {
        this.retMsg = in.readString();
    }

    public static final Parcelable.Creator<LogisticsUrgeResultBean> CREATOR = new Parcelable.Creator<LogisticsUrgeResultBean>() {
        @Override
        public LogisticsUrgeResultBean createFromParcel(Parcel source) {
            return new LogisticsUrgeResultBean(source);
        }

        @Override
        public LogisticsUrgeResultBean[] newArray(int size) {
            return new LogisticsUrgeResultBean[size];
        }
    };
}
