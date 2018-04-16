package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class RequestPermissionQueryCostBean {


    /**
     * phone : 18924656687
     * customerCode : 75519398828
     */

    private String phone;
    private String customerCode;

    public RequestPermissionQueryCostBean(String phone, String customerCode) {
        this.phone = phone;
        this.customerCode = customerCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
}
