package com.kye.model.bean.invoice_online;

/**
 * Created by yzw on 2018/3/16.
 */
public class RequestBillGrantApplicationBean {

    /**
     * 登录账号
     */
    private String phone;

    /**
     * 运单号
     */
    private String waybill;

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
