package com.kye.model.bean.waybill_take_photo;

/**
 * Created by harry on 2018/1/11 下午4:38.
 */

public class QueryWaybillImageResultBean {

    /**
     * waybill : 75503498511
     * imageUrl : http://192.168.24.186:8080/Data/File/20161104/301c53d33d4d41f983a0d35daec2625f/301c53d33d4d41f983a0d35daec2625f.jpg
     * dateTime : 2017-10-23 17:23:17
     */

    private String waybill;
    private String image;
    private String dateTime;

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
