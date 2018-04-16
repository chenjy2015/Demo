package com.kye.model.bean.order.scan_code_order.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;

public class RequestGetQuote extends RequestUser {
    @SerializedName("customerCode")
    private String customerCode;
    @SerializedName("sendProvince")
    private String sendProvince;
    @SerializedName("sendCity")
    private String sendCity;
    @SerializedName("receiptProvince")
    private String receiveProvince;
    @SerializedName("receiptCity")
    private String receiveCity;
    @SerializedName("sendPhone")
    private String sendPhone;
    @SerializedName("serviceMode")
    private String serviceMode;
    @SerializedName("weight")
    private String weight;
    @SerializedName("itemCount")
    private String itemCount;
    @SerializedName("calculationType")
    private String calculationType;

    public RequestGetQuote(String customerCode,
                           String sendProvince,
                           String sendCity,
                           String receiveProvince,
                           String receiveCity,
                           String sendPhone,
                           String serviceMode,
                           String weight,
                           String itemCount,
                           String phone) {
        super(phone);
        this.customerCode = customerCode;
        this.sendProvince = sendProvince;
        this.sendCity = sendCity;
        this.receiveProvince = receiveProvince;
        this.receiveCity = receiveCity;
        this.sendPhone = sendPhone;
        this.serviceMode = serviceMode;
        this.weight = weight;
        this.itemCount = itemCount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getSendProvince() {
        return sendProvince;
    }

    public void setSendProvince(String sendProvince) {
        this.sendProvince = sendProvince;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
    }

    public String getReceiveProvince() {
        return receiveProvince;
    }

    public void setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince;
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity;
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getItemCount() {
        return itemCount;
    }

    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }
}
