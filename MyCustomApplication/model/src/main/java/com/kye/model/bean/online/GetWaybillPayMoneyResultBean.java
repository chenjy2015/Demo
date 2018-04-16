package com.kye.model.bean.online;


/**
 * Created by chen on 18/1/18.
 */

public class GetWaybillPayMoneyResultBean {


    /**
     * waybill : 11100903646
     * money : 470.30
     * payCompany : 贵阳新碳
     * sendinTime : 2017-08-08 16:16:00
     */

    private String waybill;
    private double money;
    private String payCompany;
    private String sendinTime;

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

    public String getPayCompany() {
        return payCompany;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }

    public String getSendinTime() {
        return sendinTime;
    }

    public void setSendinTime(String sendinTime) {
        this.sendinTime = sendinTime;
    }
}
