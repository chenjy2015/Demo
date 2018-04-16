package com.kye.model.bean.found;

import java.io.Serializable;

public class RequestQueryVideoInfoList implements Serializable {


    /**
     * videoTypeId : 2
     * videoInfoKeyword : bri3
     * pageSize : 3
     * pageIndex : 1
     * loginUser : admin
     */

    //视频类型（1：视频管理 2：跨越速运出品 3：跨越速运 4：跨越元旦视频全集 5：英文视频管理 6：英文跨越速运出品 7：英文跨越速运 8：英文跨越元旦视频全集）
    private String videoTypeId;
    private String videoInfoKeyword;
    private String pageSize;
    private String pageIndex;
    private String loginUser;

    public RequestQueryVideoInfoList(String videoTypeId, String pageSize, String pageIndex, String loginUser) {
        this.videoTypeId = videoTypeId;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.loginUser = loginUser;
    }

    public String getVideoTypeId() {
        return videoTypeId;
    }

    public void setVideoTypeId(String videoTypeId) {
        this.videoTypeId = videoTypeId;
    }

    public String getVideoInfoKeyword() {
        return videoInfoKeyword;
    }

    public void setVideoInfoKeyword(String videoInfoKeyword) {
        this.videoInfoKeyword = videoInfoKeyword;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }
}
