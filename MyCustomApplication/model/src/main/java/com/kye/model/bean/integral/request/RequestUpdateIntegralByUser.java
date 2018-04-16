package com.kye.model.bean.integral.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/01/2018
 * @updated : 15/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestUpdateIntegralByUser implements Serializable {

    public RequestUpdateIntegralByUser() {
    }

    public RequestUpdateIntegralByUser(String consumptionCode, String phone) {
        this.consumptionCode = consumptionCode;
        this.phone = phone;
    }

    /**
     * consumptionCode : CZ0001
     * phone : 13222992863
     */

    @SerializedName("consumptionCode")
    private String consumptionCode;
    @SerializedName("phone")
    private String phone;

    public String getConsumptionCode() {
        return consumptionCode;
    }

    public void setConsumptionCode(String consumptionCode) {
        this.consumptionCode = consumptionCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
