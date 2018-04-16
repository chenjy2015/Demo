package com.kye.model.bean.order;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 24/01/2018
 * @updated : 24/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     记录订单最新的催件时间
 */

@Entity(tableName = "urge_records")
public class UrgeRecordBean {

    @PrimaryKey
    @NonNull
    private String code;
    private long time;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}
