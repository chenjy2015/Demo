package com.kye.model.bean.integral;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 */

public enum IntegralRecordType {

    TYPE_EXCHANGE(0),
    TYPE_OBTAIN(1);

    private int type;

    IntegralRecordType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.valueOf(type);
    }
}
