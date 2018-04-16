package com.kye.model.bean.logistics.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/01/2018
 * @updated : 27/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestLogisticsPlanReceiveTime {

    /**
     * phone : 15635629212
     * waybill : 75503489891
     * startTime : 2017-12-1 17:00:47
     * endTime : 2017-12-1 18:00:47
     * source : APP
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("startTime")
    private String startTime;
    @SerializedName("endTime")
    private String endTime;
    @SerializedName("source")
    private String source;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
