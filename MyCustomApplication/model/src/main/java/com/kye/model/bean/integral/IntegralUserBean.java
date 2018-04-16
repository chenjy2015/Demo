package com.kye.model.bean.integral;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.kye.model.base.BaseItem;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     用户积分信息
 */

public class IntegralUserBean implements Parcelable, BaseItem {

    /**
     * systemIntegralOne : 0
     * money : 34
     * exchangeRate : 0.005
     * discountedaMoney : 73.58
     * userActivItyIntegral : 1000
     * userMoneyIntegral : 0
     * type : 0
     * userAvailableIntegral : 15828
     * trueActivityIntegral : 1000
     * businessIntegral : 14716
     * prestoreIntegral : 1112
     * todaySumConsume : 0
     * totalCredit : 0
     * todayConsume : 0
     * todayConsumeGoods : 067m
     * systemIntegralTwo : 14716
     * frequency : 0
     * systemIntegral : 14716
     * trueAvailableIntegral : 6316
     * kyeUser : 1
     * jdIntegral : 6316
     * realUserBalance : 0
     */

    @SerializedName("systemIntegralOne")
    private int systemIntegralOne;
    @SerializedName("money")
    private double money;
    @SerializedName("exchangeRate")
    private double exchangeRate;
    @SerializedName("discountedaMoney")
    private double discountedaMoney;
    @SerializedName("userActivItyIntegral")
    private int userActivItyIntegral;
    @SerializedName("userMoneyIntegral")
    private int userMoneyIntegral;
    @SerializedName("type")
    private int type;
    @SerializedName("userAvailableIntegral")
    private int userAvailableIntegral;
    @SerializedName("trueActivityIntegral")
    private int trueActivityIntegral;
    @SerializedName("businessIntegral")
    private int businessIntegral;
    @SerializedName("prestoreIntegral")
    private int prestoreIntegral;
    @SerializedName("todaySumConsume")
    private int todaySumConsume;
    @SerializedName("totalCredit")
    private int totalCredit;
    @SerializedName("todayConsume")
    private int todayConsume;
    @SerializedName("todayConsumeGoods")
    private String todayConsumeGoods;
    @SerializedName("systemIntegralTwo")
    private int systemIntegralTwo;
    @SerializedName("frequency")
    private int frequency;
    @SerializedName("systemIntegral")
    private int systemIntegral;
    @SerializedName("trueAvailableIntegral")
    private int trueAvailableIntegral;
    @SerializedName("kyeUser")
    private int kyeUser;
    @SerializedName("jdIntegral")
    private int jdIntegral;
    @SerializedName("realUserBalance")
    private double realUserBalance;

    public int getSystemIntegralOne() {
        return systemIntegralOne;
    }

