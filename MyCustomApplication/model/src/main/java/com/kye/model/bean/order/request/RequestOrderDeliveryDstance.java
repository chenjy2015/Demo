package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

public class RequestOrderDeliveryDstance {
    @SerializedName("phone")
    private String phone;
    @SerializedName("waybill")
    private String waybill;

    public RequestOrderDeliveryDstance(String phone, String waybill) {
        this.phone = phone;
        this.waybill = waybill;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }
}
