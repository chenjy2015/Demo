package com.kye.model.bean.comment.notice;

/**
 * Created by harry on 2018/4/3 14:08.
 */

public class RequestAddComment {
    private String module = "5";//模块
    private String moduletype = "2";//类别
    private String moduletypename;//类型名称
    private String linkid;//关联ID
    private String commentcontent;//评论内容
    private String createuser;//评论人
    private String replyuser;//回复的人
    private String replayparentid;//回复的具体评论ID
    private String title;//主题
    private String istop;//是否置顶
    private String ishandpick;//	0：需要审核才出现； 1：不需要审核就出现
    private String author;//通知实际发布人
    private String uuid;//当前登录用户uuid
    private String marketName;//所属市场员姓名
    private String marketTel;//所属市场员电话用户
    private String subjecturl;//专题网址
    private String deviceType = "1";//评论终端来源:1:外部APP,2:内部APP,3:微官网,4:微信

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getModuletype() {
        return moduletype;
    }

    public void setModuletype(String moduletype) {
        this.moduletype = moduletype;
    }

    public String getModuletypename() {
        return moduletypename;
    }

    public void setModuletypename(String moduletypename) {
        this.moduletypename = moduletypename;
    }

    public String getLinkid() {
        return linkid;
    }

    public void setLinkid(String linkid) {
        this.linkid = linkid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getReplyuser() {
        return replyuser;
    }

    public void setReplyuser(String replyuser) {
        this.replyuser = replyuser;
    }

    public String getReplayparentid() {
        return replayparentid;
    }

    public void setReplayparentid(String replayparentid) {
        this.replayparentid = replayparentid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop;
    }

    public String getIshandpick() {
        return ishandpick;
    }

    public void setIshandpick(String ishandpick) {
        this.ishandpick = ishandpick;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketTel() {
        return marketTel;
    }

    public void setMarketTel(String marketTel) {
        this.marketTel = marketTel;
    }

    public String getSubjecturl() {
        return subjecturl;
    }

    public void setSubjecturl(String subjecturl) {
        this.subjecturl = subjecturl;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}
