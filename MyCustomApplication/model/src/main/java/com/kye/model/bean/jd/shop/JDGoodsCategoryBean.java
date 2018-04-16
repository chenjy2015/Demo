package com.kye.model.bean.jd.shop;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/01/2018
 * @updated : 27/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     商城类别
 */

public class JDGoodsCategoryBean implements Parcelable {

    /**
     * nodes : []
     * imagePath :
     * className : 生活配件
     * iD : 432
     * parentID : 428
     */

    @SerializedName("imagePath")
    private String imagePath;
    @SerializedName("className")
    private String className;
    @SerializedName("id")
    private int id = -1;
    @SerializedName("parentID")
    private int parentID = -1;
    @SerializedName("nodes")
    private List<JDGoodsCategoryBean> nodes;

    private boolean isSecondLine;

    public boolean isSecondLine() {
        return isSecondLine;
    }

    public void setSecondLine(boolean secondLine) {
        isSecondLine = secondLine;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public List<JDGoodsCategoryBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<JDGoodsCategoryBean> nodes) {
        this.nodes = nodes;
    }


    public JDGoodsCategoryBean() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JDGoodsCategoryBean)) return false;

        JDGoodsCategoryBean that = (JDGoodsCategoryBean) o;

        if (id != that.id) return false;
        return parentID == that.parentID;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + parentID;
        return result;
    }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
                                      dest.writeString(this.imagePath);
                                      dest.writeString(this.className);
                                      dest.writeInt(this.id);
                                      dest.writeInt(this.parentID);
                                      dest.writeTypedList(this.nodes);
                                      dest.writeByte(this.isSecondLine ? (byte) 1 : (byte) 0);
                                  }

    protected JDGoodsCategoryBean(Parcel in) {
                                      this.imagePath = in.readString();
                                      this.className = in.readString();
                                      this.id = in.readInt();
                                      this.parentID = in.readInt();
                                      this.nodes = in.createTypedArrayList(JDGoodsCategoryBean.CREATOR);
                                      this.isSecondLine = in.readByte() != 0;
                                  }

    public static final Creator<JDGoodsCategoryBean> CREATOR = new Creator<JDGoodsCategoryBean>() {
        @Override
        public JDGoodsCategoryBean createFromParcel(Parcel source) {return new JDGoodsCategoryBean(source);}

        @Override
        public JDGoodsCategoryBean[] newArray(int size) {return new JDGoodsCategoryBean[size];}
    };
}
