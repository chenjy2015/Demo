package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class RequestQueryCostBean {

    /**
     * phone : 18924656687
     * companyCode : 75598713
     * sendAreaCode : 0755
     * receiptAreaCode : 021
     * billingWeight : 100
     * number : 1
     * cubicNumber : 1
     * goodTime : 2016-04-22 12:00:00
     * serviceMode : 1
     */

    private String phone;
    private String companyCode;
    private String sendAreaCode;
    private String receiptAreaCode;
    private int billingWeight;
    private int number;
    private int cubicNumber;
    private String goodTime;
    private int serviceMode;

    public RequestQueryCostBean(String phone, String companyCode, String sendAreaCode, String receiptAreaCode, int billingWeight, int number, int cubicNumber, String goodTime, int serviceMode) {
        this.phone = phone;
        this.companyCode = companyCode;
        this.sendAreaCode = sendAreaCode;
        this.receiptAreaCode = receiptAreaCode;
        this.billingWeight = billingWeight;
        this.number = number;
        this.cubicNumber = cubicNumber;
        this.goodTime = goodTime;
        this.serviceMode = serviceMode;
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

    public String getSendAreaCode() {
        return sendAreaCode;
    }

    public void setSendAreaCode(String sendAreaCode) {
        this.sendAreaCode = sendAreaCode;
    }

    public String getReceiptAreaCode() {
        return receiptAreaCode;
    }

    public void setReceiptAreaCode(String receiptAreaCode) {
        this.receiptAreaCode = receiptAreaCode;
    }

    public int getBillingWeight() {
        return billingWeight;
    }

    public void setBillingWeight(int billingWeight) {
        this.billingWeight = billingWeight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCubicNumber() {
        return cubicNumber;
    }

    public void setCubicNumber(int cubicNumber) {
        this.cubicNumber = cubicNumber;
    }

    public String getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(String goodTime) {
        this.goodTime = goodTime;
    }

    public int getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(int serviceMode) {
        this.serviceMode = serviceMode;
    }
}
