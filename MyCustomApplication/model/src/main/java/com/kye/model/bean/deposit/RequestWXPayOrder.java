package com.kye.model.bean.deposit;

/**
 * Created by SkyYu on 2018/1/20
 */
public class RequestWXPayOrder {

    /**
     * body : app微信充值 下单接口
     * spbill_create_ip : 192.168.137.216
     * total_fee : 50000
     * company : 跨越速运集团
     * phone : 13341013536
     * remark : 支付备注说明
     */

    private String body;
    private String spbill_create_ip;
    private String total_fee;
    private String company;
    private String phone;
    private String remark;

    public RequestWXPayOrder(String body, String spbill_create_ip, String total_fee, String company, String phone, String remark) {
        this.body = body;
        this.spbill_create_ip = spbill_create_ip;
        this.total_fee = total_fee;
        this.company = company;
        this.phone = phone;
        this.remark = remark;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
