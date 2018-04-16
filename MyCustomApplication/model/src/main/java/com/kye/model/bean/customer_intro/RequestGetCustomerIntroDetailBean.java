package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestGetCustomerIntroDetailBean {


    /**
     * phone : 13686801018
     * introductionToCompany : 深圳市科晶通科技有限公司
     */

    private String phone;
    private String introductionToCompany;

    public RequestGetCustomerIntroDetailBean(String phone, String introductionToCompany) {
        this.phone = phone;
        this.introductionToCompany = introductionToCompany;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIntroductionToCompany() {
        return introductionToCompany;
    }

    public void setIntroductionToCompany(String introductionToCompany) {
        this.introductionToCompany = introductionToCompany;
    }
}
