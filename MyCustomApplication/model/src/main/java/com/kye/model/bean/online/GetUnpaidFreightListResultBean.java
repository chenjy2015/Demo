package com.kye.model.bean.online;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by chen on 18/1/18.
 */

public class GetUnpaidFreightListResultBean {


    /**
     * totalMoney : 41837.75 dataSource : APP qty1 : 1 datas1 : [{"waybill":"75503498449","advancePayment":"60.00","type":"月结","sendTime":"2017-09-08
     * 21:30:00"}] qty2 : 10 datas2 : [{"waybill":"75503498449","advancePayment":"60.00","type":"散客","sendTime":"2017-09-08
     * 21:30:00"},{"waybill":"75503498460","advancePayment":"100.00","type":"散客","sendTime":"2017-09-11
     * 17:32:00"},{"waybill":"0DD0757D5D0","advancePayment":"11000.00","type":"散客","sendTime":"2017-09-12
     * 14:05:10"},{"waybill":"0DD0757D5D0","advancePayment":"11000.00","type":"散客","sendTime":"2017-09-12
     * 14:05:10"},{"waybill":"20222272835","advancePayment":"420.00","type":"散客","sendTime":"2017-09-26
     * 21:12:36"},{"waybill":"20222272832","advancePayment":"390.00","type":"散客","sendTime":"2017-09-26
     * 21:12:46"},{"waybill":"8662F5C031E","advancePayment":"281.00","type":"散客","sendTime":"2017-09-26
     * 21:24:31"},{"waybill":"D364851FD87","advancePayment":"281.00","type":"散客","sendTime":"2017-09-26
     * 21:48:36"},{"waybill":"460FA5EC45B","advancePayment":"701.00","type":"散客","sendTime":"2017-09-26
     * 21:48:38"},{"waybill":"ED0DA53CFCD","advancePayment":"281.00","type":"散客","sendTime":"2017-09-26 21:53:55"}]
     */

    private double          totalMoney;
    private String          dataSource;
    private int             qty1;
    private int             qty2;
    private List<DatasBean> datas1;
    private List<DatasBean> datas2;

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public int getQty1() {
        return qty1;
    }

    public void setQty1(int qty1) {
        this.qty1 = qty1;
    }

    public int getQty2() {
        return qty2;
    }

    public void setQty2(int qty2) {
        this.qty2 = qty2;
    }

    public List<DatasBean> getDatas1() {
        return datas1;
    }

    public void setDatas1(List<DatasBean> datas1) {
        this.datas1 = datas1;
    }

    public List<DatasBean> getDatas2() {
        return datas2;
    }

    public void setDatas2(List<DatasBean> datas2) {
        this.datas2 = datas2;
    }

    public static class DatasBean {
        /**
         * waybill : 75503498449
         * advancePayment : 60.00
         * type : 月结
         * sendTime : 2017-09-08 21:30:00
         */

        private String  waybill;
        private double  advancePayment;
        private String  type;
        private String  sendTime;
        private boolean isChecked;

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }

        public double getAdvancePayment() {
            return advancePayment;
        }

        public void setAdvancePayment(double advancePayment) {
            this.advancePayment = advancePayment;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSendTime() {
            return sendTime;
        }

        public void setSendTime(String sendTime) {
            this.sendTime = sendTime;
        }

        public BigDecimal getBigDecimal() {
            return new BigDecimal(advancePayment + "");
        }
    }
}
