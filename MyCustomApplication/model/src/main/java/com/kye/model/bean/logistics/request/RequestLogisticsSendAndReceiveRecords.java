package com.kye.model.bean.logistics.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/01/2018
 * @updated : 15/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestLogisticsSendAndReceiveRecords {

    /**
     * phone : 15818415911
     */

    public RequestLogisticsSendAndReceiveRecords() {
    }

    public RequestLogisticsSendAndReceiveRecords(String phone) {
        this.phone = phone;
    }

    @SerializedName("phone")
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
