package com.kye.model.bean.freight_rates_query;

import java.util.List;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class QueryAreaByCustomerCodeResultBean {

    /**
     * recordTotalCount : 1
     * datas : [{"addressForShort":"新疆-克孜勒苏州-阿克陶县","areaNo":"0908","originalcCompanyAddress":"新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路","customerCode":"75519398828"}]
     */

    private int recordTotalCount;
    private List<DatasBean> datas;

    public int getRecordTotalCount() {
        return recordTotalCount;
    }

    public void setRecordTotalCount(int recordTotalCount) {
        this.recordTotalCount = recordTotalCount;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * addressForShort : 新疆-克孜勒苏州-阿克陶县
         * areaNo : 0908
         * originalcCompanyAddress : 新疆克孜勒苏州阿克陶县玉麦乡玉麦村福原二路
         * customerCode : 75519398828
         */

        private String addressForShort;
        private String areaNo;
        private String originalcCompanyAddress;
        private String customerCode;

        public String getAddressForShort() {
            return addressForShort;
        }

        public void setAddressForShort(String addressForShort) {
            this.addressForShort = addressForShort;
        }

        public String getAreaNo() {
            return areaNo;
        }

        public void setAreaNo(String areaNo) {
            this.areaNo = areaNo;
        }

        public String getOriginalcCompanyAddress() {
            return originalcCompanyAddress;
        }

        public void setOriginalcCompanyAddress(String originalcCompanyAddress) {
            this.originalcCompanyAddress = originalcCompanyAddress;
        }

        public String getCustomerCode() {
            return customerCode;
        }

        public void setCustomerCode(String customerCode) {
            this.customerCode = customerCode;
        }
    }
}
