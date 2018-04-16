package com.kye.model.bean.online.request;

import java.util.List;

/**
 * Created by chen on 18/1/19.
 */

public class GetAliPayUrlParams {

    String billSource;
    String body;
    String company;
    String phone;
    String subject;
    String sellerId;
    String totalFee;
    List<Data> ydinfo;

    public static class Data {

        /**
         * cw_523 : 2013-56
         * paymentYdNo : 2323
         * money : 56.3
         * type : 月结
         * sendTime :
         */

        private String cw_523;
        private String paymentYdNo;
        private String money;
        private String type;
        private String sendTime;

        public String getCw_523() {
            return cw_523;
        }

        public void setCw_523(String cw_523) {
            this.cw_523 = cw_523;
        }

        public String getPaymentYdNo() {
            return paymentYdNo;
        }

        public void setPaymentYdNo(String paymentYdNo) {
            this.paymentYdNo = paymentYdNo;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSendTime() {
            return sendTime;
        }

        public void setSendTime(String sendTime) {
            this.sendTime = sendTime;
        }
    }

    public String getBillSource() {
        return billSource;
    }

    public void setBillSource(String billSource) {
        this.billSource = billSource;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public List<Data> getYdinfo() {
        return ydinfo;
    }

    public void setYdinfo(List<Data> ydinfo) {
        this.ydinfo = ydinfo;
    }
}
