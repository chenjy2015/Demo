package com.kye.model.bean.order.scan_code_order;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class ScanCodeOrderAddress implements Serializable {

    public ScanCodeOrderAddress() {
    }

    public ScanCodeOrderAddress(String area, String contacts, String contactsPhone, boolean isDefault, String address, int flag, String province, String phone, String city, String guid) {
        this.area = area;
        this.contacts = contacts;
        this.contactsPhone = contactsPhone;
        this.isDefault = isDefault;
        this.address = address;
        this.flag = flag;
        this.province = province;
        this.phone = phone;
        this.city = city;
        this.guid = guid;
    }

    /**
     * area : 樊城区1
     * temporary : 张三测试
     * contactsPhone : 158710581771
     * isDefault : 0
     * address : 谷城县政府1
     * flag : 2
     * province : 湖北省1
     * addTime : 2017-12-12 19:14:02
     * logPhone : 13222992863
     * city : 襄阳市1
     * guid : 093d67a4-1a9c-46ae-88a0-2dcf36df4c7c
     */

    @SerializedName("area")
    private String area;
    @SerializedName("contacts")
    private String contacts;
    @SerializedName("contactsPhone")
    private String contactsPhone;
    @SerializedName("isDefault")
    private Boolean isDefault;
    @SerializedName("address")
    private String address;
    @SerializedName("flag")
    private int flag;
    @SerializedName("province")
    private String province;
    @SerializedName("addTime")
    private Date addTime;
    @SerializedName("phone")
    private String phone;
    @SerializedName("city")
    private String city;
    @SerializedName("guid")
    private String guid;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public Boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "ScanCodeOrderAddress{" +
               "area='" + area + '\'' +
               ", contacts='" + contacts + '\'' +
               ", contactsPhone='" + contactsPhone + '\'' +
               ", isDefault=" + isDefault +
               ", address='" + address + '\'' +
               ", flag=" + flag +
               ", province='" + province + '\'' +
               ", addTime=" + addTime +
               ", phone='" + phone + '\'' +
               ", city='" + city + '\'' +
               ", guid='" + guid + '\'' +
               '}';
    }
}

