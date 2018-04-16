package com.kye.model.bean.score;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/03/2018
 * @updated : 06/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class ScoreDisplayParamBean implements Parcelable {

    public ScoreDisplayParamBean(ScoreType scoreType, String code, int rating, String presetEvaluation, String remark) {
        this.scoreType = scoreType;
        this.code = code;
        this.rating = rating;
        this.presetEvaluation = presetEvaluation;
        this.remark = remark;
    }

    private ScoreType scoreType;
    private String code;
    private int rating;
    private String presetEvaluation; // 预置评价
    private String remark;

    public ScoreType getScoreType() {
        return scoreType;
    }

    public void setScoreType(ScoreType scoreType) {
        this.scoreType = scoreType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPresetEvaluation() {
        return presetEvaluation;
    }

    public void setPresetEvaluation(String presetEvaluation) {
        this.presetEvaluation = presetEvaluation;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ScoreDisplayParamBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.scoreType == null ? -1 : this.scoreType.ordinal());
        dest.writeString(this.code);
        dest.writeInt(this.rating);
        dest.writeString(this.presetEvaluation);
        dest.writeString(this.remark);
    }

    protected ScoreDisplayParamBean(Parcel in) {
        int tmpScoreType = in.readInt();
        this.scoreType = tmpScoreType == -1 ? null : ScoreType.values()[tmpScoreType];
        this.code = in.readString();
        this.rating = in.readInt();
        this.presetEvaluation = in.readString();
        this.remark = in.readString();
    }

    public static final Creator<ScoreDisplayParamBean> CREATOR = new Creator<ScoreDisplayParamBean>() {
        @Override
        public ScoreDisplayParamBean createFromParcel(Parcel source) {
            return new ScoreDisplayParamBean(source);
        }

        @Override
        public ScoreDisplayParamBean[] newArray(int size) {
            return new ScoreDisplayParamBean[size];
        }
    };
}
