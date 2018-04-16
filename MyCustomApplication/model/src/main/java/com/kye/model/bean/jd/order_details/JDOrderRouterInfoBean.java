package com.kye.model.bean.jd.order_details;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 25/01/2018
 * @updated : 25/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDOrderRouterInfoBean implements Parcelable {
    /**
     * msgTime : 2016-12-18 00:10:17
     * content : 您提交了订单，请等待系统确认
     * operator : 客户
     */

    @SerializedName("msgTime")
    private String msgTime;
    @SerializedName("content")
    private String content;
    @SerializedName("operator")
    private String operator;

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.msgTime);
        dest.writeString(this.content);
        dest.writeString(this.operator);
    }

    public JDOrderRouterInfoBean() {
    }

    protected JDOrderRouterInfoBean(Parcel in) {
        this.msgTime = in.readString();
        this.content = in.readString();
        this.operator = in.readString();
    }

    public static final Parcelable.Creator<JDOrderRouterInfoBean> CREATOR = new Parcelable.Creator<JDOrderRouterInfoBean>() {
        @Override
        public JDOrderRouterInfoBean createFromParcel(Parcel source) {
            return new JDOrderRouterInfoBean(source);
        }

        @Override
        public JDOrderRouterInfoBean[] newArray(int size) {
            return new JDOrderRouterInfoBean[size];
        }
    };
}
