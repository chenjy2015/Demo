package com.kye.model.bean.order;

import com.google.gson.annotations.SerializedName;

public class OrderContrabandBean {
    @SerializedName("isLegal")
    private int isLegal;
    @SerializedName("marketingTelphone")
    private String marketingTelphone;

    public int getIsLegal() {
        return isLegal;
    }

    public void setIsLegal(int isLegal) {
        this.isLegal = isLegal;
    }

    public String getMarketingTelphone() {
        return marketingTelphone;
    }

    public void setMarketingTelphone(String marketingTelphone) {
        this.marketingTelphone = marketingTelphone;
    }
}
