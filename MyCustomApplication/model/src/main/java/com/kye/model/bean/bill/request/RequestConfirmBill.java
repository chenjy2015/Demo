package com.kye.model.bean.bill.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;

public class RequestConfirmBill extends RequestUser {
    @SerializedName("billDate")
    private String billDate;

    public RequestConfirmBill(String phone, String billDate) {
        super(phone);
        this.billDate = billDate;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }
}
