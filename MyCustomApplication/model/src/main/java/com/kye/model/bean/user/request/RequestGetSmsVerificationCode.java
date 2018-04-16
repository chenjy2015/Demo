package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;

public class RequestGetSmsVerificationCode {

    /**
     * phonenumber : 18576629332
     * captcha :
     */
    @SerializedName("phonenumber")
    private String phonenumber;

    @SerializedName("captcha")
    private String captcha;

    public RequestGetSmsVerificationCode(String phonenumber, String captcha) {
        this.phonenumber = phonenumber;
        this.captcha = captcha;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
