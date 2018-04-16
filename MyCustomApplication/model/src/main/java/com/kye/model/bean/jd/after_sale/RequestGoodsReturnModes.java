package com.kye.model.bean.jd.after_sale;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 08/02/2018
 * @updated : 08/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestGoodsReturnModes {

    /**
     * phone : 18924656687
     * jdOrderId : 47703252395
     * skuId : 2673391
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("jdOrderId")
    private long jdOrderId;
    @SerializedName("skuId")
    private int skuId;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getJdOrderId() {
        return jdOrderId;
    }

    public void setJdOrderId(long jdOrderId) {
        this.jdOrderId = jdOrderId;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }
}
