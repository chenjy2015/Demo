package com.kye.model.bean.bill;

import com.google.gson.annotations.SerializedName;

public class BillPermissions {

    /**
     * status : 1
     * errorMsg : 您无权限使用此模块
     * commerceName : 万佳
     * commercePhone : 18928464845
     */

    @SerializedName("status")
    private int    status;
    @SerializedName("errorMsg")
    private String errorMsg;
    @SerializedName("commerceName")
    private String commerceName;
    @SerializedName("commercePhone")
    private String commercePhone;

    public int getStatus()                             { return status;}

    public void setStatus(int status)                  { this.status = status;}

    public String getErrorMsg()                        { return errorMsg;}

    public void setErrorMsg(String errorMsg)           { this.errorMsg = errorMsg;}

    public String getCommerceName()                    { return commerceName;}

    public void setCommerceName(String commerceName)   { this.commerceName = commerceName;}

    public String getCommercePhone()                   { return commercePhone;}

    public void setCommercePhone(String commercePhone) { this.commercePhone = commercePhone;}
}
