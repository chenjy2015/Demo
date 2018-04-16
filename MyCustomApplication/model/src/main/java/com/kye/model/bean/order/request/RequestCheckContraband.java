package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;


public class RequestCheckContraband extends RequestUser {
    @SerializedName("goodsName")
    private String goodsName;

    public RequestCheckContraband(String phone, String goodsName) {
        super(phone);
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
