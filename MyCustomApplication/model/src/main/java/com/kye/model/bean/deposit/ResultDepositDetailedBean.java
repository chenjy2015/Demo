package com.kye.model.bean.deposit;

import java.util.List;

/**
 * Created by SkyYu on 2018/1/16
 */
public class ResultDepositDetailedBean {

    /**
     * pageIndex : 1
     * pageSize : 10
     * recordCount : 3
     * data : [{"postMoney":1144,"money":500,"waybill":"","receiptFee":0,"discount":96,"tax":0,"time":"2017-09-08 00:00","type":"充值"},{"postMoney":624,"money":0,"waybill":"","receiptFee":0,"discount":96,"tax":0,"time":"2017-08-25 16:18","type":"充值"},{"postMoney":624,"money":600,"waybill":"","receiptFee":0,"discount":96,"tax":0,"time":"2017-08-25 00:00","type":"充值"}]
     */

    private int pageIndex;
    private int pageSize;
    private int recordCount;
    private List<DataBean> data;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {

        /**
         * money : -205.2
         * waybill : 2755459
         * type : 消费
         * time : 2018-01-18 16:00
         * postMoney : -2123.8
         * discount : 100.0
         * receiptFee : 0.0
         * tax : 0.0
         */

        private double money;
        private String waybill;
        private String type;
        private String time;
        private double postMoney;
        private double discount;
        private double receiptFee;
        private double tax;

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public double getPostMoney() {
            return postMoney;
        }

        public void setPostMoney(double postMoney) {
            this.postMoney = postMoney;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public double getReceiptFee() {
            return receiptFee;
        }

        public void setReceiptFee(double receiptFee) {
            this.receiptFee = receiptFee;
        }

        public double getTax() {
            return tax;
        }

        public void setTax(double tax) {
            this.tax = tax;
        }
    }
}
