package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestGetImageVerificationCode {

    /**
     * phonenumber : 18682118793
     */

    @SerializedName("phonenumber")
    private String phonenumber;

    public RequestGetImageVerificationCode(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
