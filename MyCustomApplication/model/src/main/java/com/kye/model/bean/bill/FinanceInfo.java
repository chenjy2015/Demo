package com.kye.model.bean.bill;

import com.google.gson.annotations.SerializedName;

public class FinanceInfo {
    @SerializedName("financeName")
    private String financeName;
    @SerializedName("financePhone")
    private String financePhone;

    public FinanceInfo(String financeName, String financePhone) {
        this.financeName = financeName;
        this.financePhone = financePhone;
    }

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }

    public String getFinancePhone() {
        return financePhone;
    }

    public void setFinancePhone(String financePhone) {
        this.financePhone = financePhone;
    }
}
