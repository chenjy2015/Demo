package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 20/01/2018
 * @updated : 20/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsWayBillRouterDataBean implements Parcelable {
    /**
     * lastTime :
     * serviceMode : 当天达
     * sender :
     * originalSend : 厦门市翔安区
     * recipient :
     * uniqId : 0
     * updateTime : 2017-10-10 00:00
     * remark :
     * depart :
     * uniqShow : 02300086747
     * sendTime : 2017-10-10 00:00
     * getAdress : 北京市朝阳区
     */

    @SerializedName("lastTime")
    private String lastTime;
    @SerializedName("serviceMode")
    private String serviceMode;
    @SerializedName("sender")
    private String sender;
    @SerializedName("originalSend")
    private String originalSend;
    @SerializedName("recipient")
    private String recipient;
    @SerializedName("uniqId")
    private int uniqId;
    @SerializedName("updateTime")
    private String updateTime;
    @SerializedName("remark")
    private String remark;
    @SerializedName("depart")
    private String depart;
    @SerializedName("uniqShow")
    private String uniqShow;
    @SerializedName("sendTime")
    private String sendTime;
    @SerializedName("getAdress")
    private String getAdress;

    /**
     * view data
     */
    private RouterStatusViewType type;
    /**
     * 已签收，订单完成
     */
    private boolean isFinished;

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public RouterStatusViewType getType() {
        return type;
    }

    public void setType(RouterStatusViewType type) {
        this.type = type;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getOriginalSend() {
        return originalSend;
    }

    public void setOriginalSend(String originalSend) {
        this.originalSend = originalSend;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getUniqId() {
        return uniqId;
    }

    public void setUniqId(int uniqId) {
        this.uniqId = uniqId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getUniqShow() {
        return uniqShow;
    }

    public void setUniqShow(String uniqShow) {
        this.uniqShow = uniqShow;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getGetAdress() {
        return getAdress;
    }

    public void setGetAdress(String getAdress) {
        this.getAdress = getAdress;
    }

    public LogisticsWayBillRouterDataBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.lastTime);
        dest.writeString(this.serviceMode);
        dest.writeString(this.sender);
        dest.writeString(this.originalSend);
        dest.writeString(this.recipient);
        dest.writeInt(this.uniqId);
        dest.writeString(this.updateTime);
        dest.writeString(this.remark);
        dest.writeString(this.depart);
        dest.writeString(this.uniqShow);
        dest.writeString(this.sendTime);
        dest.writeString(this.getAdress);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeByte(this.isFinished ? (byte) 1 : (byte) 0);
    }

    protected LogisticsWayBillRouterDataBean(Parcel in) {
        this.lastTime = in.readString();
        this.serviceMode = in.readString();
        this.sender = in.readString();
        this.originalSend = in.readString();
        this.recipient = in.readString();
        this.uniqId = in.readInt();
        this.updateTime = in.readString();
        this.remark = in.readString();
        this.depart = in.readString();
        this.uniqShow = in.readString();
        this.sendTime = in.readString();
        this.getAdress = in.readString();
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : RouterStatusViewType.values()[tmpType];
        this.isFinished = in.readByte() != 0;
    }

    public static final Creator<LogisticsWayBillRouterDataBean> CREATOR = new Creator<LogisticsWayBillRouterDataBean>() {
        @Override
        public LogisticsWayBillRouterDataBean createFromParcel(Parcel source) {
            return new LogisticsWayBillRouterDataBean(source);
        }

        @Override
        public LogisticsWayBillRouterDataBean[] newArray(int size) {
            return new LogisticsWayBillRouterDataBean[size];
        }
    };
}
