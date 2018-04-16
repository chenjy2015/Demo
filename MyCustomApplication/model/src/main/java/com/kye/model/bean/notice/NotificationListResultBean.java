package com.kye.model.bean.notice;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/01/2018
 * @updated : 06/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class NotificationListResultBean implements Parcelable {

    /**
     * datas : [{"auditPassed":1,"createDate":"12-26 11:35","htmlAccessUrl":"1787","id":1787,"imageUrl":"http://172.20.2.56/h5/img/1514259309733imageIOS0.jpg|http://172.20.2.56/h5/img/1514259309733imageIOS1.jpg","isNew":0,"isRead":"1","lastModifyDate":"2017-12-26 11:35:09","msgContent":"承诺你才能吃","msgTitle":"1承诺并才能吃","phoneNumber":"fq1w","phoneNumber_V2":"eePIottiXDhir8pM5n/frw==","publisher":"跨越速运","unReadNum":"0","url":"whsq"}]
     * recordCount : 19
     */

    @SerializedName("recordCount")
    private int recordCount;
    @SerializedName("datas")
    private List<NotificationListItemBean> datas;

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<NotificationListItemBean> getDatas() {
        return datas;
    }

    public void setDatas(List<NotificationListItemBean> datas) {
        this.datas = datas;
    }

    public static class NotificationListItemBean implements Parcelable {
        /**
         * auditPassed : 1
         * createDate : 12-26 11:35
         * htmlAccessUrl : 1787
         * id : 1787
         * imageUrl : http://172.20.2.56/h5/img/1514259309733imageIOS0.jpg|http://172.20.2.56/h5/img/1514259309733imageIOS1.jpg
         * isNew : 0
         * isRead : 1
         * lastModifyDate : 2017-12-26 11:35:09
         * msgContent : 承诺你才能吃
         * msgTitle : 1承诺并才能吃
         * phoneNumber : fq1w
         * phoneNumber_V2 : eePIottiXDhir8pM5n/frw==
         * publisher : 跨越速运
         * unReadNum : 0
         * url : whsq
         */

        @SerializedName("auditPassed")
        private int auditPassed;
        @SerializedName("createDate")
        private String createDate;
        @SerializedName("htmlAccessUrl")
        private String htmlAccessUrl;
        @SerializedName("id")
        private int id;
        @SerializedName("imageUrl")
        private String imageUrl;
        @SerializedName("isNew")
        private int isNew;
        @SerializedName("isRead")
        private String isRead;
        @SerializedName("lastModifyDate")
        private String lastModifyDate;
        @SerializedName("msgContent")
        private String msgContent;
        @SerializedName("msgTitle")
        private String msgTitle;
        @SerializedName("phoneNumber")
        private String phoneNumber;
        @SerializedName("phoneNumber_V2")
        private String phoneNumberV2;
        @SerializedName("publisher")
        private String publisher;
        @SerializedName("unReadNum")
        private String unReadNum;
        @SerializedName("url")
        private String url;

        public int getAuditPassed() {
            return auditPassed;
        }

        public void setAuditPassed(int auditPassed) {
            this.auditPassed = auditPassed;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getHtmlAccessUrl() {
            return htmlAccessUrl;
        }

        public void setHtmlAccessUrl(String htmlAccessUrl) {
            this.htmlAccessUrl = htmlAccessUrl;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public int getIsNew() {
            return isNew;
        }

        public void setIsNew(int isNew) {
            this.isNew = isNew;
        }

        public String getIsRead() {
            return isRead;
        }

        public void setIsRead(String isRead) {
            this.isRead = isRead;
        }

        public String getLastModifyDate() {
            return lastModifyDate;
        }

        public void setLastModifyDate(String lastModifyDate) {
            this.lastModifyDate = lastModifyDate;
        }

        public String getMsgContent() {
            return msgContent;
        }

        public void setMsgContent(String msgContent) {
            this.msgContent = msgContent;
        }

        public String getMsgTitle() {
            return msgTitle;
        }

        public void setMsgTitle(String msgTitle) {
            this.msgTitle = msgTitle;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumberV2() {
            return phoneNumberV2;
        }

        public void setPhoneNumberV2(String phoneNumberV2) {
            this.phoneNumberV2 = phoneNumberV2;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getUnReadNum() {
            return unReadNum;
        }

        public void setUnReadNum(String unReadNum) {
            this.unReadNum = unReadNum;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.auditPassed);
            dest.writeString(this.createDate);
            dest.writeString(this.htmlAccessUrl);
            dest.writeInt(this.id);
            dest.writeString(this.imageUrl);
            dest.writeInt(this.isNew);
            dest.writeString(this.isRead);
            dest.writeString(this.lastModifyDate);
            dest.writeString(this.msgContent);
            dest.writeString(this.msgTitle);
            dest.writeString(this.phoneNumber);
            dest.writeString(this.phoneNumberV2);
            dest.writeString(this.publisher);
            dest.writeString(this.unReadNum);
            dest.writeString(this.url);
        }

        public NotificationListItemBean() {
        }

        protected NotificationListItemBean(Parcel in) {
            this.auditPassed = in.readInt();
            this.createDate = in.readString();
            this.htmlAccessUrl = in.readString();
            this.id = in.readInt();
            this.imageUrl = in.readString();
            this.isNew = in.readInt();
            this.isRead = in.readString();
            this.lastModifyDate = in.readString();
            this.msgContent = in.readString();
            this.msgTitle = in.readString();
            this.phoneNumber = in.readString();
            this.phoneNumberV2 = in.readString();
            this.publisher = in.readString();
            this.unReadNum = in.readString();
            this.url = in.readString();
        }

        public static final Parcelable.Creator<NotificationListItemBean> CREATOR = new Parcelable.Creator<NotificationListItemBean>() {
            @Override
            public NotificationListItemBean createFromParcel(Parcel source) {
                return new NotificationListItemBean(source);
            }

            @Override
            public NotificationListItemBean[] newArray(int size) {
                return new NotificationListItemBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.recordCount);
        dest.writeTypedList(this.datas);
    }

    public NotificationListResultBean() {
    }

    protected NotificationListResultBean(Parcel in) {
        this.recordCount = in.readInt();
        this.datas = in.createTypedArrayList(NotificationListItemBean.CREATOR);
    }

    public static final Parcelable.Creator<NotificationListResultBean> CREATOR = new Parcelable.Creator<NotificationListResultBean>() {
        @Override
        public NotificationListResultBean createFromParcel(Parcel source) {
            return new NotificationListResultBean(source);
        }

        @Override
        public NotificationListResultBean[] newArray(int size) {
            return new NotificationListResultBean[size];
        }
    };
}
