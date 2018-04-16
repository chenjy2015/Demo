package com.kye.model.bean.customer_intro;

import java.util.List;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class GetCustomerIntroDetailResultBean {


    /**
     * recordCount : 1
     * customerCompanyName : mw2x
     * appealTime : j3l3
     * giveupReason : gkpn
     * appealInformation : 1d57
     * managementCode : CI1604-00007
     * customerLevel : 跟进
     * datas : [{"noteTime":"2016-08-15 11:12","descry":"联系屈先生,公司合作的物流公司很多,德邦/顺丰都有做,公司产品控制器,可以约面访","uniqId":1}]
     */

    private int recordCount;
    private String customerCompanyName;
    private String appealTime;
    private String giveupReason;
    private String appealInformation;
    private String managementCode;
    private String customerLevel;
    private List<DatasBean> datas;

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public String getCustomerCompanyName() {
        return customerCompanyName;
    }

    public void setCustomerCompanyName(String customerCompanyName) {
        this.customerCompanyName = customerCompanyName;
    }

    public String getAppealTime() {
        return appealTime;
    }

    public void setAppealTime(String appealTime) {
        this.appealTime = appealTime;
    }

    public String getGiveupReason() {
        return giveupReason;
    }

    public void setGiveupReason(String giveupReason) {
        this.giveupReason = giveupReason;
    }

    public String getAppealInformation() {
        return appealInformation;
    }

    public void setAppealInformation(String appealInformation) {
        this.appealInformation = appealInformation;
    }

    public String getManagementCode() {
        return managementCode;
    }

    public void setManagementCode(String managementCode) {
        this.managementCode = managementCode;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * noteTime : 2016-08-15 11:12
         * descry : 联系屈先生,公司合作的物流公司很多,德邦/顺丰都有做,公司产品控制器,可以约面访
         * uniqId : 1
         */

        private String noteTime;
        private String descry;
        private int uniqId;

        public String getNoteTime() {
            return noteTime;
        }

        public void setNoteTime(String noteTime) {
            this.noteTime = noteTime;
        }

        public String getDescry() {
            return descry;
        }

        public void setDescry(String descry) {
            this.descry = descry;
        }

        public int getUniqId() {
            return uniqId;
        }

        public void setUniqId(int uniqId) {
            this.uniqId = uniqId;
        }
    }
}
