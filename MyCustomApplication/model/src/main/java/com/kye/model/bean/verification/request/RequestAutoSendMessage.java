package com.kye.model.bean.verification.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/02/2018
 * @updated : 06/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestAutoSendMessage {

    /**
     * phone : 15712218151
     * type : 2
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("type")
    private int type;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
