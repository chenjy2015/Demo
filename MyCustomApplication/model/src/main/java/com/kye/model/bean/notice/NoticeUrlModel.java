package com.kye.model.bean.notice;

import android.os.Parcel;
import android.os.Parcelable;

import com.kye.model.base.BaseItem;


public class NoticeUrlModel implements BaseItem, Parcelable {
    private String url;

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
        dest.writeString(this.url);
    }

    public NoticeUrlModel() {
    }

    protected NoticeUrlModel(Parcel in) {
        this.url = in.readString();
    }

    public static final Parcelable.Creator<NoticeUrlModel> CREATOR = new Parcelable.Creator<NoticeUrlModel>() {
        @Override
        public NoticeUrlModel createFromParcel(Parcel source) {
            return new NoticeUrlModel(source);
        }

        @Override
        public NoticeUrlModel[] newArray(int size) {
            return new NoticeUrlModel[size];
        }
    };
}
