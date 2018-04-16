package com.kye.model.bean.invoice_online;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class RequestMailInvoiceBean {


    /**
     * phone : 18924656687
     * sourceCode : 20170818T00000000007
     * email : 3286484670@qq.com
     */

    private String phone;
    private String sourceCode;
    private String email;

    public RequestMailInvoiceBean(String phone, String sourceCode, String email) {
        this.phone = phone;
        this.sourceCode = sourceCode;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
