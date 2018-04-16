package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by harry on 2018/4/5 11:46.
 */

public class RequestDeleteSannerOeder {
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("phone")
    private String phone;
    @SerializedName("waybill")
    private String waybill;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
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
