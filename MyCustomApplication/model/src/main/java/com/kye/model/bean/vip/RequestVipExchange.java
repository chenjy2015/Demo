package com.kye.model.bean.vip;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 11/02/2018
 * @updated : 11/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestVipExchange {

    /**
     *
     phone	string	是	18680395505	登录账号
     moneyType	string	是	WPDH001	红包编号WPDH001（10元）WPDH002（20元）WPDH003（30元）WPDH004（50元）WPDH005（100元）WPDH006（200元）WPDH007（300元）WPDH008（500元）
     type	string	是	2	业务标识
     confirmCode	string	是	9707	验证码
     *
     * phone : 18680395505
     * moneyType : WPDH001
     * type : 2
     * confirmCode : 9707
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("moneyType")
    private String moneyType;
    @SerializedName("type")
    private String type;
    @SerializedName("confirmCode")
    private String confirmCode;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }
}
