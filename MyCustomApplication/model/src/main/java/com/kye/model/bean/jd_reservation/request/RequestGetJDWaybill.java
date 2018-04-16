package com.kye.model.bean.jd_reservation.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestPage;

public class RequestGetJDWaybill extends RequestPage{

    @SerializedName("waybill")
    private String waybill;

    public RequestGetJDWaybill(String phone, String waybill, int pageIndex, int pageSize) {
        super(phone, pageIndex, pageSize);
        this.waybill = waybill;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

}
