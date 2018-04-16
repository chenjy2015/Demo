package com.kye.model.bean.invoice_online;

import java.io.Serializable;

/**
 * invoice_queryBillingInformation 接口
 * Created by qwerty on 2018/4/3.
 */
public class InvoiceQueryBillingInformationResultBean implements Serializable {

    /**
     * "buyerType": "01",
     * "buyerName": "企业开票",
     * "buyerPhone": "18948167740",
     * "taxpayersId": "123456789123456",
     * "openingBankName": "",
     * "openingBankAccount": "123456781",
     * "buyerAddress": "15982066774",
     * "email": "847979339@qq.com"
     */

    private String buyerType          = "";
    private String buyerName          = "";
    private String buyerPhone         = "";
    private String taxpayersId        = "";
    private String openingBankName    = "";
    private String openingBankAccount = "";
    private String buyerAddress       = "";
    private String email              = "";

    public String getBuyerType() {
        return buyerType;
    }

    public void setBuyerType(String buyerType) {
        this.buyerType = buyerType;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getTaxpayersId() {
        return taxpayersId;
    }

    public void setTaxpayersId(String taxpayersId) {
        this.taxpayersId = taxpayersId;
    }

    public String getOpeningBankName() {
        return openingBankName;
    }

    public void setOpeningBankName(String openingBankName) {
        this.openingBankName = openingBankName;
    }

    public String getOpeningBankAccount() {
        return openingBankAccount;
    }

    public void setOpeningBankAccount(String openingBankAccount) {
        this.openingBankAccount = openingBankAccount;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
