package com.kye.model.bean.invoice_online;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class RequestGetInvoiceDetailBean {


    /**
     * phone : 18948167740
     * groupCode : 65c993901930486d8f9ebb238d88a18b
     */

    private String phone;
    private String groupCode;

    public RequestGetInvoiceDetailBean(String phone, String groupCode) {
        this.phone = phone;
        this.groupCode = groupCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
}
