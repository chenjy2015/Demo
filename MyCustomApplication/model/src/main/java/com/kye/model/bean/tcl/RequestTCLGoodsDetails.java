package com.kye.model.bean.tcl;

public class RequestTCLGoodsDetails {

    /**
     * phone : 18924656687
     * productId : 1
     */

    private String phone;
    private String productId;

    public RequestTCLGoodsDetails(String phone, String productId) {
        this.phone = phone;
        this.productId = productId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}