package com.kye.model.bean.waybill_take_photo;

/**
 * Created by harry on 2018/1/11 下午4:38.
 */

public class RequestGetIsInternalUserBean {

    /**
     * phone : 18924656687
     */

    private String phone;

    public RequestGetIsInternalUserBean(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
