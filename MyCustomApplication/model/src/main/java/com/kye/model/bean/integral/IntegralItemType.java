package com.kye.model.bean.integral;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 25/01/2018
 * @updated : 25/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public enum IntegralItemType {

    BUSINESS("业务积分", "YWJF001", "1"),
    PHOTO("拍照积分", "PZJF001", "2"),
    FREIGHT_PRESERVER("预存积分", "YCJF001", "3"),
    ELECTRONIC_WAYBILL("电子运单","DZYD001","4");

    IntegralItemType(String value, String code, String type) {
        this.value = value;
        this.code = code;
        this.type = type;
    }

    private String value;
    private String code;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static IntegralItemType getType(String type) {
        switch (type) {
            case "YWJF001":
                return BUSINESS;
            case "PZJF001":
                return PHOTO;
            case "YCJF001":
                return FREIGHT_PRESERVER;
            case "DZYD001":
                return ELECTRONIC_WAYBILL;
            default:
                return null;
        }
    }
}
