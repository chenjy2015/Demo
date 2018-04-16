package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestGetVerificationCodeBean {


    /**
     * phone : 13128802535
     */

    private String phone;

    public RequestGetVerificationCodeBean(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
