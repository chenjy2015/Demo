package com.kye.model.bean.found;

import java.io.Serializable;

public class RequestQueryActivityInfoList implements Serializable {

    /**
     * activityInfoTypeId : e713
     * activityInfoKeyword : 预存运费
     * pageSize : 100
     * pageNum : 1
     */

    private String activityInfoTypeId;
    private String activityInfoKeyword;
    private int pageSize;
    private int pageNum;

    public RequestQueryActivityInfoList(String activityInfoTypeId, String activityInfoKeyword, int pageSize, int pageNum) {
        this.activityInfoTypeId = activityInfoTypeId;
        this.activityInfoKeyword = activityInfoKeyword;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public RequestQueryActivityInfoList(int pageSize, int pageNum) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public String getActivityInfoTypeId() {
        return activityInfoTypeId;
    }

    public void setActivityInfoTypeId(String activityInfoTypeId) {
        this.activityInfoTypeId = activityInfoTypeId;
    }

    public String getActivityInfoKeyword() {
        return activityInfoKeyword;
    }

    public void setActivityInfoKeyword(String activityInfoKeyword) {
        this.activityInfoKeyword = activityInfoKeyword;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
