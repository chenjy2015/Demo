package com.kye.model.bean.jd.goods_detail;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 31/01/2018
 * @updated : 31/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestJDCheckGoodsAvailable {

    /**

     phone	string	是	18924656687	登录账号
     skuId	string	是	1036259	SKU
     address	string	是	1_0_0	地址，格式：1_0_0 (分别代表1、2、3级地址)

     * phone : 18924656687
     * skuId : 1036259
     * address : 1_0_0
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("skuId")
    private String skuId;
    @SerializedName("address")
    private String address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
