package com.kye.model.bean.order;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 17/01/2018
 * @updated : 17/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     todo : 最新更新，普通下单的详情和扫描下单的详情共用当前的数据bean
 *
 *     由于当前订单详情分普通订单和扫码订单
 *     两种订单详情的UI界面百分之99一致，但接口分不同的接口进行请求
 *     接口请求的返回的数据结构以及字段名称存在加大差异，当前的UI和业务与普通订单详情耦合加大，
 *     因此在处理扫码订单时对扫码订单进行响应的数据处理，使扫码订单的字段都映射到普通订单的数据结构上
 *
 */

public class OrderDetailResultBean implements Parcelable {

    /**
     * orderScore : [{"score":1,"submitTime":"2017-12-13 22:03","remark":"好好看看自己有没有问题\u2026\u2026测试结果表明\u2026\u2026","presetText":"1234"}]
     * orderMain : {"data":[{"leaveTime":"","uniqUpTime":"已取1票","uniqId":"5","uniqParticular":"","uniqShow":""}],"qpDriver":"22p0","remark":"好好看看自己有没有问题\u2026\u2026测试结果表明\u2026\u2026","serviceMode2":"v634","serviceMode3":"3886","pickupCount":"1","isArriveCurrentDay":0,"whethDeclaration":"1","marketer":"4fig","score":"1","orderTime":"2018-01-04 00:56","qpDriverPhone":"4t9l","goodsState":"3","goodTime":"2018-01-04 01:20","goodsStateDate":"2017-12-13 20:11","temporaryAddressGuid":"2143","probablyWeight":"3","goodsName":"刚刚","numberProbably":"20","companyCode":"51231636197","loadometerWeight":0,"address":"江苏省苏州市苏州工业园区胜浦街道园东社区佳胜路36号","showTracking":1,"telephone":"nkaf","qpPoint":"厦门思明点部","presetText":"1234","volume":"常规尺寸","dispatchTime":"2017-12-13 19:19","clientorderMan":"好纠结","submitTime":"2017-12-13 22:03","temporaryAddress":"7fu1","totalPoll":"2","getTelphone":"y6y5","assistantPhone":"d63n","orderCode":"XD1712-0018496","orderCompany":"苏州新凯","singleContent":"r07z"}
     */

    @SerializedName("orderMain")
    private OrderMainBean        orderMain;
    @SerializedName("orderScore")
    private List<OrderScoreBean> orderScore;
    @SerializedName("logisticsData")
    private List<OrderMainLogisticsBean> logisticsData;

    public List<OrderMainLogisticsBean> getLogisticsData() {
        return logisticsData;
    }

    public void setLogisticsData(List<OrderMainLogisticsBean> logisticsData) {
        this.logisticsData = logisticsData;
    }

    public OrderMainBean getOrderMain() {
        return orderMain;
    }

    public void setOrderMain(OrderMainBean orderMain) {
        this.orderMain = orderMain;
    }

    public List<OrderScoreBean> getOrderScore() {
        return orderScore;
    }

    public void setOrderScore(List<OrderScoreBean> orderScore) {
        this.orderScore = orderScore;
    }

    public static class OrderMainBean implements Parcelable {
        /**
         * data : [{"leaveTime":"","uniqUpTime":"已取1票","uniqId":"5","uniqParticular":"","uniqShow":""}]
         * qpDriver : 22p0
         * remark : 好好看看自己有没有问题……测试结果表明……
         * serviceMode2 : v634
         * serviceMode3 : 3886
         * pickupCount : 1
         * isArriveCurrentDay : 0
         * whethDeclaration : 1
         * marketer : 4fig
         * score : 1
         * orderTime : 2018-01-04 00:56
         * qpDriverPhone : 4t9l
         * goodsState : 3 // todo : 0:处理中 1:已调度(根据地址，10km以内显示地图) 2:已到达 3:已取货
         * goodTime : 2018-01-04 01:20
         * goodsStateDate : 2017-12-13 20:11
         * temporaryAddressGuid : 2143
         * probablyWeight : 3
         * goodsName : 刚刚
         * numberProbably : 20
         * companyCode : 51231636197
         * loadometerWeight : 0
         * address : 江苏省苏州市苏州工业园区胜浦街道园东社区佳胜路36号
         * showTracking : 1
         * telephone : nkaf
         * qpPoint : 厦门思明点部
         * presetText : 1234
         * volume : 常规尺寸
         * dispatchTime : 2017-12-13 19:19
         * clientorderMan : 好纠结
         * submitTime : 2017-12-13 22:03
         * temporaryAddress : 7fu1
         * totalPoll : 2
         * getTelphone : y6y5
         * assistantPhone : d63n
         * orderCode : XD1712-0018496
         * orderCompany : 苏州新凯
         * singleContent : r07z
         */

