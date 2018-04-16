package com.kye.model.bean.integral.request;

import java.io.Serializable;

/**
 * Created by SkyYu on 08/01/2018
 */
public class RequestUserIntegral implements Serializable {

    private String autograph = "10001";
    private String phone;

    public RequestUserIntegral() {
    }

    public RequestUserIntegral(String autograph, String phone) {
        this.autograph = autograph;
        this.phone = phone;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
