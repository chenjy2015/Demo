package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestCustomerIntroHistoryBean {

    /**
     * phone : 18924656687
     * pageSize : 10
     * pageIndex : 1
     * phoneNumber : 13530015070
     */

    private String phone;
    private int pageSize;
    private int pageIndex;

    public RequestCustomerIntroHistoryBean(String phone, int pageSize, int pageIndex) {
        this.phone = phone;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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

}
