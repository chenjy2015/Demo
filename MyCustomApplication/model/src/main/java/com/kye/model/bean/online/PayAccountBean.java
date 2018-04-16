package com.kye.model.bean.online;

import java.util.List;

/**
 * Created by chen on 18/1/19.
 */

public class PayAccountBean {


    private String account;
    private int payType;
    private String payAppId;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getPayAppId() {
        return payAppId;
    }

    public void setPayAppId(String payAppId) {
        this.payAppId = payAppId;
    }
}
