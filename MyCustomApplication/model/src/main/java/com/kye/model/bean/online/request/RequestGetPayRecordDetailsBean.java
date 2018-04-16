package com.kye.model.bean.online.request;


/**
 * Created by chen on 18/1/18.
 */

public class RequestGetPayRecordDetailsBean {


    /**
     * waybill : 4003412001201702150028171138
     * phone : 18924656687
     */

    private String waybill;
    private String phone;

    public RequestGetPayRecordDetailsBean(String waybill, String phone) {
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
