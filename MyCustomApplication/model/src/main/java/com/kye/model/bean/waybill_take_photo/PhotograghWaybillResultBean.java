package com.kye.model.bean.waybill_take_photo;

import java.io.Serializable;

/**
 * Created by linshuqin on 2017/2/16 15:31
 * Describe  云脉拍照返回 数据bean
 */

public class PhotograghWaybillResultBean implements Serializable {

    /**
     * Bcode : 00000000090
     * SendCompany : 水里驼骆州仓
     * SendAddress : 佛山南工旌甘路线西街新向北区海市区业工袜Ij-
     * SendContact : 胡小姐
     * ReceiptCompany : 难州鄂会品
     * ReceiptAddress : 湖北省流物中华会品唯州鄂路民人区发开济经店葛市州鄂省工蕉甘心中
     * ReceiptContact : 吕佩佩方丽
     * SendPhoneN0 :
     * SendMService :
     * ReceiptPhoneN0 :
     * ReceiptMService :
     * ServiceType : 其它
     * Sign :
     * Money : 无
     */

    private String Bcode;//运单号
    private String SendCompany;//寄件单位
    private String SendAddress;//寄件地址
    private String SendContact;//寄件人姓名
    private String ReceiptCompany;//收件单位
    private String ReceiptAddress;//收件地址
    private String ReceiptContact;//收件联系人
    private String SendPhoneN0;//寄件人联系固定电话
    private String SendMService;//寄件人联系手机号码
    private String ReceiptPhoneN0;//收件人联系固定电话
    private String ReceiptMService;//收件人联系手机号码
    private String ServiceType;//服务方式
    private String Sign;//签回单
    private String PayType;//代收货款
    private String Money;//代收货款

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public String getBcode() {
        return Bcode;
    }

    public void setBcode(String Bcode) {
        this.Bcode = Bcode;
    }

    public String getSendCompany() {
        return SendCompany;
    }

    public void setSendCompany(String SendCompany) {
        this.SendCompany = SendCompany;
    }

    public String getSendAddress() {
        return SendAddress;
    }

    public void setSendAddress(String SendAddress) {
        this.SendAddress = SendAddress;
    }

    public String getSendContact() {
        return SendContact;
    }

    public void setSendContact(String SendContact) {
        this.SendContact = SendContact;
    }

    public String getReceiptCompany() {
        return ReceiptCompany;
    }

    public void setReceiptCompany(String ReceiptCompany) {
        this.ReceiptCompany = ReceiptCompany;
    }

    public String getReceiptAddress() {
        return ReceiptAddress;
    }

    public void setReceiptAddress(String ReceiptAddress) {
        this.ReceiptAddress = ReceiptAddress;
    }

    public String getReceiptContact() {
        return ReceiptContact;
    }

    public void setReceiptContact(String ReceiptContact) {
        this.ReceiptContact = ReceiptContact;
    }

    public String getSendPhoneN0() {
        return SendPhoneN0;
    }

    public void setSendPhoneN0(String SendPhoneN0) {
        this.SendPhoneN0 = SendPhoneN0;
    }

    public String getSendMService() {
        return SendMService;
    }

    public void setSendMService(String SendMService) {
        this.SendMService = SendMService;
    }

    public String getReceiptPhoneN0() {
        return ReceiptPhoneN0;
    }

    public void setReceiptPhoneN0(String ReceiptPhoneN0) {
        this.ReceiptPhoneN0 = ReceiptPhoneN0;
    }

    public String getReceiptMService() {
        return ReceiptMService;
    }

    public void setReceiptMService(String ReceiptMService) {
        this.ReceiptMService = ReceiptMService;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    public String getSign() {
        return Sign;
    }

    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String Money) {
        this.Money = Money;
    }
}
