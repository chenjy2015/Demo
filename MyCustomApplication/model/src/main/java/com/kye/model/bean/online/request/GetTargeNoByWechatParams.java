package com.kye.model.bean.online.request;

import java.util.ArrayList;

/**
 * Created by chen on 18/1/19.
 */

public class GetTargeNoByWechatParams {

    String body;
    String sellerid;
    String spbill_create_ip;
    String total_fee;
    String company;
    String phone;
    String extFiled1;
    ArrayList<Data> ydinfo;


    /**
     * 运单基本信息
     */
   public static class Data {
        private String intoMonths;
        private String prePayment;
        private String type;
        private String ydno;
        private String sendingTime;

        public String getIntoMonths() {
            return intoMonths;
        }

        public void setIntoMonths(String intoMonths) {
            this.intoMonths = intoMonths;
        }

        public String getPrePayment() {
            return prePayment;
        }

        public void setPrePayment(String prePayment) {
            this.prePayment = prePayment;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getYdno() {
            return ydno;
        }

        public void setYdno(String ydno) {
            this.ydno = ydno;
        }

        public String getSendingTime() {
            return sendingTime;
        }

        public void setSendingTime(String sendingTime) {
            this.sendingTime = sendingTime;
        }
    }

    public ArrayList<Data> getYdinfo() {
        return ydinfo;
    }

    public void setYdinfo(ArrayList<Data> ydinfo) {
        this.ydinfo = ydinfo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
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

    public String getExtFiled1() {
        return extFiled1;
    }

    public void setExtFiled1(String extFiled1) {
        this.extFiled1 = extFiled1;
    }
}
