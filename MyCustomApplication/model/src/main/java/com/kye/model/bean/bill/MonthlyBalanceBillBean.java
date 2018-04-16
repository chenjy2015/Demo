package com.kye.model.bean.bill;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MonthlyBalanceBillBean implements Serializable {

    /**
     * billDate : 2017-09
     * billMoney : 2317.5
     * billType : 1
     * isCheckAccount : 0
     */

    @SerializedName("billDate")
    private String billDate;
    @SerializedName("billMoney")
    private double billMoney;
    @SerializedName("billType")
    private Integer billType;
    @SerializedName("isCheckAccount")
    private int isCheckAccount;

    /**
     * accountName : 跨越速运集团有限公司
     * bankAddress : 中国银行股份有限公司深圳机场支行
     * accountBank : 770557955157
     * companyCollect : 763.2
     * waybillMoney : 763.2
     * woodenCost : 0
     * carCost : 0
     * protectCost : 0
     * receiptCost : 0
     * count : 31
     * billingWeight : 397.3
     * extraDuties : 0
     * surcharge : 0
     * advancedMoney : 0
     */
    @SerializedName("accountName")
    private String accountName;
    @SerializedName("bankAddress")
    private String bankAddress;
    @SerializedName("accountBank")
    private String accountBank;
    @SerializedName("companyCollect")
    private double companyCollect;
    @SerializedName("waybillMoney")
    private double waybillMoney;
    @SerializedName("woodenCost")
    private double woodenCost;
    @SerializedName("carCost")
    private double carCost;
    @SerializedName("protectCost")
    private double protectCost;
    @SerializedName("receiptCost")
    private double receiptCost;
    @SerializedName("count")
    private int count;
    @SerializedName("billingWeight")
    private double billingWeight;
    @SerializedName("extraDuties")
    private double extraDuties;
    @SerializedName("surcharge")
    private double surcharge;
    @SerializedName("advancedMoney")
    private double advancedMoney;

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(double billMoney) {
        this.billMoney = billMoney;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public int getIsCheckAccount() {
        return isCheckAccount;
    }

    public void setIsCheckAccount(int isCheckAccount) {
        this.isCheckAccount = isCheckAccount;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public double getCompanyCollect() {
        return companyCollect;
    }

    public void setCompanyCollect(double companyCollect) {
        this.companyCollect = companyCollect;
    }

    public double getWaybillMoney() {
        return waybillMoney;
    }

    public void setWaybillMoney(double waybillMoney) {
        this.waybillMoney = waybillMoney;
    }

    public double getWoodenCost() {
        return woodenCost;
    }

    public void setWoodenCost(double woodenCost) {
        this.woodenCost = woodenCost;
    }

    public double getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public double getProtectCost() {
        return protectCost;
    }

    public void setProtectCost(double protectCost) {
        this.protectCost = protectCost;
    }

    public double getReceiptCost() {
        return receiptCost;
    }

    public void setReceiptCost(double receiptCost) {
        this.receiptCost = receiptCost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getBillingWeight() {
        return billingWeight;
    }

    public void setBillingWeight(double billingWeight) {
        this.billingWeight = billingWeight;
    }

    public double getExtraDuties() {
        return extraDuties;
    }

    public void setExtraDuties(double extraDuties) {
        this.extraDuties = extraDuties;
    }

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }

    public double getAdvancedMoney() {
        return advancedMoney;
    }

    public void setAdvancedMoney(double advancedMoney) {
        this.advancedMoney = advancedMoney;
    }
}
