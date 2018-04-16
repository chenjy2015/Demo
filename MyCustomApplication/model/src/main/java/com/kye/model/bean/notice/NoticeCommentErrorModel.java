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

public class NoticeCommentErrorModel implements BaseItem, Parcelable {

    public NoticeCommentErrorModel(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NoticeCommentErrorModel() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.message);
    }

    protected NoticeCommentErrorModel(Parcel in) {
        this.message = in.readString();
    }

    public static final Creator<NoticeCommentErrorModel> CREATOR = new Creator<NoticeCommentErrorModel>() {
        @Override
        public NoticeCommentErrorModel createFromParcel(Parcel source) {
            return new NoticeCommentErrorModel(source);
        }

        @Override
        public NoticeCommentErrorModel[] newArray(int size) {
            return new NoticeCommentErrorModel[size];
        }
    };
}
