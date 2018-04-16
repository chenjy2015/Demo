package com.kye.model.bean.user;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {

    /**
     * isFreightAuthority : false
     * county :
     * departMan : 杨志康
     * openlnvoiceFlag : 1
     * sessionID : 2_0a221043-7512-44a0-905c-057c4ca4c8ed
     * marketingTelphone :
     * isExamineWaybillAgreement : false
     * isCanSendAcc : false
     * isPartner : false
     * customerType : 0
     * province :
     * road :
     * isInvoiceRigth : false
     * lastAddress : []
     * depart :
     * isOrdered : false
     * departmentName :
     * isEmployee : false
     * kyeService :
     * isCanPay : false
     * wxCode :
     * workcompany : 啊啊厂
     * expire_time : 2678400
     * printSize :
     * isCustomerIsMonthly : false
     * refresh_token : 839DC2A0CB7D67E7A60D0DB42A9314AE
     * kyeServicePhone :
     * phone : 18576629332
     * isRecommendNo : false
     * partnerType :
     * isHasPwd : false
     * partnerDept :
     * city :
     * isPrintTag : false
     * cityCode :
     * isFruitsCustomer : false
     * isKeycustomer : false
     * payTax :
     * customCode :
     * isWaybillRight : false
     * isDryline : false
     * marketer :
     * isFreightPaly : false
     * street :
     * integral : 0.0
     * email :
     * assistant :
     * sex :
     * isBalance : false
     * deviceCode : 3
     * userName : 杨志康
     * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.A9858FE044CC9F7B6A4157F54A81F1D6.eyJzY29wZSI6WyJhcHAiXSwiZXhwIjoyNjc4NDAwMDAwLCJjbGllbnRfaWQiOiIxODU3NjYyOTMzMiIsImp0aSI6ImQ0MGYwMGZiLTUxY2EtNDRlMC04M2U1LTRjNzYxNjk0ZmFjYiJ9.5xcyl2JHNfFU-vKt1Rz6td9VXh3wpBefDFbX6Tnkz4w
     * isBlack : false
     */

    @SerializedName("sessionID")
    private String sessionID;
    @SerializedName("birthday")
    private Date birthday;
    @SerializedName("isFreightAuthority")
    private boolean isFreightAuthority;
    @SerializedName("county")
    private String county;
    @SerializedName("departMan")
    private String departMan;
    @SerializedName("openlnvoiceFlag")
    private int openlnvoiceFlag;
    @SerializedName("marketingTelphone")
    private String marketingTelphone;
    @SerializedName("isExamineWaybillAgreement")
    private boolean isExamineWaybillAgreement;
    @SerializedName("isCanSendAcc")
    private boolean isCanSendAcc;
    @SerializedName("isPartner")
    private boolean isPartner;
    @SerializedName("customerType")
    private int customerType;
    @SerializedName("province")
    private String province;
    @SerializedName("road")
    private String road;
    @SerializedName("isInvoiceRigth")
    private boolean isInvoiceRigth;
    @SerializedName("depart")
    private String depart;
    @SerializedName("isOrdered")
    private boolean isOrdered;
    @SerializedName("departmentName")
    private String departmentName;
    @SerializedName("isEmployee")
    private boolean isEmployee;
    @SerializedName("kyeService")
    private String kyeService;
    @SerializedName("isCanPay")
    private boolean isCanPay;
    @SerializedName("wxCode")
    private String wxCode;
    @SerializedName("workcompany")
    private String workcompany;
    @SerializedName("expire_time")
    private int expireTime;
    @SerializedName("printSize")
    private String printSize;
    @SerializedName("isCustomerIsMonthly")  // 是否月结客户（falsea否, true是）
    private boolean isCustomerIsMonthly;
    @SerializedName("refresh_token")
    private String refreshToken;
    @SerializedName("kyeServicePhone")
    private String kyeServicePhone;
    @SerializedName("phone")
    private String phone;
    @SerializedName("isRecommendNo")
    private boolean isRecommendNo;
    @SerializedName("partnerType")
    private String partnerType;
    @SerializedName("isHasPwd")
    private boolean isHasPwd;
    @SerializedName("partnerDept")
    private String partnerDept;
    @SerializedName("city")
    private String city;
    @SerializedName("isPrintTag")
    private boolean isPrintTag;
    @SerializedName("cityCode")
    private String cityCode;
    @SerializedName("isFruitsCustomer")
    private boolean isFruitsCustomer;
    @SerializedName("isKeycustomer")
    private boolean isKeycustomer;
    @SerializedName("payTax")
    private String payTax;
    @SerializedName("customCode")
    private String customCode;
    @SerializedName("isWaybillRight")
    private boolean isWaybillRight;
    @SerializedName("isDryline")
    private boolean isDryline;
    @SerializedName("marketer")
    private String marketer;
    @SerializedName("isFreightPaly")
    private boolean isFreightPaly;
    @SerializedName("street")
    private String street;
    @SerializedName("integral")
    private String integral;
    @SerializedName("email")
    private String email;
    @SerializedName("assistant")
    private String assistant;
    @SerializedName("sex")
    private String sex;
    @SerializedName("isBalance")
    private boolean isBalance;
    @SerializedName("deviceCode")
    private int deviceCode;
    @SerializedName("userName")
    private String userName;
    @SerializedName("token")
    private String token;
    @SerializedName("isBlack")
    private boolean isBlack;
    @SerializedName("lastAddress")
    private List<Address> lastAddress;
    @SerializedName("currentMoney")
    private float currentMoney;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isFreightAuthority() {
        return isFreightAuthority;
    }

    public void setIsFreightAuthority(boolean isFreightAuthority) {
        this.isFreightAuthority = isFreightAuthority;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDepartMan() {
        return departMan;
    }

    public void setDepartMan(String departMan) {
        this.departMan = departMan;
    }

    public int getOpenlnvoiceFlag() {
        return openlnvoiceFlag;
    }

    public void setOpenlnvoiceFlag(int openlnvoiceFlag) {
        this.openlnvoiceFlag = openlnvoiceFlag;
    }

    public String getMarketingTelphone() {
        return marketingTelphone;
    }

    public void setMarketingTelphone(String marketingTelphone) {
        this.marketingTelphone = marketingTelphone;
    }

    public boolean isExamineWaybillAgreement() {
        return isExamineWaybillAgreement;
    }

    public void setIsExamineWaybillAgreement(boolean isExamineWaybillAgreement) {
        this.isExamineWaybillAgreement = isExamineWaybillAgreement;
    }

    public boolean isCanSendAcc() {
        return isCanSendAcc;
    }

    public void setIsCanSendAcc(boolean isCanSendAcc) {
        this.isCanSendAcc = isCanSendAcc;
    }

    public boolean isPartner() {
        return isPartner;
    }

    public void setIsPartner(boolean isPartner) {
        this.isPartner = isPartner;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public boolean isInvoiceRigth() {
        return isInvoiceRigth;
    }

    public void setIsInvoiceRigth(boolean isInvoiceRigth) {
        this.isInvoiceRigth = isInvoiceRigth;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public String getKyeService() {
        return kyeService;
    }

    public void setKyeService(String kyeService) {
        this.kyeService = kyeService;
    }

    public boolean isCanPay() {
        return isCanPay;
    }

    public void setIsCanPay(boolean isCanPay) {
        this.isCanPay = isCanPay;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getWorkcompany() {
        return workcompany;
    }

    public void setWorkcompany(String workcompany) {
        this.workcompany = workcompany;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public String getPrintSize() {
        return printSize;
    }

    public void setPrintSize(String printSize) {
        this.printSize = printSize;
    }

    public boolean isCustomerIsMonthly() {
        return isCustomerIsMonthly;
    }

    public void setIsCustomerIsMonthly(boolean isCustomerIsMonthly) {
        this.isCustomerIsMonthly = isCustomerIsMonthly;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getKyeServicePhone() {
        return kyeServicePhone;
    }

    public void setKyeServicePhone(String kyeServicePhone) {
        this.kyeServicePhone = kyeServicePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isRecommendNo() {
        return isRecommendNo;
    }

    public void setIsRecommendNo(boolean isRecommendNo) {
        this.isRecommendNo = isRecommendNo;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    public boolean isHasPwd() {
        return isHasPwd;
    }

    public void setIsHasPwd(boolean isHasPwd) {
        this.isHasPwd = isHasPwd;
    }

    public String getPartnerDept() {
        return partnerDept;
    }

    public void setPartnerDept(String partnerDept) {
        this.partnerDept = partnerDept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPrintTag() {
        return isPrintTag;
    }

    public void setIsPrintTag(boolean isPrintTag) {
        this.isPrintTag = isPrintTag;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public boolean isFruitsCustomer() {
        return isFruitsCustomer;
    }

    public void setIsFruitsCustomer(boolean isFruitsCustomer) {
        this.isFruitsCustomer = isFruitsCustomer;
    }

    public boolean isKeycustomer() {
        return isKeycustomer;
    }

    public void setIsKeycustomer(boolean isKeycustomer) {
        this.isKeycustomer = isKeycustomer;
    }

    public String getPayTax() {
        return payTax;
    }

    public void setPayTax(String payTax) {
        this.payTax = payTax;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public boolean isWaybillRight() {
        return isWaybillRight;
    }

    public void setIsWaybillRight(boolean isWaybillRight) {
        this.isWaybillRight = isWaybillRight;
    }

    public boolean isDryline() {
        return isDryline;
    }

    public void setIsDryline(boolean isDryline) {
        this.isDryline = isDryline;
    }

    public String getMarketer() {
        return marketer;
    }

    public void setMarketer(String marketer) {
        this.marketer = marketer;
    }

    public boolean isFreightPaly() {
        return isFreightPaly;
    }

    public void setIsFreightPaly(boolean isFreightPaly) {
        this.isFreightPaly = isFreightPaly;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isBalance() {
        return isBalance;
    }

    public void setIsBalance(boolean isBalance) {
        this.isBalance = isBalance;
    }

    public int getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(int deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setIsBlack(boolean isBlack) {
        this.isBlack = isBlack;
    }

    public List<Address> getLastAddress() {
        return lastAddress;
    }

    public void setLastAddress(List<Address> lastAddress) {
        this.lastAddress = lastAddress;
    }

    public boolean isLogin() {
        return !TextUtils.isEmpty(token);
    }

    public boolean isHasCustomCode(){
        return !TextUtils.isEmpty(customCode);
    }

    public float getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(float currentMoney) {
        this.currentMoney = currentMoney;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public static class Address implements Serializable{

        /**
         * areaNo : adsfa
         * comAddress : sdafasfd
         * companyCode : companyCode
         * companyName : companyName
         * temporaryAddress : adsfaf
         */

        @SerializedName("areaNo")
        private String areaNo;
        @SerializedName("comAddress")
        private String comAddress;
        @SerializedName("companyCode")
        private String companyCode;
        @SerializedName("companyName")
        private String companyName;
        @SerializedName("temporaryAddress")
        private String temporaryAddress;
        @SerializedName("isBinding")
        private boolean isBinding;

        public String getAreaNo() {
            return areaNo;
        }

        public void setAreaNo(String areaNo) {
            this.areaNo = areaNo;
        }

        public String getComAddress() {
            return comAddress;
        }

        public void setComAddress(String comAddress) {
            this.comAddress = comAddress;
        }

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

        public String getTemporaryAddress() {
            return temporaryAddress;
        }

        public void setTemporaryAddress(String temporaryAddress) {
            this.temporaryAddress = temporaryAddress;
        }

        public boolean getIsBinding() {
            return isBinding;
        }

        public void setIsBinding(boolean isBinding) {
            this.isBinding = isBinding;
        }
    }
}
