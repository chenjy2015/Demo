package com.kye.model.bean.customer_intro;

import java.io.Serializable;
import java.util.List;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class CustomerIntroHistoryResultBean implements Serializable{

    /**
     * recordCount : 50
     * datas : [{"introductionToCompany":"be2fe809-35c1-49b2-8a52-454e9cccad0e","contactTime":"2017-12-05 14:10:58","followStatus":"未完结","editable":1,"cashAmount":0,"isCooperation":false,"sysGuid":"42AC8334205B48EB9BC60035CC98DA40","status":"正在开发","statusCode":0},{"introductionToCompany":"测试公司007","contactTime":"2017-12-01 13:47:27","followStatus":"未完结","editable":1,"cashAmount":0,"isCooperation":false,"sysGuid":"EBC41586812E44549E412A9BB021354B","status":"正在开发","statusCode":0}]
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

    public static class DatasBean implements Serializable{

        /**
         * sysGuid : E78752784A2C443F8804C8A5397B8EBB
         * customerCompanyName : null
         * introductionToCompany : 深圳捏造公司
         * contactTime : 2018-01-31 17:15:31
         * isCooperation : false
         * cooperationTime : null
         * status : 正在开发
         * statusCode : 0
         * cashAmount : 0.0
         * scry : null
         * scTel : null
         * followStatus : 未完结
         * editable : 1
         */

        private String sysGuid;
        private String customerCompanyName;
        private String introductionToCompany;
        private String contactTime;
        private boolean isCooperation;
        private String cooperationTime;
        private String status;
        private int statusCode;
        private double cashAmount;
        private String scry;
        private String scTel;
        private String followStatus;
        private int editable;

        private boolean isChecked;

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }

        public String getSysGuid() {
            return sysGuid;
        }

        public void setSysGuid(String sysGuid) {
            this.sysGuid = sysGuid;
        }

        public String getCustomerCompanyName() {
            return customerCompanyName;
        }

        public void setCustomerCompanyName(String customerCompanyName) {
            this.customerCompanyName = customerCompanyName;
        }

        public String getIntroductionToCompany() {
            return introductionToCompany;
        }

        public void setIntroductionToCompany(String introductionToCompany) {
            this.introductionToCompany = introductionToCompany;
        }

        public String getContactTime() {
            return contactTime;
        }

        public void setContactTime(String contactTime) {
            this.contactTime = contactTime;
        }

        public boolean isCooperation() {
            return isCooperation;
        }

        public void setCooperation(boolean cooperation) {
            isCooperation = cooperation;
        }

        public String getCooperationTime() {
            return cooperationTime;
        }

        public void setCooperationTime(String cooperationTime) {
            this.cooperationTime = cooperationTime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

        public double getCashAmount() {
            return cashAmount;
        }

        public void setCashAmount(double cashAmount) {
            this.cashAmount = cashAmount;
        }

        public String getScry() {
            return scry;
        }

        public void setScry(String scry) {
            this.scry = scry;
        }

        public String getScTel() {
            return scTel;
        }

        public void setScTel(String scTel) {
            this.scTel = scTel;
        }

        public String getFollowStatus() {
            return followStatus;
        }

        public void setFollowStatus(String followStatus) {
            this.followStatus = followStatus;
        }

        public int getEditable() {
            return editable;
        }

        public void setEditable(int editable) {
            this.editable = editable;
        }
    }
}
