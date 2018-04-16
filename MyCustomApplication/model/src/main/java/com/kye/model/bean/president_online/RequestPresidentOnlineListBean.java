package com.kye.model.bean.president_online;

import java.io.Serializable;

/**
 * Created by harry on 2018/1/10 下午4:30.
 */

public class RequestPresidentOnlineListBean implements Serializable {

    /**
     * pageSize : 2
     * pageIndex : 1
     * orderNo : 8dmx
     * codeType : 1
     * phone : 18924656687
     */

    private int pageSize;
    private int pageIndex;
    private String orderNo;
    private int codeType;
    private String phone;

    public RequestPresidentOnlineListBean(int pageSize, int pageIndex, int codeType, String phone) {
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.codeType = codeType;
        this.phone = phone;
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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getCodeType() {
        return codeType;
    }

    public void setCodeType(int codeType) {
        this.codeType = codeType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
