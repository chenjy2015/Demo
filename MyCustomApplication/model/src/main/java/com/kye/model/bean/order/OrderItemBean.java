package com.kye.model.bean.order;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 16/01/2018
 * @updated : 16/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class OrderItemBean implements Parcelable {

    /**
     * isCanUP : 1
     * carX :
     * carY :
     * custX :
     * custY :
     * orderCode : XD1712-0010013
     * sender : 贺金山测测哦
     * address : 上海上海市嘉定区华亭镇北新村高石公路2439号6栋
     * goodTime : 2017-09-11 20:20
     * orderState : 订单处理中
     * sendCompanyCode : 02199167216
     * orderTelphone : 18681438009
     * number : 10
     * weight : 20
     * remark : abcdef
     * orderTime : 2017-09-11 10:04
     * commodities : 测试
     * sendCompany : 上海云仓货运代理有限公司
     * telephone :
     * assistant :
     * recorder : 云仓送货
     * totalPoll : 1
     * qpDriver :
     * qpDriverPhone :
     * qpPoint :
     * destionation1 :
     * serviceMode1 : 隔日达
     * wight1 :
     * destionation2 :
     * serviceMode2 :
     * wight2 :
     * destionation3 :
     * serviceMode3 :
     * wight3 :
     * temporaryAddress : 江西省赣州市兴国县龙口镇丰溪村
     * getTelphone :
     * goodsState : 0
     * goodsStateDate : 2017-09-11 10:04
     * pickupCount :
     * isArriveCurrentDay : 0
     * codeSign : 0
     * waybill :
     * marketer : 唐美
     * scoreCode : 5
     * pushLogo : 0
     */

    @SerializedName("isCanUP")
    private String isCanUP;
    @SerializedName("carX")
    private String carX;
    @SerializedName("carY")
    private String carY;
    @SerializedName("custX")
    private String custX;
    @SerializedName("custY")
    private String custY;
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("sender")
    private String sender;
    @SerializedName("address")
    private String address;
    @SerializedName("goodTime")
    private String goodTime;
    @SerializedName("orderState")
    private String orderState;
    @SerializedName("sendCompanyCode")
    private String sendCompanyCode;
    @SerializedName("orderTelphone")
    private String orderTelphone;
    @SerializedName("number")
    private String number;
    @SerializedName("weight")
    private String weight;
    @SerializedName("remark")
    private String remark;
    @SerializedName("orderTime")
    private String orderTime;
    @SerializedName("commodities")
    private String commodities;
    @SerializedName("sendCompany")
    private String sendCompany;
    @SerializedName("telephone")
    private String telephone;
    @SerializedName("assistant")
    private String assistant;
    @SerializedName("recorder")
    private String recorder;
    @SerializedName("totalPoll")
    private String totalPoll;
    @SerializedName("qpDriver")
    private String qpDriver;
    @SerializedName("qpDriverPhone")
    private String qpDriverPhone;
    @SerializedName("qpPoint")
    private String qpPoint;
    @SerializedName("destionation1")
    private String destionation1;
    @SerializedName("serviceMode1")
    private String serviceMode1;
    @SerializedName("wight1")
    private String wight1;
    @SerializedName("destionation2")
    private String destionation2;
    @SerializedName("serviceMode2")
    private String serviceMode2;
    @SerializedName("wight2")
    private String wight2;
    @SerializedName("destionation3")
    private String destionation3;
    @SerializedName("serviceMode3")
    private String serviceMode3;
    @SerializedName("wight3")
    private String wight3;
    @SerializedName("temporaryAddress")
    private String temporaryAddress;
    @SerializedName("getTelphone")
    private String getTelphone;
    @SerializedName("goodsState")
    private String goodsState;
    @SerializedName("goodsStateDate")
    private String goodsStateDate;
    @SerializedName("pickupCount")
    private String pickupCount;
    @SerializedName("isArriveCurrentDay")
    private String isArriveCurrentDay;
    @SerializedName("codeSign")
    private String codeSign;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("marketer")
    private String marketer;
    @SerializedName("scoreCode")
    private String scoreCode;
    @SerializedName("pushLogo")
    private int pushLogo;

    public String getIsCanUP() {
        return isCanUP;
    }

    public void setIsCanUP(String isCanUP) {
        this.isCanUP = isCanUP;
    }

    public String getCarX() {
        return carX;
    }

    public void setCarX(String carX) {
        this.carX = carX;
    }

    public String getCarY() {
        return carY;
    }

    public void setCarY(String carY) {
        this.carY = carY;
    }

    public String getCustX() {
        return custX;
    }

    public void setCustX(String custX) {
        this.custX = custX;
    }

    public String getCustY() {
        return custY;
    }

    public void setCustY(String custY) {
        this.custY = custY;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(String goodTime) {
        this.goodTime = goodTime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getSendCompanyCode() {
        return sendCompanyCode;
    }

    public void setSendCompanyCode(String sendCompanyCode) {
        this.sendCompanyCode = sendCompanyCode;
    }

    public String getOrderTelphone() {
        return orderTelphone;
    }

    public void setOrderTelphone(String orderTelphone) {
        this.orderTelphone = orderTelphone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getCommodities() {
        return commodities;
    }

    public void setCommodities(String commodities) {
        this.commodities = commodities;
    }

    public String getSendCompany() {
        return sendCompany;
    }

    public void setSendCompany(String sendCompany) {
        this.sendCompany = sendCompany;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public String getTotalPoll() {
        return totalPoll;
    }

    public void setTotalPoll(String totalPoll) {
        this.totalPoll = totalPoll;
    }

    public String getQpDriver() {
        return qpDriver;
    }

    public void setQpDriver(String qpDriver) {
        this.qpDriver = qpDriver;
    }

    public String getQpDriverPhone() {
        return qpDriverPhone;
    }

    public void setQpDriverPhone(String qpDriverPhone) {
        this.qpDriverPhone = qpDriverPhone;
    }

    public String getQpPoint() {
        return qpPoint;
    }

    public void setQpPoint(String qpPoint) {
        this.qpPoint = qpPoint;
    }

    public String getDestionation1() {
        return destionation1;
    }

    public void setDestionation1(String destionation1) {
        this.destionation1 = destionation1;
    }

    public String getServiceMode1() {
        return serviceMode1;
    }

    public void setServiceMode1(String serviceMode1) {
        this.serviceMode1 = serviceMode1;
    }

    public String getWight1() {
        return wight1;
    }

    public void setWight1(String wight1) {
        this.wight1 = wight1;
    }

    public String getDestionation2() {
        return destionation2;
    }

    public void setDestionation2(String destionation2) {
        this.destionation2 = destionation2;
    }

    public String getServiceMode2() {
        return serviceMode2;
    }

    public void setServiceMode2(String serviceMode2) {
        this.serviceMode2 = serviceMode2;
    }

    public String getWight2() {
        return wight2;
    }

    public void setWight2(String wight2) {
        this.wight2 = wight2;
    }

    public String getDestionation3() {
        return destionation3;
    }

    public void setDestionation3(String destionation3) {
        this.destionation3 = destionation3;
    }

    public String getServiceMode3() {
        return serviceMode3;
    }

    public void setServiceMode3(String serviceMode3) {
        this.serviceMode3 = serviceMode3;
    }

    public String getWight3() {
        return wight3;
    }

    public void setWight3(String wight3) {
        this.wight3 = wight3;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public String getGetTelphone() {
        return getTelphone;
    }

    public void setGetTelphone(String getTelphone) {
        this.getTelphone = getTelphone;
    }

    public String getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(String goodsState) {
        this.goodsState = goodsState;
    }

    public String getGoodsStateDate() {
        return goodsStateDate;
    }

    public void setGoodsStateDate(String goodsStateDate) {
        this.goodsStateDate = goodsStateDate;
    }

    public String getPickupCount() {
        return pickupCount;
    }

    public void setPickupCount(String pickupCount) {
        this.pickupCount = pickupCount;
    }

    public String getIsArriveCurrentDay() {
        return isArriveCurrentDay;
    }

    public void setIsArriveCurrentDay(String isArriveCurrentDay) {
        this.isArriveCurrentDay = isArriveCurrentDay;
    }

    public String getCodeSign() {
        return codeSign;
    }

    public void setCodeSign(String codeSign) {
        this.codeSign = codeSign;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getMarketer() {
        return marketer;
    }

    public void setMarketer(String marketer) {
        this.marketer = marketer;
    }

    public String getScoreCode() {
        return scoreCode;
    }

    public void setScoreCode(String scoreCode) {
        this.scoreCode = scoreCode;
    }

    public int getPushLogo() {
        return pushLogo;
    }

    public void setPushLogo(int pushLogo) {
        this.pushLogo = pushLogo;
    }

    public OrderItemBean() {
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.isCanUP);
        dest.writeString(this.carX);
        dest.writeString(this.carY);
        dest.writeString(this.custX);
        dest.writeString(this.custY);
        dest.writeString(this.orderCode);
        dest.writeString(this.sender);
        dest.writeString(this.address);
        dest.writeString(this.goodTime);
        dest.writeString(this.orderState);
        dest.writeString(this.sendCompanyCode);
        dest.writeString(this.orderTelphone);
        dest.writeString(this.number);
        dest.writeString(this.weight);
        dest.writeString(this.remark);
        dest.writeString(this.orderTime);
        dest.writeString(this.commodities);
        dest.writeString(this.sendCompany);
        dest.writeString(this.telephone);
        dest.writeString(this.assistant);
        dest.writeString(this.recorder);
        dest.writeString(this.totalPoll);
        dest.writeString(this.qpDriver);
        dest.writeString(this.qpDriverPhone);
        dest.writeString(this.qpPoint);
        dest.writeString(this.destionation1);
        dest.writeString(this.serviceMode1);
        dest.writeString(this.wight1);
        dest.writeString(this.destionation2);
        dest.writeString(this.serviceMode2);
        dest.writeString(this.wight2);
        dest.writeString(this.destionation3);
        dest.writeString(this.serviceMode3);
        dest.writeString(this.wight3);
        dest.writeString(this.temporaryAddress);
        dest.writeString(this.getTelphone);
        dest.writeString(this.goodsState);
        dest.writeString(this.goodsStateDate);
        dest.writeString(this.pickupCount);
        dest.writeString(this.isArriveCurrentDay);
        dest.writeString(this.codeSign);
        dest.writeString(this.waybill);
        dest.writeString(this.marketer);
        dest.writeString(this.scoreCode);
        dest.writeInt(this.pushLogo);
    }

    protected OrderItemBean(Parcel in) {
        this.isCanUP = in.readString();
        this.carX = in.readString();
        this.carY = in.readString();
        this.custX = in.readString();
        this.custY = in.readString();
        this.orderCode = in.readString();
        this.sender = in.readString();
        this.address = in.readString();
        this.goodTime = in.readString();
        this.orderState = in.readString();
        this.sendCompanyCode = in.readString();
        this.orderTelphone = in.readString();
        this.number = in.readString();
        this.weight = in.readString();
        this.remark = in.readString();
        this.orderTime = in.readString();
        this.commodities = in.readString();
        this.sendCompany = in.readString();
        this.telephone = in.readString();
        this.assistant = in.readString();
        this.recorder = in.readString();
        this.totalPoll = in.readString();
        this.qpDriver = in.readString();
        this.qpDriverPhone = in.readString();
        this.qpPoint = in.readString();
        this.destionation1 = in.readString();
        this.serviceMode1 = in.readString();
        this.wight1 = in.readString();
        this.destionation2 = in.readString();
        this.serviceMode2 = in.readString();
        this.wight2 = in.readString();
        this.destionation3 = in.readString();
        this.serviceMode3 = in.readString();
        this.wight3 = in.readString();
        this.temporaryAddress = in.readString();
        this.getTelphone = in.readString();
        this.goodsState = in.readString();
        this.goodsStateDate = in.readString();
        this.pickupCount = in.readString();
        this.isArriveCurrentDay = in.readString();
        this.codeSign = in.readString();
        this.waybill = in.readString();
        this.marketer = in.readString();
        this.scoreCode = in.readString();
        this.pushLogo = in.readInt();
    }

    public static final Creator<OrderItemBean> CREATOR = new Creator<OrderItemBean>() {
        @Override
        public OrderItemBean createFromParcel(Parcel source) {
            return new OrderItemBean(source);
        }

        @Override
        public OrderItemBean[] newArray(int size) {
            return new OrderItemBean[size];
        }
    };
}
