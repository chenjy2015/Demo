package com.kye.model.bean.picture_show;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 28/03/2018
 * @updated : 28/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class MessageReceiptData implements Parcelable {

    public List<String> imageBase64Datas;

    public static MessageReceiptData newInstance(List<String> imageBase64Datas) {
        return new MessageReceiptData(imageBase64Datas);
    }

    public MessageReceiptData() {
    }

    public MessageReceiptData(List<String> imageBase64Datas) {
        this.imageBase64Datas = imageBase64Datas;
    }

    public List<String> getImageBase64Datas() {
        return imageBase64Datas;
    }

    public void setImageBase64Datas(List<String> imageBase64Datas) {
        this.imageBase64Datas = imageBase64Datas;
    }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {dest.writeStringList(this.imageBase64Datas);}

    protected MessageReceiptData(Parcel in) {this.imageBase64Datas = in.createStringArrayList();}

    public static final Parcelable.Creator<MessageReceiptData> CREATOR = new Parcelable.Creator<MessageReceiptData>() {
        @Override
        public MessageReceiptData createFromParcel(Parcel source) {return new MessageReceiptData(source);}

        @Override
        public MessageReceiptData[] newArray(int size) {return new MessageReceiptData[size];}
    };
}
