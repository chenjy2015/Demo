package com.kye.model.bean.online;

/**
 * Created by chen on 18/1/20.
 */

public enum PayStatusType {
    /**
     * 在线支付
     */
    PAY_TYPE_ON_LINE("online pay"),
    /**
     * 预存运费
     */
    PAY_TYPE_FREIGHT("freight pay");

    String payType;

    PayStatusType(String type) {
        this.payType = type;
    }
}
