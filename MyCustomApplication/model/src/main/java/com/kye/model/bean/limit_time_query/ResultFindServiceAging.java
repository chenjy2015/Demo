package com.kye.model.bean.limit_time_query;

import java.util.List;

/**
 * Created by harry on 2018/1/6 下午3:42.
 */

public class ResultFindServiceAging {


    /**
     * datas : [{"agingInstructions":"","landingTime":"01:00 - 13:00","sendTime":"2017/8/2 14:01:00","serviceMode":"次日达","receiptAddDays":"0.0","sendAreaCode":"0755","limitArea":"","airportDestination":"深圳 - 南昌","loadingFlight":"跨越包机5","receiptAreaCode":"0791","sendAddDays":"0.0","sendPlace":"4CA70F98F9F040E5B50BD75FA925E2EE","getAdress":"646EA15A220146BFA1BC5D75F82D0865","sendAging":"2017-08-03 14:01(航班不稳定)"},{"agingInstructions":"","landingTime":" - ","sendTime":"2017/8/2 14:01:00","serviceMode":"隔日达","receiptAddDays":"0.0","sendAreaCode":"0755","limitArea":"","airportDestination":" - ","loadingFlight":"","receiptAreaCode":"0791","sendAddDays":"0.0","sendPlace":"4CA70F98F9F040E5B50BD75FA925E2EE","getAdress":"646EA15A220146BFA1BC5D75F82D0865","sendAging":"2017-08-04 09:00 - 12:00"},{"agingInstructions":"","landingTime":" - ","sendTime":"2017/8/2 14:01:00","serviceMode":"冷运件","receiptAddDays":"0.0","sendAreaCode":"0755","limitArea":"","airportDestination":" - ","loadingFlight":"","receiptAreaCode":"0791","sendAddDays":"0.0","sendPlace":"4CA70F98F9F040E5B50BD75FA925E2EE","getAdress":"646EA15A220146BFA1BC5D75F82D0865","sendAging":"2017-08-04 09:00 - 12:00"},{"agingInstructions":"","landingTime":" - ","sendTime":"2017/8/2 14:01:00","serviceMode":"陆运件","receiptAddDays":"0.0","sendAreaCode":"0755","limitArea":"","airportDestination":" - ","loadingFlight":"","receiptAreaCode":"0791","sendAddDays":"0.0","sendPlace":"4CA70F98F9F040E5B50BD75FA925E2EE","getAdress":"646EA15A220146BFA1BC5D75F82D0865","sendAging":"2017-08-05 09:00 - 12:00"}]
     * limitedCode : 0
     * limitedMsg : 全境提供取货服务
     * limitedArea : 35s8
     */

    private int limitedCode;
    private String limitedMsg;
    private String limitedArea;
    private List<DatasBean> datas;

    public int getLimitedCode() {
        return limitedCode;
    }

    public void setLimitedCode(int limitedCode) {
        this.limitedCode = limitedCode;
    }

    public String getLimitedMsg() {
        return limitedMsg;
    }

    public void setLimitedMsg(String limitedMsg) {
        this.limitedMsg = limitedMsg;
    }

    public String getLimitedArea() {
        return limitedArea;
    }

    public void setLimitedArea(String limitedArea) {
        this.limitedArea = limitedArea;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * agingInstructions :
         * landingTime : 01:00 - 13:00
         * sendTime : 2017/8/2 14:01:00
         * serviceMode : 次日达
         * receiptAddDays : 0.0
         * sendAreaCode : 0755
         * limitArea :
         * airportDestination : 深圳 - 南昌
         * loadingFlight : 跨越包机5
         * receiptAreaCode : 0791
         * sendAddDays : 0.0
         * sendPlace : 4CA70F98F9F040E5B50BD75FA925E2EE
         * getAdress : 646EA15A220146BFA1BC5D75F82D0865
         * sendAging : 2017-08-03 14:01(航班不稳定)
         */

        private String agingInstructions;
        private String landingTime;
        private String sendTime;
        private String serviceMode;
        private String receiptAddDays;
        private String sendAreaCode;
        private String limitArea;
        private String airportDestination;
        private String loadingFlight;
        private String receiptAreaCode;
        private String sendAddDays;
        private String sendPlace;
        private String getAdress;
        private String sendAging;

        private boolean isTitle;//自己加的，不是服务器返回的
        private boolean isBottom;//自己加的，不是服务器返回的

        public boolean isTitle() {
            return isTitle;
        }

        public void setTitle(boolean title) {
            isTitle = title;
        }

        public boolean isBottom() {
            return isBottom;
        }

        public void setBottom(boolean bottom) {
            isBottom = bottom;
        }

        public String getAgingInstructions() {
            return agingInstructions;
        }

        public void setAgingInstructions(String agingInstructions) {
            this.agingInstructions = agingInstructions;
        }

        public String getLandingTime() {
            return landingTime;
        }

        public void setLandingTime(String landingTime) {
            this.landingTime = landingTime;
        }

        public String getSendTime() {
            return sendTime;
        }

        public void setSendTime(String sendTime) {
            this.sendTime = sendTime;
        }

        public String getServiceMode() {
            return serviceMode;
        }

        public void setServiceMode(String serviceMode) {
            this.serviceMode = serviceMode;
        }

        public String getReceiptAddDays() {
            return receiptAddDays;
        }

        public void setReceiptAddDays(String receiptAddDays) {
            this.receiptAddDays = receiptAddDays;
        }

        public String getSendAreaCode() {
            return sendAreaCode;
        }

        public void setSendAreaCode(String sendAreaCode) {
            this.sendAreaCode = sendAreaCode;
        }

        public String getLimitArea() {
            return limitArea;
        }

        public void setLimitArea(String limitArea) {
            this.limitArea = limitArea;
        }

        public String getAirportDestination() {
            return airportDestination;
        }

        public void setAirportDestination(String airportDestination) {
            this.airportDestination = airportDestination;
        }

        public String getLoadingFlight() {
            return loadingFlight;
        }

        public void setLoadingFlight(String loadingFlight) {
            this.loadingFlight = loadingFlight;
        }

        public String getReceiptAreaCode() {
            return receiptAreaCode;
        }

        public void setReceiptAreaCode(String receiptAreaCode) {
            this.receiptAreaCode = receiptAreaCode;
        }

        public String getSendAddDays() {
            return sendAddDays;
        }

        public void setSendAddDays(String sendAddDays) {
            this.sendAddDays = sendAddDays;
        }

        public String getSendPlace() {
            return sendPlace;
        }

        public void setSendPlace(String sendPlace) {
            this.sendPlace = sendPlace;
        }

        public String getGetAdress() {
            return getAdress;
        }

        public void setGetAdress(String getAdress) {
            this.getAdress = getAdress;
        }

        public String getSendAging() {
            return sendAging;
        }

        public void setSendAging(String sendAging) {
            this.sendAging = sendAging;
        }
    }
}
