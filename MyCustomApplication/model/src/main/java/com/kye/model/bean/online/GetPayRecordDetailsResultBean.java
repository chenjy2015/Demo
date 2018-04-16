package com.kye.model.bean.online;


import java.util.List;

/**
 * Created by chen on 18/1/18.
 */

public class GetPayRecordDetailsResultBean {


    private List<PayDtlBean> payDtl;

    public List<PayDtlBean> getPayDtl() {
        return payDtl;
    }

    public void setPayDtl(List<PayDtlBean> payDtl) {
        this.payDtl = payDtl;
    }

    public static class PayDtlBean {
        /**
         * collectedMoney : 0.1
         * payType : 微信
         * payTime : 2017-02-15 15:34:34
         * phone : 18924656687
         * receivDtl : [{"payMoney":0.1,"waybill":"88888888"}]
         */

        private double collectedMoney;
        private String payType;
        private String payTime;
        private String phone;
        private List<ReceivDtlBean> receivDtl;

        public double getCollectedMoney() {
            return collectedMoney;
        }

        public void setCollectedMoney(double collectedMoney) {
            this.collectedMoney = collectedMoney;
        }

        public String getPayType() {
            return payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getPayTime() {
            return payTime;
        }

        public void setPayTime(String payTime) {
            this.payTime = payTime;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public List<ReceivDtlBean> getReceivDtl() {
            return receivDtl;
        }

        public void setReceivDtl(List<ReceivDtlBean> receivDtl) {
            this.receivDtl = receivDtl;
        }

        public static class ReceivDtlBean {
            /**
             * payMoney : 0.1
             * waybill : 88888888
             */

            private double payMoney;
            private String waybill;

            public double getPayMoney() {
                return payMoney;
            }

            public void setPayMoney(double payMoney) {
                this.payMoney = payMoney;
            }

            public String getWaybill() {
                return waybill;
            }

            public void setWaybill(String waybill) {
                this.waybill = waybill;
            }
        }
    }
}
