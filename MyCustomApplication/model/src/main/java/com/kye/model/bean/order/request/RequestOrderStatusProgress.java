package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 18/01/2018
 * @updated : 18/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestOrderStatusProgress {

    /**
     * phone : 13222992863
     * orderCode : XD1712-0000539
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("orderCode")
    private String orderCode;

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
}
