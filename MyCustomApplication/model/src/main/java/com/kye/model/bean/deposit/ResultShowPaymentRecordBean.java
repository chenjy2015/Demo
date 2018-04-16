package com.kye.model.bean.deposit;

import java.util.List;

/**
 * Created by SkyYu on 2018/1/16
 */
public class ResultShowPaymentRecordBean {

    /**
     * recordCount : 12
     * datas : [{"payMoney":1000,"payTime":"2017-07-19 23:32:47.5780000","payState":"网转","state":"无水单"},{"payMoney":1000,"payTime":"2017-06-03 21:25:15.4190000","payState":"网转","state":"无水单"},{"payMoney":10000,"payTime":"2017-07-31 19:28:24.4940000","payState":"网转","state":"无水单"},{"payMoney":1001,"payTime":"2017-06-06 14:40:45.1430000","payState":"网转","state":"无水单"},{"payMoney":1009,"payTime":"2017-06-06 14:39:25.9400000","payState":"网转","state":"无水单"},{"payMoney":1000,"payTime":"2017-07-21 13:55:14.8410000","payState":"网转","state":"无水单"},{"payMoney":1000,"payTime":"2017-02-25 15:31:50.893","payState":"转账","state":"待审核"},{"payMoney":1000,"payTime":"2017-02-15 15:45:22.920","payState":"转账","state":"待审核"},{"payMoney":0.1,"payTime":"2017-02-15 14:55:18.000","payState":"微信","state":"待审核"},{"payMoney":0.1,"payTime":"2017-02-15 14:29:32.000","payState":"微信","state":"待审核"},{"payMoney":0.1,"payTime":"2017-02-15 14:22:44.000","payState":"微信","state":"待审核"},{"payMoney":1.5,"payTime":"2016-09-03 14:31:55.000","payState":"微信","state":"待审核"}]
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
         * payMoney : 1000
         * payTime : 2017-07-19 23:32:47.5780000
         * payState : 网转
         * state : 无水单
         */

        private double payMoney;
        private String payTime;
        private String payState;
        private String state;

        public double getPayMoney() {
            return payMoney;
        }

        public void setPayMoney(double payMoney) {
            this.payMoney = payMoney;
        }

        public String getPayTime() {
            return payTime;
        }

        public void setPayTime(String payTime) {
            this.payTime = payTime;
        }

        public String getPayState() {
            return payState;
        }

        public void setPayState(String payState) {
            this.payState = payState;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
