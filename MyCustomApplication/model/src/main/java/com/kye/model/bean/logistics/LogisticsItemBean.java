package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 17/01/2018
 * @updated : 17/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     运单列表
 */

public class LogisticsItemBean implements Parcelable {

    /**
     * trackRecord :
     * senderAddress : 新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路
     * receiptRecipient :
     * timeArrival :
     * trackRecord7 : 签收人:李四
     * trackRecord4 :
     * latitude : 22.68997
     * trackRecord5 :
     * trackRecord2 : 到达乌鲁木齐点部正在分拣,准备送往始发机场
     * trackRecord3 :
     * receiptPhone : 18657325018
     * trackRecord1 : 到达客户处,待取货
     * type : 0
     * urge : 1
     * sendAdress : 取货完毕,准备送往西安雁塔点部
     * score :
     * waybill : 20762239091
     * receiptCall : 075584526548*010
     * paymentCompany : 接口部测试
     * ratingStatus : 0
     * waybillSend : 广州跨越
     * longitude : 113.80972
     * timeGetPoint :
     * receiptCompanyCode :
     * timeDelivery :
     * sfRemark :
     * sendCheck :
     * timeLoading :
     * rush : 0
     * signingTime :
     * sendTime : 2017-12-04 12:00
     * itemCount : 1
     * signPeople : 李四
     * receivesAddress : 上海上海市松江区车墩镇华阳居委会松江区车墩镇香径路169号2栋3楼
     * sendCarNumber :
     * productCode :
     * checkIn : 2017-11-15 10:04
     * mobilePhone :
     * serviceMode : 隔日达
     * sendCompanyCode : 接口部测试
     * sender : 张三
     * recipient : 李四
     * orderCode : XD1711-0040320
     * haveOrNotReceipt : 有
     * vipshopCode :
     * getAdress :
     */

    @SerializedName("trackRecord")
    private String trackRecord;
    @SerializedName("senderAddress")
    private String senderAddress;
    @SerializedName("receiptRecipient")
    private String receiptRecipient;
    @SerializedName("timeArrival")
    private String timeArrival;
    @SerializedName("trackRecord7")
    private String trackRecord7;
    @SerializedName("trackRecord4")
    private String trackRecord4;
    @SerializedName("latitude")
    private double latitude;
    @SerializedName("trackRecord5")
    private String trackRecord5;
    @SerializedName("trackRecord2")
    private String trackRecord2;
    @SerializedName("trackRecord3")
    private String trackRecord3;
    @SerializedName("receiptPhone")
    private String receiptPhone;
    @SerializedName("trackRecord1")
    private String trackRecord1;
    @SerializedName("type")
    private int type;
    @SerializedName("urge")
    private String urge;
    @SerializedName("sendAdress")
    private String sendAdress;
    @SerializedName("score")
    private String score;
    @SerializedName("waybill")
    private String waybill;
    @SerializedName("receiptCall")
    private String receiptCall;
    @SerializedName("paymentCompany")
    private String paymentCompany;
    @SerializedName("ratingStatus")
    private String ratingStatus;
    @SerializedName("waybillSend")
    private String waybillSend;
    @SerializedName("longitude")
    private double longitude;
    @SerializedName("timeGetPoint")
    private String timeGetPoint;
    @SerializedName("receiptCompanyCode")
    private String receiptCompanyCode;
    @SerializedName("timeDelivery")
    private String timeDelivery;
    @SerializedName("sfRemark")
    private String sfRemark;
    @SerializedName("sendCheck")
    private String sendCheck;
    @SerializedName("timeLoading")
    private String timeLoading;
    @SerializedName("rush")
    private int rush;
    @SerializedName("signingTime")
    private String signingTime;
    @SerializedName("sendTime")
    private String sendTime;
    @SerializedName("itemCount")
    private int itemCount;
    @SerializedName("signPeople")
    private String signPeople;
    @SerializedName("receivesAddress")
    private String receivesAddress;
    @SerializedName("sendCarNumber")
    private String sendCarNumber;
    @SerializedName("productCode")
    private String productCode;
    @SerializedName("checkIn")
    private String checkIn;
    @SerializedName("mobilePhone")
    private String mobilePhone;
    @SerializedName("serviceMode")
    private String serviceMode;
    @SerializedName("sendCompanyCode")
    private String sendCompanyCode;
    @SerializedName("sender")
    private String sender;
    @SerializedName("recipient")
    private String recipient;
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("haveOrNotReceipt")
    private String haveOrNotReceipt;
    @SerializedName("vipshopCode")
    private String vipshopCode;
    @SerializedName("getAdress")
    private String getAdress;
    @SerializedName("queryState")
    private int queryState;

