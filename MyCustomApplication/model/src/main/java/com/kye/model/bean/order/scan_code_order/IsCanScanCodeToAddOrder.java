package com.kye.model.bean.order.scan_code_order;

import com.google.gson.annotations.SerializedName;

public class IsCanScanCodeToAddOrder {

    /**
     * ordersType : 1
     * companyCode : 75519398828-001
     * waybillNo : 1q33
     * contacts : 张三
     * contactNumber : 31bh
     * isDefault : 1
     * province : 湖北省
     * city : 襄阳市
     * area : 樊城区
     * address : 谷城县政府
     * guid : 17b31c08-48b4-416b-b1dd-9c4f60b1d65b
     */

    @SerializedName("ordersType")
    private boolean ordersType;
    @SerializedName("companyCode")
    private String companyCode;
    @SerializedName("waybillNo")
    private String waybillNo;
    @SerializedName("contacts")
    private String contacts;
    @SerializedName("contactNumber")
    private String contactNumber;
    @SerializedName("isDefault")
    private boolean isDefault;
    @SerializedName("province")
    private String province;
    @SerializedName("city")
    private String city;
    @SerializedName("area")
    private String area;
    @SerializedName("address")
    private String address;
    @SerializedName("guid")
    private String guid;

    public boolean isOrdersType() {
        return ordersType;
    }

    public void setOrdersType(boolean ordersType) {
        this.ordersType = ordersType;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
