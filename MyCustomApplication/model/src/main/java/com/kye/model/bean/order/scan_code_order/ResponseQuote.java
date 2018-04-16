package com.kye.model.bean.order.scan_code_order;

import com.google.gson.annotations.SerializedName;

public class ResponseQuote {

    /**
     * quote : 250
     */

    @SerializedName("quote")
    private double quote;

    public double getQuote() {
        return quote;
    }

    public void setQuote(double quote) {
        this.quote = quote;
    }
}
