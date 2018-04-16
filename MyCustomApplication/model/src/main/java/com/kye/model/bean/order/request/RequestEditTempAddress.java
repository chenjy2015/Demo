package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

public class RequestEditTempAddress {


    /**
     * phone :
     * addressName :
     * province :
     * city :
     * county :
     * detailsAddress :
     * contacePerson :
     * telphone :
     * guid :
     * companyCode :
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("addressName")
    private String addressName;
    @SerializedName("province")
    private String province;
    @SerializedName("city")
    private String city;
    @SerializedName("county")
    private String county;
    @SerializedName("detailsAddress")
    private String detailsAddress;
    @SerializedName("contacePerson")
    private String contacePerson;
    @SerializedName("telphone")
    private String telphone;
    @SerializedName("guid")
    private String guid;
    @SerializedName("companyCode")
    private String companyCode;
    @SerializedName("company")
    private String company;

    @SerializedName("areaNo")
    private String areaNo;
    @SerializedName("phoneNo")
    private String phoneNo;
    @SerializedName("extensionNumber")
    private String extensionNumber;

    public RequestEditTempAddress(String phone, String addressName, String province, String city, String county, String detailAddress, String person, String telphone, String guid, String companyCode, String company, String areaNo, String phoneNo, String extensionNumber) {
        this.phone = phone;
        this.addressName = addressName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.detailsAddress = detailAddress;
        this.contacePerson = person;
        this.telphone = telphone;
        this.guid = guid;
        this.companyCode = companyCode;
        this.company = company;
        this.areaNo = areaNo;
        this.phoneNo = phoneNo;
        this.extensionNumber = extensionNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDetailsAddress() {
        return detailsAddress;
    }

    public void setDetailsAddress(String detailsAddress) {
        this.detailsAddress = detailsAddress;
    }

    public String getContacePerson() {
        return contacePerson;
    }

    public void setContacePerson(String contacePerson) {
        this.contacePerson = contacePerson;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getExtensionNumber() {
        return extensionNumber;
    }

    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }
}
