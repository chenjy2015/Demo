package com.kye.model.bean.order.scan_code_order;

import com.google.gson.annotations.SerializedName;

public class ScanCodeAddOrderBean {
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("reciveName")
    private String reciveName;
    @SerializedName("sendTime")
    private String sendTime;

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getReciveName() {
        return reciveName;
    }

    public void setReciveName(String reciveName) {
        this.reciveName = reciveName;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
