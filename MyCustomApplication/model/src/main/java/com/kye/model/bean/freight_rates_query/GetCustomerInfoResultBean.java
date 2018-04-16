package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class GetCustomerInfoResultBean {

    /**
     * customerCodePwd : 31279286
     * customeryName : 北京坤成基业
     * customerCode : 01096025925
     * isOnlyOne : true
     */

    private String customerCodePwd;
    private String customeryName;
    private String customerCode;
    private boolean isOnlyOne;

    public String getCustomerCodePwd() {
        return customerCodePwd;
    }

    public void setCustomerCodePwd(String customerCodePwd) {
        this.customerCodePwd = customerCodePwd;
    }

    public String getCustomeryName() {
        return customeryName;
    }

    public void setCustomeryName(String customeryName) {
        this.customeryName = customeryName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public boolean isIsOnlyOne() {
        return isOnlyOne;
    }

    public void setIsOnlyOne(boolean isOnlyOne) {
        this.isOnlyOne = isOnlyOne;
    }
}
