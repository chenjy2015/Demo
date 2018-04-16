package com.kye.model.bean.update;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ResponseAppUpGrade implements Parcelable {

    /**
     * versionNo : v6.0.1      APP版本号
     * msg : 修复视频播放BUG     升级信息
     * compelUpdate : 0        是否强制升级
     * download : http://testapi.ky-express.com/android/openAdmin/android/1516592333143/kyeInternal_611_V6.11_release_signed.apk    升级包下载地址
     * isUp : 1                是否升级
     */

    @SerializedName("versionNo")
    private String versionNo;
    @SerializedName("msg")
    private String msg;
    @SerializedName("compelUpdate")
    private int compelUpdate;
    @SerializedName("download")
    private String download;
    @SerializedName("isUp")
    private int isUp;

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCompelUpdate() {
        return compelUpdate;
    }

    public void setCompelUpdate(int compelUpdate) {
        this.compelUpdate = compelUpdate;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public int getIsUp() {
        return isUp;
    }

    public void setIsUp(int isUp) {
        this.isUp = isUp;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.versionNo);
        dest.writeString(this.msg);
        dest.writeInt(this.compelUpdate);
        dest.writeString(this.download);
        dest.writeInt(this.isUp);
    }

    public ResponseAppUpGrade() {
    }

    private ResponseAppUpGrade(Parcel in) {
        this.versionNo = in.readString();
        this.msg = in.readString();
        this.compelUpdate = in.readInt();
        this.download = in.readString();
        this.isUp = in.readInt();
    }

    public static final Parcelable.Creator<ResponseAppUpGrade> CREATOR = new Parcelable.Creator<ResponseAppUpGrade>() {
        @Override
        public ResponseAppUpGrade createFromParcel(Parcel source) {
            return new ResponseAppUpGrade(source);
        }

        @Override
        public ResponseAppUpGrade[] newArray(int size) {
            return new ResponseAppUpGrade[size];
        }
    };
}