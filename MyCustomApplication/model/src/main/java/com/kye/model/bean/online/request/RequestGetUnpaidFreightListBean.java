package com.kye.model.bean.online.request;


/**
 * Created by chen on 18/1/18.
 */

public class RequestGetUnpaidFreightListBean {


    /**
     * phone : 13537608123
     * no : 57177676165
     * pageSize : 10
     * pageIndex : 1
     */

    private String phone;
    private String no;
    private int pageSize;
    private int pageIndex;

    public RequestGetUnpaidFreightListBean(String phone, String no, int pageSize, int pageIndex) {
        this.phone = phone;
        this.no = no;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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
