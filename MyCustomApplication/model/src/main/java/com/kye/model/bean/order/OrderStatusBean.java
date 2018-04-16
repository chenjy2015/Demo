package com.kye.model.bean.order;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 18/01/2018
 * @updated : 18/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class OrderStatusBean implements Parcelable {

    /**
     * state : 3
     * time : 2017-12-01 18:11
     * status : 已取货
     */

    @SerializedName("state")
    private String state;
    @SerializedName("time")
    private String time;
    @SerializedName("status")
    private String status;

    /**
     * 标示当前状态
     */
    private boolean isCurrentState;

    public OrderStatusBean(String state, String time, String status) {
        this.state = state;
        this.time = time;
        this.status = status;
    }

    public static List<OrderStatusBean> getDefaultList() {
        List<OrderStatusBean> orderStatusBeans = new ArrayList<>();
        orderStatusBeans.add(new OrderStatusBean("0", null, "处理中"));
        orderStatusBeans.add(new OrderStatusBean("1", null, "已调度"));
        orderStatusBeans.add(new OrderStatusBean("2", null, "已到达"));
        orderStatusBeans.add(new OrderStatusBean("3", null, "已取货"));
        return orderStatusBeans;
    }

    public boolean isCurrentState() {
        return isCurrentState;
    }

    public void setCurrentState(boolean currentState) {
        isCurrentState = currentState;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderStatusBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.state);
        dest.writeString(this.time);
        dest.writeString(this.status);
        dest.writeByte(this.isCurrentState ? (byte) 1 : (byte) 0);
    }

    protected OrderStatusBean(Parcel in) {
        this.state = in.readString();
        this.time = in.readString();
        this.status = in.readString();
        this.isCurrentState = in.readByte() != 0;
    }

    public static final Creator<OrderStatusBean> CREATOR = new Creator<OrderStatusBean>() {
        @Override
        public OrderStatusBean createFromParcel(Parcel source) {
            return new OrderStatusBean(source);
        }

        @Override
        public OrderStatusBean[] newArray(int size) {
            return new OrderStatusBean[size];
        }
    };
}
