package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestWithdrawBean {


    /**
     * cashCompany : IT部测试
     * cashAmount : 5.00
     * phone : 18924656687
     * valiteCode : 451698
     */

    private String cashCompany;
    private String cashAmount;
    private String phone;
    private String valiteCode;

    public RequestWithdrawBean(String cashCompany, String cashAmount, String phone, String valiteCode) {
        this.cashCompany = cashCompany;
        this.cashAmount = cashAmount;
        this.phone = phone;
        this.valiteCode = valiteCode;
    }

    public String getCashCompany() {
        return cashCompany;
    }

    public void setCashCompany(String cashCompany) {
        this.cashCompany = cashCompany;
    }

    public String getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(String cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getValiteCode() {
        return valiteCode;
    }

    public void setValiteCode(String valiteCode) {
        this.valiteCode = valiteCode;
    }
}
