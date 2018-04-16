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
 *     通知详情, 热门评论标题item
 */

public class NoticeCommentTitleModel implements BaseItem, Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public NoticeCommentTitleModel() {
    }

    protected NoticeCommentTitleModel(Parcel in) {
    }

    public static final Parcelable.Creator<NoticeCommentTitleModel> CREATOR = new Parcelable.Creator<NoticeCommentTitleModel>() {
        @Override
        public NoticeCommentTitleModel createFromParcel(Parcel source) {
            return new NoticeCommentTitleModel(source);
        }

        @Override
        public NoticeCommentTitleModel[] newArray(int size) {
            return new NoticeCommentTitleModel[size];
        }
    };
}
