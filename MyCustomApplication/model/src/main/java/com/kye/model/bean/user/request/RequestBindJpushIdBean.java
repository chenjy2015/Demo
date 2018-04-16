package com.kye.model.bean.user.request;


public class RequestBindJpushIdBean {

    /**
     * jpushrid : 75519398828
     * phone : 15818415911
     */

    private String jpushrid;
    private String phone;

    public RequestBindJpushIdBean(String jpushrid, String phone) {
        this.jpushrid = jpushrid;
        this.phone = phone;
    }

    public String getJpushrid() {
        return jpushrid;
    }

    public void setJpushrid(String jpushrid) {
        this.jpushrid = jpushrid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
