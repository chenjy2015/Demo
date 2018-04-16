package com.kye.model.bean.online.request;


/**
 * Created by chen on 18/1/18.
 */

public class RequestGetPayResultBean {

    /**
     * phone : 18948167740
     * orderNo : 111
     */

    private String phone;
    private String orderNo;

    public RequestGetPayResultBean(String phone, String orderNo) {
        this.phone = phone;
        this.orderNo = orderNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
