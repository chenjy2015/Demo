package com.kye.model.bean.help;

public class RequestQueryHelpList {

    private String ids;
    private int classId;
    private int num;
    private String keyword;

    public RequestQueryHelpList(String ids, int classId, int num, String keyword) {
        this.ids = ids;
        this.classId = classId;
        this.num = num;
        this.keyword = keyword;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
