package com.kye.model.bean.limit_time_query;

/**
 * Created by harry on 2018/1/6 下午3:42.
 */

public class RequestFindServiceAging {


    /**
     * sendProvince : 广东省,1
     * sendCity : 深圳市,2
     * sendArea : 福田区,3
     * receiptProvince : 江西省,1
     * receiptCity : 南昌市,2
     * receiptArea : 西湖区,3
     * receiptStreet : k6mn
     * sendDate : 2017-08-02 14:01:00
     * type : 0
     */

    private String sendProvince;
    private String sendCity;
    private String sendArea;
    private String receiptProvince;
    private String receiptCity;
    private String receiptArea;
    private String receiptStreet;
    private String sendDate;
    private String type;

    public RequestFindServiceAging(String sendProvince, String sendCity, String sendArea, String receiptProvince, String receiptCity, String receiptArea, String receiptStreet, String sendDate, String type) {
        this.sendProvince = sendProvince;
        this.sendCity = sendCity;
        this.sendArea = sendArea;
        this.receiptProvince = receiptProvince;
        this.receiptCity = receiptCity;
        this.receiptArea = receiptArea;
        this.receiptStreet = receiptStreet;
        this.sendDate = sendDate;
        this.type = type;
    }

    public String getSendProvince() {
        return sendProvince;
    }

    public void setSendProvince(String sendProvince) {
        this.sendProvince = sendProvince;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
    }

    public String getSendArea() {
        return sendArea;
    }

    public void setSendArea(String sendArea) {
        this.sendArea = sendArea;
    }

    public String getReceiptProvince() {
        return receiptProvince;
    }

    public void setReceiptProvince(String receiptProvince) {
        this.receiptProvince = receiptProvince;
    }

    public String getReceiptCity() {
        return receiptCity;
    }

    public void setReceiptCity(String receiptCity) {
        this.receiptCity = receiptCity;
    }

    public String getReceiptArea() {
        return receiptArea;
    }

    public void setReceiptArea(String receiptArea) {
        this.receiptArea = receiptArea;
    }

    public String getReceiptStreet() {
        return receiptStreet;
    }

    public void setReceiptStreet(String receiptStreet) {
        this.receiptStreet = receiptStreet;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
