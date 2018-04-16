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

public class NoticeImageModel implements BaseItem, Parcelable {

    private String imageUrl;
    private float width = 1;
    private float height = 1;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.imageUrl);
        dest.writeFloat(this.width);
        dest.writeFloat(this.height);
        dest.writeInt(this.position);
    }

    public NoticeImageModel() {
    }

    protected NoticeImageModel(Parcel in) {
        this.imageUrl = in.readString();
        this.width = in.readFloat();
        this.height = in.readFloat();
        this.position = in.readInt();
    }

    public static final Parcelable.Creator<NoticeImageModel> CREATOR = new Parcelable.Creator<NoticeImageModel>() {
        @Override
        public NoticeImageModel createFromParcel(Parcel source) {
            return new NoticeImageModel(source);
        }

        @Override
        public NoticeImageModel[] newArray(int size) {
            return new NoticeImageModel[size];
        }
    };
}
