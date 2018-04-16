package com.kye.model.bean.invoice_online;

import java.math.BigDecimal;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class GetInvoicedListResultBean {


    /**
     * waybill : 57900031302
     * money : 1.20
     */

    private String  waybill;
    private double  money;
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public BigDecimal getBigDecimal() {
        return new BigDecimal(money + "");
    }

}
