package com.kye.model.bean.verification;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/02/2018
 * @updated : 06/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class PictureVerificationResultBean implements Parcelable {

    /**
     * picture : 06m6
     */

    @SerializedName("picture")
    private byte[] picture;

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByteArray(this.picture);
    }

    public PictureVerificationResultBean() {
    }

    protected PictureVerificationResultBean(Parcel in) {
        this.picture = in.createByteArray();
    }

    public static final Parcelable.Creator<PictureVerificationResultBean> CREATOR = new Parcelable.Creator<PictureVerificationResultBean>() {
        @Override
        public PictureVerificationResultBean createFromParcel(Parcel source) {
            return new PictureVerificationResultBean(source);
        }

        @Override
        public PictureVerificationResultBean[] newArray(int size) {
            return new PictureVerificationResultBean[size];
        }
    };
}
