package com.kye.model.bean.waybill_take_photo;

/**
 * Created by harry on 2018/1/11 下午4:38.
 */

public class UploadWaybillPictureResultBean {

    /**
     * waybill : 75504920312
     * errorMsg : 您所拍的运单已上传或已被使用
     */

    private String waybill;
    private String remark;

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
