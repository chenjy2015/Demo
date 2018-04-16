package com.kye.model.bean.comment.notice;

/**
 * Created by harry on 2018/4/3 15:51.
 */

public class RequestUnReadList {
    private String module;
    private String linkId;
    private String createUser;

    public String getMoudle() {
        return module;
    }

    public void setMoudle(String module) {
        this.module = module;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}
