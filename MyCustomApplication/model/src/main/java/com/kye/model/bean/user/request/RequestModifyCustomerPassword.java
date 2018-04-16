package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestModifyCustomerPassword {
    @SerializedName("phone")
    private String phone;
    @SerializedName("companyCode")
    private String companyCode;
    @SerializedName("oldCustomerPWD")
    private String oldCustomerPWD;
    @SerializedName("newCustomerPWD")
    private String newCustomerPWD;

    public RequestModifyCustomerPassword(String phone, String companyCode, String oldCustomerPWD, String newCustomerPWD) {
        this.phone = phone;
        this.companyCode = companyCode;
        this.oldCustomerPWD = oldCustomerPWD;
        this.newCustomerPWD = newCustomerPWD;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getOldCustomerPWD() {
        return oldCustomerPWD;
    }

    public void setOldCustomerPWD(String oldCustomerPWD) {
        this.oldCustomerPWD = oldCustomerPWD;
    }

    public String getNewCustomerPWD() {
        return newCustomerPWD;
    }

    public void setNewCustomerPWD(String newCustomerPWD) {
        this.newCustomerPWD = newCustomerPWD;
    }
}
