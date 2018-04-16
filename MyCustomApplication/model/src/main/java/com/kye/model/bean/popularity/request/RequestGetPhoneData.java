package com.kye.model.bean.popularity.request;

import com.google.gson.annotations.SerializedName;

public class RequestGetPhoneData {
    @SerializedName("num")
    private String num;

    @SerializedName("ids")
    private String ids;

    @SerializedName("classId")
    private String classId;

    public RequestGetPhoneData(String num, String ids, String classId) {
        this.num = num;
        this.ids = ids;
        this.classId = classId;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
