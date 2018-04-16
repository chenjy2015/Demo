package com.kye.model.bean.waybill_take_photo;

import java.io.Serializable;

/**
 * Created by linshuqin on 2016/11/17 14:44
 * Describe
 */

public class WaybillPhotograhbean implements Serializable {
    private long id;
    private String waybillNumber;
    private String imagePath;
    private String upLoadErroMsg;//上传失败后设值

    public String getUpLoadErroMsg() {
        return upLoadErroMsg;
    }

    public void setUpLoadErroMsg(String upLoadErroMsg) {
        this.upLoadErroMsg = upLoadErroMsg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
