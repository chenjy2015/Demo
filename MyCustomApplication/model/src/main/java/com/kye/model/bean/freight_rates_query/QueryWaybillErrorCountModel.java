package com.kye.model.bean.freight_rates_query;

/**
 * Created by harry on 2018/1/16 下午5:31.
 * 单号查询输入错误次数
 */

public class QueryWaybillErrorCountModel {
    private int errCount;
    private long time; //时间戳

    public int getErrCount() {
        return errCount;
    }

    public void setErrCount(int errCount) {
        this.errCount = errCount;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
