package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class RequestQueryWaybillCostBean {


    /**
     * waybill : 75503498541
     * phone : 13222992863
     * queryPhone : 18948167740
     */

    private String waybill;
    private String phone;
    private String queryPhone;

    public RequestQueryWaybillCostBean(String waybill, String phone, String queryPhone) {
        this.waybill = waybill;
        this.phone = phone;
        this.queryPhone = queryPhone;
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

    public String getQueryPhone() {
        return queryPhone;
    }

    public void setQueryPhone(String queryPhone) {
        this.queryPhone = queryPhone;
    }
}
