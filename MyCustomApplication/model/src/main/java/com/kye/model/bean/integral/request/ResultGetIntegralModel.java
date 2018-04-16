package com.kye.model.bean.integral.request;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by SkyYu on 08/01/2018
 */
public class ResultGetIntegralModel implements Parcelable {

    public int todaySumConsume;
    public int trueActivityIntegral;
    public int userActivItyIntegral;
    public String todayConsumeGoods;
    public int totalCredit;
    public int systemIntegralTwo;
    public int systemIntegral;
    public int type;
    public int kyeUser;
    public int frequency;
    public int businessIntegral;
    public double realUserBalance;
    public double money;
    public float exchangeRate;
    public int userMoneyIntegral;
    public int systemIntegralOne;
    public int userAvailableIntegral;
    public int prestoreIntegral;
    public int trueAvailableIntegral;
    public double discountedaMoney;
    public int todayConsume;
    public int jdIntegral;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.todaySumConsume);
        dest.writeInt(this.trueActivityIntegral);
        dest.writeInt(this.userActivItyIntegral);
        dest.writeString(this.todayConsumeGoods);
        dest.writeInt(this.totalCredit);
        dest.writeInt(this.systemIntegralTwo);
        dest.writeInt(this.systemIntegral);
        dest.writeInt(this.type);
        dest.writeInt(this.kyeUser);
        dest.writeInt(this.frequency);
        dest.writeInt(this.businessIntegral);
        dest.writeDouble(this.realUserBalance);
        dest.writeDouble(this.money);
        dest.writeFloat(this.exchangeRate);
        dest.writeInt(this.userMoneyIntegral);
        dest.writeInt(this.systemIntegralOne);
        dest.writeInt(this.userAvailableIntegral);
        dest.writeInt(this.prestoreIntegral);
        dest.writeInt(this.trueAvailableIntegral);
        dest.writeDouble(this.discountedaMoney);
        dest.writeInt(this.todayConsume);
        dest.writeInt(this.jdIntegral);
    }

    public ResultGetIntegralModel() {
    }

    protected ResultGetIntegralModel(Parcel in) {
        this.todaySumConsume = in.readInt();
        this.trueActivityIntegral = in.readInt();
        this.userActivItyIntegral = in.readInt();
        this.todayConsumeGoods = in.readString();
        this.totalCredit = in.readInt();
        this.systemIntegralTwo = in.readInt();
        this.systemIntegral = in.readInt();
        this.type = in.readInt();
        this.kyeUser = in.readInt();
        this.frequency = in.readInt();
        this.businessIntegral = in.readInt();
        this.realUserBalance = in.readDouble();
        this.money = in.readInt();
        this.exchangeRate = in.readFloat();
        this.userMoneyIntegral = in.readInt();
        this.systemIntegralOne = in.readInt();
        this.userAvailableIntegral = in.readInt();
        this.prestoreIntegral = in.readInt();
        this.trueAvailableIntegral = in.readInt();
        this.discountedaMoney = in.readDouble();
        this.todayConsume = in.readInt();
        this.jdIntegral = in.readInt();
    }

    public static final Creator<ResultGetIntegralModel> CREATOR = new Creator<ResultGetIntegralModel>() {
        @Override
        public ResultGetIntegralModel createFromParcel(Parcel source) {
            return new ResultGetIntegralModel(source);
        }

        @Override
        public ResultGetIntegralModel[] newArray(int size) {
            return new ResultGetIntegralModel[size];
        }
    };
}