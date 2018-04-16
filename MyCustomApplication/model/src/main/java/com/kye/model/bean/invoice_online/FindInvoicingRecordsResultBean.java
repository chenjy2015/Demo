package com.kye.model.bean.invoice_online;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class FindInvoicingRecordsResultBean {


    /**
     * note : 收派服务费
     * amount : 1.2
     * invoiceTime : 2017-12-21 18:03:33
     * groupCode : d3dd6f9dcd2b4724b5950641a21f375c
     */

    private String note;
    private double amount;
    private String invoiceTime;
    private String groupCode;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
}
