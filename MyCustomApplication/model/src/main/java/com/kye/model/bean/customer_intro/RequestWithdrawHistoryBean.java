package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestWithdrawHistoryBean {

    /**
     * phone : 18924656687
     * startTime : 2016-09-18 10:30
     * endTime : 2017-12-18 02:30
     * pageSize : 10
     * pageIndex : 1
     */

    private String phone;
    private String startTime;
    private String endTime;
    private int pageSize;
    private int pageIndex;

    public RequestWithdrawHistoryBean(String phone, String startTime, String endTime, int pageSize, int pageIndex) {
        this.phone = phone;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
}
