package com.kye.model.bean.jd_reservation;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class JDWaybillsBean {

    /**
     * datas : [{"waybill":"20762237505","sendCompany":"接口部测试","itemCount":1,"receiptCompany":"武汉京东","sendTime":"2017-12-01 09:18"}]
     * recordCount : 1
     */

    @SerializedName("recordCount")
    private int recordCount;
    @SerializedName("datas")
    private List<JDWaybill> datas;

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<JDWaybill> getDatas() {
        return datas;
    }

    public void setDatas(List<JDWaybill> datas) {
        this.datas = datas;
    }

    public static class JDWaybill implements Serializable {
        /**
         * waybill : 20762237505
         * sendCompany : 接口部测试
         * itemCount : 1
         * receiptCompany : 武汉京东
         * sendTime : 2017-12-01 09:18
         */

        @SerializedName("waybill")
        private String waybill;
        @SerializedName("sendCompany")
        private String sendCompany;
        @SerializedName("itemCount")
        private int itemCount;
        @SerializedName("receiptCompany")
        private String receiptCompany;
        @SerializedName("sendTime")
        private Date sendTime;
        private boolean dividerVisible;

        public JDWaybill() {
        }

        public JDWaybill(String waybill, String sendCompany, int itemCount, String receiptCompany, Date sendTime) {
            this.waybill = waybill;
            this.sendCompany = sendCompany;
            this.itemCount = itemCount;
            this.receiptCompany = receiptCompany;
            this.sendTime = sendTime;
        }

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }

        public String getSendCompany() {
            return sendCompany;
        }

        public void setSendCompany(String sendCompany) {
            this.sendCompany = sendCompany;
        }

        public int getItemCount() {
            return itemCount;
        }

        public void setItemCount(int itemCount) {
            this.itemCount = itemCount;
        }

        public String getReceiptCompany() {
            return receiptCompany;
        }

        public void setReceiptCompany(String receiptCompany) {
            this.receiptCompany = receiptCompany;
        }

        public Date getSendTime() {
            return sendTime;
        }

        public void setSendTime(Date sendTime) {
            this.sendTime = sendTime;
        }

        public boolean isDividerVisible() {
            return dividerVisible;
        }

        public void setDividerVisible(boolean dividerVisible) {
            this.dividerVisible = dividerVisible;
        }
    }
}
