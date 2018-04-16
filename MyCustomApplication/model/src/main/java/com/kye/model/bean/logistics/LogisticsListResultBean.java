package com.kye.model.bean.logistics;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 04/01/2018
 * @updated : 04/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class LogisticsListResultBean implements Parcelable {

    /**
     * datas : [{"trackRecord":"","senderAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","receiptRecipient":"","timeArrival":"","trackRecord7":"签收人:李四","trackRecord4":"","latitude":22.68997,"trackRecord5":"","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"18657325018","trackRecord1":"到达客户处,待取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往西安雁塔点部","score":"","waybill":"20762239091","receiptCall":"075584526548*010","paymentCompany":"接口部测试","ratingStatus":"0","waybillSend":"广州跨越","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"","timeDelivery":"","sfRemark":"","sendCheck":"","timeLoading":"","rush":0,"signingTime":"","sendTime":"2017-12-04 12:00","itemCount":1,"signPeople":"李四","receivesAddress":"上海上海市松江区车墩镇华阳居委会松江区车墩镇香径路169号2栋3楼","sendCarNumber":"","productCode":"","checkIn":"2017-11-15 10:04","mobilePhone":"","serviceMode":"隔日达","sendCompanyCode":"接口部测试","sender":"张三","recipient":"李四","orderCode":"XD1711-0040320","haveOrNotReceipt":"有","vipshopCode":"","getAdress":""},{"trackRecord":"","senderAddress":"广东省深圳市龙岗区石背路德众工业园B懂2楼乐易购科技有限公司","receiptRecipient":"","timeArrival":"","trackRecord7":"签收人:hll","trackRecord4":"","latitude":22.68997,"trackRecord5":"","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往乌鲁木齐机场","trackRecord3":"","receiptPhone":"18128833228","trackRecord1":"到达客户处,待取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往西安雁塔点部","score":"","waybill":"20762239129","receiptCall":"075584526548*011","paymentCompany":"接口部测试","ratingStatus":"0","waybillSend":"广州跨越","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"","timeDelivery":"","sfRemark":"","sendCheck":"","timeLoading":"","rush":0,"signingTime":"","sendTime":"2017-12-04 12:00","itemCount":1,"signPeople":"hll","receivesAddress":"广东省中山市三角镇三角村456","sendCarNumber":"","productCode":"","checkIn":"2017-11-16 14:50","mobilePhone":"","serviceMode":"隔日达","sendCompanyCode":"接口部测试","sender":"测试","recipient":"苏惠芳","orderCode":"XD1711-0042657","haveOrNotReceipt":"有","vipshopCode":"","getAdress":""},{"trackRecord":"已到收方客户处,待签收","senderAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","receiptRecipient":"","timeArrival":"","trackRecord7":"签收人:节点3","trackRecord4":"","latitude":22.68997,"trackRecord5":"正在派送途中,派件员:张林02,电话:13211111111","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"","trackRecord1":"到达客户处,待取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往西安雁塔点部","score":"","waybill":"20762239001","receiptCall":"","paymentCompany":"深圳航盛电子","ratingStatus":"0","waybillSend":"接口部测试","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"深圳航盛电子","timeDelivery":"","sfRemark":"","sendCheck":"2017-11-15 17:43","timeLoading":"2017-11-15 17:42","rush":0,"signingTime":"","sendTime":"2017-12-04 12:00","itemCount":10,"signPeople":"节点3","receivesAddress":"广东省深圳市宝安区福永街道和平社区航盛工业园1","sendCarNumber":"","productCode":"","checkIn":"2017-11-15 10:04","mobilePhone":"66666666666","serviceMode":"当天达","sendCompanyCode":"接口部测试","sender":"","recipient":"","orderCode":"XD1711-0040320","haveOrNotReceipt":"","vipshopCode":"","getAdress":"沙井和平街道"},{"trackRecord":"已到收方客户处,待签收","senderAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","receiptRecipient":"","timeArrival":"","trackRecord7":"签收人:125","trackRecord4":"","latitude":22.68997,"trackRecord5":"","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"18657325018","trackRecord1":"到达客户处,待取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往西安雁塔点部","score":"","waybill":"20762239087","receiptCall":"075584526548*010","paymentCompany":"接口部测试","ratingStatus":"0","waybillSend":"广州跨越","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"","timeDelivery":"","sfRemark":"","sendCheck":"2017-11-16 10:52","timeLoading":"","rush":1,"signingTime":"","sendTime":"2017-12-04 12:00","itemCount":1,"signPeople":"125","receivesAddress":"上海上海市松江区车墩镇华阳居委会松江区车墩镇香径路169号2栋3楼","sendCarNumber":"","productCode":"","checkIn":"2017-11-15 10:04","mobilePhone":"18102322365","serviceMode":"隔日达","sendCompanyCode":"接口部测试","sender":"张三","recipient":"李四","orderCode":"XD1711-0040320","haveOrNotReceipt":"有","vipshopCode":"","getAdress":""},{"trackRecord":"已到收方客户处,待签收","senderAddress":"广东省深圳市龙岗区石背路德众工业园B懂2楼乐易购科技有限公司","receiptRecipient":"","timeArrival":"","trackRecord7":"签收人:123","trackRecord4":"快件到达雅安操作部，准备派往客户","latitude":22.68997,"trackRecord5":"正在派送途中,派件员:七七,电话:","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"18888888881","trackRecord1":"到达客户处,待取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往西安雁塔点部","score":"","waybill":"20762239128","receiptCall":"075584526548*010","paymentCompany":"接口部测试","ratingStatus":"4","waybillSend":"广州跨越","longitude":113.80972,"timeGetPoint":"2017-11-16 15:49","receiptCompanyCode":"广州跨越","timeDelivery":"","sfRemark":"","sendCheck":"2017-11-16 15:50","timeLoading":"2017-11-16 15:49","rush":0,"signingTime":"","sendTime":"2017-12-03 12:00","itemCount":1,"signPeople":"123","receivesAddress":"四川省雅安市名山区蒙阳镇","sendCarNumber":"","productCode":"","checkIn":"2017-11-16 14:50","mobilePhone":"","serviceMode":"隔日达","sendCompanyCode":"接口部测试","sender":"张三","recipient":"李四","orderCode":"XD1711-0042657","haveOrNotReceipt":"有","vipshopCode":"","getAdress":"花都花东机场"},{"trackRecord":"","senderAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","receiptRecipient":"","timeArrival":"","trackRecord7":"","trackRecord4":"","latitude":22.68997,"trackRecord5":"","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"","trackRecord1":"上门取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往开发组司机","score":"","waybill":"75503412464","receiptCall":"","paymentCompany":"接口部测试","ratingStatus":"0","waybillSend":"","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"沙井和平点部","timeDelivery":"","sfRemark":"","sendCheck":"","timeLoading":"","rush":1,"signingTime":"","sendTime":"2017-11-29 11:30","itemCount":45,"signPeople":"","receivesAddress":"广东省深圳市宝安区福永街道和平社区蚝业路33号","sendCarNumber":"","productCode":"","checkIn":"","mobilePhone":"","serviceMode":"当天达","sendCompanyCode":"接口部测试","sender":"1","recipient":"1","orderCode":"","haveOrNotReceipt":"","vipshopCode":"","getAdress":"沙井和平重庆路"},{"trackRecord":"","senderAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","receiptRecipient":"","timeArrival":"","trackRecord7":"","trackRecord4":"","latitude":22.68997,"trackRecord5":"","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"","trackRecord1":"到达客户处,待取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往解答调研组","score":"","waybill":"75503412465","receiptCall":"","paymentCompany":"接口部测试","ratingStatus":"0","waybillSend":"接口部测试","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"","timeDelivery":"","sfRemark":"","sendCheck":"","timeLoading":"","rush":1,"signingTime":"","sendTime":"2017-11-25 16:18","itemCount":1,"signPeople":"","receivesAddress":"北京北京市海淀区马连洼街道农大南路社区农大南路88号万霖大厦2层小E","sendCarNumber":"","productCode":"","checkIn":"2017-11-25 14:20","mobilePhone":"","serviceMode":"次日达","sendCompanyCode":"接口部测试","sender":"1","recipient":"1","orderCode":"","haveOrNotReceipt":"有","vipshopCode":"","getAdress":""},{"trackRecord":"","senderAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","receiptRecipient":"","timeArrival":"","trackRecord7":"","trackRecord4":"","latitude":22.68997,"trackRecord5":"","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"13874414141","trackRecord1":"上门取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往西安雁塔点部","score":"","waybill":"57400940483","receiptCall":"","paymentCompany":"接口部测试","ratingStatus":"0","waybillSend":"","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"","timeDelivery":"","sfRemark":"","sendCheck":"","timeLoading":"","rush":0,"signingTime":"","sendTime":"2017-11-24 18:46","itemCount":10,"signPeople":"","receivesAddress":"湖南省怀化市麻阳县吕家坪","sendCarNumber":"","productCode":"","checkIn":"","mobilePhone":"","serviceMode":"当天达","sendCompanyCode":"接口部测试","sender":"","recipient":"华年","orderCode":"","haveOrNotReceipt":"","vipshopCode":"","getAdress":"麻阳苗族自治县吕家坪镇"},{"trackRecord":"","senderAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","receiptRecipient":"","timeArrival":"","trackRecord7":"","trackRecord4":"","latitude":22.68997,"trackRecord5":"","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"","trackRecord1":"到达客户处,待取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往运单后台组","score":"","waybill":"57400940402","receiptCall":"","paymentCompany":"接口部测试","ratingStatus":"0","waybillSend":"接口部测试","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"鄂州唯品会","timeDelivery":"","sfRemark":"","sendCheck":"","timeLoading":"","rush":1,"signingTime":"","sendTime":"2017-11-24 17:59","itemCount":1,"signPeople":"","receivesAddress":"湖北省鄂州市华容区华容镇桥头村（唯品会）人民路鄂州唯品会华中物流中心","sendCarNumber":"","productCode":"","checkIn":"2017-11-24 14:17","mobilePhone":"","serviceMode":"次日达","sendCompanyCode":"接口部测试","sender":"","recipient":"","orderCode":"","haveOrNotReceipt":"","vipshopCode":".","getAdress":"武汉鄂州"},{"trackRecord":"","senderAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","receiptRecipient":"","timeArrival":"","trackRecord7":"","trackRecord4":"","latitude":22.68997,"trackRecord5":"","trackRecord2":"到达乌鲁木齐点部正在分拣,准备送往始发机场","trackRecord3":"","receiptPhone":"","trackRecord1":"到达客户处,待取货","type":0,"urge":"1","sendAdress":"取货完毕,准备送往运单后台组","score":"","waybill":"57400940431","receiptCall":"","paymentCompany":"鄂州唯品会","ratingStatus":"0","waybillSend":"接口部测试","longitude":113.80972,"timeGetPoint":"","receiptCompanyCode":"鄂州唯品会","timeDelivery":"","sfRemark":"","sendCheck":"","timeLoading":"","rush":1,"signingTime":"","sendTime":"2017-11-24 17:58","itemCount":1,"signPeople":"","receivesAddress":"湖北省鄂州市华容区华容镇桥头村（唯品会）人民路鄂州唯品会华中物流中心","sendCarNumber":"","productCode":"","checkIn":"2017-11-24 14:17","mobilePhone":"","serviceMode":"次日达","sendCompanyCode":"接口部测试","sender":"","recipient":"","orderCode":"","haveOrNotReceipt":"","vipshopCode":".","getAdress":"武汉鄂州"}]
     * recordCount : 25
     */

    @SerializedName("recordCount")
    private int recordCount;
    @SerializedName("datas")
    private List<LogisticsItemBean> datas;

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<LogisticsItemBean> getDatas() {
        return datas;
    }

    public void setDatas(List<LogisticsItemBean> datas) {
        this.datas = datas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.recordCount);
        dest.writeTypedList(this.datas);
    }

    public LogisticsListResultBean() {
    }

    protected LogisticsListResultBean(Parcel in) {
        this.recordCount = in.readInt();
        this.datas = in.createTypedArrayList(LogisticsItemBean.CREATOR);
    }

    public static final Parcelable.Creator<LogisticsListResultBean> CREATOR = new Parcelable.Creator<LogisticsListResultBean>() {
        @Override
        public LogisticsListResultBean createFromParcel(Parcel source) {
            return new LogisticsListResultBean(source);
        }

        @Override
        public LogisticsListResultBean[] newArray(int size) {
            return new LogisticsListResultBean[size];
        }
    };
}
