package com.kye.model.bean.invoice_online;

import java.util.List;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class RequestGeneratedInvoiceDataBean {

    /**
     * phone : 18948167740
     * data : [{"amount":5.1,"waybill":"75503498688"}]
     */

    private String phone;
    private List<DataBean> data;

    public RequestGeneratedInvoiceDataBean(String phone, List<DataBean> data) {
        this.phone = phone;
        this.data = data;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * amount : 5.1
         * waybill : 75503498688
         */

        private double amount;
        private String waybill;

        public DataBean(double amount, String waybill) {
            this.amount = amount;
            this.waybill = waybill;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }
    }
}
