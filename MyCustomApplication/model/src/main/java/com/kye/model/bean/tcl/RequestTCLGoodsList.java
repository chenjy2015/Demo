package com.kye.model.bean.tcl;

import com.google.gson.annotations.SerializedName;

public class RequestTCLGoodsList {

    /**
     * phone : 18924656687
     * size : h79c
     * pageIndex : 1
     * pageSize : 0
     * maxPrice : 2eno
     * minPrice : 4e58
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("size")
    private String size;
    @SerializedName("pageIndex")
    private int pageIndex;
    @SerializedName("pageSize")
    private int pageSize;
    @SerializedName("maxPrice")
    private String maxPrice;
    @SerializedName("minPrice")
    private String minPrice;

    public RequestTCLGoodsList(String phone,int pageIndex, int pageSize) {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }
}