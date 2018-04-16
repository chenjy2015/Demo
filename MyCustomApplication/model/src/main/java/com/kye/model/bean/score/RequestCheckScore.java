package com.kye.model.bean.score;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 13/03/2018
 * @updated : 13/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestCheckScore {

    /**
     * phone : 15818415911
     * waybill : XD1712-0027554
     * type : 0
     */

//    phone	string	是	15818415911	登录账号
//    waybill	string	是	XD1712-0027554	下单编码或者运单号（Type=0时为下单编码， Type=1时为运单号）
//    type	string	是	0	类型（0取货评价1派货评价）

    @SerializedName("phone")
    private String phone;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("type")
    private String type;

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
