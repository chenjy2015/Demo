package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class RequestQueryBillingMethodBean {


    /**
     * customerCode : 75519398828
     * sendPlace : 广东省-深圳市
     * getAdress : 广东省-广州市
     * serviceModeType : 4
     * phone : 15818415911
     */

    private String customerCode;
    private String sendPlace;
    private String getAdress;
    private String serviceModeType;
    private String phone;

    public RequestQueryBillingMethodBean(String customerCode, String sendPlace, String getAdress, String serviceModeType, String phone) {
        this.customerCode = customerCode;
        this.sendPlace = sendPlace;
        this.getAdress = getAdress;
        this.serviceModeType = serviceModeType;
        this.phone = phone;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getSendPlace() {
        return sendPlace;
    }

    public void setSendPlace(String sendPlace) {
        this.sendPlace = sendPlace;
    }

    public String getGetAdress() {
        return getAdress;
    }

    public void setGetAdress(String getAdress) {
        this.getAdress = getAdress;
    }

    public String getServiceModeType() {
        return serviceModeType;
    }

    public void setServiceModeType(String serviceModeType) {
        this.serviceModeType = serviceModeType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
