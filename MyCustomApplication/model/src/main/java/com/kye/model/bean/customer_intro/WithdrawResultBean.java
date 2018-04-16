package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class WithdrawResultBean {


    /**
     * status : 0
     * retMsg : 提现金额有误,请检查！
     * money : 0
     */

    private String status;//是否提现成功（"1" 表示提现成功 "0"表示提现失败）
    private String retMsg;
    private String money;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