    public int getQueryState() {
        return queryState;
    }

    public void setQueryState(int queryState) {
        this.queryState = queryState;
    }

    public String getTrackRecord() {
        return trackRecord;
    }

    public void setTrackRecord(String trackRecord) {
        this.trackRecord = trackRecord;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiptRecipient() {
        return receiptRecipient;
    }

    public void setReceiptRecipient(String receiptRecipient) {
        this.receiptRecipient = receiptRecipient;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public String getTrackRecord7() {
        return trackRecord7;
    }

    public void setTrackRecord7(String trackRecord7) {
        this.trackRecord7 = trackRecord7;
    }

    public String getTrackRecord4() {
        return trackRecord4;
    }

    public void setTrackRecord4(String trackRecord4) {
        this.trackRecord4 = trackRecord4;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getTrackRecord5() {
        return trackRecord5;
    }

    public void setTrackRecord5(String trackRecord5) {
        this.trackRecord5 = trackRecord5;
    }

    public String getTrackRecord2() {
        return trackRecord2;
    }

    public void setTrackRecord2(String trackRecord2) {
        this.trackRecord2 = trackRecord2;
    }

    public String getTrackRecord3() {
        return trackRecord3;
    }

    public void setTrackRecord3(String trackRecord3) {
        this.trackRecord3 = trackRecord3;
    }

    public String getReceiptPhone() {
        return receiptPhone;
    }

    public void setReceiptPhone(String receiptPhone) {
        this.receiptPhone = receiptPhone;
    }

    public String getTrackRecord1() {
        return trackRecord1;
    }

    public void setTrackRecord1(String trackRecord1) {
        this.trackRecord1 = trackRecord1;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrge() {
        return urge;
    }

    public void setUrge(String urge) {
        this.urge = urge;
    }

    public String getSendAdress() {
        return sendAdress;
    }

    public void setSendAdress(String sendAdress) {
        this.sendAdress = sendAdress;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getReceiptCall() {
        return receiptCall;
    }

    public void setReceiptCall(String receiptCall) {
        this.receiptCall = receiptCall;
    }

    public String getPaymentCompany() {
        return paymentCompany;
    }

    public void setPaymentCompany(String paymentCompany) {
        this.paymentCompany = paymentCompany;
    }

    public String getRatingStatus() {
        return ratingStatus;
    }

    public void setRatingStatus(String ratingStatus) {
        this.ratingStatus = ratingStatus;
    }

    public String getWaybillSend() {
        return waybillSend;
    }

    public void setWaybillSend(String waybillSend) {
        this.waybillSend = waybillSend;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimeGetPoint() {
        return timeGetPoint;
    }

    public void setTimeGetPoint(String timeGetPoint) {
        this.timeGetPoint = timeGetPoint;
    }

    public String getReceiptCompanyCode() {
        return receiptCompanyCode;
    }

    public void setReceiptCompanyCode(String receiptCompanyCode) {
        this.receiptCompanyCode = receiptCompanyCode;
    }

    public String getTimeDelivery() {
        return timeDelivery;
    }

    public void setTimeDelivery(String timeDelivery) {
        this.timeDelivery = timeDelivery;
    }

    public String getSfRemark() {
        return sfRemark;
    }

    public void setSfRemark(String sfRemark) {
        this.sfRemark = sfRemark;
    }

    public String getSendCheck() {
        return sendCheck;
    }

    public void setSendCheck(String sendCheck) {
        this.sendCheck = sendCheck;
    }

    public String getTimeLoading() {
        return timeLoading;
    }

    public void setTimeLoading(String timeLoading) {
        this.timeLoading = timeLoading;
    }

    public int getRush() {
        return rush;
    }

    public void setRush(int rush) {
        this.rush = rush;
    }

    public String getSigningTime() {
        return signingTime;
    }

    public void setSigningTime(String signingTime) {
        this.signingTime = signingTime;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getSignPeople() {
        return signPeople;
    }

    public void setSignPeople(String signPeople) {
        this.signPeople = signPeople;
    }

    public String getReceivesAddress() {
        return receivesAddress;
    }

    public void setReceivesAddress(String receivesAddress) {
        this.receivesAddress = receivesAddress;
    }

    public String getSendCarNumber() {
        return sendCarNumber;
    }

    public void setSendCarNumber(String sendCarNumber) {
        this.sendCarNumber = sendCarNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
    }

    public String getSendCompanyCode() {
        return sendCompanyCode;
    }

    public void setSendCompanyCode(String sendCompanyCode) {
        this.sendCompanyCode = sendCompanyCode;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getHaveOrNotReceipt() {
        return haveOrNotReceipt;
    }

    public void setHaveOrNotReceipt(String haveOrNotReceipt) {
        this.haveOrNotReceipt = haveOrNotReceipt;
    }

    public String getVipshopCode() {
        return vipshopCode;
    }

    public void setVipshopCode(String vipshopCode) {
        this.vipshopCode = vipshopCode;
    }

    public String getGetAdress() {
        return getAdress;
    }

    public void setGetAdress(String getAdress) {
        this.getAdress = getAdress;
    }

    public LogisticsItemBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.trackRecord);
        dest.writeString(this.senderAddress);
        dest.writeString(this.receiptRecipient);
        dest.writeString(this.timeArrival);
        dest.writeString(this.trackRecord7);
        dest.writeString(this.trackRecord4);
        dest.writeDouble(this.latitude);
        dest.writeString(this.trackRecord5);
        dest.writeString(this.trackRecord2);
        dest.writeString(this.trackRecord3);
        dest.writeString(this.receiptPhone);
        dest.writeString(this.trackRecord1);
        dest.writeInt(this.type);
        dest.writeString(this.urge);
        dest.writeString(this.sendAdress);
        dest.writeString(this.score);
        dest.writeString(this.waybill);
        dest.writeString(this.receiptCall);
        dest.writeString(this.paymentCompany);
        dest.writeString(this.ratingStatus);
        dest.writeString(this.waybillSend);
        dest.writeDouble(this.longitude);
        dest.writeString(this.timeGetPoint);
        dest.writeString(this.receiptCompanyCode);
        dest.writeString(this.timeDelivery);
        dest.writeString(this.sfRemark);
        dest.writeString(this.sendCheck);
        dest.writeString(this.timeLoading);
        dest.writeInt(this.rush);
        dest.writeString(this.signingTime);
        dest.writeString(this.sendTime);
        dest.writeInt(this.itemCount);
        dest.writeString(this.signPeople);
        dest.writeString(this.receivesAddress);
        dest.writeString(this.sendCarNumber);
        dest.writeString(this.productCode);
        dest.writeString(this.checkIn);
        dest.writeString(this.mobilePhone);
        dest.writeString(this.serviceMode);
        dest.writeString(this.sendCompanyCode);
        dest.writeString(this.sender);
        dest.writeString(this.recipient);
        dest.writeString(this.orderCode);
        dest.writeString(this.haveOrNotReceipt);
        dest.writeString(this.vipshopCode);
        dest.writeString(this.getAdress);
        dest.writeInt(this.queryState);
    }

    protected LogisticsItemBean(Parcel in) {
        this.trackRecord = in.readString();
        this.senderAddress = in.readString();
        this.receiptRecipient = in.readString();
        this.timeArrival = in.readString();
        this.trackRecord7 = in.readString();
        this.trackRecord4 = in.readString();
        this.latitude = in.readDouble();
        this.trackRecord5 = in.readString();
        this.trackRecord2 = in.readString();
        this.trackRecord3 = in.readString();
        this.receiptPhone = in.readString();
        this.trackRecord1 = in.readString();
        this.type = in.readInt();
        this.urge = in.readString();
        this.sendAdress = in.readString();
        this.score = in.readString();
        this.waybill = in.readString();
        this.receiptCall = in.readString();
        this.paymentCompany = in.readString();
        this.ratingStatus = in.readString();
        this.waybillSend = in.readString();
        this.longitude = in.readDouble();
        this.timeGetPoint = in.readString();
        this.receiptCompanyCode = in.readString();
        this.timeDelivery = in.readString();
        this.sfRemark = in.readString();
        this.sendCheck = in.readString();
        this.timeLoading = in.readString();
        this.rush = in.readInt();
        this.signingTime = in.readString();
        this.sendTime = in.readString();
        this.itemCount = in.readInt();
        this.signPeople = in.readString();
        this.receivesAddress = in.readString();
        this.sendCarNumber = in.readString();
        this.productCode = in.readString();
        this.checkIn = in.readString();
        this.mobilePhone = in.readString();
        this.serviceMode = in.readString();
        this.sendCompanyCode = in.readString();
        this.sender = in.readString();
        this.recipient = in.readString();
        this.orderCode = in.readString();
        this.haveOrNotReceipt = in.readString();
        this.vipshopCode = in.readString();
        this.getAdress = in.readString();
        this.queryState = in.readInt();
    }

    public static final Creator<LogisticsItemBean> CREATOR = new Creator<LogisticsItemBean>() {
        @Override
        public LogisticsItemBean createFromParcel(Parcel source) {
            return new LogisticsItemBean(source);
        }

        @Override
        public LogisticsItemBean[] newArray(int size) {
            return new LogisticsItemBean[size];
        }
    };
}
