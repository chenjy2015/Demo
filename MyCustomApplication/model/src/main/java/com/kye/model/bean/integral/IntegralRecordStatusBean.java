package com.kye.model.bean.integral;

import android.os.Parcel;
import android.os.Parcelable;

import com.kye.base.utils.DateUtils;

import java.util.Date;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class IntegralRecordStatusBean implements Parcelable {

    public IntegralRecordType recordType = IntegralRecordType.TYPE_EXCHANGE;
    @Deprecated
    public String dateFrom;
    @Deprecated
    public String dateTo;

    public String date;

    public static IntegralRecordStatusBean newInstance() {
        IntegralRecordStatusBean data = new IntegralRecordStatusBean();
        data.setDateFrom(DateUtils.getDateStringByDateYearMonthDay(new Date()));
        data.setDateTo(DateUtils.getDateStringByDateYearMonthDay(new Date()));
        data.setDate(DateUtils.getDateStringByDateYearMonthDay(new Date()));
        return data;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public IntegralRecordType getRecordType() {
        return recordType;
    }

    public void setRecordType(IntegralRecordType recordType) {
        this.recordType = recordType;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public IntegralRecordStatusBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.recordType == null ? -1 : this.recordType.ordinal());
        dest.writeString(this.dateFrom);
        dest.writeString(this.dateTo);
        dest.writeString(this.date);
    }

    protected IntegralRecordStatusBean(Parcel in) {
        int tmpRecordType = in.readInt();
        this.recordType = tmpRecordType == -1 ? null : IntegralRecordType.values()[tmpRecordType];
        this.dateFrom = in.readString();
        this.dateTo = in.readString();
        this.date = in.readString();
    }

    public static final Creator<IntegralRecordStatusBean> CREATOR = new Creator<IntegralRecordStatusBean>() {
        @Override
        public IntegralRecordStatusBean createFromParcel(Parcel source) {
            return new IntegralRecordStatusBean(source);
        }

        @Override
        public IntegralRecordStatusBean[] newArray(int size) {
            return new IntegralRecordStatusBean[size];
        }
    };
}
