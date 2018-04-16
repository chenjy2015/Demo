package com.kye.model.bean.jd.shop.request;

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

public class RequestJDCheckUploadAddressAvailable {

    /**
     *

     valiteType	string	是	1	验证类型,1.京东兑换2.红包兑换3.唯品卡兑换
     phone	string	是	18924656687	登录账号

     *
     * valiteType : 1
     * phone : 18924656687
     */

    @SerializedName("valiteType")
    private String valiteType;
    @SerializedName("phone")
    private String phone;

    public String getValiteType() {
        return valiteType;
    }

    public void setValiteType(String valiteType) {
        this.valiteType = valiteType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
