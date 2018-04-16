package com.kye.model.bean.wechat;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 09/02/2018
 * @updated : 09/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestWechatOpenIdAddress {

    /**
     * phone : 13128802535
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
