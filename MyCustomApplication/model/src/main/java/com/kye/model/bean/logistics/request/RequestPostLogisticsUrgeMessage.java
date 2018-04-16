package com.kye.model.bean.logistics.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 18/01/2018
 * @updated : 18/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestPostLogisticsUrgeMessage {

    /**
     * phone : 15635629212
     * waybill : 57403837481
     * remark : 备注备注备注备注备注备注
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("remark")
    private String remark;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
