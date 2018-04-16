package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 20/01/2018
 * @updated : 20/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsWayBillResultDataBean implements Parcelable {

    /**
     * waybill : 20762248956
     * abnormalReturns : 获取运单信息失败
     * recordNumber : 0
     * longitude :
     * latitude :
     * address :
     * totalFreight :
     * haveOrNotReceipt :
     * recipientPeople :
     * signingTime :
     * receiver :
     * haveOrNotReceipt1 : false
     * marketAssistant :
     * assistantPhone :
     * sendPeople :
     * sendPeoplePhone :
     * itemCount :
     * weight :
     * preSentDate :
     * permissions : false
     * signforNotes :
     * sfRemark :
     * haveOrNotInvoice : true
     * haveOrNotFlImage : false
     * orderCode :
     * pushMark : 0
     * sendMark : 0
     * isDevivery :
     * notreason :
     * planArriveTime :
     * rating : 0
     * presetEvaluation :
     * leaveRemark :
     * driverName :
     * markingTime :
     * data : []
     */

    @SerializedName("waybill")
    private String waybill;
    @SerializedName("abnormalReturns")
    private String abnormalReturns;
    @SerializedName("recordNumber")
    private int recordNumber;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("address")
    private String address;
    @SerializedName("totalFreight")
    private String totalFreight;
    @SerializedName("haveOrNotReceipt")
    private String haveOrNotReceipt;
    @SerializedName("recipientPeople")
    private String recipientPeople;
    @SerializedName("signingTime")
    private String signingTime;
    @SerializedName("receiver")
    private String receiver;
    @SerializedName("haveOrNotReceipt1")
    private boolean haveOrNotReceipt1;
    @SerializedName("marketAssistant")
    private String marketAssistant;
    @SerializedName("isReceiptPicture")
    private boolean isReceiptPicture;
    @SerializedName("assistantPhone")
    private String assistantPhone;
    @SerializedName("sendPeople")
    private String sendPeople;
    @SerializedName("sendPeoplePhone")
    private String sendPeoplePhone;
    @SerializedName("itemCount")
    private String itemCount;
    @SerializedName("weight")
    private String weight;
    @SerializedName("preSentDate")
    private String preSentDate;
    @SerializedName("permissions")
    private boolean permissions;
    @SerializedName("signforNotes")
    private byte[] signforNotes;
    @SerializedName("sfRemark")
    private String sfRemark;
    @SerializedName("haveOrNotInvoice")
    private boolean haveOrNotInvoice;
    @SerializedName("haveOrNotFlImage")
    private boolean haveOrNotFlImage;
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("pushMark")
    private int pushMark;
    @SerializedName("sendMark")
    private int sendMark; ////  指定派送标识(1 有 0  无 2 已经修改过
    @SerializedName("isDevivery")
    private boolean isDevivery;
    @SerializedName("notreason")
    private String notreason;
    @SerializedName("planArriveTime")
    private String planArriveTime;
    @SerializedName("rating")
    private int rating;
    @SerializedName("presetEvaluation")
    private String presetEvaluation;
    @SerializedName("leaveRemark")
    private String leaveRemark;
    @SerializedName("driverName")
    private String driverName;
    @SerializedName("markingTime")
    private String markingTime;
    @SerializedName("data")
    private List<LogisticsWayBillRouterDataBean> data;

    public boolean isReceiptPicture() {
        return isReceiptPicture;
    }

    public void setReceiptPicture(boolean receiptPicture) {
        isReceiptPicture = receiptPicture;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getAbnormalReturns() {
        return abnormalReturns;
    }

    public void setAbnormalReturns(String abnormalReturns) {
        this.abnormalReturns = abnormalReturns;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotalFreight() {
        return totalFreight;
    }

    public void setTotalFreight(String totalFreight) {
        this.totalFreight = totalFreight;
    }

    public String getHaveOrNotReceipt() {
        return haveOrNotReceipt;
    }

    public void setHaveOrNotReceipt(String haveOrNotReceipt) {
        this.haveOrNotReceipt = haveOrNotReceipt;
    }

    public String getRecipientPeople() {
        return recipientPeople;
    }

    public void setRecipientPeople(String recipientPeople) {
        this.recipientPeople = recipientPeople;
    }

    public String getSigningTime() {
        return signingTime;
    }

    public void setSigningTime(String signingTime) {
        this.signingTime = signingTime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public boolean isHaveOrNotReceipt1() {
        return haveOrNotReceipt1;
    }

    public void setHaveOrNotReceipt1(boolean haveOrNotReceipt1) {
        this.haveOrNotReceipt1 = haveOrNotReceipt1;
    }

    public String getMarketAssistant() {
        return marketAssistant;
    }

    public void setMarketAssistant(String marketAssistant) {
        this.marketAssistant = marketAssistant;
    }

    public String getAssistantPhone() {
        return assistantPhone;
    }

    public void setAssistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }

    public String getSendPeople() {
        return sendPeople;
    }

    public void setSendPeople(String sendPeople) {
        this.sendPeople = sendPeople;
    }

    public String getSendPeoplePhone() {
        return sendPeoplePhone;
    }

    public void setSendPeoplePhone(String sendPeoplePhone) {
        this.sendPeoplePhone = sendPeoplePhone;
    }

    public String getItemCount() {
        return itemCount;
    }

    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPreSentDate() {
        return preSentDate;
    }

    public void setPreSentDate(String preSentDate) {
        this.preSentDate = preSentDate;
    }

    public boolean isPermissions() {
        return permissions;
    }

    public void setPermissions(boolean permissions) {
        this.permissions = permissions;
    }

    public byte[] getSignforNotes() {
        return signforNotes;
    }

    public void setSignforNotes(byte[] signforNotes) {
        this.signforNotes = signforNotes;
    }

    public String getSfRemark() {
        return sfRemark;
    }

    public void setSfRemark(String sfRemark) {
        this.sfRemark = sfRemark;
    }

    public boolean isHaveOrNotInvoice() {
        return haveOrNotInvoice;
    }

    public void setHaveOrNotInvoice(boolean haveOrNotInvoice) {
        this.haveOrNotInvoice = haveOrNotInvoice;
    }

    public boolean isHaveOrNotFlImage() {
        return haveOrNotFlImage;
    }

    public void setHaveOrNotFlImage(boolean haveOrNotFlImage) {
        this.haveOrNotFlImage = haveOrNotFlImage;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getPushMark() {
        return pushMark;
    }

    public void setPushMark(int pushMark) {
        this.pushMark = pushMark;
    }

    public int getSendMark() {
        return sendMark;
    }

    public void setSendMark(int sendMark) {
        this.sendMark = sendMark;
    }

    public boolean isDevivery() {
        return isDevivery;
    }

    public void setDevivery(boolean devivery) {
        isDevivery = devivery;
    }

    public String getNotreason() {
        return notreason;
    }

    public void setNotreason(String notreason) {
        this.notreason = notreason;
    }

    public String getPlanArriveTime() {
        return planArriveTime;
    }

    public void setPlanArriveTime(String planArriveTime) {
        this.planArriveTime = planArriveTime;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPresetEvaluation() {
        return presetEvaluation;
    }

    public void setPresetEvaluation(String presetEvaluation) {
        this.presetEvaluation = presetEvaluation;
    }

    public String getLeaveRemark() {
        return leaveRemark;
    }

    public void setLeaveRemark(String leaveRemark) {
        this.leaveRemark = leaveRemark;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getMarkingTime() {
        return markingTime;
    }

    public void setMarkingTime(String markingTime) {
        this.markingTime = markingTime;
    }

    public List<LogisticsWayBillRouterDataBean> getData() {
        return data;
    }

    public void setData(List<LogisticsWayBillRouterDataBean> data) {
        this.data = data;
    }

    public LogisticsWayBillResultDataBean() {
    }

    @Override
    public int describeContents()                       { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags)   {
                                                            dest.writeString(this.waybill);
                                                            dest.writeString(this.abnormalReturns);
                                                            dest.writeInt(this.recordNumber);
                                                            dest.writeString(this.longitude);
                                                            dest.writeString(this.latitude);
                                                            dest.writeString(this.address);
                                                            dest.writeString(this.totalFreight);
                                                            dest.writeString(this.haveOrNotReceipt);
                                                            dest.writeString(this.recipientPeople);
                                                            dest.writeString(this.signingTime);
                                                            dest.writeString(this.receiver);
                                                            dest.writeByte(this.haveOrNotReceipt1 ? (byte) 1 : (byte) 0);
                                                            dest.writeString(this.marketAssistant);
                                                            dest.writeByte(this.isReceiptPicture ? (byte) 1 : (byte) 0);
                                                            dest.writeString(this.assistantPhone);
                                                            dest.writeString(this.sendPeople);
                                                            dest.writeString(this.sendPeoplePhone);
                                                            dest.writeString(this.itemCount);
                                                            dest.writeString(this.weight);
                                                            dest.writeString(this.preSentDate);
                                                            dest.writeByte(this.permissions ? (byte) 1 : (byte) 0);
                                                            dest.writeByteArray(this.signforNotes);
                                                            dest.writeString(this.sfRemark);
                                                            dest.writeByte(this.haveOrNotInvoice ? (byte) 1 : (byte) 0);
                                                            dest.writeByte(this.haveOrNotFlImage ? (byte) 1 : (byte) 0);
                                                            dest.writeString(this.orderCode);
                                                            dest.writeInt(this.pushMark);
                                                            dest.writeInt(this.sendMark);
                                                            dest.writeByte(this.isDevivery ? (byte) 1 : (byte) 0);
                                                            dest.writeString(this.notreason);
                                                            dest.writeString(this.planArriveTime);
                                                            dest.writeInt(this.rating);
                                                            dest.writeString(this.presetEvaluation);
                                                            dest.writeString(this.leaveRemark);
                                                            dest.writeString(this.driverName);
                                                            dest.writeString(this.markingTime);
                                                            dest.writeTypedList(this.data);
                                                        }

    protected LogisticsWayBillResultDataBean(Parcel in) {
                                                            this.waybill = in.readString();
                                                            this.abnormalReturns = in.readString();
                                                            this.recordNumber = in.readInt();
                                                            this.longitude = in.readString();
                                                            this.latitude = in.readString();
                                                            this.address = in.readString();
                                                            this.totalFreight = in.readString();
                                                            this.haveOrNotReceipt = in.readString();
                                                            this.recipientPeople = in.readString();
                                                            this.signingTime = in.readString();
                                                            this.receiver = in.readString();
                                                            this.haveOrNotReceipt1 = in.readByte() != 0;
                                                            this.marketAssistant = in.readString();
                                                            this.isReceiptPicture = in.readByte() != 0;
                                                            this.assistantPhone = in.readString();
                                                            this.sendPeople = in.readString();
                                                            this.sendPeoplePhone = in.readString();
                                                            this.itemCount = in.readString();
                                                            this.weight = in.readString();
                                                            this.preSentDate = in.readString();
                                                            this.permissions = in.readByte() != 0;
                                                            this.signforNotes = in.createByteArray();
                                                            this.sfRemark = in.readString();
                                                            this.haveOrNotInvoice = in.readByte() != 0;
                                                            this.haveOrNotFlImage = in.readByte() != 0;
                                                            this.orderCode = in.readString();
                                                            this.pushMark = in.readInt();
                                                            this.sendMark = in.readInt();
                                                            this.isDevivery = in.readByte() != 0;
                                                            this.notreason = in.readString();
                                                            this.planArriveTime = in.readString();
                                                            this.rating = in.readInt();
                                                            this.presetEvaluation = in.readString();
                                                            this.leaveRemark = in.readString();
                                                            this.driverName = in.readString();
                                                            this.markingTime = in.readString();
                                                            this.data = in.createTypedArrayList(LogisticsWayBillRouterDataBean.CREATOR);
                                                        }

    public static final Creator<LogisticsWayBillResultDataBean> CREATOR = new Creator<LogisticsWayBillResultDataBean>() {
        @Override
        public LogisticsWayBillResultDataBean createFromParcel(Parcel source) {return new LogisticsWayBillResultDataBean(source);}

        @Override
        public LogisticsWayBillResultDataBean[] newArray(int size) {return new LogisticsWayBillResultDataBean[size];}
    };
}
