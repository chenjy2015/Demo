package com.kye.model.bean.address;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 31/01/2018
 * @updated : 31/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     跨越地址
 */

public class AddressBean implements Parcelable {

    private int id;
    private String name;
    private char firstLetter;

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

    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressBean)) return false;

        AddressBean that = (AddressBean) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public AddressBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.firstLetter);
    }

    protected AddressBean(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.firstLetter = (char) in.readInt();
    }

    public static final Creator<AddressBean> CREATOR = new Creator<AddressBean>() {
        @Override
        public AddressBean createFromParcel(Parcel source) {
            return new AddressBean(source);
        }

        @Override
        public AddressBean[] newArray(int size) {
            return new AddressBean[size];
        }
    };
}
