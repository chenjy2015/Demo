package com.kye.model.bean.jd_reservation;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class JDReservationBean {

    /**
     * datas : [{"billId":"74773","orderno":"76901300157","totalCount":"11","appointCount":"12","appointCode":"1111","apppointSTime":"2018-01-25 18:00","goodsCode":"123","greator":"18924656687","createTime":"2017-12-26 17:00","purchaseCode":"2222,3333","apppointETime":"","packCompany":"东莞三协(高埗)","sendCompany":"北京京东方(8)号","reservationWarehouse":""},{"billId":"74786","orderno":"12355236985","totalCount":"0","appointCount":"1","appointCode":"1","apppointSTime":"2018-01-16 23:50","goodsCode":"","greator":"18924656687","createTime":"2018-01-16 09:55","purchaseCode":"11","apppointETime":"","packCompany":"深圳仁美","sendCompany":"上海大大建设","reservationWarehouse":""}]
     * recordCount : 3
     */

    @SerializedName("recordCount")
    private int recordCount;
    @SerializedName("datas")
    private List<JDReservation> datas;

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<JDReservation> getDatas() {
        return datas;
    }

    public void setDatas(List<JDReservation> datas) {
        this.datas = datas;
    }

    public static class JDReservation implements Serializable {
        /**
         * billId : 74773
         * orderno : 76901300157
         * totalCount : 11
         * appointCount : 12
         * appointCode : 1111
         * apppointSTime : 2018-01-25 18:00
         * goodsCode : 123
         * greator : 18924656687
         * createTime : 2017-12-26 17:00
         * purchaseCode : 2222,3333
         * apppointETime :
         * packCompany : 东莞三协(高埗)
         * sendCompany : 北京京东方(8)号
         * reservationWarehouse :
         */

        @SerializedName("billId")
        private String billId;
        @SerializedName("orderno")
        private String orderno;
        @SerializedName("totalCount")
        private String totalCount;
        @SerializedName("appointCount")
        private String appointCount;
        @SerializedName("appointCode")
        private String appointCode;
        @SerializedName("apppointSTime")
        private Date apppointSTime;
        @SerializedName("goodsCode")
        private String goodsCode;
        @SerializedName("greator")
        private String greator;
        @SerializedName("createTime")
        private Date createTime;
        @SerializedName("purchaseCode")
        private String purchaseCode;
        @SerializedName("apppointETime")
        private Date apppointETime;
        @SerializedName("packCompany")
        private String packCompany;
        @SerializedName("sendCompany")
        private String sendCompany;
        @SerializedName("reservationWarehouse")
        private String reservationWarehouse;
        private boolean dividerVisible;

        public String getBillId() {
            return billId;
        }

        public void setBillId(String billId) {
            this.billId = billId;
        }

        public String getOrderno() {
            return orderno;
        }

        public void setOrderno(String orderno) {
            this.orderno = orderno;
        }

        public String getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(String totalCount) {
            this.totalCount = totalCount;
        }

        public String getAppointCount() {
            return appointCount;
        }

        public void setAppointCount(String appointCount) {
            this.appointCount = appointCount;
        }

        public String getAppointCode() {
            return appointCode;
        }

        public void setAppointCode(String appointCode) {
            this.appointCode = appointCode;
        }

        public Date getApppointSTime() {
            return apppointSTime;
        }

        public void setApppointSTime(Date apppointSTime) {
            this.apppointSTime = apppointSTime;
        }

        public String getGoodsCode() {
            return goodsCode;
        }

        public void setGoodsCode(String goodsCode) {
            this.goodsCode = goodsCode;
        }

        public String getGreator() {
            return greator;
        }

        public void setGreator(String greator) {
            this.greator = greator;
        }

        public Date getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

        public String getPurchaseCode() {
            return purchaseCode;
        }

        public void setPurchaseCode(String purchaseCode) {
            this.purchaseCode = purchaseCode;
        }

        public Date getApppointETime() {
            return apppointETime;
        }

        public void setApppointETime(Date apppointETime) {
            this.apppointETime = apppointETime;
        }

        public String getPackCompany() {
            return packCompany;
        }

        public void setPackCompany(String packCompany) {
            this.packCompany = packCompany;
        }

        public String getSendCompany() {
            return sendCompany;
        }

        public void setSendCompany(String sendCompany) {
            this.sendCompany = sendCompany;
        }

        public String getReservationWarehouse() {
            return reservationWarehouse;
        }

        public void setReservationWarehouse(String reservationWarehouse) {
            this.reservationWarehouse = reservationWarehouse;
        }

        public boolean getDividerVisible() {
            return dividerVisible;
        }

        public void setDividerVisible(boolean dividerVisible) {
            this.dividerVisible = dividerVisible;
        }
    }
}
