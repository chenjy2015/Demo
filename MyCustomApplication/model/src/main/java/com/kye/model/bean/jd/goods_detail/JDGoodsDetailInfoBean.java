package com.kye.model.bean.jd.goods_detail;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 30/01/2018
 * @updated : 30/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     京东商品详情信息
 */

public class JDGoodsDetailInfoBean implements Parcelable {

    /**
     * saleUnit : 台
     * weight : 0.38
     * productArea : 中国大陆
     * wareQD :  手机*1，充电器*1，数据线*1，3.5mm耳机*1，快速指南*1，三包凭证*1，取卡针*1
     * imagePath : jfs/t1468/336/560997898/135498/bece9522/55ac6614Nefdfcda7.jpg
     * param : 0gq4
     * state : 0
     * sku : 1731757
     * brandName : 华为（HUAWEI）
     * upc : 1731757
     * category : 9987;653;655
     * name : 华为 P8 青春版 金色 移动联通4G手机 双卡双待
     * introduction : s16n
     */

    @SerializedName("saleUnit")
    private String saleUnit;
    @SerializedName("weight")
    private String weight;
    @SerializedName("productArea")
    private String productArea;
    @SerializedName("wareQD")
    private String wareQD;
    @SerializedName("imagePath")
    private String imagePath;
    @SerializedName("param")
    private String param;
    @SerializedName("state")
    private int state;
    @SerializedName("sku")
    private int sku;
    @SerializedName("brandName")
    private String brandName;
    @SerializedName("upc")
    private String upc;
    @SerializedName("category")
    private String category;
    @SerializedName("name")
    private String name;
    @SerializedName("introduction")
    private String introduction;

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getProductArea() {
        return productArea;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    public String getWareQD() {
        return wareQD;
    }

    public void setWareQD(String wareQD) {
        this.wareQD = wareQD;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JDGoodsDetailInfoBean)) return false;

        JDGoodsDetailInfoBean that = (JDGoodsDetailInfoBean) o;

        return sku == that.sku;
    }

    @Override
    public int hashCode() {
        return sku;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.saleUnit);
        dest.writeString(this.weight);
        dest.writeString(this.productArea);
        dest.writeString(this.wareQD);
        dest.writeString(this.imagePath);
        dest.writeString(this.param);
        dest.writeInt(this.state);
        dest.writeInt(this.sku);
        dest.writeString(this.brandName);
        dest.writeString(this.upc);
        dest.writeString(this.category);
        dest.writeString(this.name);
        dest.writeString(this.introduction);
    }

    public JDGoodsDetailInfoBean() {
    }

    protected JDGoodsDetailInfoBean(Parcel in) {
        this.saleUnit = in.readString();
        this.weight = in.readString();
        this.productArea = in.readString();
        this.wareQD = in.readString();
        this.imagePath = in.readString();
        this.param = in.readString();
        this.state = in.readInt();
        this.sku = in.readInt();
        this.brandName = in.readString();
        this.upc = in.readString();
        this.category = in.readString();
        this.name = in.readString();
        this.introduction = in.readString();
    }

    public static final Parcelable.Creator<JDGoodsDetailInfoBean> CREATOR = new Parcelable.Creator<JDGoodsDetailInfoBean>() {
        @Override
        public JDGoodsDetailInfoBean createFromParcel(Parcel source) {
            return new JDGoodsDetailInfoBean(source);
        }

        @Override
        public JDGoodsDetailInfoBean[] newArray(int size) {
            return new JDGoodsDetailInfoBean[size];
        }
    };
}
