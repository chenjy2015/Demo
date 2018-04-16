package com.kye.model.bean.order;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 03/03/2018
 * @updated : 03/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class EditOrderParamBean implements Parcelable {

    private String orderCode;
    private String commodities;
    private String totalNumber;
    private String weight;
    private String totalPoll;
    private String size;
    private String volume;
    private boolean dangTianDa;
    private Date date;
    private String remark;

    public EditOrderParamBean() {

    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getCommodities() {
        return commodities;
    }

    public void setCommodities(String commodities) {
        this.commodities = commodities;
    }

    public String getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(String totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTotalPoll() {
        return totalPoll;
    }

    public void setTotalPoll(String totalPoll) {
        this.totalPoll = totalPoll;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public boolean isDangTianDa() {
        return dangTianDa;
    }

    public void setDangTianDa(boolean dangTianDa) {
        this.dangTianDa = dangTianDa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    protected EditOrderParamBean(Parcel in) {
        orderCode = in.readString();
        commodities = in.readString();
        totalNumber = in.readString();
        weight = in.readString();
        totalPoll = in.readString();
        size = in.readString();
        volume = in.readString();
        dangTianDa = in.readByte() != 0;
        remark = in.readString();
        date = new Date(in.readLong());
    }

    public static final Creator<EditOrderParamBean> CREATOR = new Creator<EditOrderParamBean>() {
        @Override
        public EditOrderParamBean createFromParcel(Parcel in) {
            return new EditOrderParamBean(in);
        }

        @Override
        public EditOrderParamBean[] newArray(int size) {
            return new EditOrderParamBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(orderCode);
        dest.writeString(commodities);
        dest.writeString(totalNumber);
        dest.writeString(weight);
        dest.writeString(totalPoll);
        dest.writeString(size);
        dest.writeString(volume);
        dest.writeByte((byte) (dangTianDa ? 1 : 0));
        dest.writeString(remark);
        dest.writeLong(date.getTime());
    }
}
