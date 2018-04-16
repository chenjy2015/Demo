package com.kye.model.bean.order.scan_code_order;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 16/03/2018
 * @updated : 16/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class OrderMainLogisticsBeanBackup {


    /**
     * supportValue : 1000
     * sendName : 姚遥
     * sendAddress : 广东省深圳市宝安区富源二路跨越速运
     * sms : 15818415911
     * payType : 寄付
     * reciveAddress : 广东省广州市天河区岗顶
     * recivePhone : 15818415922
     * reciveName : 王五
     * waybillRemark : 备注
     */

    @SerializedName("supportValue")
    private int    supportValue;
    @SerializedName("sendName")
    private String sendName;
    @SerializedName("sendAddress")
    private String sendAddress;
    @SerializedName("sms")
    private String sms;
    @SerializedName("payType")
    private String payType;
    @SerializedName("reciveAddress")
    private String reciveAddress;
    @SerializedName("recivePhone")
    private String recivePhone;
    @SerializedName("reciveName")
    private String reciveName;
    @SerializedName("waybillRemark")
    private String waybillRemark;

    public int getSupportValue() {
        return supportValue;
    }

    public void setSupportValue(int supportValue) {
        this.supportValue = supportValue;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getReciveAddress() {
        return reciveAddress;
    }

    public void setReciveAddress(String reciveAddress) {
        this.reciveAddress = reciveAddress;
    }

    public String getRecivePhone() {
        return recivePhone;
    }

    public void setRecivePhone(String recivePhone) {
        this.recivePhone = recivePhone;
    }

    public String getReciveName() {
        return reciveName;
    }

    public void setReciveName(String reciveName) {
        this.reciveName = reciveName;
    }

    public String getWaybillRemark() {
        return waybillRemark;
    }

    public void setWaybillRemark(String waybillRemark) {
        this.waybillRemark = waybillRemark;
    }
}
