package com.kye.model.bean.help;

import com.google.gson.annotations.SerializedName;

/**
 * @version V1.0
 * @createAuthor chenyuhan
 * @createDate 2018/1/8 17:17
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public class RequestGetHelpList {

    /**
     *  classId : 0为查询所有 ,取值 1 - 5
     *  num : 查询条数
     */
    @SerializedName("classId")
    private int classId;

    @SerializedName("num")
    private int num;

    public RequestGetHelpList(int classId, int num) {
        this.classId = classId;
        this.num = num;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
