package com.kye.model.bean.invoice_online;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class RequestFindWaybillAmountBean {


    /**
     * phone : 18948167740
     * waybill : 75503498701
     */

    private String phone;
    private String waybill;

    public RequestFindWaybillAmountBean(String phone, String waybill) {
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
