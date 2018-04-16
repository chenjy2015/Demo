package com.kye.model.bean.deposit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SkyYu on 2018/1/16
 */
public class RequestDepositDetailed{

    // 登录账号
    @SerializedName("phone")
    private String phone;
    // 公司名称
    @SerializedName("companyName")
    private String companyName;
    // 页数
    @SerializedName("pageIndex")
    private int pageIndex;
    // 页面大小
    @SerializedName("pageSize")
    private int pageSize;
    // 开始时间
    @SerializedName("startTime")
    private String startTime;
    // 结束时间
    @SerializedName("endTime")
    private String endTime;

    public RequestDepositDetailed(String phone, String companyName, int pageIndex, int pageSize, String startTime, String endTime) {
        this.phone = phone;
        this.companyName = companyName;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
