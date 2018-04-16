package com.kye.model.bean.online;


import java.util.List;

/**
 * Created by chen on 18/1/18.
 */

public class GetPayRecordResultBean {


    private List<PayRecordBean> payRecord;

    public List<PayRecordBean> getPayRecord() {
        return payRecord;
    }

    public void setPayRecord(List<PayRecordBean> payRecord) {
        this.payRecord = payRecord;
    }

    public static class PayRecordBean {
        /**
         * payMoney : 0.1
         * payTime : 2017/2/15 15:34:34
         * payOrder : 4003412001201702150028171138
         */

        private double payMoney;
        private String payTime;
        private String payOrder;

        public double getPayMoney() {
            return payMoney;
        }

        public void setPayMoney(double payMoney) {
            this.payMoney = payMoney;
        }

        public String getPayTime() {
            return payTime;
        }

        public void setPayTime(String payTime) {
            this.payTime = payTime;
        }

        public String getPayOrder() {
            return payOrder;
        }

        public void setPayOrder(String payOrder) {
            this.payOrder = payOrder;
        }
    }
}
