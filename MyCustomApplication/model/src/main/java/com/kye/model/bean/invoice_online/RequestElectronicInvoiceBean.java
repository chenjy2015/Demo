package com.kye.model.bean.invoice_online;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class RequestElectronicInvoiceBean {

    /**
     * buyerName : 测试开票
     * buyerType : 2
     * buyerPhone : 18948167742
     * invoiceSource : 18948167742
     * phone : 18948167740
     * taxpayersId : sb5y
     * buyerAddress : pyf2
     * buyerAccount : fj1j
     * email : 2359836324@qq.com
     * groupCode : E57D7B874C7941FF93D309F7C32A23DD
     */

    private String buyerName;
    private int buyerType;
    private String buyerPhone;
    private String invoiceSource;
    private String phone;
    private String taxpayersId;
    private String buyerAddress;
    private String buyerAccount;
    private String email;
    private String groupCode;

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public int getBuyerType() {
        return buyerType;
    }

    public void setBuyerType(int buyerType) {
        this.buyerType = buyerType;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getInvoiceSource() {
        return invoiceSource;
    }

    public void setInvoiceSource(String invoiceSource) {
        this.invoiceSource = invoiceSource;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTaxpayersId() {
        return taxpayersId;
    }

    public void setTaxpayersId(String taxpayersId) {
        this.taxpayersId = taxpayersId;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
}
