package com.kye.model.bean.waybill_search;

import java.util.List;

public class ResultAcquredQueryHistory {

    /**
     * recordCount : 29
     * datas : [{"waybill":"12121132356","phone":"15035438277","createTime":"2017-05-26 16:37:39","sendTime":"2017-05-19 16:00:00"}]
     */

    private int recordCount;
    private List<DatasBean> datas;

    public int getRecordCount()                 { return recordCount;}

    public void setRecordCount(int recordCount) { this.recordCount = recordCount;}

    public List<DatasBean> getDatas()           { return datas;}

    public void setDatas(List<DatasBean> datas) { this.datas = datas;}

    public static class DatasBean {
        /**
         * waybill : 12121132356
         * phone : 15035438277
         * createTime : 2017-05-26 16:37:39
         * sendTime : 2017-05-19 16:00:00
         */

        private String waybill;
        private String phone;
        private String createTime;
        private String sendTime;

        public String getWaybill()                   { return waybill;}

        public void setWaybill(String waybill)       { this.waybill = waybill;}

        public String getPhone()                     { return phone;}

        public void setPhone(String phone)           { this.phone = phone;}

        public String getCreateTime()                { return createTime;}

        public void setCreateTime(String createTime) { this.createTime = createTime;}

        public String getSendTime()                  { return sendTime;}

        public void setSendTime(String sendTime)     { this.sendTime = sendTime;}

        @Override
        public String toString() {
            return waybill;
        }
    }
}
