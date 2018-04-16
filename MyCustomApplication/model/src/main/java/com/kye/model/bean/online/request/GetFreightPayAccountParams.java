package com.kye.model.bean.online.request;

import com.google.gson.annotations.SerializedName;



/**
 *
 *@Author chen
 *@Date 18/1/20 下午5:55
 *@descript 获取预存运费账号入参
 */

public class GetFreightPayAccountParams{

    String phone;

    String companyCode;

    public GetFreightPayAccountParams(){

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
