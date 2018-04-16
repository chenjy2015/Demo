package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class RequestGetCustomerInfoBean {

    /**
     * phone : 18898355737
     */

    private String phone;

    public RequestGetCustomerInfoBean(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
