package com.kye.model.bean.deposit;

/**
 * Created by SkyYu on 2018/1/20
 */
public class RequestTradeURL {

    /**
     * phone : 18565826288
     * subject : 红包活动未完，待续….
     * totalFee : 500
     * body : 伤残捐款
     * company : 跨越速运集团
     */

    private String phone;
    private String subject;
    private String totalFee;
    private String body;
    private String company;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
