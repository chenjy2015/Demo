package com.kye.model.bean.jd.shop;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/01/2018
 * @updated : 27/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     京东商城产品item
 */

public class JDGoodsItemBean implements Parcelable {

    /**
     * updateDate : 2017/1/19 16:58:21
     * needScore : 80860
     * getProductData :
     * imagePath : jfs/t1879/122/555272999/70487/50cff809/56161fbfNe0a2c08b.jpg
     * productData :
     * pageSize :
     * className : 流行男鞋
     * shelvesFlag : 1
     * pageNum : 249
     * kySign :
     * productName : 鸿星尔克ERKE时尚E字复古男慢跑鞋11115120292中灰/棕黄43码
     * classID : 274
     * rowsCount : 1
     * price : 279
     * sku : 1969804
     * recomdFlag : 0
     * skuImage : {"1969804":[{"id":15611555,"skuId":1969804,"path":"jfs/t1879/122/555272999/70487/50cff809/56161fbfNe0a2c08b.jpg","created":"2015-10-08 15:48:17","modified":"2015-10-08 15:48:17","yn":1,"isPrimary":1,"orderSort":0,"position":null,"type":0,"features":null},{"id":15611556,"skuId":1969804,"path":"jfs/t1855/122/534310844/98902/88400fda/56161fbfN0c6e7b5e.jpg","created":"2015-10-08 15:48:17","modified":"2015-10-08 15:48:17","yn":1,"isPrimary":0,"orderSort":1,"position":null,"type":0,"features":null},{"id":15611557,"skuId":1969804,"path":"jfs/t1837/123/547003362/68685/d9db5b94/56161fc0Ncf50121d.jpg","created":"2015-10-08 15:48:17","modified":"2015-10-08 15:48:17","yn":1,"isPrimary":0,"orderSort":2,"position":null,"type":0,"features":null},{"id":15611558,"skuId":1969804,"path":"jfs/t2047/94/558932194/81790/ebdf56e9/56161fc1Nf658aa59.jpg","created":"2015-10-08 15:48:17","modified":"2015-10-08 15:48:17","yn":1,"isPrimary":0,"orderSort":3,"position":null,"type":0,"features":null}]}
     * createDate : 2015/12/27 0:23:40
     */

    @SerializedName("updateDate")
    private String updateDate;
    @SerializedName("needScore")
    private int needScore;
    @SerializedName("getProductData")
    private String getProductData;
    @SerializedName("imagePath")
    private String imagePath;
    @SerializedName("productData")
    private String productData;
    @SerializedName("pageSize")
    private String pageSize;
    @SerializedName("className")
    private String className;
    @SerializedName("shelvesFlag")
    private String shelvesFlag;
    @SerializedName("pageNum")
    private String pageNum;
    @SerializedName("kySign")
    private String kySign;
    @SerializedName("productName")
    private String productName;
    @SerializedName("classID")
    private int classID;
    @SerializedName("rowsCount")
    private int rowsCount;
    @SerializedName("price")
    private double price;
    @SerializedName("sku")
    private String sku;
    @SerializedName("recomdFlag")
    private int recomdFlag;
    @SerializedName("skuImage")
    private HashMap<String, ArrayList<JDGoodsSkuImageBean>> skuImage;
    @SerializedName("createDate")
    private String createDate;

    private double exchangeRate;

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public int getNeedScore() {
        return needScore;
    }

    public void setNeedScore(int needScore) {
        this.needScore = needScore;
    }

    public String getGetProductData() {
        return getProductData;
    }

    public void setGetProductData(String getProductData) {
        this.getProductData = getProductData;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getProductData() {
        return productData;
    }

    public void setProductData(String productData) {
        this.productData = productData;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getShelvesFlag() {
        return shelvesFlag;
    }

    public void setShelvesFlag(String shelvesFlag) {
        this.shelvesFlag = shelvesFlag;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getKySign() {
        return kySign;
    }

    public void setKySign(String kySign) {
        this.kySign = kySign;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getRecomdFlag() {
        return recomdFlag;
    }

    public void setRecomdFlag(int recomdFlag) {
        this.recomdFlag = recomdFlag;
    }

    public HashMap<String, ArrayList<JDGoodsSkuImageBean>> getSkuImage() {
        return skuImage;
    }

    public void setSkuImage(HashMap<String, ArrayList<JDGoodsSkuImageBean>> skuImage) {
        this.skuImage = skuImage;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


    public JDGoodsItemBean() {
    }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
                                      dest.writeString(this.updateDate);
                                      dest.writeInt(this.needScore);
                                      dest.writeString(this.getProductData);
                                      dest.writeString(this.imagePath);
                                      dest.writeString(this.productData);
                                      dest.writeString(this.pageSize);
                                      dest.writeString(this.className);
                                      dest.writeString(this.shelvesFlag);
                                      dest.writeString(this.pageNum);
                                      dest.writeString(this.kySign);
                                      dest.writeString(this.productName);
                                      dest.writeInt(this.classID);
                                      dest.writeInt(this.rowsCount);
                                      dest.writeDouble(this.price);
                                      dest.writeString(this.sku);
                                      dest.writeInt(this.recomdFlag);
                                      dest.writeSerializable(this.skuImage);
                                      dest.writeString(this.createDate);
                                      dest.writeDouble(this.exchangeRate);
                                  }

    protected JDGoodsItemBean(Parcel in) {
                                      this.updateDate = in.readString();
                                      this.needScore = in.readInt();
                                      this.getProductData = in.readString();
                                      this.imagePath = in.readString();
                                      this.productData = in.readString();
                                      this.pageSize = in.readString();
                                      this.className = in.readString();
                                      this.shelvesFlag = in.readString();
                                      this.pageNum = in.readString();
                                      this.kySign = in.readString();
                                      this.productName = in.readString();
                                      this.classID = in.readInt();
                                      this.rowsCount = in.readInt();
                                      this.price = in.readDouble();
                                      this.sku = in.readString();
                                      this.recomdFlag = in.readInt();
                                      this.skuImage = (HashMap<String, ArrayList<JDGoodsSkuImageBean>>) in.readSerializable();
                                      this.createDate = in.readString();
                                      this.exchangeRate = in.readDouble();
                                  }

    public static final Creator<JDGoodsItemBean> CREATOR = new Creator<JDGoodsItemBean>() {
        @Override
        public JDGoodsItemBean createFromParcel(Parcel source) {return new JDGoodsItemBean(source);}

        @Override
        public JDGoodsItemBean[] newArray(int size) {return new JDGoodsItemBean[size];}
    };
}
