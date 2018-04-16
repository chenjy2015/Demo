package com.kye.model.bean.tcl;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class ResponseTCLGoodsListBean implements Parcelable {

    /**
     * datas : [{"goodsId":1,"goodsPrice":6500,"goodsSize":65,"urlAddress":["www.baidu.com"],"goodsName":"乐视","productName":"电视"}]
     * recordCount : 1
     */

    private int recordCount;
    private List<DatasBean> datas;

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * goodsId : 1
         * goodsPrice : 6500
         * goodsSize : 65
         * urlAddress : ["www.baidu.com"]
         * goodsName : 乐视
         * productName : 电视
         */

        private int goodsId;
        private int goodsPrice;
        private int goodsSize;
        private String goodsName;
        private String productName;
        private List<String> urlAddress;

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public int getGoodsPrice() {
            return goodsPrice;
        }

        public void setGoodsPrice(int goodsPrice) {
            this.goodsPrice = goodsPrice;
        }

        public int getGoodsSize() {
            return goodsSize;
        }

        public void setGoodsSize(int goodsSize) {
            this.goodsSize = goodsSize;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public List<String> getUrlAddress() {
            return urlAddress;
        }

        public void setUrlAddress(List<String> urlAddress) {
            this.urlAddress = urlAddress;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.recordCount);
        dest.writeList(this.datas);
    }

    public ResponseTCLGoodsListBean() {
    }

    protected ResponseTCLGoodsListBean(Parcel in) {
        this.recordCount = in.readInt();
        this.datas = new ArrayList<DatasBean>();
        in.readList(this.datas, DatasBean.class.getClassLoader());
    }

    public static final Creator<ResponseTCLGoodsListBean> CREATOR = new Creator<ResponseTCLGoodsListBean>() {
        @Override
        public ResponseTCLGoodsListBean createFromParcel(Parcel source) {
            return new ResponseTCLGoodsListBean(source);
        }

        @Override
        public ResponseTCLGoodsListBean[] newArray(int size) {
            return new ResponseTCLGoodsListBean[size];
        }
    };
}