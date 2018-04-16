package com.kye.model.bean.integral;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/01/2018
 * @updated : 15/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

@Deprecated
public enum  IntegralObtainType {

    TYPE_PZJF001("PZJF001"),
    TYPE_YCJF001("YCJF001"),
    TYPE_YWJF001("YWJF001"),
    TYPE_OTHER("other");

    private String type;

    private IntegralObtainType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
