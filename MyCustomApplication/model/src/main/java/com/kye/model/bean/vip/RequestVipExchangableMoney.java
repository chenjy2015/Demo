package com.kye.model.bean.vip;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 11/02/2018
 * @updated : 11/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestVipExchangableMoney {

    /**
     * phone : 18924656687
     */

    @SerializedName("phone")
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
