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

public class NoticeCommentEmptyModel implements BaseItem, Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public NoticeCommentEmptyModel() {
    }

    protected NoticeCommentEmptyModel(Parcel in) {
    }

    public static final Parcelable.Creator<NoticeCommentEmptyModel> CREATOR = new Parcelable.Creator<NoticeCommentEmptyModel>() {
        @Override
        public NoticeCommentEmptyModel createFromParcel(Parcel source) {
            return new NoticeCommentEmptyModel(source);
        }

        @Override
        public NoticeCommentEmptyModel[] newArray(int size) {
            return new NoticeCommentEmptyModel[size];
        }
    };
}
