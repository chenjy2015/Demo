package com.kye.model.bean.notice;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.kye.model.base.BaseItem;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/12/2017
 * @updated : 27/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     通知详情基本信息，标题，发表时间，阅读数等
 */

public class NotificationDetailBasicInfoBean implements BaseItem, Parcelable {


    /**
     * msgType : 3
     * smallImg : http://res.ky-express.com/h5/comm/notice.png
     * url :
     * lastModifyUser :
     * msgContent : 深圳跨越
     * phoneNumber : 17817778962
     * msgTitle : bug
     * imageUrl : http://172.20.2.56/h5/img/1514949935024imageIOS0.jpg|http://172.20.2.56/h5/img/1514949935025imageIOS1.jpg|http://172.20.2.56/h5/img/1514949935026imageIOS2.jpg
     * publisher : 跨越速运
     * auditPassed : 1
     * id : 1808
     * lastModifyDate : 2018-01-03 11:25:35
     * createDate : 2018-01-03 11:25:35
     */

    @SerializedName("msgType")
    private String msgType;
    @SerializedName("smallImg")
    private String smallImg;
    @SerializedName("url")
    private String url;
    @SerializedName("lastModifyUser")
    private String lastModifyUser;
    @SerializedName("msgContent")
    private String msgContent;
    @SerializedName("phoneNumber")
    private String phoneNumber;
    @SerializedName("msgTitle")
    private String msgTitle;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("auditPassed")
    private int auditPassed;
    @SerializedName("id")
    private int id;
    @SerializedName("lastModifyDate")
    private String lastModifyDate;
    @SerializedName("createDate")
    private String createDate;
    @SerializedName("pv")
    private String pv;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(String smallImg) {
        this.smallImg = smallImg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(String lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getAuditPassed() {
        return auditPassed;
    }

    public void setAuditPassed(int auditPassed) {
        this.auditPassed = auditPassed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.msgType);
        dest.writeString(this.smallImg);
        dest.writeString(this.url);
        dest.writeString(this.lastModifyUser);
        dest.writeString(this.msgContent);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.msgTitle);
        dest.writeString(this.imageUrl);
        dest.writeString(this.publisher);
        dest.writeInt(this.auditPassed);
        dest.writeInt(this.id);
        dest.writeString(this.lastModifyDate);
        dest.writeString(this.createDate);
        dest.writeString(this.pv);
    }

    public NotificationDetailBasicInfoBean() {
    }

    protected NotificationDetailBasicInfoBean(Parcel in) {
        this.msgType = in.readString();
        this.smallImg = in.readString();
        this.url = in.readString();
        this.lastModifyUser = in.readString();
        this.msgContent = in.readString();
        this.phoneNumber = in.readString();
        this.msgTitle = in.readString();
        this.imageUrl = in.readString();
        this.publisher = in.readString();
        this.auditPassed = in.readInt();
        this.id = in.readInt();
        this.lastModifyDate = in.readString();
        this.createDate = in.readString();
        this.pv = in.readString();
    }

    public static final Parcelable.Creator<NotificationDetailBasicInfoBean> CREATOR = new Parcelable.Creator<NotificationDetailBasicInfoBean>() {
        @Override
        public NotificationDetailBasicInfoBean createFromParcel(Parcel source) {
            return new NotificationDetailBasicInfoBean(source);
        }

        @Override
        public NotificationDetailBasicInfoBean[] newArray(int size) {
            return new NotificationDetailBasicInfoBean[size];
        }
    };
}
