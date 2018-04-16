package com.kye.model.bean.bill.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;

public class RequestGetBill extends RequestUser {
    @SerializedName("billDate")
    private String billDate;
    @SerializedName("dateType")
    private String dateType;

    public RequestGetBill(String phone, String billDate, int dateType) {
        super(phone);
        this.billDate = billDate;
        this.dateType = dateType + "";
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }
}
