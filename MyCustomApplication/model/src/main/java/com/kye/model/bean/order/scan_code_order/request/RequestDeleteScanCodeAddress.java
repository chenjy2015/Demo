package com.kye.model.bean.order.scan_code_order.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;

public class RequestDeleteScanCodeAddress extends RequestUser{
    @SerializedName("guid")
    private String guid;

    public RequestDeleteScanCodeAddress(String phone, String guid) {
        super(phone);
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
