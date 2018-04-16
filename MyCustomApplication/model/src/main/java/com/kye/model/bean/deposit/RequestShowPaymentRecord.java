package com.kye.model.bean.deposit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SkyYu on 2018/1/16
 */
public class RequestShowPaymentRecord {

    @SerializedName("phone")
    private String phone;
    @SerializedName("pageIndex")
    private int pageIndex;
    @SerializedName("pageSize")
    private int pageSize;

    public RequestShowPaymentRecord(String phone, int pageIndex, int pageSize) {
        this.phone = phone;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
