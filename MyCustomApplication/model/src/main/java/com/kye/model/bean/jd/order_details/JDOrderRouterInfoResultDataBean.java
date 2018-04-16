package com.kye.model.bean.jd.order_details;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 25/01/2018
 * @updated : 25/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDOrderRouterInfoResultDataBean implements Parcelable {

    /**
     * orderTrack : [{"msgTime":"2016-12-18 00:10:17","content":"您提交了订单，请等待系统确认","operator":"客户"},{"msgTime":"2016-12-18 00:10:23","content":"您的订单已经进入京东2号库准备出库","operator":"系统"},{"msgTime":"2016-12-18 00:20:18","content":"您的订单从厦门市发货，预计12月18日 24:00前送达","operator":"系统"},{"msgTime":"2016-12-18 07:48:12","content":"您的订单已经打印完毕","operator":"系统"},{"msgTime":"2016-12-18 08:01:36","content":"您的订单已经拣货完成","operator":"段俊龙"},{"msgTime":"2016-12-18 08:35:15","content":"扫描员已经扫描","operator":"林福英"},{"msgTime":"2016-12-18 08:39:29","content":"打包成功","operator":"京东打包员"},{"msgTime":"2016-12-18 10:13:12","content":"您的订单在京东【厦门分拨中心】分拣完成","operator":"周玉芬"},{"msgTime":"2016-12-18 11:46:43","content":"您的订单在京东【厦门分拨中心】发货完成，准备送往京东【厦门新阳站】","operator":"周玉芬"},{"msgTime":"2016-12-18 13:52:53","content":"您的订单在京东【厦门新阳站】验货完成，正在分配配送员","operator":"张固军"},{"msgTime":"2016-12-18 14:03:46","content":"京东配送员【左建锋】已出发，联系电话【15396261609或0592-5219750，感谢您的耐心等待】","operator":"左建锋"},{"msgTime":"2016-12-18 15:17:57","content":"感谢您在京东购物，欢迎您再次光临！","operator":"左建锋"}]
     * jdOrderId : 47655409133
     */

    @SerializedName("jdOrderId")
    private long jdOrderId;
    @SerializedName("orderTrack")
    private ArrayList<JDOrderRouterInfoBean> orderTrack;

    public long getJdOrderId() {
        return jdOrderId;
    }

    public void setJdOrderId(long jdOrderId) {
        this.jdOrderId = jdOrderId;
    }

    public ArrayList<JDOrderRouterInfoBean> getOrderTrack() {
        return orderTrack;
    }

    public void setOrderTrack(ArrayList<JDOrderRouterInfoBean> orderTrack) {
        this.orderTrack = orderTrack;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.jdOrderId);
        dest.writeTypedList(this.orderTrack);
    }

    public JDOrderRouterInfoResultDataBean() {
    }

    protected JDOrderRouterInfoResultDataBean(Parcel in) {
        this.jdOrderId = in.readLong();
        this.orderTrack = in.createTypedArrayList(JDOrderRouterInfoBean.CREATOR);
    }

    public static final Parcelable.Creator<JDOrderRouterInfoResultDataBean> CREATOR = new Parcelable.Creator<JDOrderRouterInfoResultDataBean>() {
        @Override
        public JDOrderRouterInfoResultDataBean createFromParcel(Parcel source) {
            return new JDOrderRouterInfoResultDataBean(source);
        }

        @Override
        public JDOrderRouterInfoResultDataBean[] newArray(int size) {
            return new JDOrderRouterInfoResultDataBean[size];
        }
    };
}
