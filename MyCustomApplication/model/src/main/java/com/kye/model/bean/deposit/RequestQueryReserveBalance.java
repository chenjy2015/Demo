package com.kye.model.bean.deposit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SkyYu on 2018/1/16
 */
public class RequestQueryReserveBalance {

    // 登录账号
    @SerializedName("phone")
    private String phone;
    // 客户编码
    @SerializedName("companyCode")
    private String companyCode;

    public RequestQueryReserveBalance(String phone, String companyCode) {
        this.phone = phone;
        this.companyCode = companyCode;
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
}
