package com.kye.model.bean.logistics;

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

public class RequestLogisticsDriverInfo {

    /**
     *
     phone	string	是	13222992863	登录账号
     waybill	string	是	76900597010	下单编码或运单号
     type	string	是	1	类型（0为取货展示，1为派货展示）
     *
     * phone : 13222992863
     * waybill : 76900597010
     * type : 1
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("type")
    private String type;

    public RequestLogisticsDriverInfo() {
    }

    public RequestLogisticsDriverInfo(String phone, String waybill, String type) {
        this.phone = phone;
        this.waybill = waybill;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
