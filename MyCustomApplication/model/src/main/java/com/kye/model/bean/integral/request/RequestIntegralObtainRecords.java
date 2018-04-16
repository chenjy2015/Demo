package com.kye.model.bean.integral.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 * <p>
 * 获取'获取记录'列表
 */

public class RequestIntegralObtainRecords implements Serializable {

    /**
     * phone :     15552337066
     * startTime : 2016-03-25
     * endTime :   2016-07-27
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("startTime")
    private String startTime;
    @SerializedName("endTime")
    private String endTime;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
