package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class QueryBillingMethodResultBean {


    /**
     * billType : 重量收费
     * sendAreaCode : 0755
     * receiptAreaCode : 0775
     */

    private String billType;
    private String sendAreaCode;
    private String receiptAreaCode;

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getSendAreaCode() {
        return sendAreaCode;
    }

    public void setSendAreaCode(String sendAreaCode) {
        this.sendAreaCode = sendAreaCode;
    }

    public String getReceiptAreaCode() {
        return receiptAreaCode;
    }

    public void setReceiptAreaCode(String receiptAreaCode) {
        this.receiptAreaCode = receiptAreaCode;
    }
}
