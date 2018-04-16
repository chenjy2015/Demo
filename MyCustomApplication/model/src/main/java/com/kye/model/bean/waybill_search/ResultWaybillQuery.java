package com.kye.model.bean.waybill_search;

import java.io.Serializable;
import java.util.List;

/**
 * Created by harry on 2018/1/6 下午3:42.
 */

public class ResultWaybillQuery implements Serializable{


    /**
     * result : [{"sendPeoplePhone":"","abnormalReturns":"","sendPeople":"","planArriveTime":"","data":[{"lastTime":"","serviceMode":"当天达","sender":"","originalSend":"厦门市翔安区","recipient":"","uniqId":0,"updateTime":"2017-10-10 00:00","remark":"","depart":"","uniqShow":"02300086747","sendTime":"2017-10-10 00:00","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":1,"updateTime":"2017-10-09 17:31","remark":"","depart":"","uniqShow":"出车取货","sendTime":"已安排前往客户处取货，取件员：王洪02，车牌号：员工车辆","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":2,"updateTime":"2017-10-09 16:12","remark":"","depart":"","uniqShow":"取签到","sendTime":"到达客户处，待取货","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":3,"updateTime":"2017-10-09 18:00","remark":"","depart":"","uniqShow":"离开客户","sendTime":"取货完毕，准备送往重庆操作培训组","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":12,"updateTime":"2017-10-20 17:55","remark":"","depart":"","uniqShow":"装车派送","sendTime":"正在派送途中,派件员:沙头李树波,电话:17702611972","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":13,"updateTime":"2017-10-20 17:55","remark":"","depart":"","uniqShow":"派签到","sendTime":"已到收方客户处,待签收","getAdress":"北京市朝阳区"}],"totalFreight":"","latitude":"22.689970","rating":0,"recipientPeople":"","waybill":"02300086747","permissions":false,"signforNotes":"","longitude":"113.809720","pushMark":0,"recordNumber":6,"sfRemark":"09:00-19:00","sendMark":2,"address":"深圳市福永镇**********用）","markingTime":"","receiver":"","haveOrNotReceipt1":"","leaveRemark":"","weight":"52.3","isDevivery":"0","haveOrNotFlImage":0,"presetEvaluation":"","signingTime":"","itemCount":"12","notreason":"","preSentDate":"2017-10-10","assistantPhone":"","haveOrNotInvoice":"无","orderCode":"XD1710-0039558","driverName":"","haveOrNotReceipt":"","marketAssistant":""}]
     * waybillNumber : 1
     */

    private int waybillNumber;
    private List<ResultBean> result;

