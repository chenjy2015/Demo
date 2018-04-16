package com.kye.model.bean.waybill_take_photo;

import java.util.List;

/**
 * Created by harry on 2018/1/11 下午4:38.
 */

public class QueryWaybillTakePhotoHistoryResultBean {


    /**
     * integralCount : 2
     * datas : [{"integralScore":"645","waybill":"51201225876","remark":"","createDate":"2016-11-21 22:52","status":""},{"integralScore":"546","waybill":"51200930299","remark":"","createDate":"2016-11-14 21:07","status":""}]
     * totalCount : 4
     */

    private int integralCount;
    private int totalCount;
    private List<DatasBean> datas;

    public int getIntegralCount() {
        return integralCount;
    }

    public void setIntegralCount(int integralCount) {
        this.integralCount = integralCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * integralScore : 645
         * waybill : 51201225876
         * remark :
         * createDate : 2016-11-21 22:52
         * status :
         */

        private String integralScore;
        private String waybill;
        private String remark;
        private String createDate;
        private String status;

        public String getIntegralScore() {
            return integralScore;
        }

        public void setIntegralScore(String integralScore) {
            this.integralScore = integralScore;
        }

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
