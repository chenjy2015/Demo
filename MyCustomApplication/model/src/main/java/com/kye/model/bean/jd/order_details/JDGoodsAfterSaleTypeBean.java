package com.kye.model.bean.jd.order_details;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 02/02/2018
 * @updated : 02/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDGoodsAfterSaleTypeBean implements Parcelable {

    /**
     * code : 30
     * name : 维修
     */

    @SerializedName("code")
    private String code;
    @SerializedName("name")
    private String name;

    private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JDGoodsAfterSaleTypeBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.name);
        dest.writeByte(this.selected ? (byte) 1 : (byte) 0);
    }

    protected JDGoodsAfterSaleTypeBean(Parcel in) {
        this.code = in.readString();
        this.name = in.readString();
        this.selected = in.readByte() != 0;
    }

    public static final Creator<JDGoodsAfterSaleTypeBean> CREATOR = new Creator<JDGoodsAfterSaleTypeBean>() {
        @Override
        public JDGoodsAfterSaleTypeBean createFromParcel(Parcel source) {
            return new JDGoodsAfterSaleTypeBean(source);
        }

        @Override
        public JDGoodsAfterSaleTypeBean[] newArray(int size) {
            return new JDGoodsAfterSaleTypeBean[size];
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JDGoodsAfterSaleTypeBean)) return false;

        JDGoodsAfterSaleTypeBean that = (JDGoodsAfterSaleTypeBean) o;

        if (!code.equals(that.code)) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
