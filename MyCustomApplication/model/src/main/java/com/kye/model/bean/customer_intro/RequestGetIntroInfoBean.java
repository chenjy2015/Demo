package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestGetIntroInfoBean {

    /**
     * phone : 18924656687
     * sysGuid : 82C4F1DC57A5488695A5A45D2505F645
     */

    private String phone;
    private String sysGuid;

    public RequestGetIntroInfoBean(String phone, String sysGuid) {
        this.phone = phone;
        this.sysGuid = sysGuid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSysGuid() {
        return sysGuid;
    }

    public void setSysGuid(String sysGuid) {
        this.sysGuid = sysGuid;
    }
}
