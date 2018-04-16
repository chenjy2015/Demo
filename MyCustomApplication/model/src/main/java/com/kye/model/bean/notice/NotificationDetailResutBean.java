package com.kye.model.bean.notice;

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
 *
 *     通知详情请求结果bean
 */

@Deprecated
public class NotificationDetailResutBean implements Parcelable {

    /**
     * code : 0
     * data : {"auditPassed":0,"createDate":"2017-12-14 21:39:09","id":1767,"imageUrl":"g671","lastModifyDate":"2017-12-14 21:39:09","lastModifyUser":"7j1l","msgContent":"互联网","msgTitle":"互联网","msgType":"3","phoneNumber":"18565748429","publisher":"跨越速运","smallImg":"http://res.ky-express.com/h5/comm/notice.png","url":"gi5r"}
     * msg : 操作成功
     * success : true
     */

    @SerializedName("code")
    private int code;
    @SerializedName("data")
    private NotificationDetailBasicInfoBean data;
    @SerializedName("msg")
    private String msg;
    @SerializedName("success")
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public NotificationDetailBasicInfoBean getData() {
        return data;
    }

    public void setData(NotificationDetailBasicInfoBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.code);
        dest.writeParcelable(this.data, flags);
        dest.writeString(this.msg);
        dest.writeByte(this.success ? (byte) 1 : (byte) 0);
    }

    public NotificationDetailResutBean() {
    }

    protected NotificationDetailResutBean(Parcel in) {
        this.code = in.readInt();
        this.data = in.readParcelable(NotificationDetailBasicInfoBean.class.getClassLoader());
        this.msg = in.readString();
        this.success = in.readByte() != 0;
    }

    public static final Parcelable.Creator<NotificationDetailResutBean> CREATOR = new Parcelable.Creator<NotificationDetailResutBean>() {
        @Override
        public NotificationDetailResutBean createFromParcel(Parcel source) {
            return new NotificationDetailResutBean(source);
        }

        @Override
        public NotificationDetailResutBean[] newArray(int size) {
            return new NotificationDetailResutBean[size];
        }
    };
}
