package com.kye.model.bean.waybill_search;

/**
 * Created by harry on 2018/1/6 下午3:42.
 */

public class RequestWaybillQuery {

    /**
     * waybill : 02300086747
     * phone : kj5i
     * waybillPhone : qkx4
     * telephone : 7m36
     * sender : s8k5
     */

    private String waybill;
    private String phone;
    private String waybillPhone;
    private String telephone;
    private String sender;

    public RequestWaybillQuery() {
    }

    public RequestWaybillQuery(String waybill, String phone) {
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

    public String getWaybillPhone() {
        return waybillPhone;
    }

    public void setWaybillPhone(String waybillPhone) {
        this.waybillPhone = waybillPhone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