        /**
         * piaoCount : 1
         * goodsTypeTime : 2018/1/4 0:56:00
         * serviceMode : qk8e
         * goodsType : 0
         * remark : abcdef
         * totalPoll : 1
         * orderContent : i2h5
         * size : 70pe
         * temporaryAddress : dcio
         * address : 浙江省杭州市西湖区西溪街道花园亭社区万塘路69号华星科技苑小四楼一楼
         * temporaryPhone : 5u0g
         * customerPhone : ml8s
         * weight : 12
         * orderCode : XD1712-0002955
         * goodsName : 测试
         * clientorderMan : 侯越鹏测试
         * goodTime : 2018/1/4 1:20:00
         * orderCompany : 杭州何汝华
         * whethDeclaration : 有
         * companyCode : 57177676165
         * loadometerWeight : 0
         * routeData : [{"uniqId":"5","uniqShow":"","uniqUpTime":"已取1票","uniqParticular":"","departureTime":""}]
         * showTracking : 1
         * qpDriver : 6652
         * qpDriverPhone : j3is
         * mileage : j20d
         * number : 10
         * sendAddressGuid : 022r
         * reciveAddressGuid : tk69
         * submitTime : 2fip
         * commentRemark : 5se1
         * score : s4r8
         * presetText : 421s
         * pushLogo : 0
         * sendProvince : 82n8
         * sendCity : 15nd
         * sendArea : 3a88
         * receiptProvince : 198e
         * receiptCity : 4lo4
         * receiptArea : 2t1w
         * senderAddress : bn64
         * receivesAddress : 1wkh
         */

        // todo : 一下为扫描下单新增的字段

        @SerializedName("piaoCount")
        private String              piaoCount;
        @SerializedName("goodsTypeTime")
        private String              goodsTypeTime;
        @SerializedName("serviceMode")
        private String              serviceMode;
        @SerializedName("goodsType")
        private String              goodsType;
        @SerializedName("orderContent")
        private String              orderContent;
        @SerializedName("temporaryPhone")
        private String              temporaryPhone;
        @SerializedName("customerPhone")
        private String              customerPhone;
        @SerializedName("weight")
        private String              weight;
        @SerializedName("clientorderMan")
        private String              clientorderMan;
        @SerializedName("mileage")
        private String              mileage;
        @SerializedName("number")
        private String              number;
        @SerializedName("sendAddressGuid")
        private String              sendAddressGuid;
        @SerializedName("reciveAddressGuid")
        private String              reciveAddressGuid;
        @SerializedName("commentRemark")
        private String              commentRemark;
        @SerializedName("pushLogo")
        private int                 pushLogo;
        @SerializedName("sendProvince")
        private String              sendProvince;
        @SerializedName("sendCity")
        private String              sendCity;
        @SerializedName("sendArea")
        private String              sendArea;
        @SerializedName("receiptProvince")
        private String              receiptProvince;
        @SerializedName("receiptCity")
        private String              receiptCity;
        @SerializedName("receiptArea")
        private String              receiptArea;
        @SerializedName("senderAddress")
        private String              senderAddress;
        @SerializedName("receivesAddress")
        private String              receivesAddress;
        @SerializedName("routeData")
        private List<OrderMainItemBean> routeData;


        // todo : 以下为普通订单的字段

