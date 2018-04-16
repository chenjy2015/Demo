package com.kye.model.bean.jd.address.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 01/02/2018
 * @updated : 01/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestDeleteAddress {

    /**
     *
     *
     phone	string	是	18924656687	登录账号
     id	string	是	3	查询接口返回的ID
     address	string	是	1	地址来源（0，京东地址 1，跨越地址）
     validation	string	否	1	验证来源（空：APP，0：APP ， 1：微信内部购）

     * phone : 18924656687
     * id : 3
     * address : 1
     * validation : 1
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("id")
    private String id;
    @SerializedName("address")
    private String address;
    @SerializedName("validation")
    private String validation;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }
}
