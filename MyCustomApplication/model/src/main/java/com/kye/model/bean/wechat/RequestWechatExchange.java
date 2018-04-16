package com.kye.model.bean.wechat;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 09/02/2018
 * @updated : 09/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestWechatExchange {

    /**
     * phone : 18924656687
     * money : 111
     * confirmCode : 666666
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("money")
    private String money;
    @SerializedName("confirmCode")
    private String confirmCode;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }
}
