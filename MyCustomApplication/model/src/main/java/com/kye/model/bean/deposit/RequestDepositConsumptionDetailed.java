package com.kye.model.bean.deposit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SkyYu on 2018/3/6
 */
public class RequestDepositConsumptionDetailed {

    // 登录账号
    @SerializedName("phone")
    private String phone;
    // 公司名称
    @SerializedName("companyName")
    private String companyName;
    // 页数
    @SerializedName("pageIndex")
    private String pageIndex;
    // 页面大小
    @SerializedName("pageSize")
    private String pageSize;
    // 开始时间
    @SerializedName("startTime")
    private String startTime;
    // 结束时间
    @SerializedName("endTime")
    private String endTime;

    public RequestDepositConsumptionDetailed(String phone, String companyName, String pageIndex, String pageSize, String startTime, String endTime) {
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

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
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
