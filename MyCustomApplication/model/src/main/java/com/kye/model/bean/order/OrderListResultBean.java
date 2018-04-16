package com.kye.model.bean.order;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 03/01/2018
 * @updated : 03/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class OrderListResultBean implements Parcelable {

    /**
     * recrrdCount : 3
     * data : [{"destionation2":"","destionation1":"","goodTime":"2017-09-11 20:20","qpDriver":"罗章","destionation3":"","commodities":"测试",
     * "remark":"abcdef","custY":"","serviceMode2":"","serviceMode3":"","custX":"","orderState":"取货中","serviceMode1":"隔日达","number":"10","marketer":"唐美","orderTime":"2017-09-11 10:04","qpDriverPhone":"18948179547","ratingStatus":"5","recorder":"云仓送货","address":"上海上海市嘉定区华亭镇北新村高石公路2439号6栋","sendCompany":"上海云仓货运代理有限公司","assistant":"","isCanUP":"0","weight":"20","carX":"","telephone":"","carY":"","qpPoint":"中山东升点部","orderTelphone":"18681438009","sender":"贺金山测测哦","sendCompanyCode":"02199167216","totalPoll":"1","temporaryAddress":"江西省赣州市兴国县龙口镇丰溪村","getTelphone":"","wight1":"","wight2":"","orderCode":"XD1709-0001215","wight3":""}]
     */

    @SerializedName("recrrdCount")
    private int recrrdCount;
    @SerializedName("data")
    private List<OrderItemBean> data;

    public int getRecrrdCount() {
        return recrrdCount;
    }

    public void setRecrrdCount(int recrrdCount) {
        this.recrrdCount = recrrdCount;
    }

    public List<OrderItemBean> getData() {
        return data;
    }

    public void setData(List<OrderItemBean> data) {
        this.data = data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.recrrdCount);
        dest.writeTypedList(this.data);
    }

    public OrderListResultBean() {
    }

    protected OrderListResultBean(Parcel in) {
        this.recrrdCount = in.readInt();
        this.data = in.createTypedArrayList(OrderItemBean.CREATOR);
    }

    public static final Parcelable.Creator<OrderListResultBean> CREATOR = new Parcelable.Creator<OrderListResultBean>() {
        @Override
        public OrderListResultBean createFromParcel(Parcel source) {
            return new OrderListResultBean(source);
        }

        @Override
        public OrderListResultBean[] newArray(int size) {
            return new OrderListResultBean[size];
        }
    };
}
