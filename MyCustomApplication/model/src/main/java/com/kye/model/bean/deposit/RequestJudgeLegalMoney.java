package com.kye.model.bean.deposit;

/**
 * Created by SkyYu on 2018/1/20
 */
public class RequestJudgeLegalMoney {

    /**
     * money : 1500
     */

    private String money;

    public RequestJudgeLegalMoney(String money) {
        this.money = money;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
