package com.kye.model.bean.integral;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class IntegralRecordEmptyBean implements Parcelable {

    public IntegralRecordEmptyBean() {
    }

    protected IntegralRecordEmptyBean(Parcel in) {
    }

    public static final Creator<IntegralRecordEmptyBean> CREATOR = new Creator<IntegralRecordEmptyBean>() {
        @Override
        public IntegralRecordEmptyBean createFromParcel(Parcel in) {
            return new IntegralRecordEmptyBean(in);
        }

        @Override
        public IntegralRecordEmptyBean[] newArray(int size) {
            return new IntegralRecordEmptyBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
