package com.kye.model.bean.verification.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/02/2018
 * @updated : 06/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestSmsVerification {

    /**
     *
         phone	string	是	18924656687	登录账号
         dynamicCode	string	是	5D3BB1AAAA93484698E62D3B284579BE	动态验证码
         type	string	是	0	类型（type=0为新用户注册时获取验证码 type=1为找回密码获取验证码 type=2为兑换礼品获取验证码 type=3为红包获取验证码 type=4为提现获取验证码 type=5为登录获取验证码(不需要图型动态码) type=6为登录获取验证码 type=7为查询运费获取验证码）
         phone : 18924656687
         dynamicCode : 5D3BB1AAAA93484698E62D3B284579BE
         type : 0
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("dynamicCode")
    private String dynamicCode;
    @SerializedName("type")
    private String type;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDynamicCode() {
        return dynamicCode;
    }

    public void setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
