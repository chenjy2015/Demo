package com.kye.model.bean.notice;

import android.os.Parcel;
import android.os.Parcelable;

import com.kye.model.base.BaseItem;
import com.kye.model.bean.comment.notice.CommentItemBean;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/12/2017
 * @updated : 27/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     通知详情, 热门评论item, 二级评论model
 */

public class NoticeCommentChildModel implements BaseItem, Parcelable {

    public NoticeCommentChildModel(CommentItemBean commentItemBean) {
        this.commentItemBean = commentItemBean;
    }

    private CommentItemBean commentItemBean;

    public CommentItemBean getCommentItemBean() {
        return commentItemBean;
    }

    public void setCommentItemBean(CommentItemBean commentItemBean) {
        this.commentItemBean = commentItemBean;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.commentItemBean, flags);
    }

    public NoticeCommentChildModel() {
    }

    protected NoticeCommentChildModel(Parcel in) {
        this.commentItemBean = in.readParcelable(CommentItemBean.class.getClassLoader());
    }

    public static final Creator<NoticeCommentChildModel> CREATOR = new Creator<NoticeCommentChildModel>() {
        @Override
        public NoticeCommentChildModel createFromParcel(Parcel source) {
            return new NoticeCommentChildModel(source);
        }

        @Override
        public NoticeCommentChildModel[] newArray(int size) {
            return new NoticeCommentChildModel[size];
        }
    };
}