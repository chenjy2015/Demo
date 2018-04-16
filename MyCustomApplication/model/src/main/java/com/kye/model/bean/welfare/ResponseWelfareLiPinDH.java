package com.kye.model.bean.welfare;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseWelfareLiPinDH implements Parcelable {

    private List<ResultBean> result;

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean implements Serializable {
        /**
         * modelID : 29
         * accessUrl :
         * modelTitle : 跨越速购商城
         * modelIcon : https://res.ky-express.com/h5/lipindh/1@3x.png
         * modelSubTitle : 生鲜产品 跨越到家
         * modelTitleColor : ff8383
         * isLogin : 0
         */

        private int modelID;
        private String accessUrl;
        private String modelTitle;
        private String modelIcon;
        private String modelSubTitle;
        private String modelTitleColor;
        private int isLogin;

        public ResultBean(int modelID, String accessUrl, String modelTitle, String modelIcon, String modelSubTitle, String modelTitleColor, int isLogin) {
            this.modelID = modelID;
            this.accessUrl = accessUrl;
            this.modelTitle = modelTitle;
            this.modelIcon = modelIcon;
            this.modelSubTitle = modelSubTitle;
            this.modelTitleColor = modelTitleColor;
            this.isLogin = isLogin;
        }

        public int getModelID() {
            return modelID;
        }

        public void setModelID(int modelID) {
            this.modelID = modelID;
        }

        public String getAccessUrl() {
            return accessUrl;
        }

        public void setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
        }

        public String getModelTitle() {
            return modelTitle;
        }

        public void setModelTitle(String modelTitle) {
            this.modelTitle = modelTitle;
        }

        public String getModelIcon() {
            return modelIcon;
        }

        public void setModelIcon(String modelIcon) {
            this.modelIcon = modelIcon;
        }

        public String getModelSubTitle() {
            return modelSubTitle;
        }

        public void setModelSubTitle(String modelSubTitle) {
            this.modelSubTitle = modelSubTitle;
        }

        public String getModelTitleColor() {
            return modelTitleColor;
        }

        public void setModelTitleColor(String modelTitleColor) {
            this.modelTitleColor = modelTitleColor;
        }

        public int getIsLogin() {
            return isLogin;
        }

        public void setIsLogin(int isLogin) {
            this.isLogin = isLogin;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.result);
    }

    public ResponseWelfareLiPinDH() {
    }

    protected ResponseWelfareLiPinDH(Parcel in) {
        this.result = new ArrayList<ResultBean>();
        in.readList(this.result, ResultBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<ResponseWelfareLiPinDH> CREATOR = new Parcelable.Creator<ResponseWelfareLiPinDH>() {
        @Override
        public ResponseWelfareLiPinDH createFromParcel(Parcel source) {
            return new ResponseWelfareLiPinDH(source);
        }

        @Override
        public ResponseWelfareLiPinDH[] newArray(int size) {
            return new ResponseWelfareLiPinDH[size];
        }
    };
}