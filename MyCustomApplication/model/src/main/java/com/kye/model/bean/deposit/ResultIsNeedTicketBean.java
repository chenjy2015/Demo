package com.kye.model.bean.deposit;

/**
 * Created by SkyYu on 2018/1/20
 */
public class ResultIsNeedTicketBean {

    /**
     * isVoucher : false
     * account : 6227077200224717
     * userName : 杨晓
     * bankName : 中国建设银行深圳机场支行
     */

    private boolean isVoucher;
    private String account;
    private String userName;
    private String bankName;

    public ResultIsNeedTicketBean(boolean isVoucher, String account, String userName, String bankName) {
        this.isVoucher = isVoucher;
        this.account = account;
        this.userName = userName;
        this.bankName = bankName;
    }

    public boolean isIsVoucher() {
        return isVoucher;
    }

    public void setIsVoucher(boolean isVoucher) {
        this.isVoucher = isVoucher;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
