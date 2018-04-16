package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class RequestQueryFreightRightsBean {

    /**
     * phone : 18898355737
     * confirmCode : 355422
     */

    private String phone;
    private String confirmCode;

    public RequestQueryFreightRightsBean(String phone, String confirmCode) {
        this.phone = phone;
        this.confirmCode = confirmCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }
}
