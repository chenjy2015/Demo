package com.kye.model.bean.order;

import com.google.gson.annotations.SerializedName;

public class OrderValidationNameCertificationBean {

    @SerializedName("isValidation")
    private boolean isValidation;
    @SerializedName("message")
    private String message;
    @SerializedName("isRealName")
    private boolean isRealName;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isValidation() {
        return isValidation;
    }

    public void setValidation(boolean validation) {
        isValidation = validation;
    }

    public boolean isRealName() {
        return isRealName;
    }

    public void setRealName(boolean realName) {
        isRealName = realName;
    }
}
