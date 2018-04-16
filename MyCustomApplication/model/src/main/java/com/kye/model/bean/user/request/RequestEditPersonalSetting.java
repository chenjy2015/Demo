package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class RequestEditPersonalSetting {
    @SerializedName("phone")
    private String phone;
    @SerializedName("work")
    private String work;
    @SerializedName("sex")
    private String sex;
    @SerializedName("name")
    private String name;
    @SerializedName("date")
    private Date date;

    public RequestEditPersonalSetting(String phone, String name, String gender, String company, Date birthday) {
        this.phone = phone;
        this.name = name;
        this.sex = gender;
        this.work = company;
        this.date = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
