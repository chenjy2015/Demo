package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;

public class RequestNameCertification extends RequestUser{
    @SerializedName("name")
    private String name;
    @SerializedName("idCard")
    private String idCard;
    @SerializedName("certificateType")
    private String certificateType;

    public RequestNameCertification(String phone, String name, String idCard, String certificateType) {
        super(phone);
        this.name = name;
        this.idCard = idCard;
        this.certificateType = certificateType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }
}
