package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestCompleteInformation {


    @SerializedName("phone")
    private String phone;
    @SerializedName("company")
    private String company;
    @SerializedName("name")
    private String name;


    public RequestCompleteInformation(String phone, String company, String name) {
        this.phone = phone;
        this.company = company;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
