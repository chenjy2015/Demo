package com.kye.model.bean.notice;

import android.os.Parcel;
import android.os.Parcelable;

import com.kye.model.base.BaseItem;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/12/2017
 * @updated : 27/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     通知详情，图片信息item
 */

public class NoticeTextModel implements BaseItem, Parcelable {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
    }

    public NoticeTextModel() {
    }

    protected NoticeTextModel(Parcel in) {
        this.text = in.readString();
    }

    public static final Parcelable.Creator<NoticeTextModel> CREATOR = new Parcelable.Creator<NoticeTextModel>() {
        @Override
        public NoticeTextModel createFromParcel(Parcel source) {
            return new NoticeTextModel(source);
        }

        @Override
        public NoticeTextModel[] newArray(int size) {
            return new NoticeTextModel[size];
        }
    };
}
