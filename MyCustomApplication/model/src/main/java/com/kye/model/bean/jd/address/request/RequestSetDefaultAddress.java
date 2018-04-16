package com.kye.model.bean.jd.address.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 01/02/2018
 * @updated : 01/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestSetDefaultAddress {

    /**
     * phone : 18924656687
     * id : 2093
     * address : 1
     * verification : 1
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("id")
    private String id;
    @SerializedName("address")
    private String address;
    @SerializedName("verification")
    private String verification;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }
}