        @SerializedName("qpDriver")
        private String                  qpDriver;
        @SerializedName("remark")
        private String                  remark;
        @SerializedName("serviceMode2")
        private String                  serviceMode2;
        @SerializedName("serviceMode3")
        private String                  serviceMode3;
        @SerializedName("pickupCount")
        private String                  pickupCount;
        @SerializedName("isArriveCurrentDay")
        private int                     isArriveCurrentDay;
        @SerializedName("whethDeclaration")
        private String                  whethDeclaration;
        @SerializedName("marketer")
        private String                  marketer;
        @SerializedName("score")
        private String                  score;
        @SerializedName("orderTime")
        private String                  orderTime;
        @SerializedName("qpDriverPhone")
        private String                  qpDriverPhone;
        @SerializedName("goodsState")
        private String                  goodsState;
        @SerializedName("goodTime")
        private String                  goodTime;
        @SerializedName("goodsStateDate")
        private String                  goodsStateDate;
        @SerializedName("temporaryAddressGuid")
        private String                  temporaryAddressGuid;
        @SerializedName("probablyWeight")
        private String                  probablyWeight;
        @SerializedName("goodsName")
        private String                  goodsName;
        @SerializedName("numberProbably")
        private String                  numberProbably;
        @SerializedName("companyCode")
        private String                  companyCode;
        @SerializedName("loadometerWeight")
        private int                     loadometerWeight;
        @SerializedName("address")
        private String                  address;
        @SerializedName("showTracking")
        private int                     showTracking;
        @SerializedName("telephone")
        private String                  telephone;
        @SerializedName("qpPoint")
        private String                  qpPoint;
        @SerializedName("presetText")
        private String                  presetText;
        @SerializedName("volume")
        private String                  volume;
        @SerializedName("dispatchTime")
        private String                  dispatchTime;
        @SerializedName("orderMan")
        private String                  orderMan;
        @SerializedName("submitTime")
        private String                  submitTime;
        @SerializedName("temporaryAddress")
        private String                  temporaryAddress;
        @SerializedName("totalPoll")
        private String                  totalPoll;
        @SerializedName("getTelphone")
        private String                  getTelphone;
        @SerializedName("assistantPhone")
        private String                  assistantPhone;
        @SerializedName("orderCode")
        private String                  orderCode;
        @SerializedName("orderCompany")
        private String                  orderCompany;
        @SerializedName("singleContent")
        private String                  singleContent;
        @SerializedName("data")
        private List<OrderMainItemBean> data;
        @SerializedName("weight1")
        private String                  weight1;
        @SerializedName("commodities")
        private String                  commodities;
        @SerializedName("totalNumber")
        private String                  totalNumber;
        @SerializedName("size")
        private String                  size;

        public List<OrderMainItemBean> getRouteData() {
            return routeData;
        }

        public void setRouteData(List<OrderMainItemBean> routeData) {
            this.routeData = routeData;
        }

        public String getPiaoCount() {
            return piaoCount;
        }

        public void setPiaoCount(String piaoCount) {
            this.piaoCount = piaoCount;
        }

        public String getGoodsTypeTime() {
            return goodsTypeTime;
        }

        public void setGoodsTypeTime(String goodsTypeTime) {
            this.goodsTypeTime = goodsTypeTime;
        }

        public String getServiceMode() {
            return serviceMode;
        }

        public void setServiceMode(String serviceMode) {
            this.serviceMode = serviceMode;
        }

        public String getGoodsType() {
            return goodsType;
        }

        public void setGoodsType(String goodsType) {
            this.goodsType = goodsType;
        }

        public String getOrderContent() {
            return orderContent;
        }

        public void setOrderContent(String orderContent) {
            this.orderContent = orderContent;
        }

        public String getTemporaryPhone() {
            return temporaryPhone;
        }

        public void setTemporaryPhone(String temporaryPhone) {
            this.temporaryPhone = temporaryPhone;
        }

        public String getCustomerPhone() {
            return customerPhone;
        }

        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getClientorderMan() {
            return clientorderMan;
        }

        public void setClientorderMan(String clientorderMan) {
            this.clientorderMan = clientorderMan;
        }

        public String getMileage() {
            return mileage;
        }

