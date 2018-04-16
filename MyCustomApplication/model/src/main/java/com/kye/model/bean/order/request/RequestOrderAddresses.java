package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

public class RequestOrderAddresses {
    @SerializedName("phone")
    private String phone;
    @SerializedName("companyCode")
    private String companyCode;
    @SerializedName("stype")
    private String stype;

    public RequestOrderAddresses(String phone, String companyCode) {
        this.phone = phone;
        this.companyCode = companyCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
