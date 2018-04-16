package com.kye.model.bean.waybill_search;


public class RequestDeleteHistoryRecord {
    /**
     * phone : 15035438277
     * waybill : 12121132356
     */

    private String phone;
    private String waybill;

    public RequestDeleteHistoryRecord(String phone, String waybill) {
        this.phone = phone;
        this.waybill = waybill;
    }

    public String getPhone()               { return phone;}

    public void setPhone(String phone)     { this.phone = phone;}

    public String getWaybill()             { return waybill;}

    public void setWaybill(String waybill) { this.waybill = waybill;}
}
