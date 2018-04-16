package com.kye.model.bean.notice.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/01/2018
 * @updated : 06/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class NotificationListRequestParam implements Parcelable {

    public static NotificationListRequestParam newDefaultInstance() {
        NotificationListRequestParam param = new NotificationListRequestParam();
        param.setAction(String.valueOf(1));
        param.setPageSize(20);
        param.setPageNum(1);
        return param;
    }

    public NotificationListRequestParam(String action, String author, int pageSize, int pageNum, String loginUser) {
        this.action = action;
        this.author = author;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.loginUser = loginUser;
    }

    /**
     * action : 1
     * author : 詹姆斯
     * pageSize : 2
     * pageNum : 1
     * loginUser : 用户唯一标识
     */

    @SerializedName("action")
    private String action;
    @SerializedName("author")
    private String author;
    @SerializedName("pageSize")
    private int pageSize;
    @SerializedName("pageNum")
    private int pageNum;
    @SerializedName("loginUser")
    private String loginUser;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.action);
        dest.writeString(this.author);
        dest.writeInt(this.pageSize);
        dest.writeInt(this.pageNum);
        dest.writeString(this.loginUser);
    }

    public NotificationListRequestParam() {
    }

    protected NotificationListRequestParam(Parcel in) {
        this.action = in.readString();
        this.author = in.readString();
        this.pageSize = in.readInt();
        this.pageNum = in.readInt();
        this.loginUser = in.readString();
    }

    public static final Parcelable.Creator<NotificationListRequestParam> CREATOR = new Parcelable.Creator<NotificationListRequestParam>() {
        @Override
        public NotificationListRequestParam createFromParcel(Parcel source) {
            return new NotificationListRequestParam(source);
        }

        @Override
        public NotificationListRequestParam[] newArray(int size) {
            return new NotificationListRequestParam[size];
        }
    };
}
