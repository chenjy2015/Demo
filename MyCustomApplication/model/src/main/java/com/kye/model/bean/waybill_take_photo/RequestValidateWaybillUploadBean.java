package com.kye.model.bean.waybill_take_photo;

/**
 * Created by harry on 2018/1/11 下午4:38.
 */

public class RequestValidateWaybillUploadBean {

    /**
     * phone : 18924656687
     * waybill : 111
     */

    private String phone;
    private String waybill;

    public RequestValidateWaybillUploadBean(String phone, String waybill) {
        this.phone = phone;
        this.waybill = waybill;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }
}
