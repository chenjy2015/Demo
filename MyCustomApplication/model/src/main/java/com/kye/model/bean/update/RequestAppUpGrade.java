package com.kye.model.bean.update;

import com.google.gson.annotations.SerializedName;

public class RequestAppUpGrade {

    /**
     * versionNo : v6.0.0  	APP版本号
     * upType : 2           APP用户群 (1内部用户;2非内部用户)
     * flag : 30            APP平台类型 (10：内部APP安卓 20：内部APP苹果 30：外部APP安卓 40：外部APP苹果)
     */

    @SerializedName("versionNo")
    private String versionNo;
    @SerializedName("upType")
    private int upType;
    @SerializedName("flag")
    private String flag;

    public RequestAppUpGrade(String versionNo, int upType, String flag) {
        this.versionNo = versionNo;
        this.upType = upType;
        this.flag = flag;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public int getUpType() {
        return upType;
    }

    public void setUpType(int upType) {
        this.upType = upType;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}