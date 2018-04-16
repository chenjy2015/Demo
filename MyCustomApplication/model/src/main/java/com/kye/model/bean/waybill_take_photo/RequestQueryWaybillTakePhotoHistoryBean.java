package com.kye.model.bean.waybill_take_photo;

/**
 * Created by harry on 2018/1/11 下午4:38.
 */

public class RequestQueryWaybillTakePhotoHistoryBean {


    /**
     * phone : 18924656687
     * startTime : 2016-11-04
     * endTime : 2017-11-04
     * pageIndex : 1
     * pageSize : 2
     * integralType : 1
     */

    private String phone;
    private String startTime;
    private String endTime;
    private int pageIndex;
    private int pageSize;
    private int integralType;

    public RequestQueryWaybillTakePhotoHistoryBean(String phone, String startTime, String endTime, int pageIndex, int pageSize, int integralType) {
        this.phone = phone;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.integralType = integralType;
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

    public int getIntegralType() {
        return integralType;
    }

    public void setIntegralType(int integralType) {
        this.integralType = integralType;
    }
}
