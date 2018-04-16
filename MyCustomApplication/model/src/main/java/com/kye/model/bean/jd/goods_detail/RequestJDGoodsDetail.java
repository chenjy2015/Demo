package com.kye.model.bean.jd.goods_detail;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 30/01/2018
 * @updated : 30/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestJDGoodsDetail {

    /**
     * skuId : 1731757
     */

    @SerializedName("skuId")
    private String skuId;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
