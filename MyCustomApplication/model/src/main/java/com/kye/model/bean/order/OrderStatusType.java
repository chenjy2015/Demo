package com.kye.model.bean.order;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 28/12/2017
 * @updated : 28/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public enum OrderStatusType {

    ORDER_TO_TAKE("待取件"),
    ORDER_TAKEN("已取件");

    private String desc;

    OrderStatusType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
