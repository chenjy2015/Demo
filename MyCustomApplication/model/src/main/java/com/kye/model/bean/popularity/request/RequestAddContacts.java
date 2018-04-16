package com.kye.model.bean.popularity.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.popularity.PhoneNumber;

import java.util.List;

public class RequestAddContacts {
    @SerializedName("key")
    private String key = "EDC44EDA65D3CAB85B127AA01DAAD0A3";
    @SerializedName("phone")
    private String phone;
    @SerializedName("data")
    private List<PhoneNumber> data;

    public RequestAddContacts(String phone, List<PhoneNumber> data) {
        this.phone = phone;
        this.data = data;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<PhoneNumber> getData() {
        return data;
    }

    public void setData(List<PhoneNumber> data) {
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
