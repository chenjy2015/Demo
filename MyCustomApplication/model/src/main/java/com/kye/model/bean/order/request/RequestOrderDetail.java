package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 17/01/2018
 * @updated : 17/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestOrderDetail {

    /**
     * phone : 15635629212
     * orderCode : XD1712-0018496
     * scoreCode : 2
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("scoreCode")
    private String scoreCode;

    public RequestOrderDetail(String phone, String orderCode, String scoreCode) {
        this.phone = phone;
        this.orderCode = orderCode;
        this.scoreCode = scoreCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getScoreCode() {
        return scoreCode;
    }

    public void setScoreCode(String scoreCode) {
        this.scoreCode = scoreCode;
    }
}
