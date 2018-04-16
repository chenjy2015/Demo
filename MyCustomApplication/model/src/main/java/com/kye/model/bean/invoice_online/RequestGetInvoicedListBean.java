package com.kye.model.bean.invoice_online;

/**
 * Created by harry on 2018/1/17 下午3:19.
 */

public class RequestGetInvoicedListBean {

    /**
     * phone : 18948167740
     * pageIndex : 1
     * pageSize : 20
     */

    private String phone;
    private int pageIndex;
    private int pageSize;

    public RequestGetInvoicedListBean(String phone, int pageIndex, int pageSize) {
        this.phone = phone;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
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
