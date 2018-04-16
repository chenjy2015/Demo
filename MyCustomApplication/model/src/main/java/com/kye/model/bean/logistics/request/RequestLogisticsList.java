package com.kye.model.bean.logistics.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 04/01/2018
 * @updated : 04/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 */

public class RequestLogisticsList {

    /**
     * phone : 15818415911
     * startTime : 2017-12-1
     * endTime : 2017-12-7
     * queryState : 0
     * orderMan : 郭蒸央
     * pageIndex : 1
     * pageSize : 10
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("startTime")
    private String startTime;
    @SerializedName("endTime")
    private String endTime;
    @SerializedName("queryState")
    private String queryState;
    @SerializedName("orderMan")
    private String orderMan;
    @SerializedName("pageIndex")
    private int pageIndex;
    @SerializedName("pageSize")
    private int pageSize;

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

    public String getQueryState() {
        return queryState;
    }

    public void setQueryState(String queryState) {
        this.queryState = queryState;
    }

    public String getOrderMan() {
        return orderMan;
    }

    public void setOrderMan(String orderMan) {
        this.orderMan = orderMan;
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
