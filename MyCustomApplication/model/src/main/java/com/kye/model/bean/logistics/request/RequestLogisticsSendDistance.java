package com.kye.model.bean.logistics.request;

import com.google.gson.annotations.SerializedName;

public class RequestLogisticsSendDistance {
    @SerializedName("waybill")
    private String waybill;

    public RequestLogisticsSendDistance(String waybill) {
        this.waybill = waybill;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }
}
