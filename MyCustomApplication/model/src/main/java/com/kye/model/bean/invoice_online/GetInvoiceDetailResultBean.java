package com.kye.model.bean.invoice_online;

import java.io.Serializable;
import java.util.List;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class GetInvoiceDetailResultBean implements Serializable{


    /**
     * totalAmount : 2.3
     * sourceCodeData : [{"sourceCode":"20180118T00000000020","invoicedAmount":2.3,"header":"测试","note":"收派服务费","invoiceTime":"2018-01-18 19:50","printAddress":"http://down.szhtxx.cn:10002/downs/91440300665859389F/2018/01/18/20180118T00000000020.pdf"}]
     * waybillNoData : [{"waybill":"75503498664","invoicedAmount":2.3,"sendCompany":"杭州何汝华","sender":"测试","receiptCompany":"东莞诺亚","recipient":"测试1","sendTime":"2017-12-07 21:15:00"}]
     */

    private double totalAmount;
    private List<SourceCodeDataBean> sourceCodeData;
    private List<WaybillNoDataBean> waybillNoData;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<SourceCodeDataBean> getSourceCodeData() {
        return sourceCodeData;
    }

    public void setSourceCodeData(List<SourceCodeDataBean> sourceCodeData) {
        this.sourceCodeData = sourceCodeData;
    }

    public List<WaybillNoDataBean> getWaybillNoData() {
        return waybillNoData;
    }

    public void setWaybillNoData(List<WaybillNoDataBean> waybillNoData) {
        this.waybillNoData = waybillNoData;
    }

    public static class SourceCodeDataBean implements Serializable{
        /**
         * sourceCode : 20180118T00000000020
         * invoicedAmount : 2.3
         * header : 测试
         * note : 收派服务费
         * invoiceTime : 2018-01-18 19:50
         * printAddress : http://down.szhtxx.cn:10002/downs/91440300665859389F/2018/01/18/20180118T00000000020.pdf
         */

        private String sourceCode;
        private double invoicedAmount;
        private String header;
        private String note;
        private String invoiceTime;
        private String printAddress;

        // 本地是否已经下载pdf
        private boolean localIsDownloadedPDF;


        public String getSourceCode() {
            return sourceCode;
        }

        public void setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
        }

        public double getInvoicedAmount() {
            return invoicedAmount;
        }

        public void setInvoicedAmount(double invoicedAmount) {
            this.invoicedAmount = invoicedAmount;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getInvoiceTime() {
            return invoiceTime;
        }

        public void setInvoiceTime(String invoiceTime) {
            this.invoiceTime = invoiceTime;
        }

        public String getPrintAddress() {
            return printAddress;
        }

        public void setPrintAddress(String printAddress) {
            this.printAddress = printAddress;
        }

        public boolean isLocalIsDownloadedPDF() {
            return localIsDownloadedPDF;
        }

        public void setLocalIsDownloadedPDF(boolean localIsDownloadedPDF) {
            this.localIsDownloadedPDF = localIsDownloadedPDF;
        }
    }

    public static class WaybillNoDataBean implements Serializable{
        /**
         * waybill : 75503498664
         * invoicedAmount : 2.3
         * sendCompany : 杭州何汝华
         * sender : 测试
         * receiptCompany : 东莞诺亚
         * recipient : 测试1
         * sendTime : 2017-12-07 21:15:00
         */

        private String waybill;
        private double invoicedAmount;
        private String sendCompany;
        private String sender;
        private String receiptCompany;
        private String recipient;
        private String sendTime;

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }

        public double getInvoicedAmount() {
            return invoicedAmount;
        }

        public void setInvoicedAmount(double invoicedAmount) {
            this.invoicedAmount = invoicedAmount;
        }

        public String getSendCompany() {
            return sendCompany;
        }

        public void setSendCompany(String sendCompany) {
            this.sendCompany = sendCompany;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getReceiptCompany() {
            return receiptCompany;
        }

        public void setReceiptCompany(String receiptCompany) {
            this.receiptCompany = receiptCompany;
        }

        public String getRecipient() {
            return recipient;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }

        public String getSendTime() {
            return sendTime;
        }

        public void setSendTime(String sendTime) {
            this.sendTime = sendTime;
        }
    }
}
