package com.kye.model.bean.invoice_online;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class RequestFindInvoicingRecordsBean {


    /**
     * phone : 18948167740
     * pageIndex : 1
     * pageSize : 10
     * startTime : 2017-01-01
     * endTime : 2099-12-31
     */

    private String phone;
    private int pageIndex;
    private int pageSize;
    private String startTime;
    private String endTime;

    public RequestFindInvoicingRecordsBean(String phone, int pageIndex, int pageSize, String startTime, String endTime) {
        this.phone = phone;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
