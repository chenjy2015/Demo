package com.kye.model.bean.online.request;


/**
 * Created by chen on 18/1/18.
 */

public class RequestGetPayRecordBean {


    /**
     * startTime : 2016-10-1
     * endTime : 2017-11-15
     * phone : 18924656687
     * pageIndex : 1
     * pageSize : 10
     */

    private String startTime;
    private String endTime;
    private String phone;
    private int pageIndex;
    private int pageSize;

    public RequestGetPayRecordBean(String startTime, String endTime, String phone, int pageIndex, int pageSize) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.phone = phone;
        this.pageIndex = pageIndex;
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
}
