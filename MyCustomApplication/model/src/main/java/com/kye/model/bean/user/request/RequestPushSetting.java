package com.kye.model.bean.user.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;

public class RequestPushSetting extends RequestUser {

    @SerializedName("loginType")
    private String loginType = 1 + "";

    @SerializedName("value")
    private String value;

    public RequestPushSetting(String phone, boolean isPush) {
        super(phone);
        this.value = isPush ? 1 + "" : 0 + "";
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
