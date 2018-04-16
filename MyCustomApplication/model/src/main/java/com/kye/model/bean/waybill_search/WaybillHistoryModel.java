package com.kye.model.bean.waybill_search;

public class WaybillHistoryModel {
    private String number;
    private long time;

    public WaybillHistoryModel(String number, long time) {
        this.number = number;
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
