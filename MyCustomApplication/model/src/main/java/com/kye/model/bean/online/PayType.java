package com.kye.model.bean.online;

/**
 * Created by chen on 18/1/19.
 */

public enum PayType {
    PAY_TYPE_WECHAT("wechat"),
    PAY_TYPE_ALIPAY("alipay");

    String payType;

    PayType(String type) {
        this.payType = type;
    }
}
