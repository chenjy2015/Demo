package com.kye.model.bean.jd.order_details.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 03/02/2018
 * @updated : 03/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestGooodsExchange implements Parcelable {

//    @"bNeedAnnex":@(1),
//    @"bNeedGift":@(0),
//    @"num":@"1",
//    @"invoiceState":@"2",
//    @"invoiceType":@"1",
//    @"billingType":@"4",
//    @"invoiceName":@"1",
//    @"invoiceDetailed":@"1",
//    @"paymentType":@"4",
//    @"isUseBalance":@"1",
//    @"submitState":@"1",

    /**
     * kySign : 123456
     * skuId : 1036259
     * num : 1
     * bNeedAnnex : true
     * bNeedGift : false
     * name : 333
     * province : 21
     * city : 1911
     * county : 1927
     * town : 1913
     * address : 1111111
     * zip : 252120
     * mobile : 14777477467
     * email : hcd@153.com
     * invoiceState : 2
     * invoiceType : 1
     * billingType : 4
     * invoiceName : 1
     * invoiceDetailed : 1
     * paymentType : 4
     * isUseBalance : 1
     * submitState : 1
     * codeMoney : 100
     * phone : 14777477467
     * consCredit : 2000
     * allowContFlag : 1
     * confirmCode : 666666
     * phoneNumber : 14777477467
     * orderAmount : u3fr
     * provinceName : fj69
     * cityName : 1xjz
     * countyName : y21l
     * townName : 8a46
     */

    @SerializedName("kySign")
    private String kySign;
    @SerializedName("skuId")
    private String skuId;
    @SerializedName("num")
    private String num = "1";
    @SerializedName("bNeedAnnex")
    private boolean bNeedAnnex = true;
    @SerializedName("bNeedGift")
    private boolean bNeedGift = false;
    @SerializedName("name")
    private String name;
    @SerializedName("province")
    private String province;
    @SerializedName("city")
    private String city;
    @SerializedName("county")
    private String county;
    @SerializedName("town")
    private String town;
    @SerializedName("address")
    private String address;
    @SerializedName("zip")
    private String zip;
    @SerializedName("mobile")
    private String mobile;
    @SerializedName("email")
    private String email;
    @SerializedName("invoiceState")
    private String invoiceState = "2";
    @SerializedName("invoiceType")
    private String invoiceType = "1";
    @SerializedName("billingType")
    private String billingType = "4";
    @SerializedName("invoiceName")
    private String invoiceName = "1";
    @SerializedName("invoiceDetailed")
    private String invoiceDetailed = "1";
    @SerializedName("paymentType")
    private String paymentType = "4";
    @SerializedName("isUseBalance")
    private String isUseBalance = "1";
    @SerializedName("submitState")
    private String submitState = "1";
    @SerializedName("codeMoney")
    private String codeMoney;
    @SerializedName("phone")
    private String phone;
    @SerializedName("consCredit")
    private String consCredit;
    @SerializedName("allowContFlag")
    private String allowContFlag;
    @SerializedName("confirmCode")
    private String confirmCode;
    @SerializedName("phoneNumber")
    private String phoneNumber;
    @SerializedName("orderAmount")
    private String orderAmount;
    @SerializedName("provinceName")
    private String provinceName;
    @SerializedName("cityName")
    private String cityName;
    @SerializedName("countyName")
    private String countyName;
    @SerializedName("townName")
    private String townName;

    public String getKySign() {
        return kySign;
    }

    public void setKySign(String kySign) {
        this.kySign = kySign;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public boolean isBNeedAnnex() {
        return bNeedAnnex;
    }

    public void setBNeedAnnex(boolean bNeedAnnex) {
        this.bNeedAnnex = bNeedAnnex;
    }

    public boolean isBNeedGift() {
        return bNeedGift;
    }

    public void setBNeedGift(boolean bNeedGift) {
        this.bNeedGift = bNeedGift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(String invoiceState) {
        this.invoiceState = invoiceState;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceDetailed() {
        return invoiceDetailed;
    }

    public void setInvoiceDetailed(String invoiceDetailed) {
        this.invoiceDetailed = invoiceDetailed;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getIsUseBalance() {
        return isUseBalance;
    }

    public void setIsUseBalance(String isUseBalance) {
        this.isUseBalance = isUseBalance;
    }

    public String getSubmitState() {
        return submitState;
    }

    public void setSubmitState(String submitState) {
        this.submitState = submitState;
    }

    public String getCodeMoney() {
        return codeMoney;
    }

    public void setCodeMoney(String codeMoney) {
        this.codeMoney = codeMoney;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getConsCredit() {
        return consCredit;
    }

    public void setConsCredit(String consCredit) {
        this.consCredit = consCredit;
    }

    public String getAllowContFlag() {
        return allowContFlag;
    }

    public void setAllowContFlag(String allowContFlag) {
        this.allowContFlag = allowContFlag;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.kySign);
        dest.writeString(this.skuId);
        dest.writeString(this.num);
        dest.writeByte(this.bNeedAnnex ? (byte) 1 : (byte) 0);
        dest.writeByte(this.bNeedGift ? (byte) 1 : (byte) 0);
        dest.writeString(this.name);
        dest.writeString(this.province);
        dest.writeString(this.city);
        dest.writeString(this.county);
        dest.writeString(this.town);
        dest.writeString(this.address);
        dest.writeString(this.zip);
        dest.writeString(this.mobile);
        dest.writeString(this.email);
        dest.writeString(this.invoiceState);
        dest.writeString(this.invoiceType);
        dest.writeString(this.billingType);
        dest.writeString(this.invoiceName);
        dest.writeString(this.invoiceDetailed);
        dest.writeString(this.paymentType);
        dest.writeString(this.isUseBalance);
        dest.writeString(this.submitState);
        dest.writeString(this.codeMoney);
        dest.writeString(this.phone);
        dest.writeString(this.consCredit);
        dest.writeString(this.allowContFlag);
        dest.writeString(this.confirmCode);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.orderAmount);
        dest.writeString(this.provinceName);
        dest.writeString(this.cityName);
        dest.writeString(this.countyName);
        dest.writeString(this.townName);
    }

    public RequestGooodsExchange() {
    }

    protected RequestGooodsExchange(Parcel in) {
        this.kySign = in.readString();
        this.skuId = in.readString();
        this.num = in.readString();
        this.bNeedAnnex = in.readByte() != 0;
        this.bNeedGift = in.readByte() != 0;
        this.name = in.readString();
        this.province = in.readString();
        this.city = in.readString();
        this.county = in.readString();
        this.town = in.readString();
        this.address = in.readString();
        this.zip = in.readString();
        this.mobile = in.readString();
        this.email = in.readString();
        this.invoiceState = in.readString();
        this.invoiceType = in.readString();
        this.billingType = in.readString();
        this.invoiceName = in.readString();
        this.invoiceDetailed = in.readString();
        this.paymentType = in.readString();
        this.isUseBalance = in.readString();
        this.submitState = in.readString();
        this.codeMoney = in.readString();
        this.phone = in.readString();
        this.consCredit = in.readString();
        this.allowContFlag = in.readString();
        this.confirmCode = in.readString();
        this.phoneNumber = in.readString();
        this.orderAmount = in.readString();
        this.provinceName = in.readString();
        this.cityName = in.readString();
        this.countyName = in.readString();
        this.townName = in.readString();
    }

    public static final Parcelable.Creator<RequestGooodsExchange> CREATOR = new Parcelable.Creator<RequestGooodsExchange>() {
        @Override
        public RequestGooodsExchange createFromParcel(Parcel source) {
            return new RequestGooodsExchange(source);
        }

        @Override
        public RequestGooodsExchange[] newArray(int size) {
            return new RequestGooodsExchange[size];
        }
    };
}
