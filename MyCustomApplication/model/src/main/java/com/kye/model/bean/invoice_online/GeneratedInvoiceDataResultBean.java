package com.kye.model.bean.invoice_online;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class GeneratedInvoiceDataResultBean implements Serializable{

    /**
     * amount : 14.1
     * waybill : 75503498688
     * groupCode : 8EC27E3A708A44D4B38AE35E7D71467C
     */

    private double amount;
    private String waybill = "";
    private String groupCode;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

}
