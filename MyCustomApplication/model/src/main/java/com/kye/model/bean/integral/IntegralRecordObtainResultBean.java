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

public class IntegralRecordObtainResultBean implements Parcelable , BaseItem {

    /**
     * totalScore : 0
     * avbJDCredit : 0
     * haveOrNotFullIntegral : 0
     * recordCount : 8
     * whetherScrapPhone : 0
     * datas : [{"reason":"当天没有业务积分","integralTypeInstructions":"业务积分","state":"","signIntegral":0,"integralType":"YWJF001","integralTime":"2016-03-25"},{"reason":"当天没有上传拍照","integralTypeInstructions":"拍照积分","state":"","signIntegral":0,"integralType":"PZJF001","integralTime":"2016-03-25"},{"reason":"当天没有签到","integralTypeInstructions":"签到积分","state":"","signIntegral":0,"integralType":"QD001","integralTime":"2016-03-25"},{"reason":"没有分享至朋友圈","integralTypeInstructions":"朋友圈分享积分","state":"","signIntegral":0,"integralType":"HDHB008","integralTime":"2016-03-25"},{"reason":"没有分享至QQ空间","integralTypeInstructions":"QQ空间分享积分","state":"","signIntegral":0,"integralType":"HDHB007","integralTime":"2016-03-25"},{"reason":"没有分享至微博","integralTypeInstructions":"微博分享积分","state":"","signIntegral":0,"integralType":"HDHB006","integralTime":"2016-03-25"},{"reason":"当天没有下单","integralTypeInstructions":"下单积分","state":"","signIntegral":0,"integralType":"XDJF001","integralTime":"2016-03-25"},{"reason":"当天没有评分","integralTypeInstructions":"评分奖励积分","state":"","signIntegral":0,"integralType":"PF001","integralTime":"2016-03-25"}]
     */

    @SerializedName("totalScore")
    private int totalScore;
    @SerializedName("avbJDCredit")
    private int avbJDCredit;
    @SerializedName("haveOrNotFullIntegral")
    private int haveOrNotFullIntegral;
    @SerializedName("recordCount")
    private int recordCount;
    @SerializedName("whetherScrapPhone")
    private int whetherScrapPhone;
    @SerializedName("datas")
    private List<IntegralRecordObtainRecordBean> datas;

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getAvbJDCredit() {
        return avbJDCredit;
    }

    public void setAvbJDCredit(int avbJDCredit) {
        this.avbJDCredit = avbJDCredit;
    }

    public int getHaveOrNotFullIntegral() {
        return haveOrNotFullIntegral;
    }

    public void setHaveOrNotFullIntegral(int haveOrNotFullIntegral) {
        this.haveOrNotFullIntegral = haveOrNotFullIntegral;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public int getWhetherScrapPhone() {
        return whetherScrapPhone;
    }

    public void setWhetherScrapPhone(int whetherScrapPhone) {
        this.whetherScrapPhone = whetherScrapPhone;
    }

    public List<IntegralRecordObtainRecordBean> getDatas() {
        return datas;
    }

    public void setDatas(List<IntegralRecordObtainRecordBean> datas) {
        this.datas = datas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.totalScore);
        dest.writeInt(this.avbJDCredit);
        dest.writeInt(this.haveOrNotFullIntegral);
        dest.writeInt(this.recordCount);
        dest.writeInt(this.whetherScrapPhone);
        dest.writeTypedList(this.datas);
    }

    public IntegralRecordObtainResultBean() {
    }

    protected IntegralRecordObtainResultBean(Parcel in) {
        this.totalScore = in.readInt();
        this.avbJDCredit = in.readInt();
        this.haveOrNotFullIntegral = in.readInt();
        this.recordCount = in.readInt();
        this.whetherScrapPhone = in.readInt();
        this.datas = in.createTypedArrayList(IntegralRecordObtainRecordBean.CREATOR);
    }

    public static final Parcelable.Creator<IntegralRecordObtainResultBean> CREATOR = new Parcelable.Creator<IntegralRecordObtainResultBean>() {
        @Override
        public IntegralRecordObtainResultBean createFromParcel(Parcel source) {
            return new IntegralRecordObtainResultBean(source);
        }

        @Override
        public IntegralRecordObtainResultBean[] newArray(int size) {
            return new IntegralRecordObtainResultBean[size];
        }
    };
}
