package com.kye.model.bean.common_tool;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 07/01/2018
 * @updated : 07/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     常用工具数据entity
 */

@Entity(tableName = "common_tools")
public class CommonToolItemBean implements Parcelable {

    public CommonToolItemBean() {

    }

    @Ignore
    public CommonToolItemBean(int id, String name, boolean isSelected, int position, int positionSelected, int positionUnselected) {
        this.id = id;
        this.name = name;
        this.isSelected = isSelected;
        this.position = position;
        this.positionSelected = positionSelected;
        this.positionUnselected = positionUnselected;
    }

    @PrimaryKey
    protected int id;
    @ColumnInfo(name = "name")
    protected String name;
    @ColumnInfo(name = "isSelected")
    protected boolean isSelected;
    @ColumnInfo(name = "position")
    protected int position;
    @ColumnInfo(name = "positionSelected")
    protected int positionSelected;
    @ColumnInfo(name = "positionUnselected")
    protected int positionUnselected;

    @Ignore
    protected boolean isShowSelectedIcon;
    @Ignore
    protected int iconRes;
    @Ignore
    protected String title;

    public static final Creator<CommonToolItemBean> CREATOR = new Creator<CommonToolItemBean>() {
        @Override
        public CommonToolItemBean createFromParcel(Parcel in) {
            return new CommonToolItemBean(in);
        }

        @Override
        public CommonToolItemBean[] newArray(int size) {
            return new CommonToolItemBean[size];
        }
    };

    public int getIconRes() {
        return iconRes;
    }

    public void setIconRes(int iconRes) {
        this.iconRes = iconRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShowSelectedIcon() {
        return isShowSelectedIcon;
    }

    public void setShowSelectedIcon(boolean showSelectedIcon) {
        isShowSelectedIcon = showSelectedIcon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPositionSelected() {
        return positionSelected;
    }

    public void setPositionSelected(int positionSelected) {
        this.positionSelected = positionSelected;
    }

    public int getPositionUnselected() {
        return positionUnselected;
    }

    public void setPositionUnselected(int positionUnselected) {
        this.positionUnselected = positionUnselected;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
        dest.writeInt(this.position);
        dest.writeInt(this.positionSelected);
        dest.writeInt(this.positionUnselected);
        dest.writeByte(this.isShowSelectedIcon ? (byte) 1 : (byte) 0);
        dest.writeInt(this.iconRes);
        dest.writeString(this.title);
    }

    protected CommonToolItemBean(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.isSelected = in.readByte() != 0;
        this.position = in.readInt();
        this.positionSelected = in.readInt();
        this.positionUnselected = in.readInt();
        this.isShowSelectedIcon = in.readByte() != 0;
        this.iconRes = in.readInt();
        this.title = in.readString();
    }

    @Override
    public String toString() {
        return "CommonToolItemBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isSelected=" + isSelected +
                ", position=" + position +
                ", positionSelected=" + positionSelected +
                ", positionUnselected=" + positionUnselected +
                ", isShowSelectedIcon=" + isShowSelectedIcon +
                ", iconRes=" + iconRes +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommonToolItemBean)) return false;

        CommonToolItemBean itemBean = (CommonToolItemBean) o;

        return id == itemBean.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
