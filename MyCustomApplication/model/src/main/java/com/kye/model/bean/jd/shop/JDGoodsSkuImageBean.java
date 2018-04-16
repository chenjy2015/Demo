package com.kye.model.bean.jd.shop;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/01/2018
 * @updated : 27/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDGoodsSkuImageBean implements Parcelable, Serializable{

    /**
     * id : 15611555
     * skuId : 1969804
     * path : jfs/t1879/122/555272999/70487/50cff809/56161fbfNe0a2c08b.jpg
     * created : 2015-10-08 15:48:17
     * modified : 2015-10-08 15:48:17
     * yn : 1
     * isPrimary : 1
     * orderSort : 0
     * position : null
     * type : 0
     * features : null
     */

    @SerializedName("id")
    private int id;
    @SerializedName("skuId")
    private int skuId;
    @SerializedName("path")
    private String path;
    @SerializedName("created")
    private String created;
    @SerializedName("modified")
    private String modified;
    @SerializedName("yn")
    private int yn;
    @SerializedName("isPrimary")
    private int isPrimary;
    @SerializedName("orderSort")
    private int orderSort;
//    @SerializedName("position")
//    private Object position;
    @SerializedName("type")
    private int type;
//    @SerializedName("features")
//    private Object features;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }

    public int getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(int isPrimary) {
        this.isPrimary = isPrimary;
    }

    public int getOrderSort() {
        return orderSort;
    }

    public void setOrderSort(int orderSort) {
        this.orderSort = orderSort;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.skuId);
        dest.writeString(this.path);
        dest.writeString(this.created);
        dest.writeString(this.modified);
        dest.writeInt(this.yn);
        dest.writeInt(this.isPrimary);
        dest.writeInt(this.orderSort);
        dest.writeInt(this.type);
    }

    public JDGoodsSkuImageBean() {
    }

    protected JDGoodsSkuImageBean(Parcel in) {
        this.id = in.readInt();
        this.skuId = in.readInt();
        this.path = in.readString();
        this.created = in.readString();
        this.modified = in.readString();
        this.yn = in.readInt();
        this.isPrimary = in.readInt();
        this.orderSort = in.readInt();
        this.type = in.readInt();
    }

    public static final Parcelable.Creator<JDGoodsSkuImageBean> CREATOR = new Parcelable.Creator<JDGoodsSkuImageBean>() {
        @Override
        public JDGoodsSkuImageBean createFromParcel(Parcel source) {
            return new JDGoodsSkuImageBean(source);
        }

        @Override
        public JDGoodsSkuImageBean[] newArray(int size) {
            return new JDGoodsSkuImageBean[size];
        }
    };
}
