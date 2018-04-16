package com.kye.model.bean.logistics.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 20/01/2018
 * @updated : 20/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestLogisticsWayBillDetail {

    /**
     * waybill : 02300086747
     * phone : 90bp
     * waybillPhone : 62i3
     * telephone : xj8n
     * sender : syl8
     */

    @SerializedName("waybill")
    private String waybill;
    @SerializedName("phone")
    private String phone;
    @SerializedName("waybillPhone")
    private String waybillPhone;
    @SerializedName("telephone")
    private String telephone;
    @SerializedName("sender")
    private String sender;

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWaybillPhone() {
        return waybillPhone;
    }

    public void setWaybillPhone(String waybillPhone) {
        this.waybillPhone = waybillPhone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