        public void setMileage(String mileage) {
            this.mileage = mileage;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getSendAddressGuid() {
            return sendAddressGuid;
        }

        public void setSendAddressGuid(String sendAddressGuid) {
            this.sendAddressGuid = sendAddressGuid;
        }

        public String getReciveAddressGuid() {
            return reciveAddressGuid;
        }

        public void setReciveAddressGuid(String reciveAddressGuid) {
            this.reciveAddressGuid = reciveAddressGuid;
        }

        public String getCommentRemark() {
            return commentRemark;
        }

        public void setCommentRemark(String commentRemark) {
            this.commentRemark = commentRemark;
        }

        public int getPushLogo() {
            return pushLogo;
        }

        public void setPushLogo(int pushLogo) {
            this.pushLogo = pushLogo;
        }

        public String getSendProvince() {
            return sendProvince;
        }

        public void setSendProvince(String sendProvince) {
            this.sendProvince = sendProvince;
        }

        public String getSendCity() {
            return sendCity;
        }

        public void setSendCity(String sendCity) {
            this.sendCity = sendCity;
        }

        public String getSendArea() {
            return sendArea;
        }

        public void setSendArea(String sendArea) {
            this.sendArea = sendArea;
        }

        public String getReceiptProvince() {
            return receiptProvince;
        }

        public void setReceiptProvince(String receiptProvince) {
            this.receiptProvince = receiptProvince;
        }

        public String getReceiptCity() {
            return receiptCity;
        }

        public void setReceiptCity(String receiptCity) {
            this.receiptCity = receiptCity;
        }

        public String getReceiptArea() {
            return receiptArea;
        }

        public void setReceiptArea(String receiptArea) {
            this.receiptArea = receiptArea;
        }

        public String getSenderAddress() {
            return senderAddress;
        }

        public void setSenderAddress(String senderAddress) {
            this.senderAddress = senderAddress;
        }

        public String getReceivesAddress() {
            return receivesAddress;
        }

        public void setReceivesAddress(String receivesAddress) {
            this.receivesAddress = receivesAddress;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getTotalNumber() {
            return totalNumber;
        }

        public void setTotalNumber(String totalNumber) {
            this.totalNumber = totalNumber;
        }

        public String getCommodities() {
            return commodities;
        }

        public void setCommodities(String commodities) {
            this.commodities = commodities;
        }

        public String getWeight1() {
            return weight1;
        }

        public void setWeight1(String weight1) {
            this.weight1 = weight1;
        }

        public String getQpDriver() {
            return qpDriver;
        }

        public void setQpDriver(String qpDriver) {
            this.qpDriver = qpDriver;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getServiceMode2() {
            return serviceMode2;
        }

        public void setServiceMode2(String serviceMode2) {
            this.serviceMode2 = serviceMode2;
        }

        public String getServiceMode3() {
            return serviceMode3;
        }

        public void setServiceMode3(String serviceMode3) {
            this.serviceMode3 = serviceMode3;
        }

        public String getPickupCount() {
            return pickupCount;
        }

        public void setPickupCount(String pickupCount) {
            this.pickupCount = pickupCount;
        }

        public int getIsArriveCurrentDay() {
            return isArriveCurrentDay;
        }

        public void setIsArriveCurrentDay(int isArriveCurrentDay) {
            this.isArriveCurrentDay = isArriveCurrentDay;
        }

        public String getWhethDeclaration() {
            return whethDeclaration;
        }

        public void setWhethDeclaration(String whethDeclaration) {
            this.whethDeclaration = whethDeclaration;
        }

        public String getMarketer() {
            return marketer;
        }

        public void setMarketer(String marketer) {
            this.marketer = marketer;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(String orderTime) {
            this.orderTime = orderTime;
        }

        public String getQpDriverPhone() {
            return qpDriverPhone;
        }

        public void setQpDriverPhone(String qpDriverPhone) {
            this.qpDriverPhone = qpDriverPhone;
        }

        public String getGoodsState() {
            return goodsState;
        }

        public void setGoodsState(String goodsState) {
            this.goodsState = goodsState;
        }

        public String getGoodTime() {
            return goodTime;
        }

        public void setGoodTime(String goodTime) {
            this.goodTime = goodTime;
        }

        public String getGoodsStateDate() {
            return goodsStateDate;
        }

        public void setGoodsStateDate(String goodsStateDate) {
            this.goodsStateDate = goodsStateDate;
        }

        public String getTemporaryAddressGuid() {
            return temporaryAddressGuid;
        }

        public void setTemporaryAddressGuid(String temporaryAddressGuid) {
            this.temporaryAddressGuid = temporaryAddressGuid;
        }

        public String getProbablyWeight() {
            return probablyWeight;
        }

        public void setProbablyWeight(String probablyWeight) {
            this.probablyWeight = probablyWeight;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public String getNumberProbably() {
            return numberProbably;
        }

        public void setNumberProbably(String numberProbably) {
            this.numberProbably = numberProbably;
        }

        public String getCompanyCode() {
            return companyCode;
        }

        public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
        }

        public int getLoadometerWeight() {
            return loadometerWeight;
        }

        public void setLoadometerWeight(int loadometerWeight) {
            this.loadometerWeight = loadometerWeight;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getShowTracking() {
            return showTracking;
        }

        public void setShowTracking(int showTracking) {
            this.showTracking = showTracking;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getQpPoint() {
            return qpPoint;
        }

        public void setQpPoint(String qpPoint) {
            this.qpPoint = qpPoint;
        }

        public String getPresetText() {
            return presetText;
        }

        public void setPresetText(String presetText) {
            this.presetText = presetText;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public String getDispatchTime() {
            return dispatchTime;
        }

        public void setDispatchTime(String dispatchTime) {
            this.dispatchTime = dispatchTime;
        }

        public String getOrderMan() {
            return orderMan;
        }

        public void setOrderMan(String orderMan) {
            this.orderMan = orderMan;
        }

        public String getSubmitTime() {
            return submitTime;
        }

        public void setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
        }

        public String getTemporaryAddress() {
            return temporaryAddress;
        }

        public void setTemporaryAddress(String temporaryAddress) {
            this.temporaryAddress = temporaryAddress;
        }

        public String getTotalPoll() {
            return totalPoll;
        }

        public void setTotalPoll(String totalPoll) {
            this.totalPoll = totalPoll;
        }

        public String getGetTelphone() {
            return getTelphone;
        }

        public void setGetTelphone(String getTelphone) {
            this.getTelphone = getTelphone;
        }

        public String getAssistantPhone() {
            return assistantPhone;
        }

        public void setAssistantPhone(String assistantPhone) {
            this.assistantPhone = assistantPhone;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getOrderCompany() {
            return orderCompany;
        }

        public void setOrderCompany(String orderCompany) {
            this.orderCompany = orderCompany;
        }

        public String getSingleContent() {
            return singleContent;
        }

        public void setSingleContent(String singleContent) {
            this.singleContent = singleContent;
        }

        public List<OrderMainItemBean> getData() {
            return data;
        }

        public void setData(List<OrderMainItemBean> data) {
            this.data = data;
        }

        public static class OrderMainItemBean implements Parcelable {
            /**
             * leaveTime :
             * uniqUpTime : 已取1票
             * uniqId : 5
             * uniqParticular :
             * uniqShow :
             */

            @SerializedName("leaveTime")
            private String leaveTime; // todo : 普通下单
            @SerializedName("departureTime")
            private String departureTime; // todo : 扫描下单
            @SerializedName("uniqUpTime")
            private String uniqUpTime;
            @SerializedName("uniqId")
            private String uniqId;
            @SerializedName("uniqParticular")
            private String uniqParticular;
            @SerializedName("uniqShow")
            private String uniqShow;

            public String getDepartureTime() {
                return departureTime;
            }

            public void setDepartureTime(String departureTime) {
                this.departureTime = departureTime;
            }

            public String getLeaveTime() {
                return leaveTime;
            }

            public void setLeaveTime(String leaveTime) {
                this.leaveTime = leaveTime;
            }

            public String getUniqUpTime() {
                return uniqUpTime;
            }

            public void setUniqUpTime(String uniqUpTime) {
                this.uniqUpTime = uniqUpTime;
            }

            public String getUniqId() {
                return uniqId;
            }

            public void setUniqId(String uniqId) {
                this.uniqId = uniqId;
            }

            public String getUniqParticular() {
                return uniqParticular;
            }

            public void setUniqParticular(String uniqParticular) {
                this.uniqParticular = uniqParticular;
            }

            public String getUniqShow() {
                return uniqShow;
            }

            public void setUniqShow(String uniqShow) {
                this.uniqShow = uniqShow;
            }

            public OrderMainItemBean() {
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.leaveTime);
                dest.writeString(this.departureTime);
                dest.writeString(this.uniqUpTime);
                dest.writeString(this.uniqId);
                dest.writeString(this.uniqParticular);
                dest.writeString(this.uniqShow);
            }

            protected OrderMainItemBean(Parcel in) {
                this.leaveTime = in.readString();
                this.departureTime = in.readString();
                this.uniqUpTime = in.readString();
                this.uniqId = in.readString();
                this.uniqParticular = in.readString();
                this.uniqShow = in.readString();
            }

            public static final Creator<OrderMainItemBean> CREATOR = new Creator<OrderMainItemBean>() {
                @Override
                public OrderMainItemBean createFromParcel(Parcel source) {
                    return new OrderMainItemBean(source);
                }

                @Override
                public OrderMainItemBean[] newArray(int size) {
                    return new OrderMainItemBean[size];
                }
            };
        }

        public OrderMainBean() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.piaoCount);
            dest.writeString(this.goodsTypeTime);
            dest.writeString(this.serviceMode);
            dest.writeString(this.goodsType);
            dest.writeString(this.orderContent);
            dest.writeString(this.temporaryPhone);
            dest.writeString(this.customerPhone);
            dest.writeString(this.weight);
            dest.writeString(this.clientorderMan);
            dest.writeString(this.mileage);
            dest.writeString(this.number);
            dest.writeString(this.sendAddressGuid);
            dest.writeString(this.reciveAddressGuid);
            dest.writeString(this.commentRemark);
            dest.writeInt(this.pushLogo);
            dest.writeString(this.sendProvince);
            dest.writeString(this.sendCity);
            dest.writeString(this.sendArea);
            dest.writeString(this.receiptProvince);
            dest.writeString(this.receiptCity);
            dest.writeString(this.receiptArea);
            dest.writeString(this.senderAddress);
            dest.writeString(this.receivesAddress);
            dest.writeTypedList(this.routeData);
            dest.writeString(this.qpDriver);
            dest.writeString(this.remark);
            dest.writeString(this.serviceMode2);
            dest.writeString(this.serviceMode3);
            dest.writeString(this.pickupCount);
            dest.writeInt(this.isArriveCurrentDay);
            dest.writeString(this.whethDeclaration);
            dest.writeString(this.marketer);
            dest.writeString(this.score);
            dest.writeString(this.orderTime);
            dest.writeString(this.qpDriverPhone);
            dest.writeString(this.goodsState);
            dest.writeString(this.goodTime);
            dest.writeString(this.goodsStateDate);
            dest.writeString(this.temporaryAddressGuid);
            dest.writeString(this.probablyWeight);
            dest.writeString(this.goodsName);
            dest.writeString(this.numberProbably);
            dest.writeString(this.companyCode);
            dest.writeInt(this.loadometerWeight);
            dest.writeString(this.address);
            dest.writeInt(this.showTracking);
            dest.writeString(this.telephone);
            dest.writeString(this.qpPoint);
            dest.writeString(this.presetText);
            dest.writeString(this.volume);
            dest.writeString(this.dispatchTime);
            dest.writeString(this.orderMan);
            dest.writeString(this.submitTime);
            dest.writeString(this.temporaryAddress);
            dest.writeString(this.totalPoll);
            dest.writeString(this.getTelphone);
            dest.writeString(this.assistantPhone);
            dest.writeString(this.orderCode);
            dest.writeString(this.orderCompany);
            dest.writeString(this.singleContent);
            dest.writeTypedList(this.data);
            dest.writeString(this.weight1);
            dest.writeString(this.commodities);
            dest.writeString(this.totalNumber);
            dest.writeString(this.size);
        }

        protected OrderMainBean(Parcel in) {
            this.piaoCount = in.readString();
            this.goodsTypeTime = in.readString();
            this.serviceMode = in.readString();
            this.goodsType = in.readString();
            this.orderContent = in.readString();
            this.temporaryPhone = in.readString();
            this.customerPhone = in.readString();
            this.weight = in.readString();
            this.clientorderMan = in.readString();
            this.mileage = in.readString();
            this.number = in.readString();
            this.sendAddressGuid = in.readString();
            this.reciveAddressGuid = in.readString();
            this.commentRemark = in.readString();
            this.pushLogo = in.readInt();
            this.sendProvince = in.readString();
            this.sendCity = in.readString();
            this.sendArea = in.readString();
            this.receiptProvince = in.readString();
            this.receiptCity = in.readString();
            this.receiptArea = in.readString();
            this.senderAddress = in.readString();
            this.receivesAddress = in.readString();
            this.routeData = in.createTypedArrayList(OrderMainItemBean.CREATOR);
            this.qpDriver = in.readString();
            this.remark = in.readString();
            this.serviceMode2 = in.readString();
            this.serviceMode3 = in.readString();
            this.pickupCount = in.readString();
            this.isArriveCurrentDay = in.readInt();
            this.whethDeclaration = in.readString();
            this.marketer = in.readString();
            this.score = in.readString();
            this.orderTime = in.readString();
            this.qpDriverPhone = in.readString();
            this.goodsState = in.readString();
            this.goodTime = in.readString();
            this.goodsStateDate = in.readString();
            this.temporaryAddressGuid = in.readString();
            this.probablyWeight = in.readString();
            this.goodsName = in.readString();
            this.numberProbably = in.readString();
            this.companyCode = in.readString();
            this.loadometerWeight = in.readInt();
            this.address = in.readString();
            this.showTracking = in.readInt();
            this.telephone = in.readString();
            this.qpPoint = in.readString();
            this.presetText = in.readString();
            this.volume = in.readString();
            this.dispatchTime = in.readString();
            this.orderMan = in.readString();
            this.submitTime = in.readString();
            this.temporaryAddress = in.readString();
            this.totalPoll = in.readString();
            this.getTelphone = in.readString();
            this.assistantPhone = in.readString();
            this.orderCode = in.readString();
            this.orderCompany = in.readString();
            this.singleContent = in.readString();
            this.data = in.createTypedArrayList(OrderMainItemBean.CREATOR);
            this.weight1 = in.readString();
            this.commodities = in.readString();
            this.totalNumber = in.readString();
            this.size = in.readString();
        }

        public static final Creator<OrderMainBean> CREATOR = new Creator<OrderMainBean>() {
            @Override
            public OrderMainBean createFromParcel(Parcel source) {
                return new OrderMainBean(source);
            }

            @Override
            public OrderMainBean[] newArray(int size) {
                return new OrderMainBean[size];
            }
        };
    }

    /**
     * todo : 扫描下单详情的物流信息
     */
    public static class OrderMainLogisticsBean implements Parcelable {


        /**
         * supportValue : 1000
         * sendName : 姚遥
         * sendAddress : 广东省深圳市宝安区富源二路跨越速运
         * sms : 15818415911
         * payType : 寄付
         * reciveAddress : 广东省广州市天河区岗顶
         * recivePhone : 15818415922
         * reciveName : 王五
         * waybillRemark : 备注
         */

        @SerializedName("supportValue")
        private int    supportValue;
        @SerializedName("sendName")
        private String sendName;
        @SerializedName("sendAddress")
        private String sendAddress;
        @SerializedName("sms")
        private String sms;
        @SerializedName("payType")
        private String payType;
        @SerializedName("reciveAddress")
        private String reciveAddress;
        @SerializedName("recivePhone")
        private String recivePhone;
        @SerializedName("reciveName")
        private String reciveName;
        @SerializedName("waybillRemark")
        private String waybillRemark;

        public int getSupportValue() {
            return supportValue;
        }

        public void setSupportValue(int supportValue) {
            this.supportValue = supportValue;
        }

        public String getSendName() {
            return sendName;
        }

        public void setSendName(String sendName) {
            this.sendName = sendName;
        }

        public String getSendAddress() {
            return sendAddress;
        }

        public void setSendAddress(String sendAddress) {
            this.sendAddress = sendAddress;
        }

        public String getSms() {
            return sms;
        }

        public void setSms(String sms) {
            this.sms = sms;
        }

        public String getPayType() {
            return payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getReciveAddress() {
            return reciveAddress;
        }

        public void setReciveAddress(String reciveAddress) {
            this.reciveAddress = reciveAddress;
        }

        public String getRecivePhone() {
            return recivePhone;
        }

        public void setRecivePhone(String recivePhone) {
            this.recivePhone = recivePhone;
        }

        public String getReciveName() {
            return reciveName;
        }

        public void setReciveName(String reciveName) {
            this.reciveName = reciveName;
        }

        public String getWaybillRemark() {
            return waybillRemark;
        }

        public void setWaybillRemark(String waybillRemark) {
            this.waybillRemark = waybillRemark;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.supportValue);
            dest.writeString(this.sendName);
            dest.writeString(this.sendAddress);
            dest.writeString(this.sms);
            dest.writeString(this.payType);
            dest.writeString(this.reciveAddress);
            dest.writeString(this.recivePhone);
            dest.writeString(this.reciveName);
            dest.writeString(this.waybillRemark);
        }

        public OrderMainLogisticsBean() {
        }

        protected OrderMainLogisticsBean(Parcel in) {
            this.supportValue = in.readInt();
            this.sendName = in.readString();
            this.sendAddress = in.readString();
            this.sms = in.readString();
            this.payType = in.readString();
            this.reciveAddress = in.readString();
            this.recivePhone = in.readString();
            this.reciveName = in.readString();
            this.waybillRemark = in.readString();
        }

        public static final Creator<OrderMainLogisticsBean> CREATOR = new Creator<OrderMainLogisticsBean>() {
            @Override
            public OrderMainLogisticsBean createFromParcel(Parcel source) {
                return new OrderMainLogisticsBean(source);
            }

            @Override
            public OrderMainLogisticsBean[] newArray(int size) {
                return new OrderMainLogisticsBean[size];
            }
        };
    }

    /**
     * todo : 普通下单
     */
    public static class OrderScoreBean implements Parcelable {
        /**
         * score : 1
         * submitTime : 2017-12-13 22:03
         * remark : 好好看看自己有没有问题……测试结果表明……
         * presetText : 1234
         */

        @SerializedName("score")
        private int    score;
        @SerializedName("submitTime")
        private String submitTime;
        @SerializedName("remark")
        private String remark;
        @SerializedName("presetText")
        private String presetText;

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getSubmitTime() {
            return submitTime;
        }

        public void setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getPresetText() {
            return presetText;
        }

        public void setPresetText(String presetText) {
            this.presetText = presetText;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.score);
            dest.writeString(this.submitTime);
            dest.writeString(this.remark);
            dest.writeString(this.presetText);
        }

        public OrderScoreBean() {
        }

        protected OrderScoreBean(Parcel in) {
            this.score = in.readInt();
            this.submitTime = in.readString();
            this.remark = in.readString();
            this.presetText = in.readString();
        }

        public static final Parcelable.Creator<OrderScoreBean> CREATOR = new Parcelable.Creator<OrderScoreBean>() {
            @Override
            public OrderScoreBean createFromParcel(Parcel source) {
                return new OrderScoreBean(source);
            }

            @Override
            public OrderScoreBean[] newArray(int size) {
                return new OrderScoreBean[size];
            }
        };
    }

    public OrderDetailResultBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.orderMain, flags);
        dest.writeTypedList(this.orderScore);
        dest.writeTypedList(this.logisticsData);
    }

    protected OrderDetailResultBean(Parcel in) {
        this.orderMain = in.readParcelable(OrderMainBean.class.getClassLoader());
        this.orderScore = in.createTypedArrayList(OrderScoreBean.CREATOR);
        this.logisticsData = in.createTypedArrayList(OrderMainLogisticsBean.CREATOR);
    }

    public static final Creator<OrderDetailResultBean> CREATOR = new Creator<OrderDetailResultBean>() {
        @Override
        public OrderDetailResultBean createFromParcel(Parcel source) {
            return new OrderDetailResultBean(source);
        }

        @Override
        public OrderDetailResultBean[] newArray(int size) {
            return new OrderDetailResultBean[size];
        }
    };
}
