package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class RequestAddOrder {
    @SerializedName("phone")
    private String phone;

    @SerializedName("companyCode")
    private String companyCode;

    @SerializedName("orderMan")
    private String orderMan;

    @SerializedName("totalNumber")
    private String totalNumber;

    @SerializedName("address")
    private String address;

    @SerializedName("goodTime")
    private Date goodTime;

    @SerializedName("remark")
    private String remark;

    /**
     * commodities 托寄物
     */
    @SerializedName("commodities")
    private String commodities;

    @SerializedName("orderCompany")
    private String orderCompany;

    @SerializedName("orderCode")
    private String orderCode;

    @SerializedName("telephone")
    private String telephone;

    @SerializedName("orderSource")
    private int orderSource = 3;

    @SerializedName("totalPoll")
    private String totalPoll;

    @SerializedName("serviceMode1")
    private String serviceMode1;

    @SerializedName("weight1")
    private String weight1;

    @SerializedName("repeatStatus")
    private boolean repeatStatus;

    @SerializedName("size")
    private String size;

    @SerializedName("volume")
    private String volume;

    @SerializedName("getTelphone")
    private String getTelphone;

    @SerializedName("temporaryAddress")
    private String temporaryAddress;

    @SerializedName("temporaryAddressGuid")
    private String temporaryAddressGuid;

    @SerializedName("orderTelphone")
    private String orderTelphone;

    public String getTemporaryAddressGuid() {
        return temporaryAddressGuid;
    }

    public void setTemporaryAddressGuid(String temporaryAddressGuid) {
        this.temporaryAddressGuid = temporaryAddressGuid;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public String getGetTelphone() {
        return getTelphone;
    }

    public void setGetTelphone(String getTelphone) {
        this.getTelphone = getTelphone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getOrderMan() {
        return orderMan;
    }

    public void setOrderMan(String orderMan) {
        this.orderMan = orderMan;
    }

    public String getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(String totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(Date goodTime) {
        this.goodTime = goodTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCommodities() {
        return commodities;
    }

    public void setCommodities(String commodities) {
        this.commodities = commodities;
    }

    public String getOrderCompany() {
        return orderCompany;
    }

    public void setOrderCompany(String orderCompany) {
        this.orderCompany = orderCompany;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(int orderSource) {
        this.orderSource = orderSource;
    }

    public String getTotalPoll() {
        return totalPoll;
    }

    public void setTotalPoll(String totalPoll) {
        this.totalPoll = totalPoll;
    }

    public String getServiceMode1() {
        return serviceMode1;
    }

    public void setServiceMode1(String serviceMode1) {
        this.serviceMode1 = serviceMode1;
    }

    public String getWeight1() {
        return weight1;
    }

    public void setWeight1(String weight1) {
        this.weight1 = weight1;
    }

    public boolean isRepeatStatus() {
        return repeatStatus;
    }

    public void setRepeatStatus(boolean repeatStatus) {
        this.repeatStatus = repeatStatus;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getOrderTelphone() {
        return orderTelphone;
    }

    public void setOrderTelphone(String orderTelphone) {
        this.orderTelphone = orderTelphone;
    }
}
