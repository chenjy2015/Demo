package com.kye.model.bean.comment.notice;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/03/2018
 * @updated : 15/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     通知详情的评论数据
 */

public class CommentItemBean implements Parcelable {

    /**
     * replyuser :
     * commentcontent : 跨越速运10亿红包凶猛来袭评论
     * ishandpick : 1
     * isMy : 0
     * childList : [{"replyuser":"158****8899","commentcontent":"跨越速运10亿红包凶猛来袭评论","ishandpick":"1","isMy":"0","jpushRid":"","rootparentid":"19573","subjecturl":"","replayparentid":"19573","content":"","linkid":"1","istop":"1","id":19577,"createusername":"","commentdate":1514538302000,"level":2,"author":"王鹏","marketTel":"","createuser":"158****8899","isCustomer":"0","marketName":"","commentTitle":"","isread":"1","replyusername":""},{"replyuser":"158****8899","commentcontent":"跨越速运10亿红包凶猛来袭评论","ishandpick":"1","isMy":"0","jpushRid":"","rootparentid":"19573","subjecturl":"","replayparentid":"19573","content":"","linkid":"1","istop":"1","id":19578,"createusername":"","commentdate":1514538311000,"level":2,"author":"王鹏","marketTel":"","createuser":"158****8899","isCustomer":"0","marketName":"","commentTitle":"","isread":"1","replyusername":""}]
     * jpushRid :
     * rootparentid :
     * subjecturl :
     * replayparentid :
     * content :
     * linkid : 1
     * istop : 1
     * id : 19573
     * createusername :
     * commentdate : 1514447080000
     * level : 1
     * author : 王鹏
     * marketTel :
     * createuser : 158****8899
     * isCustomer : 0
     * marketName :
     * commentTitle :
     * isread : 1
     * replyusername :
     */

    @SerializedName("replyuser")
    private String replyuser;
    @SerializedName("commentcontent")
    private String              commentcontent;
    @SerializedName("ishandpick")
    private String              ishandpick;
    @SerializedName("isMy")
    private String              isMy;
    @SerializedName("jpushRid")
    private String              jpushRid;
    @SerializedName("rootparentid")
    private String              rootparentid;
    @SerializedName("subjecturl")
    private String              subjecturl;
    @SerializedName("replayparentid")
    private String              replayparentid;
    @SerializedName("content")
    private String              content;
    @SerializedName("linkid")
    private String              linkid;
    @SerializedName("istop")
    private String              istop;
    @SerializedName("id")
    private int                 id;
    @SerializedName("createusername")
    private String              createusername;
    @SerializedName("commentdate")
    private long                commentdate;
    @SerializedName("level")
    private int                 level;
    @SerializedName("author")
    private String              author;
    @SerializedName("marketTel")
    private String              marketTel;
    @SerializedName("createuser")
    private String              createuser;
    @SerializedName("isCustomer")
    private String              isCustomer;
    @SerializedName("marketName")
    private String              marketName;
    @SerializedName("commentTitle")
    private String              commentTitle;
    @SerializedName("isread")
    private String              isread;
    @SerializedName("replyusername")
    private String              replyusername;
    @SerializedName("childList")
    private List<CommentItemBean> childList;

    public String getReplyuser() {
        return replyuser;
    }

    public void setReplyuser(String replyuser) {
        this.replyuser = replyuser;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    public String getIshandpick() {
        return ishandpick;
    }

    public void setIshandpick(String ishandpick) {
        this.ishandpick = ishandpick;
    }

    public String getIsMy() {
        return isMy;
    }

    public void setIsMy(String isMy) {
        this.isMy = isMy;
    }

    public String getJpushRid() {
        return jpushRid;
    }

    public void setJpushRid(String jpushRid) {
        this.jpushRid = jpushRid;
    }

    public String getRootparentid() {
        return rootparentid;
    }

    public void setRootparentid(String rootparentid) {
        this.rootparentid = rootparentid;
    }

    public String getSubjecturl() {
        return subjecturl;
    }

    public void setSubjecturl(String subjecturl) {
        this.subjecturl = subjecturl;
    }

    public String getReplayparentid() {
        return replayparentid;
    }

    public void setReplayparentid(String replayparentid) {
        this.replayparentid = replayparentid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLinkid() {
        return linkid;
    }

    public void setLinkid(String linkid) {
        this.linkid = linkid;
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername;
    }

    public long getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(long commentdate) {
        this.commentdate = commentdate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMarketTel() {
        return marketTel;
    }

    public void setMarketTel(String marketTel) {
        this.marketTel = marketTel;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(String isCustomer) {
        this.isCustomer = isCustomer;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getIsread() {
        return isread;
    }

    public void setIsread(String isread) {
        this.isread = isread;
    }

    public String getReplyusername() {
        return replyusername;
    }

    public void setReplyusername(String replyusername) {
        this.replyusername = replyusername;
    }

    public List<CommentItemBean> getChildList() {
        return childList;
    }

    public void setChildList(List<CommentItemBean> childList) {
        this.childList = childList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.replyuser);
        dest.writeString(this.commentcontent);
        dest.writeString(this.ishandpick);
        dest.writeString(this.isMy);
        dest.writeString(this.jpushRid);
        dest.writeString(this.rootparentid);
        dest.writeString(this.subjecturl);
        dest.writeString(this.replayparentid);
        dest.writeString(this.content);
        dest.writeString(this.linkid);
        dest.writeString(this.istop);
        dest.writeInt(this.id);
        dest.writeString(this.createusername);
        dest.writeLong(this.commentdate);
        dest.writeInt(this.level);
        dest.writeString(this.author);
        dest.writeString(this.marketTel);
        dest.writeString(this.createuser);
        dest.writeString(this.isCustomer);
        dest.writeString(this.marketName);
        dest.writeString(this.commentTitle);
        dest.writeString(this.isread);
        dest.writeString(this.replyusername);
        dest.writeList(this.childList);
    }

    public CommentItemBean() {
    }

    protected CommentItemBean(Parcel in) {
        this.replyuser = in.readString();
        this.commentcontent = in.readString();
        this.ishandpick = in.readString();
        this.isMy = in.readString();
        this.jpushRid = in.readString();
        this.rootparentid = in.readString();
        this.subjecturl = in.readString();
        this.replayparentid = in.readString();
        this.content = in.readString();
        this.linkid = in.readString();
        this.istop = in.readString();
        this.id = in.readInt();
        this.createusername = in.readString();
        this.commentdate = in.readLong();
        this.level = in.readInt();
        this.author = in.readString();
        this.marketTel = in.readString();
        this.createuser = in.readString();
        this.isCustomer = in.readString();
        this.marketName = in.readString();
        this.commentTitle = in.readString();
        this.isread = in.readString();
        this.replyusername = in.readString();
        this.childList = new ArrayList<CommentItemBean>();
        in.readList(this.childList, CommentItemBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<CommentItemBean> CREATOR = new Parcelable.Creator<CommentItemBean>() {
        @Override
        public CommentItemBean createFromParcel(Parcel source) {
            return new CommentItemBean(source);
        }

        @Override
        public CommentItemBean[] newArray(int size) {
            return new CommentItemBean[size];
        }
    };
}
