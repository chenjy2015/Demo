package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestLoginWithSmsVerificationCode {

    /**
     * phonenumber : 18682118793
     * smscaptcha : 831846
     */

    @SerializedName("phonenumber")
    private String phonenumber;
    @SerializedName("smscaptcha")
    private String smscaptcha;

    public RequestLoginWithSmsVerificationCode(String phonenumber, String smscaptcha) {
        this.phonenumber = phonenumber;
        this.smscaptcha = smscaptcha;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSmscaptcha() {
        return smscaptcha;
    }

    public void setSmscaptcha(String smscaptcha) {
        this.smscaptcha = smscaptcha;
    }
}
