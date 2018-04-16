package com.kye.model.bean.integral;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.integral.request.IntegralItemDataBean;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 25/01/2018
 * @updated : 25/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class IntegralItemListResultDataBean implements Parcelable {


    /**
     * integralCount : 2
     * datas : [{"integralScore":"645","waybill":"51201225876","remark":"","createDate":"2016-11-21 22:52","status":""},{"integralScore":"546","waybill":"51200930299","remark":"","createDate":"2016-11-14 21:07","status":""}]
     * totalCount : 4
     */

    @SerializedName("integralCount")
    private int integralCount;
    @SerializedName("totalCount")
    private int totalCount;
    @SerializedName("datas")
    private List<IntegralItemDataBean> datas;

    public int getIntegralCount() {
        return integralCount;
    }

    public void setIntegralCount(int integralCount) {
        this.integralCount = integralCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<IntegralItemDataBean> getDatas() {
        return datas;
    }

    public void setDatas(List<IntegralItemDataBean> datas) {
        this.datas = datas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.integralCount);
        dest.writeInt(this.totalCount);
        dest.writeTypedList(this.datas);
    }

    public IntegralItemListResultDataBean() {
    }

    protected IntegralItemListResultDataBean(Parcel in) {
        this.integralCount = in.readInt();
        this.totalCount = in.readInt();
        this.datas = in.createTypedArrayList(IntegralItemDataBean.CREATOR);
    }

    public static final Parcelable.Creator<IntegralItemListResultDataBean> CREATOR = new Parcelable.Creator<IntegralItemListResultDataBean>() {
        @Override
        public IntegralItemListResultDataBean createFromParcel(Parcel source) {
            return new IntegralItemListResultDataBean(source);
        }

        @Override
        public IntegralItemListResultDataBean[] newArray(int size) {
            return new IntegralItemListResultDataBean[size];
        }
    };
}
