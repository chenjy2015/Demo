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
 * <p>
 * 京东商城商品列表请求结果
 */

public class JDGoodsListResultBean implements Parcelable {

    /**
     * datas : [{"updateDate":"2017/1/19 16:58:21","needScore":80860,"getProductData":"","imagePath":"jfs/t1879/122/555272999/70487/50cff809/56161fbfNe0a2c08b.jpg","productData":"","pageSize":"","className":"流行男鞋","shelvesFlag":"1","pageNum":"249","kySign":"","productName":"鸿星尔克ERKE时尚E字复古男慢跑鞋11115120292中灰/棕黄43码","classID":274,"rowsCount":1,"price":279,"sku":"1969804","recomdFlag":0,"skuImage":{"1969804":[{"id":15611555,"skuId":1969804,"path":"jfs/t1879/122/555272999/70487/50cff809/56161fbfNe0a2c08b.jpg","created":"2015-10-08 15:48:17","modified":"2015-10-08 15:48:17","yn":1,"isPrimary":1,"orderSort":0,"position":null,"type":0,"features":null},{"id":15611556,"skuId":1969804,"path":"jfs/t1855/122/534310844/98902/88400fda/56161fbfN0c6e7b5e.jpg","created":"2015-10-08 15:48:17","modified":"2015-10-08 15:48:17","yn":1,"isPrimary":0,"orderSort":1,"position":null,"type":0,"features":null},{"id":15611557,"skuId":1969804,"path":"jfs/t1837/123/547003362/68685/d9db5b94/56161fc0Ncf50121d.jpg","created":"2015-10-08 15:48:17","modified":"2015-10-08 15:48:17","yn":1,"isPrimary":0,"orderSort":2,"position":null,"type":0,"features":null},{"id":15611558,"skuId":1969804,"path":"jfs/t2047/94/558932194/81790/ebdf56e9/56161fc1Nf658aa59.jpg","created":"2015-10-08 15:48:17","modified":"2015-10-08 15:48:17","yn":1,"isPrimary":0,"orderSort":3,"position":null,"type":0,"features":null}]},"createDate":"2015/12/27 0:23:40"}]
     * maxTotal : 34
     */

    @SerializedName("maxTotal")
    private int maxTotal;
    @SerializedName("datas")
    private List<JDGoodsItemBean> datas;

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public List<JDGoodsItemBean> getDatas() {
        return datas;
    }

    public void setDatas(List<JDGoodsItemBean> datas) {
        this.datas = datas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.maxTotal);
        dest.writeTypedList(this.datas);
    }

    private JDGoodsListResultBean(Parcel in) {
        this.maxTotal = in.readInt();
        this.datas = in.createTypedArrayList(JDGoodsItemBean.CREATOR);
    }

    private static final Parcelable.Creator<JDGoodsListResultBean> CREATOR = new Parcelable.Creator<JDGoodsListResultBean>() {
        @Override
        public JDGoodsListResultBean createFromParcel(Parcel source) {
            return new JDGoodsListResultBean(source);
        }

        @Override
        public JDGoodsListResultBean[] newArray(int size) {
            return new JDGoodsListResultBean[size];
        }
    };
}
