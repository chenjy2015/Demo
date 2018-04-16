package com.kye.model.bean.customer_intro;

import java.util.List;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class WithdrawHistoryResultBean {

    /**
     * datas : [{"cashCompany":"深圳大族广电","cashAmount":118,"cashTime":"2017-08-14 15:40:14"},{"cashCompany":"深圳新中科达","cashAmount":72,"cashTime":"2016-10-07 15:01:14"}]
     * recordCount : 2
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
         * cashCompany : 深圳大族广电
         * cashAmount : 118
         * cashTime : 2017-08-14 15:40:14
         */

        private String cashCompany;
        private double cashAmount;
        private String cashTime;

        public String getCashCompany() {
            return cashCompany;
        }

        public void setCashCompany(String cashCompany) {
            this.cashCompany = cashCompany;
        }

        public double getCashAmount() {
            return cashAmount;
        }

        public void setCashAmount(double cashAmount) {
            this.cashAmount = cashAmount;
        }

        public String getCashTime() {
            return cashTime;
        }

        public void setCashTime(String cashTime) {
            this.cashTime = cashTime;
        }
    }
}
