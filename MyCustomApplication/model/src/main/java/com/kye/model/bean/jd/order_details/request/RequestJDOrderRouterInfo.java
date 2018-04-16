package com.kye.model.bean.jd.order_details.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 25/01/2018
 * @updated : 25/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestJDOrderRouterInfo {

    /**
     * phone : 18924656687
     * jdOrderId : 47655409133
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("jdOrderId")
    private String jdOrderId;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJdOrderId() {
        return jdOrderId;
    }

    public void setJdOrderId(String jdOrderId) {
        this.jdOrderId = jdOrderId;
    }
}
