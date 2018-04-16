package com.kye.model.bean.online.request;


/**
 * Created by chen on 18/1/18.
 */

public class RequestGetWaybillPayMoneyBean {


    /**
     * waybill : 11100903646
     * phone : 15818415911
     */

    private String waybill;
    private String phone;

    public RequestGetWaybillPayMoneyBean(String waybill, String phone) {
        this.waybill = waybill;
        this.phone = phone;
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
