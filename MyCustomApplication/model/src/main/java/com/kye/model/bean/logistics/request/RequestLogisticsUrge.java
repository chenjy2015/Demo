package com.kye.model.bean.logistics.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 04/01/2018
 * @updated : 04/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *  催件请求参数
 */

public class RequestLogisticsUrge {

    /**
     * phone : 15635629212
     * waybill : XD1703-1873561
     * type : 0
     * source : APP
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("type")
    private String type;
    @SerializedName("source")
    private String source;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
