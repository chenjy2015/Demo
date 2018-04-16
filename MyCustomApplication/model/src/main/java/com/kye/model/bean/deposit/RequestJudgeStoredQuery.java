package com.kye.model.bean.deposit;

/**
 * Created by SkyYu on 2018/1/16
 */
public class RequestJudgeStoredQuery {

    /**
     * companyCode : 75519398828
     * phone : 15818415911
     */

    private String companyCode;
    private String phone;

    public RequestJudgeStoredQuery(String companyCode, String phone) {
        this.companyCode = companyCode;
        this.phone = phone;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
