package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestGetCashCountBean {


    /**
     * autograph : 123456
     * phone : 18924656687
     */

    private String autograph;
    private String phone;

    public RequestGetCashCountBean(String autograph, String phone) {
        this.autograph = autograph;
        this.phone = phone;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
