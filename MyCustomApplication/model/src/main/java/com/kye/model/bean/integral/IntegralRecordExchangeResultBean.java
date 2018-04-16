package com.kye.model.bean.integral;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.kye.model.base.BaseItem;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class IntegralRecordExchangeResultBean implements Parcelable, BaseItem {

    /**
     * rowcount : 23
     * retDatas : [{"townName":"","address":"中国广东省深圳市宝安路","town":"","activeAddress":"","city":"","goodsId":"45766760020","mobile":"18924656687","county":"","type":"0","picture":"jfs/t1729/257/944560398/146403/27078bb4/55dc510bN1f00bf44.jpg","cityName":"","province":"","integral":46549,"name":"那里","goodsNeme":"九阳 Joyoung JK-30E07电饼铛煎烤机多功能电脑版一键通","time":"2016-11-28 17:49","provinceName":"","state":"订单已申请退货","sku":"1583842","email":"571018437@qq.com","countyName":"","merchantno":""}]
     * retCount : 1
     */

    @SerializedName("rowcount")
    private int rowcount;
    @SerializedName("retCount")
    private int retCount;
    @SerializedName("retDatas")
    private List<IntegralRecordExchangeRecordBean> retDatas;

    public int getRowcount() {
        return rowcount;
    }

    public void setRowcount(int rowcount) {
        this.rowcount = rowcount;
    }

    public int getRetCount() {
        return retCount;
    }

    public void setRetCount(int retCount) {
        this.retCount = retCount;
    }

    public List<IntegralRecordExchangeRecordBean> getRetDatas() {
        return retDatas;
    }

    public void setRetDatas(List<IntegralRecordExchangeRecordBean> retDatas) {
        this.retDatas = retDatas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.rowcount);
        dest.writeInt(this.retCount);
        dest.writeTypedList(this.retDatas);
    }

    public IntegralRecordExchangeResultBean() {
    }

    protected IntegralRecordExchangeResultBean(Parcel in) {
        this.rowcount = in.readInt();
        this.retCount = in.readInt();
        this.retDatas = in.createTypedArrayList(IntegralRecordExchangeRecordBean.CREATOR);
    }

    public static final Parcelable.Creator<IntegralRecordExchangeResultBean> CREATOR = new Parcelable.Creator<IntegralRecordExchangeResultBean>() {
        @Override
        public IntegralRecordExchangeResultBean createFromParcel(Parcel source) {
            return new IntegralRecordExchangeResultBean(source);
        }

        @Override
        public IntegralRecordExchangeResultBean[] newArray(int size) {
            return new IntegralRecordExchangeResultBean[size];
        }
    };
}
