package com.kye.model.bean.bill.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;

public class RequestGetBillDetail extends RequestUser {

    @SerializedName("waybill")
    private String waybill;

    public RequestGetBillDetail(String phone, String waybill) {
        super(phone);
        this.waybill = waybill;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }
}
