package com.kye.model.bean.jd.after_sale;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 08/02/2018
 * @updated : 08/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDReturnModesResultBean implements Parcelable {

    @SerializedName("result")
    private List<ResultBean> result;

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean implements Parcelable {
        /**
         * code : 40
         * name : 客户发货
         */

        @SerializedName("code")
        private String code;
        @SerializedName("name")
        private String name;

        private boolean selectd;

        public boolean isSelectd() {
            return selectd;
        }

        public void setSelectd(boolean selectd) {
            this.selectd = selectd;
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.code);
            dest.writeString(this.name);
            dest.writeByte(this.selectd ? (byte) 1 : (byte) 0);
        }

        public ResultBean() {
        }

        protected ResultBean(Parcel in) {
            this.code = in.readString();
            this.name = in.readString();
            this.selectd = in.readByte() != 0;
        }

        public static final Parcelable.Creator<ResultBean> CREATOR = new Parcelable.Creator<ResultBean>() {
            @Override
            public ResultBean createFromParcel(Parcel source) {
                return new ResultBean(source);
            }

            @Override
            public ResultBean[] newArray(int size) {
                return new ResultBean[size];
            }
        };

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ResultBean)) return false;

            ResultBean that = (ResultBean) o;

            if (code != null ? !code.equals(that.code) : that.code != null) return false;
            return name != null ? name.equals(that.name) : that.name == null;
        }

        @Override
        public int hashCode() {
            int result = code != null ? code.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.result);
    }

    public JDReturnModesResultBean() {
    }

    protected JDReturnModesResultBean(Parcel in) {
        this.result = in.createTypedArrayList(ResultBean.CREATOR);
    }

    public static final Parcelable.Creator<JDReturnModesResultBean> CREATOR = new Parcelable.Creator<JDReturnModesResultBean>() {
        @Override
        public JDReturnModesResultBean createFromParcel(Parcel source) {
            return new JDReturnModesResultBean(source);
        }

        @Override
        public JDReturnModesResultBean[] newArray(int size) {
            return new JDReturnModesResultBean[size];
        }
    };
}
