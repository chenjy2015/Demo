package com.kye.model.bean.bill;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BillListBean {

    /**
     * total : {"taxRate":0,"count":3,"countMoney":763.2,"money":763.2}
     * accountBillDtl : [{"waybill":"75501034529","reciveCompany":"宁波升谱(新辉路)","sendCompany":"深圳晶联","idx":1,"companyCollect":299.2,"sendTime":"2017-07-04 21:19:00"},{"waybill":"75501034533","reciveCompany":"个人陈俊峰(邗江)","sendCompany":"深圳晶联","idx":2,"companyCollect":317,"sendTime":"2017-07-13 18:38:00"},{"waybill":"75501034546","reciveCompany":"宁波升谱(新辉路)","sendCompany":"深圳晶联","idx":3,"companyCollect":25,"sendTime":"2017-07-14 19:37:00"}]
     */

    @SerializedName("total")
    private Total total;
    @SerializedName("accountBillDtl")
    private List<BillBean> accountBillDtl;

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public List<BillBean> getAccountBillDtl() {
        return accountBillDtl;
    }

    public void setAccountBillDtl(List<BillBean> accountBillDtl) {
        this.accountBillDtl = accountBillDtl;
    }

    public static class Total {
        /**
         * taxRate : 0
         * count : 3
         * countMoney : 763.2
         * money : 763.2
         */

        @SerializedName("taxRate")
        private double taxRate;
        @SerializedName("count")
        private int count;
        @SerializedName("countMoney")
        private double countMoney;
        @SerializedName("money")
        private double money;

        public double getTaxRate() {
            return taxRate;
        }

        public void setTaxRate(double taxRate) {
            this.taxRate = taxRate;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getCountMoney() {
            return countMoney;
        }

        public void setCountMoney(double countMoney) {
            this.countMoney = countMoney;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }
    }

    public static class BillBean implements Serializable {
        /**
         * waybill : 75501034529
         * reciveCompany : 宁波升谱(新辉路)
         * sendCompany : 深圳晶联
         * idx : 1
         * companyCollect : 299.2
         * sendTime : 2017-07-04 21:19:00
         */

        @SerializedName("waybill")
        private String waybill;
        @SerializedName("reciveCompany")
        private String reciveCompany;
        @SerializedName("sendCompany")
        private String sendCompany;
        @SerializedName("idx")
        private int idx;
        @SerializedName("companyCollect")
        private double companyCollect;
        @SerializedName("sendTime")
        private Date sendTime;

        /**
         * sendTime : 2017-07-04 21:19:00
         * sendMan : 张**
         * reciveMan : 王**
         * serviceMode : 陆运件
         * paymentCompany : 深圳晶联
         * freight : 299.2
         * discount : 100
         * discountMoney : 299.2
         * woodenCost : 0
         * carCost : 0
         * protectCost : 0
         * receiptCost : 0
         * surcharge : 0
         * companyCollect : 299.2
         * inStrorePrice : 0
         * totalWeight : 187
         * totalNumber : 16
         */

        @SerializedName("sendMan")
        private String sendMan;
        @SerializedName("reciveMan")
        private String reciveMan;
        @SerializedName("serviceMode")
        private String serviceMode;
        @SerializedName("paymentCompany")
        private String paymentCompany;
        @SerializedName("freight")
        private double freight;
        @SerializedName("discount")
        private int discount;
        @SerializedName("discountMoney")
        private double discountMoney;
        @SerializedName("woodenCost")
        private double woodenCost;
        @SerializedName("carCost")
        private double carCost;
        @SerializedName("protectCost")
        private double protectCost;
        @SerializedName("receiptCost")
        private double receiptCost;
        @SerializedName("surcharge")
        private double surcharge;
        @SerializedName("inStrorePrice")
        private double inStrorePrice;
        @SerializedName("totalWeight")
        private double totalWeight;
        @SerializedName("totalNumber")
        private int totalNumber;

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }

        public String getReciveCompany() {
            return reciveCompany;
        }

        public void setReciveCompany(String reciveCompany) {
            this.reciveCompany = reciveCompany;
        }

        public String getSendCompany() {
            return sendCompany;
        }

        public void setSendCompany(String sendCompany) {
            this.sendCompany = sendCompany;
        }

        public int getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }

        public double getCompanyCollect() {
            return companyCollect;
        }

        public void setCompanyCollect(double companyCollect) {
            this.companyCollect = companyCollect;
        }

        public Date getSendTime() {
            return sendTime;
        }

        public void setSendTime(Date sendTime) {
            this.sendTime = sendTime;
        }

        public String getSendMan() {
            return sendMan;
        }

        public void setSendMan(String sendMan) {
            this.sendMan = sendMan;
        }

        public String getReciveMan() {
            return reciveMan;
        }

        public void setReciveMan(String reciveMan) {
            this.reciveMan = reciveMan;
        }

        public String getServiceMode() {
            return serviceMode;
        }

        public void setServiceMode(String serviceMode) {
            this.serviceMode = serviceMode;
        }

        public String getPaymentCompany() {
            return paymentCompany;
        }

        public void setPaymentCompany(String paymentCompany) {
            this.paymentCompany = paymentCompany;
        }

        public double getFreight() {
            return freight;
        }

        public void setFreight(double freight) {
            this.freight = freight;
        }

        public int getDiscount() {
            return discount;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public double getDiscountMoney() {
            return discountMoney;
        }

        public void setDiscountMoney(double discountMoney) {
            this.discountMoney = discountMoney;
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

        public void setCarCost(double carCost) {
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

        public double getSurcharge() {
            return surcharge;
        }

        public void setSurcharge(double surcharge) {
            this.surcharge = surcharge;
        }

        public double getInStrorePrice() {
            return inStrorePrice;
        }

        public void setInStrorePrice(double inStrorePrice) {
            this.inStrorePrice = inStrorePrice;
        }

        public double getTotalWeight() {
            return totalWeight;
        }

        public void setTotalWeight(double totalWeight) {
            this.totalWeight = totalWeight;
        }

        public int getTotalNumber() {
            return totalNumber;
        }

        public void setTotalNumber(int totalNumber) {
            this.totalNumber = totalNumber;
        }
    }
}
