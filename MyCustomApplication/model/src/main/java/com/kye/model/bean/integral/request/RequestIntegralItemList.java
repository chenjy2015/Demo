package com.kye.model.bean.integral.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 25/01/2018
 * @updated : 25/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestIntegralItemList implements Serializable {

    /**
     *
         phone	string	是	18924656687	登录账号
         startTime	string	是	2016-11-04	开始时间
         endTime	string	是	2017-11-04	结束时间
         pageIndex	number	是	1	页数
         pageSize	number	是	2	每页大小
         integralType	string	是	1	类型（1 业务积分明细 2 拍照积分明细 3 预存积分明细）

     * phone : 18924656687
     * startTime : 2016-11-04
     * endTime : 2017-11-04
     * pageIndex : 1
     * pageSize : 2
     * integralType : 1
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("startTime")
    private String startTime;
    @SerializedName("endTime")
    private String endTime;
    @SerializedName("pageIndex")
    private int pageIndex;
    @SerializedName("pageSize")
    private int pageSize;
    @SerializedName("integralType")
    private String integralType;

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

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getIntegralType() {
        return integralType;
    }

    public void setIntegralType(String integralType) {
        this.integralType = integralType;
    }
}
