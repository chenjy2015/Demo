package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/01/2018
 * @updated : 15/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsSendAndReceiveRecordBean implements Parcelable {

//    postNoTake	number	49	寄件未取货数量（待取货）
//    postSigned	number	10	寄件已签收数量（待签收里边的已签收）
//    postTookToday	number	0	寄件今日已取货数量（待取货里边的已取货）
//    postSignedToday	number	0	寄件今日已签收数量（今日签收）
//    getNoSign	number	0	收件未签收数量（待签收）
//    getSigned	number	0	收件已签收数量（今日签收里边的已签收）
//    getSignToday	number	0	收件今日已签收数量（今日签收）
//    postNoSign	number	0	寄件未签收数量（待签收）

    /**
     * postNoTake : 49
     * postSigned : 10
     * postTookToday : 0
     * postSignedToday : 0
     * getNoSign : 0
     * getSigned : 0
     * getSignToday : 0
     */

    @SerializedName("postNoTake")
    private int postNoTake;
    @SerializedName("postSigned")
    private int postSigned;
    @SerializedName("postTookToday")
    private int postTookToday;
    @SerializedName("postSignedToday")
    private int postSignedToday;
    @SerializedName("getNoSign")
    private int getNoSign;
    @SerializedName("getSigned")
    private int getSigned;
    @SerializedName("getSignToday")
    private int getSignToday;
    @SerializedName("postNoSign")
    private int postNoSign;

    public int getPostNoSign() {
        return postNoSign;
    }

    public void setPostNoSign(int postNoSign) {
        this.postNoSign = postNoSign;
    }

    public int getPostNoTake() {
        return postNoTake;
    }

    public void setPostNoTake(int postNoTake) {
        this.postNoTake = postNoTake;
    }

    public int getPostSigned() {
        return postSigned;
    }

    public void setPostSigned(int postSigned) {
        this.postSigned = postSigned;
    }

    public int getPostTookToday() {
        return postTookToday;
    }

    public void setPostTookToday(int postTookToday) {
        this.postTookToday = postTookToday;
    }

    public int getPostSignedToday() {
        return postSignedToday;
    }

    public void setPostSignedToday(int postSignedToday) {
        this.postSignedToday = postSignedToday;
    }

    public int getGetNoSign() {
        return getNoSign;
    }

    public void setGetNoSign(int getNoSign) {
        this.getNoSign = getNoSign;
    }

    public int getGetSigned() {
        return getSigned;
    }

    public void setGetSigned(int getSigned) {
        this.getSigned = getSigned;
    }

    public int getGetSignToday() {
        return getSignToday;
    }

    public void setGetSignToday(int getSignToday) {
        this.getSignToday = getSignToday;
    }

    public LogisticsSendAndReceiveRecordBean() {
    }

    @Override
    public int describeContents()                          { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags)      {
                                                               dest.writeInt(this.postNoTake);
                                                               dest.writeInt(this.postSigned);
                                                               dest.writeInt(this.postTookToday);
                                                               dest.writeInt(this.postSignedToday);
                                                               dest.writeInt(this.getNoSign);
                                                               dest.writeInt(this.getSigned);
                                                               dest.writeInt(this.getSignToday);
                                                               dest.writeInt(this.postNoSign);
                                                           }

    protected LogisticsSendAndReceiveRecordBean(Parcel in) {
                                                               this.postNoTake = in.readInt();
                                                               this.postSigned = in.readInt();
                                                               this.postTookToday = in.readInt();
                                                               this.postSignedToday = in.readInt();
                                                               this.getNoSign = in.readInt();
                                                               this.getSigned = in.readInt();
                                                               this.getSignToday = in.readInt();
                                                               this.postNoSign = in.readInt();
                                                           }

    public static final Creator<LogisticsSendAndReceiveRecordBean> CREATOR = new Creator<LogisticsSendAndReceiveRecordBean>() {
        @Override
        public LogisticsSendAndReceiveRecordBean createFromParcel(Parcel source) {return new LogisticsSendAndReceiveRecordBean(source);}

        @Override
        public LogisticsSendAndReceiveRecordBean[] newArray(int size) {return new LogisticsSendAndReceiveRecordBean[size];}
    };
}
