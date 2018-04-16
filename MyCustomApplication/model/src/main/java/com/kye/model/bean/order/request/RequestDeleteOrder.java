package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 05/02/2018
 * @updated : 05/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestDeleteOrder {

    /**
     * orderCode : XD1712-0027873
     * phone : 18924656687
     */

    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("phone")
    private String phone;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
