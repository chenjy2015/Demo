package com.kye.model.bean.deposit;

import com.kye.model.bean.user.User;

/**
 * Created by SkyYu on 2018/1/16
 */
public class ResultDepositHeaderBean {

    private User user;
    private ResultQueryReserveBalanceBean balanceBean;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ResultQueryReserveBalanceBean getBalance() {
        return balanceBean;
    }

    public void setBalance(ResultQueryReserveBalanceBean balance) {
        this.balanceBean = balance;
    }
}