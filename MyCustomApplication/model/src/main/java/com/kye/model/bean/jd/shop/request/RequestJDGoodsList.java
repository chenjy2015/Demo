package com.kye.model.bean.jd.shop.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/01/2018
 * @updated : 27/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestJDGoodsList implements Parcelable {

    /**
     * phone : 18924656687
     * kySign : 123456
     * skuId : 1969804
     * goodsName : pn8q
     * classId : 274
     * pageSize : 1
     * pageIndex : 2
     * detailsType : b868
     * RecommendType : h2u3
     * minPrice : 3qs5
     * maxPrice : nmnm
     * shelvesFlag : 1
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("kySign")
    private String kySign;
    @SerializedName("skuId")
    private String skuId;
    @SerializedName("goodsName")
    private String goodsName;
    @SerializedName("classId")
    private String classId;
    @SerializedName("pageSize")
    private int pageSize;
    @SerializedName("pageIndex")
    private int pageIndex;
    @SerializedName("detailsType")
    private String detailsType;
    @SerializedName("RecommendType")
    private String RecommendType;
    @SerializedName("minPrice")
    private String minPrice;
    @SerializedName("maxPrice")
    private String maxPrice;
//    @SerializedName("shelvesFlag")
//    private int shelvesFlag;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKySign() {
        return kySign;
    }

    public void setKySign(String kySign) {
        this.kySign = kySign;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getDetailsType() {
        return detailsType;
    }

    public void setDetailsType(String detailsType) {
        this.detailsType = detailsType;
    }

    public String getRecommendType() {
        return RecommendType;
    }

    public void setRecommendType(String RecommendType) {
        this.RecommendType = RecommendType;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.phone);
        dest.writeString(this.kySign);
        dest.writeString(this.skuId);
        dest.writeString(this.goodsName);
        dest.writeString(this.classId);
        dest.writeInt(this.pageSize);
        dest.writeInt(this.pageIndex);
        dest.writeString(this.detailsType);
        dest.writeString(this.RecommendType);
        dest.writeString(this.minPrice);
        dest.writeString(this.maxPrice);
    }

    public RequestJDGoodsList() {
    }

    protected RequestJDGoodsList(Parcel in) {
        this.phone = in.readString();
        this.kySign = in.readString();
        this.skuId = in.readString();
        this.goodsName = in.readString();
        this.classId = in.readString();
        this.pageSize = in.readInt();
        this.pageIndex = in.readInt();
        this.detailsType = in.readString();
        this.RecommendType = in.readString();
        this.minPrice = in.readString();
        this.maxPrice = in.readString();
    }

    public static final Parcelable.Creator<RequestJDGoodsList> CREATOR = new Parcelable.Creator<RequestJDGoodsList>() {
        @Override
        public RequestJDGoodsList createFromParcel(Parcel source) {
            return new RequestJDGoodsList(source);
        }

        @Override
        public RequestJDGoodsList[] newArray(int size) {
            return new RequestJDGoodsList[size];
        }
    };
}
