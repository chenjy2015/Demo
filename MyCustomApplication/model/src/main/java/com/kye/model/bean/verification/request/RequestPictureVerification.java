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

public class RequestPictureVerification {

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
