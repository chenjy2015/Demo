package com.kye.model.bean.order;

import com.google.gson.annotations.SerializedName;

public class OrderAddOrderBean {

    /**
     * orderCode : uu3t
     * first : 0
     * driver : 6nt6
     * stowage : i5o1
     * goodTime : 2018-01-31 13:15
     * status : 2
     * confirmCode : 1
     */

    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("first")
    private String first;
    @SerializedName("driver")
    private String driver;
    @SerializedName("stowage")
    private String stowage;
    @SerializedName("goodTime")
    private String goodTime;
    @SerializedName("status")
    private int status;
    @SerializedName("confirmCode")
    private int confirmCode;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getStowage() {
        return stowage;
    }

    public void setStowage(String stowage) {
        this.stowage = stowage;
    }

    public String getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(String goodTime) {
        this.goodTime = goodTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(int confirmCode) {
        this.confirmCode = confirmCode;
    }
}
