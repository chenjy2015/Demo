package com.kye.model.bean.score;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/01/2018
 * @updated : 19/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class ScoreTagModel implements Parcelable {

    private String tag;
    private boolean isSelected;
    private boolean isDisable;

    public ScoreTagModel(String tag, boolean isSelected) {
        this.tag = tag;
        this.isSelected = isSelected;
    }

    public ScoreTagModel(String tag, boolean isSelected, boolean isDisable) {
        this.tag = tag;
        this.isSelected = isSelected;
        this.isDisable = isDisable;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public void setDisable(boolean disable) {
        isDisable = disable;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tag);
        dest.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isDisable ? (byte) 1 : (byte) 0);
    }

    protected ScoreTagModel(Parcel in) {
        this.tag = in.readString();
        this.isSelected = in.readByte() != 0;
        this.isDisable = in.readByte() != 0;
    }

    public static final Creator<ScoreTagModel> CREATOR = new Creator<ScoreTagModel>() {
        @Override
        public ScoreTagModel createFromParcel(Parcel source) {
            return new ScoreTagModel(source);
        }

        @Override
        public ScoreTagModel[] newArray(int size) {
            return new ScoreTagModel[size];
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScoreTagModel)) return false;

        ScoreTagModel tagModel = (ScoreTagModel) o;

        return tag.equals(tagModel.tag);
    }

    @Override
    public int hashCode() {
        return tag.hashCode();
    }
}
