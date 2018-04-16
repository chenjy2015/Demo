package com.kye.model.bean.order.scan_code_order.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class RequestAddScanCode implements Serializable {
    @SerializedName("sendName")
    private String sendName;
    @SerializedName("sendPhone")
    private String sendPhone;
    @SerializedName("sendAddress")
    private String sendAddress;
    @SerializedName("commodities")
    private String commodities;
    @SerializedName("serviceMode")
    private String serviceMode;
    @SerializedName("remark")
    private String remark;
    @SerializedName("reciveName")
    private String reciveName;
    @SerializedName("recivePhone")
    private String recivePhone;
    @SerializedName("reciveAddress")
    private String reciveAddress;
    @SerializedName("source")
    private String source = "2";
    @SerializedName("sendProvince")
    private String sendProvince;
    @SerializedName("sendCity")
    private String sendCity;
    @SerializedName("receiptProvince")
    private String recivePtprovince;
    @SerializedName("reciveCity")
    private String reciveCity;
    @SerializedName("supportValue")
    private String supportValue;
    @SerializedName("companyCode")
    private String companyCode;
    @SerializedName("weight")
    private String weight;
    @SerializedName("number")
    private String number;
    @SerializedName("payType")
    private String payType;
    @SerializedName("goodTime")
    private Date   goodTime;
    @SerializedName("phone")
    private String phone;
    @SerializedName("sendAddressGuid")
    private String sendAddressGuid;
    @SerializedName("reciveAddressGuid")
    private String reciveAddressGuid;
    @SerializedName("sendArea")
    private String sendArea;
    @SerializedName("senderAddress")
    private String senderAddress;
    @SerializedName("receiptArea")
    private String receiptArea;
    @SerializedName("receivesAddress")
    private String receivesAddress;
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("waybill")
    private String waybill;

    @SerializedName("orderType")
    private String orderType = "2";

    public RequestAddScanCode() {}

    public RequestAddScanCode(String sendName,
                              String sendPhone,
                              String sendAddress,
                              String commodities,
                              String serviceMode,
                              String remark,
                              String reciveName,
                              String recivePhone,
                              String reciveAddress,
                              String sendProvince,
                              String sendCity,
                              String recivePtprovince,
                              String reciveCity,
                              String supportValue,
                              String companyCode,
                              String weight,
                              String number,
                              String payType,
                              Date goodTime,
                              String sendAddressGuid,
                              String reciveAddressGuid,
                              String sendArea,
                              String senderAddress,
                              String receiptArea,
                              String receivesAddress
                             ) {
        this.sendName = sendName;
        this.sendPhone = sendPhone;
        this.sendAddress = sendAddress;
        this.commodities = commodities;
        this.serviceMode = serviceMode;
        this.remark = remark;
        this.reciveName = reciveName;
        this.recivePhone = recivePhone;
        this.reciveAddress = reciveAddress;
        this.sendProvince = sendProvince;
        this.sendCity = sendCity;
        this.recivePtprovince = recivePtprovince;
        this.reciveCity = reciveCity;
        this.supportValue = supportValue;
        this.companyCode = companyCode;
        this.weight = weight;
        this.number = number;
        this.payType = payType;
        this.goodTime = goodTime;

        this.sendAddressGuid = sendAddressGuid;
        this.reciveAddressGuid = reciveAddressGuid;
        this.sendArea = sendArea;
        this.senderAddress = senderAddress;
        this.receiptArea = receiptArea;
        this.receivesAddress = receivesAddress;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public String getCommodities() {
        return commodities;
    }

    public void setCommodities(String commodities) {
        this.commodities = commodities;
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReciveName() {
        return reciveName;
    }

    public void setReciveName(String reciveName) {
        this.reciveName = reciveName;
    }

    public String getRecivePhone() {
        return recivePhone;
    }

    public void setRecivePhone(String recivePhone) {
        this.recivePhone = recivePhone;
    }

    public String getReciveAddress() {
        return reciveAddress;
    }

    public void setReciveAddress(String reciveAddress) {
        this.reciveAddress = reciveAddress;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public String getRecivePtprovince() {
        return recivePtprovince;
    }

    public void setRecivePtprovince(String recivePtprovince) {
        this.recivePtprovince = recivePtprovince;
    }

    public String getReciveCity() {
        return reciveCity;
    }

    public void setReciveCity(String reciveCity) {
        this.reciveCity = reciveCity;
    }

    public String getSupportValue() {
        return supportValue;
    }

    public void setSupportValue(String supportValue) {
        this.supportValue = supportValue;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(Date goodTime) {
        this.goodTime = goodTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getSendAddressGuid() {
        return sendAddressGuid;
    }

    public void setSendAddressGuid(String sendAddressGuid) {
        this.sendAddressGuid = sendAddressGuid;
    }

    public String getReciveAddressGuid() {
        return reciveAddressGuid;
    }

    public void setReciveAddressGuid(String reciveAddressGuid) {
        this.reciveAddressGuid = reciveAddressGuid;
    }

    public String getSendArea() {
        return sendArea;
    }

    public void setSendArea(String sendArea) {
        this.sendArea = sendArea;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiptArea() {
        return receiptArea;
    }

    public void setReceiptArea(String receiptArea) {
        this.receiptArea = receiptArea;
    }

    public String getReceivesAddress() {
        return receivesAddress;
    }

    public void setReceivesAddress(String receivesAddress) {
        this.receivesAddress = receivesAddress;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }
}
