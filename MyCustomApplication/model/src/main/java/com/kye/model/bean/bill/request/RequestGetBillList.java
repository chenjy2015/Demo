package com.kye.model.bean.bill.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestPage;

public class RequestGetBillList extends RequestPage {
    @SerializedName("billDate")
    private String billDate;
    @SerializedName("dateType")
    private String dateType;
    @SerializedName("type")
    private String type = "1";

    public RequestGetBillList(String phone, String billDate, int dateType) {
        super(phone, 1, 100000);
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

    public void setDateType(int dateType) {
        this.dateType = dateType + "";
    }

    public String getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type + "";
    }
}