    public int getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(int waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean implements Serializable{
        /**
         * sendPeoplePhone :
         * abnormalReturns :
         * sendPeople :
         * planArriveTime :
         * data : [{"lastTime":"","serviceMode":"当天达","sender":"","originalSend":"厦门市翔安区","recipient":"","uniqId":0,"updateTime":"2017-10-10 00:00","remark":"","depart":"","uniqShow":"02300086747","sendTime":"2017-10-10 00:00","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":1,"updateTime":"2017-10-09 17:31","remark":"","depart":"","uniqShow":"出车取货","sendTime":"已安排前往客户处取货，取件员：王洪02，车牌号：员工车辆","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":2,"updateTime":"2017-10-09 16:12","remark":"","depart":"","uniqShow":"取签到","sendTime":"到达客户处，待取货","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":3,"updateTime":"2017-10-09 18:00","remark":"","depart":"","uniqShow":"离开客户","sendTime":"取货完毕，准备送往重庆操作培训组","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":12,"updateTime":"2017-10-20 17:55","remark":"","depart":"","uniqShow":"装车派送","sendTime":"正在派送途中,派件员:沙头李树波,电话:17702611972","getAdress":"北京市朝阳区"},{"lastTime":"","serviceMode":"","sender":"","originalSend":"","recipient":"","uniqId":13,"updateTime":"2017-10-20 17:55","remark":"","depart":"","uniqShow":"派签到","sendTime":"已到收方客户处,待签收","getAdress":"北京市朝阳区"}]
         * totalFreight :
         * latitude : 22.689970
         * rating : 0
         * recipientPeople :
         * waybill : 02300086747
         * permissions : false
         * signforNotes :
         * longitude : 113.809720
         * pushMark : 0
         * recordNumber : 6
         * sfRemark : 09:00-19:00
         * sendMark : 2
         * address : 深圳市福永镇**********用）
         * markingTime :
         * receiver :
         * haveOrNotReceipt1 :
         * leaveRemark :
         * weight : 52.3
         * isDevivery : 0
         * haveOrNotFlImage : 0
         * presetEvaluation :
         * signingTime :
         * itemCount : 12
         * notreason :
         * preSentDate : 2017-10-10
         * assistantPhone :
         * haveOrNotInvoice : 无
         * orderCode : XD1710-0039558
         * driverName :
         * haveOrNotReceipt :
         * marketAssistant :
         */

        private String sendPeoplePhone;
        private String abnormalReturns;
        private String sendPeople;
        private String planArriveTime;
        private String totalFreight;
        private String latitude;
        private int rating;
        private String recipientPeople;
        private String waybill;
        private boolean permissions;
        private String signforNotes;
        private String longitude;
        private int pushMark;
        private int recordNumber;
        private String sfRemark;
        private int sendMark;
        private String address;
        private String markingTime;
        private String receiver;
        private String haveOrNotReceipt1;
        private String leaveRemark;
        private String weight;
        private String isDevivery;
        private boolean haveOrNotFlImage;
        private String presetEvaluation;
        private String signingTime;
        private String itemCount;
        private String notreason;
        private String preSentDate;
        private String assistantPhone;
        private String haveOrNotInvoice;
        private String orderCode;
        private String driverName;
        private String haveOrNotReceipt;
        private String marketAssistant;
        private List<DataBean> data;

        public String getSendPeoplePhone() {
            return sendPeoplePhone;
        }

        public void setSendPeoplePhone(String sendPeoplePhone) {
            this.sendPeoplePhone = sendPeoplePhone;
        }

        public String getAbnormalReturns() {
            return abnormalReturns;
        }

        public void setAbnormalReturns(String abnormalReturns) {
            this.abnormalReturns = abnormalReturns;
        }

        public String getSendPeople() {
            return sendPeople;
        }

        public void setSendPeople(String sendPeople) {
            this.sendPeople = sendPeople;
        }

        public String getPlanArriveTime() {
            return planArriveTime;
        }

        public void setPlanArriveTime(String planArriveTime) {
            this.planArriveTime = planArriveTime;
        }

        public String getTotalFreight() {
            return totalFreight;
        }

        public void setTotalFreight(String totalFreight) {
            this.totalFreight = totalFreight;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getRecipientPeople() {
            return recipientPeople;
        }

        public void setRecipientPeople(String recipientPeople) {
            this.recipientPeople = recipientPeople;
        }

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }

        public boolean isPermissions() {
            return permissions;
        }

        public void setPermissions(boolean permissions) {
            this.permissions = permissions;
        }

        public String getSignforNotes() {
            return signforNotes;
        }

        public void setSignforNotes(String signforNotes) {
            this.signforNotes = signforNotes;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public int getPushMark() {
            return pushMark;
        }

        public void setPushMark(int pushMark) {
            this.pushMark = pushMark;
        }

        public int getRecordNumber() {
            return recordNumber;
        }

        public void setRecordNumber(int recordNumber) {
            this.recordNumber = recordNumber;
        }

        public String getSfRemark() {
            return sfRemark;
        }

        public void setSfRemark(String sfRemark) {
            this.sfRemark = sfRemark;
        }

        public int getSendMark() {
            return sendMark;
        }

        public void setSendMark(int sendMark) {
            this.sendMark = sendMark;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getMarkingTime() {
            return markingTime;
        }

        public void setMarkingTime(String markingTime) {
            this.markingTime = markingTime;
        }

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getHaveOrNotReceipt1() {
            return haveOrNotReceipt1;
        }

        public void setHaveOrNotReceipt1(String haveOrNotReceipt1) {
            this.haveOrNotReceipt1 = haveOrNotReceipt1;
        }

        public String getLeaveRemark() {
            return leaveRemark;
        }

        public void setLeaveRemark(String leaveRemark) {
            this.leaveRemark = leaveRemark;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getIsDevivery() {
            return isDevivery;
        }

        public void setIsDevivery(String isDevivery) {
            this.isDevivery = isDevivery;
        }

        public boolean isHaveOrNotFlImage() {
            return haveOrNotFlImage;
        }

        public void setHaveOrNotFlImage(boolean haveOrNotFlImage) {
            this.haveOrNotFlImage = haveOrNotFlImage;
        }

        public String getPresetEvaluation() {
            return presetEvaluation;
        }

        public void setPresetEvaluation(String presetEvaluation) {
            this.presetEvaluation = presetEvaluation;
        }

        public String getSigningTime() {
            return signingTime;
        }

        public void setSigningTime(String signingTime) {
            this.signingTime = signingTime;
        }

        public String getItemCount() {
            return itemCount;
        }

        public void setItemCount(String itemCount) {
            this.itemCount = itemCount;
        }

        public String getNotreason() {
            return notreason;
        }

        public void setNotreason(String notreason) {
            this.notreason = notreason;
        }

        public String getPreSentDate() {
            return preSentDate;
        }

        public void setPreSentDate(String preSentDate) {
            this.preSentDate = preSentDate;
        }

        public String getAssistantPhone() {
            return assistantPhone;
        }

        public void setAssistantPhone(String assistantPhone) {
            this.assistantPhone = assistantPhone;
        }

        public String getHaveOrNotInvoice() {
            return haveOrNotInvoice;
        }

        public void setHaveOrNotInvoice(String haveOrNotInvoice) {
            this.haveOrNotInvoice = haveOrNotInvoice;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getDriverName() {
            return driverName;
        }

        public void setDriverName(String driverName) {
            this.driverName = driverName;
        }

        public String getHaveOrNotReceipt() {
            return haveOrNotReceipt;
        }

        public void setHaveOrNotReceipt(String haveOrNotReceipt) {
            this.haveOrNotReceipt = haveOrNotReceipt;
        }

        public String getMarketAssistant() {
            return marketAssistant;
        }

        public void setMarketAssistant(String marketAssistant) {
            this.marketAssistant = marketAssistant;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable {
            /**
             * lastTime :
             * serviceMode : 当天达
             * sender :
             * originalSend : 厦门市翔安区
             * recipient :
             * uniqId : 0
             * updateTime : 2017-10-10 00:00
             * remark :
             * depart :
             * uniqShow : 02300086747
             * sendTime : 2017-10-10 00:00
             * getAdress : 北京市朝阳区
             */

            private String lastTime;
            private String serviceMode;
            private String sender;
            private String originalSend;
            private String recipient;
            private int uniqId;
            private String updateTime;
            private String remark;
            private String depart;
            private String uniqShow;
            private String sendTime;
            private String getAdress;

            public String getLastTime() {
                return lastTime;
            }

            public void setLastTime(String lastTime) {
                this.lastTime = lastTime;
            }

            public String getServiceMode() {
                return serviceMode;
            }

            public void setServiceMode(String serviceMode) {
                this.serviceMode = serviceMode;
            }

            public String getSender() {
                return sender;
            }

            public void setSender(String sender) {
                this.sender = sender;
            }

            public String getOriginalSend() {
                return originalSend;
            }

            public void setOriginalSend(String originalSend) {
                this.originalSend = originalSend;
            }

            public String getRecipient() {
                return recipient;
            }

            public void setRecipient(String recipient) {
                this.recipient = recipient;
            }

            public int getUniqId() {
                return uniqId;
            }

            public void setUniqId(int uniqId) {
                this.uniqId = uniqId;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getDepart() {
                return depart;
            }

            public void setDepart(String depart) {
                this.depart = depart;
            }

            public String getUniqShow() {
                return uniqShow;
            }

            public void setUniqShow(String uniqShow) {
                this.uniqShow = uniqShow;
            }

            public String getSendTime() {
                return sendTime;
            }

            public void setSendTime(String sendTime) {
                this.sendTime = sendTime;
            }

            public String getGetAdress() {
                return getAdress;
            }

            public void setGetAdress(String getAdress) {
                this.getAdress = getAdress;
            }
        }
    }
}
