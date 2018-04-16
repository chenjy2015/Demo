package com.kye.model.bean.order;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class OrderAddresses implements Serializable {

    /**
     * companyName : 接口部测试唯品 addresses : [{"phone":"xjou","addressName":"接口部测试唯品","province":"2eak","city":"st23","county":"8p42",
     * "detailsAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","contacePerson":"黎路","telphone":"13222992863","areaNo":"","phoneNo":"","extensionNumber":"",
     * "guid":"bc4c5aaa-cb61-4a73-8fb0-e7b63da30e07","companyCode":"75519398828","company":"接口部测试唯品","isDefault":true,"addTime":"0001-01-01
     * 00:00:00","specialAddress":"l0jt"},{"phone":"13222992863","addressName":"测试","province":"北京","city":"北京市","county":"大兴区",
     * "detailsAddress":"测试","contacePerson":"测试","telphone":"13222992863","areaNo":"","phoneNo":"","extensionNumber":"",
     * "guid":"fd6d13dd-f9f8-41a7-a9ea-7841094a03da","companyCode":"75519398828","company":"接口部测试唯品","isDefault":false,"addTime":"0001-01-01
     * 00:00:00","specialAddress":"4er3"}]
     */

    @SerializedName("companyName")
    private String        companyName;
    @SerializedName("companyCode")
    private String        companyCode;
    @SerializedName("addresses")
    private List<Address> addresses;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public static class Address implements Serializable {
        /**
         * phone : xjou
         * addressName : 接口部测试唯品
         * province : 2eak
         * city : st23
         * county : 8p42
         * detailsAddress : 新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路
         * contacePerson : 黎路
         * telphone : 13222992863
         * areaNo :
         * phoneNo :
         * extensionNumber :
         * guid : bc4c5aaa-cb61-4a73-8fb0-e7b63da30e07
         * companyCode : 75519398828
         * company : 接口部测试唯品
         * isDefault : true
         * addTime : 0001-01-01 00:00:00
         * specialAddress : l0jt
         */

        @SerializedName("addressName")
        private String  addressName;
        @SerializedName("province")
        private String  province;
        @SerializedName("city")
        private String  city;
        @SerializedName("county")
        private String  county;
        @SerializedName("detailsAddress")
        private String  detailsAddress;
        @SerializedName("contacePerson")
        private String  contacePerson;
        @SerializedName("telphone")
        private String  telphone;
        @SerializedName("areaNo")
        private String  areaNo;
        @SerializedName("phoneNo")
        private String  phoneNo;
        @SerializedName("extensionNumber")
        private String  extensionNumber;
        @SerializedName("guid")
        private String  guid;
        @SerializedName("company")
        private String  company;
        @SerializedName("isDefault")
        private boolean isDefault;
        @SerializedName("addTime")
        private String  addTime;
        @SerializedName("specialAddress")
        private String  specialAddress;

        @SerializedName("companyCode")
        private String companyCode;

        public String getCompanyCode() {
            return companyCode;
        }

        public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
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

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public boolean isDefault() {
            return isDefault;
        }

        public void setIsDefault(boolean isDefault) {
            this.isDefault = isDefault;
        }

        public String getAddTime() {
            return addTime;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public String getSpecialAddress() {
            return specialAddress;
        }

        public void setSpecialAddress(String specialAddress) {
            this.specialAddress = specialAddress;
        }

        public String getAllDetails() {
            String p = getProvince() == null || "".equals(getProvince()) ? "" : getProvince();
            String c = getCity() == null || "".equals(getCity()) ? "" : getCity();
            String a = getCounty() == null || "".equals(getCounty()) ? "" : getCounty();
            String d = getDetailsAddress() == null || "".equals(getDetailsAddress()) ? "" : getDetailsAddress();
            return p + c + a + d;
        }

        @Override
        public String toString() {
            return "Address{" +
                   "addressName='" + addressName + '\'' +
                   ", province='" + province + '\'' +
                   ", city='" + city + '\'' +
                   ", county='" + county + '\'' +
                   ", detailsAddress='" + detailsAddress + '\'' +
                   ", contacePerson='" + contacePerson + '\'' +
                   ", telphone='" + telphone + '\'' +
                   ", areaNo='" + areaNo + '\'' +
                   ", phoneNo='" + phoneNo + '\'' +
                   ", extensionNumber='" + extensionNumber + '\'' +
                   ", guid='" + guid + '\'' +
                   ", company='" + company + '\'' +
                   ", isDefault=" + isDefault +
                   ", addTime='" + addTime + '\'' +
                   ", specialAddress='" + specialAddress + '\'' +
                   ", companyCode='" + companyCode + '\'' +
                   '}';
        }
    }
}
