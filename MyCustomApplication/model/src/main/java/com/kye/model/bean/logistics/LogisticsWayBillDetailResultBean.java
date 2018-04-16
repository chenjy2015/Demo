package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 20/01/2018
 * @updated : 20/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsWayBillDetailResultBean implements Parcelable {

    /**
     * result : [{"sendPeoplePhone":"","abnormalReturns":"","sendPeople":"","planArriveTime":"","data":[{"lastTime":"","serviceMode":"当天达","sender":"","originalSend":"厦门市翔安区","recipient":"","uniqId":0,"updateTime":"2017-10-10 00:00","remark":"","depart":"","uniqShow":"02300086747","sendTime":"2017-10-10 00:00","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":1,"updateTime":"2017-10-09 17:31","remark":"","depart":"","uniqShow":"出车取货","sendTime":"已安排前往客户处取货，取件员：王洪02，车牌号：员工车辆","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":2,"updateTime":"2017-10-09 16:12","remark":"","depart":"","uniqShow":"取签到","sendTime":"到达客户处，待取货","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":3,"updateTime":"2017-10-09 18:00","remark":"","depart":"","uniqShow":"离开客户","sendTime":"取货完毕，准备送往重庆操作培训组","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":12,"updateTime":"2017-10-20 17:55","remark":"","depart":"","uniqShow":"装车派送","sendTime":"正在派送途中,派件员:沙头李树波,电话:17702611972","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":13,"updateTime":"2017-10-20 17:55","remark":"","depart":"","uniqShow":"派签到","sendTime":"已到收方客户处,待签收","getAdress":"北京市朝阳区"}],"totalFreight":"","latitude":"22.689970","rating":0,"recipientPeople":"","waybill":"02300086747","permissions":false,"signforNotes":"","longitude":"113.809720","pushMark":0,"recordNumber":6,"sfRemark":"09:00-19:00","sendMark":2,"address":"深圳市福永镇**********用）","markingTime":"","receiver":"","haveOrNotReceipt1":"","leaveRemark":"","weight":"52.3","isDevivery":"0","haveOrNotFlImage":0,"presetEvaluation":"","signingTime":"","itemCount":"12","notreason":"","preSentDate":"2017-10-10","assistantPhone":"","haveOrNotInvoice":"无","orderCode":"XD1710-0039558","driverName":"","haveOrNotReceipt":"","marketAssistant":""}]
     * waybillNumber : 1
     */

    @SerializedName("waybillNumber")
    private int waybillNumber;
    @SerializedName("result")
    private List<LogisticsWayBillResultDataBean> result;

    public int getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(int waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public List<LogisticsWayBillResultDataBean> getResult() {
        return result;
    }

    public void setResult(List<LogisticsWayBillResultDataBean> result) {
        this.result = result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.waybillNumber);
        dest.writeTypedList(this.result);
    }

    public LogisticsWayBillDetailResultBean() {
    }

    protected LogisticsWayBillDetailResultBean(Parcel in) {
        this.waybillNumber = in.readInt();
        this.result = in.createTypedArrayList(LogisticsWayBillResultDataBean.CREATOR);
    }

    public static final Parcelable.Creator<LogisticsWayBillDetailResultBean> CREATOR = new Parcelable.Creator<LogisticsWayBillDetailResultBean>() {
        @Override
        public LogisticsWayBillDetailResultBean createFromParcel(Parcel source) {
            return new LogisticsWayBillDetailResultBean(source);
        }

        @Override
        public LogisticsWayBillDetailResultBean[] newArray(int size) {
            return new LogisticsWayBillDetailResultBean[size];
        }
    };
}
