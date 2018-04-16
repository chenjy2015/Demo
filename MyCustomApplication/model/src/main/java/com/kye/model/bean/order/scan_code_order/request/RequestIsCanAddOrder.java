package com.kye.model.bean.order.scan_code_order.request;

import com.google.gson.annotations.SerializedName;

public class RequestIsCanAddOrder {
    @SerializedName("companyCode")
    private String companyCode;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("phone")
    private String phone;

    public RequestIsCanAddOrder(String companyCode, String waybill, String phone) {
        this.companyCode = companyCode;
        this.waybill = waybill;
        this.phone = phone;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
