package com.kye.model.bean.notice.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 07/01/2018
 * @updated : 07/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class NotificationDetailRequestParam implements Parcelable {

    public NotificationDetailRequestParam(long notificationId) {
        this.notificationId = notificationId;
    }

    /**
     * notificationId : 1767
     */

    @SerializedName("notificationId")
    private long notificationId;

    public long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.notificationId);
    }

    public NotificationDetailRequestParam() {
    }

    protected NotificationDetailRequestParam(Parcel in) {
        this.notificationId = in.readLong();
    }

    public static final Parcelable.Creator<NotificationDetailRequestParam> CREATOR = new Parcelable.Creator<NotificationDetailRequestParam>() {
        @Override
        public NotificationDetailRequestParam createFromParcel(Parcel source) {
            return new NotificationDetailRequestParam(source);
        }

        @Override
        public NotificationDetailRequestParam[] newArray(int size) {
            return new NotificationDetailRequestParam[size];
        }
    };
}
