package com.kye.model.bean.waybill_list;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 28/12/2017
 * @updated : 28/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public enum WaybillStatusType {

    WAYBILL_TO_SIGN("待签收"),
    WAYBILL_SIGNED("已签收");

    private String desc;

    WaybillStatusType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
