package com.kye.model.bean.deposit;

/**
 * Created by SkyYu on 2018/1/20
 */
public class RequestIsNeedTicket {

    /**
     * phone : 18924656687
     * companyCode : 75519398828
     */

    private String phone;
    private String companyCode;

    public RequestIsNeedTicket(String phone, String companyCode) {
        this.phone = phone;
        this.companyCode = companyCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