    public void setSystemIntegralOne(int systemIntegralOne) {
        this.systemIntegralOne = systemIntegralOne;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getDiscountedaMoney() {
        return discountedaMoney;
    }

    public void setDiscountedaMoney(double discountedaMoney) {
        this.discountedaMoney = discountedaMoney;
    }

    public int getUserActivItyIntegral() {
        return userActivItyIntegral;
    }

    public void setUserActivItyIntegral(int userActivItyIntegral) {
        this.userActivItyIntegral = userActivItyIntegral;
    }

    public int getUserMoneyIntegral() {
        return userMoneyIntegral;
    }

    public void setUserMoneyIntegral(int userMoneyIntegral) {
        this.userMoneyIntegral = userMoneyIntegral;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getUserAvailableIntegral() {
        return userAvailableIntegral;
    }

    public void setUserAvailableIntegral(int userAvailableIntegral) {
        this.userAvailableIntegral = userAvailableIntegral;
    }

    public int getTrueActivityIntegral() {
        return trueActivityIntegral;
    }

    public void setTrueActivityIntegral(int trueActivityIntegral) {
        this.trueActivityIntegral = trueActivityIntegral;
    }

    public int getBusinessIntegral() {
        return businessIntegral;
    }

    public void setBusinessIntegral(int businessIntegral) {
        this.businessIntegral = businessIntegral;
    }

    public int getPrestoreIntegral() {
        return prestoreIntegral;
    }

    public void setPrestoreIntegral(int prestoreIntegral) {
        this.prestoreIntegral = prestoreIntegral;
    }

    public int getTodaySumConsume() {
        return todaySumConsume;
    }

    public void setTodaySumConsume(int todaySumConsume) {
        this.todaySumConsume = todaySumConsume;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public int getTodayConsume() {
        return todayConsume;
    }

    public void setTodayConsume(int todayConsume) {
        this.todayConsume = todayConsume;
    }

    public String getTodayConsumeGoods() {
        return todayConsumeGoods;
    }

    public void setTodayConsumeGoods(String todayConsumeGoods) {
        this.todayConsumeGoods = todayConsumeGoods;
    }

    public int getSystemIntegralTwo() {
        return systemIntegralTwo;
    }

    public void setSystemIntegralTwo(int systemIntegralTwo) {
        this.systemIntegralTwo = systemIntegralTwo;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getSystemIntegral() {
        return systemIntegral;
    }

    public void setSystemIntegral(int systemIntegral) {
        this.systemIntegral = systemIntegral;
    }

    public int getTrueAvailableIntegral() {
        return trueAvailableIntegral;
    }

    public void setTrueAvailableIntegral(int trueAvailableIntegral) {
        this.trueAvailableIntegral = trueAvailableIntegral;
    }

    public int getKyeUser() {
        return kyeUser;
    }

    public void setKyeUser(int kyeUser) {
        this.kyeUser = kyeUser;
    }

    public int getJdIntegral() {
        return jdIntegral;
    }

    public void setJdIntegral(int jdIntegral) {
        this.jdIntegral = jdIntegral;
    }

    public double getRealUserBalance() {
        return realUserBalance;
    }

    public void setRealUserBalance(double realUserBalance) {
        this.realUserBalance = realUserBalance;
    }

    public IntegralUserBean() {
    }


    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
                                      dest.writeInt(this.systemIntegralOne);
                                      dest.writeDouble(this.money);
                                      dest.writeDouble(this.exchangeRate);
                                      dest.writeDouble(this.discountedaMoney);
                                      dest.writeInt(this.userActivItyIntegral);
                                      dest.writeInt(this.userMoneyIntegral);
                                      dest.writeInt(this.type);
                                      dest.writeInt(this.userAvailableIntegral);
                                      dest.writeInt(this.trueActivityIntegral);
                                      dest.writeInt(this.businessIntegral);
                                      dest.writeInt(this.prestoreIntegral);
                                      dest.writeInt(this.todaySumConsume);
                                      dest.writeInt(this.totalCredit);
                                      dest.writeInt(this.todayConsume);
                                      dest.writeString(this.todayConsumeGoods);
                                      dest.writeInt(this.systemIntegralTwo);
                                      dest.writeInt(this.frequency);
                                      dest.writeInt(this.systemIntegral);
                                      dest.writeInt(this.trueAvailableIntegral);
                                      dest.writeInt(this.kyeUser);
                                      dest.writeInt(this.jdIntegral);
                                      dest.writeDouble(this.realUserBalance);
                                  }

    protected IntegralUserBean(Parcel in) {
                                      this.systemIntegralOne = in.readInt();
                                      this.money = in.readDouble();
                                      this.exchangeRate = in.readDouble();
                                      this.discountedaMoney = in.readDouble();
                                      this.userActivItyIntegral = in.readInt();
                                      this.userMoneyIntegral = in.readInt();
                                      this.type = in.readInt();
                                      this.userAvailableIntegral = in.readInt();
                                      this.trueActivityIntegral = in.readInt();
                                      this.businessIntegral = in.readInt();
                                      this.prestoreIntegral = in.readInt();
                                      this.todaySumConsume = in.readInt();
                                      this.totalCredit = in.readInt();
                                      this.todayConsume = in.readInt();
                                      this.todayConsumeGoods = in.readString();
                                      this.systemIntegralTwo = in.readInt();
                                      this.frequency = in.readInt();
                                      this.systemIntegral = in.readInt();
                                      this.trueAvailableIntegral = in.readInt();
                                      this.kyeUser = in.readInt();
                                      this.jdIntegral = in.readInt();
                                      this.realUserBalance = in.readDouble();
                                  }

    public static final Creator<IntegralUserBean> CREATOR = new Creator<IntegralUserBean>() {
        @Override
        public IntegralUserBean createFromParcel(Parcel source) {return new IntegralUserBean(source);}

        @Override
        public IntegralUserBean[] newArray(int size) {return new IntegralUserBean[size];}
    };
}
