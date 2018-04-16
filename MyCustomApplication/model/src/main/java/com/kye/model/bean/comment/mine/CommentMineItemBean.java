package com.kye.model.bean.comment.mine;

import com.google.gson.annotations.SerializedName;
import com.kye.model.base.BaseItem;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 11/01/2018
 * @updated : 11/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     我的评论item
 */

public class CommentMineItemBean implements BaseItem {


    /**
     * replyuser :
     * deviceType : 1
     * commentcontent : 跨越速运10亿红包凶猛来袭评论
     * commentdate : 1514451421000
     * level : 1
     * author : 王鹏
     * module : 3
     * createuser : 15817358899
     * title : 跨越速运10亿红包凶猛来袭
     * subjecturl : http://res.ky-express.com/h5/advertisement/1.html
     * subjecturl_V2 : http://res.ky-express.com/h5/advertisement/1.html
     * moduletypename : 启动欢迎页
     * linkid : 1
     * isread : 1
     * moduletype : 2
     * id : 19576
     */

    @SerializedName("replyuser")
    private String replyuser;
    @SerializedName("deviceType")
    private String deviceType;
    @SerializedName("commentcontent")
    private String commentcontent;
    @SerializedName("commentdate")
    private long commentdate;
    @SerializedName("level")
    private String level;
    @SerializedName("author")
    private String author;
    @SerializedName("module")
    private String module;
    @SerializedName("createuser")
    private String createuser;
    @SerializedName("title")
    private String title;
    @SerializedName("subjecturl")
    private String subjecturl;
    @SerializedName("subjecturl_V2")
    private String subjecturlV2;
    @SerializedName("moduletypename")
    private String moduletypename;
    @SerializedName("linkid")
    private String linkid;
    @SerializedName("isread")
    private String isread;
    @SerializedName("moduletype")
    private String moduletype;
    @SerializedName("id")
    private long id;

    public String getReplyuser() {
        return replyuser;
    }

    public void setReplyuser(String replyuser) {
        this.replyuser = replyuser;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    public long getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(long commentdate) {
        this.commentdate = commentdate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubjecturl() {
        return subjecturl;
    }

    public void setSubjecturl(String subjecturl) {
        this.subjecturl = subjecturl;
    }

    public String getSubjecturlV2() {
        return subjecturlV2;
    }

    public void setSubjecturlV2(String subjecturlV2) {
        this.subjecturlV2 = subjecturlV2;
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

    public String getIsread() {
        return isread;
    }

    public void setIsread(String isread) {
        this.isread = isread;
    }

    public String getModuletype() {
        return moduletype;
    }

    public void setModuletype(String moduletype) {
        this.moduletype = moduletype;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
