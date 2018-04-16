package com.kye.model.bean.found;

import java.io.Serializable;

public class RequestQueryNewsList implements Serializable {


    /**
     * newsTypeId : 8tb6
     * loginUser : 18937085668
     * newsKeyword : 9558
     * pageSize : 2
     * pageNum : 1
     */

    private String newsTypeId;
    private String loginUser;
    private String newsKeyword;
    private int pageSize;
    private int pageNum;

    public RequestQueryNewsList(String loginUser, int pageSize, int pageNum) {
        this.loginUser = loginUser;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public String getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(String newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getNewsKeyword() {
        return newsKeyword;
    }

    public void setNewsKeyword(String newsKeyword) {
        this.newsKeyword = newsKeyword;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
