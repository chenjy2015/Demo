package com.kye.model.bean.jd.address.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 30/01/2018
 * @updated : 30/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestJDAddress {

    /**
     * phone : 18924656687
     * addressType : 1
     * validationType : 1
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("addressType")
    private String addressType;
    @SerializedName("validationType")
    private String validationType;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getValidationType() {
        return validationType;
    }

    public void setValidationType(String validationType) {
        this.validationType = validationType;
    }
}
