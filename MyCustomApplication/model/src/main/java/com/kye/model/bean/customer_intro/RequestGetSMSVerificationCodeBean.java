package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestGetSMSVerificationCodeBean {


    /**
     * phone : 18924656687
     * dynamicCode : 5D3BB1AAAA93484698E62D3B284579BE
     * type : 0
     */

    private String phone;
    private String dynamicCode;
    private String type;

    public RequestGetSMSVerificationCodeBean(String phone, String dynamicCode, String type) {
        this.phone = phone;
        this.dynamicCode = dynamicCode;
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDynamicCode() {
        return dynamicCode;
    }

    public void setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
