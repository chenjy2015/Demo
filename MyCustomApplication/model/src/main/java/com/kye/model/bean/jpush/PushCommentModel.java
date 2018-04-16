package com.kye.model.bean.jpush;

import java.io.Serializable;
import java.util.List;

public class PushCommentModel implements Serializable {


    /**
     * author :
     * childList : [{"author":"","commentTitle":"","commentcontent":"考虑太可怜了","commentdate":1480688120000,"content":"","createuser":"136****4300","createusername":"","id":1181,"isMy":"1","ishandpick":"1","isread":"1","istop":"0","jpushRid":"","level":2,"linkid":"249","replayparentid":"1177","replyuser":"136****4300","replyusername":"","rootparentid":"1177","subjecturl":""}]
     * commentTitle :
     * commentcontent : 经济斤斤计较2
     * commentdate : 1480677333000
     * content :
     * createuser : 136****4300
     * createusername :
     * id : 1177
     * isMy : 1
     * ishandpick : 1
     * isread : 1
     * istop : 0
     * jpushRid :
     * level : 1
     * linkid : 249
     * replayparentid :
     * replyuser :
     * replyusername :
     * rootparentid :
     * subjecturl :
     */

    private String author;
    private String commentTitle;
    private String commentcontent;
    private long commentdate;
    private String content;
    private String createuser;
    private String createusername;
    private int id;
    private String isMy;
    private String ishandpick;
    private String isread;
    private String istop;
    private String jpushRid;
    private int level;
    private String linkid;
    private String replayparentid;
    private String replyuser;
    private String replyusername;
    private String rootparentid;
    private String subjecturl;
    private boolean isDisplayAll;//自定字段，判断二级评论是否显示完全

    public boolean isDisplayAll() {
        return isDisplayAll;
    }

    public void setDisplayAll(boolean displayAll) {
        isDisplayAll = displayAll;
    }

    /**
     * author :
     * commentTitle :
     * commentcontent : 考虑太可怜了
     * commentdate : 1480688120000
     * content :
     * createuser : 136****4300
     * createusername :
     * id : 1181
     * isMy : 1
     * ishandpick : 1
     * isread : 1
     * istop : 0
     * jpushRid :
     * level : 2
     * linkid : 249
     * replayparentid : 1177
     * replyuser : 136****4300
     * replyusername :
     * rootparentid : 1177
     * subjecturl :
     */


    private List<ChildListBean> childList;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsMy() {
        return isMy;
    }

    public void setIsMy(String isMy) {
        this.isMy = isMy;
    }

    public String getIshandpick() {
        return ishandpick;
    }

    public void setIshandpick(String ishandpick) {
        this.ishandpick = ishandpick;
    }

    public String getIsread() {
        return isread;
    }

    public void setIsread(String isread) {
        this.isread = isread;
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop;
    }

    public String getJpushRid() {
        return jpushRid;
    }

    public void setJpushRid(String jpushRid) {
        this.jpushRid = jpushRid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLinkid() {
        return linkid;
    }

    public void setLinkid(String linkid) {
        this.linkid = linkid;
    }

    public String getReplayparentid() {
        return replayparentid;
    }

    public void setReplayparentid(String replayparentid) {
        this.replayparentid = replayparentid;
    }

    public String getReplyuser() {
        return replyuser;
    }

    public void setReplyuser(String replyuser) {
        this.replyuser = replyuser;
    }

    public String getReplyusername() {
        return replyusername;
    }

    public void setReplyusername(String replyusername) {
        this.replyusername = replyusername;
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

    public List<ChildListBean> getChildList() {
        return childList;
    }

    public void setChildList(List<ChildListBean> childList) {
        this.childList = childList;
    }

    public static class ChildListBean {
        private String author;
        private String commentTitle;
        private String commentcontent;
        private long commentdate;
        private String content;
        private String createuser;
        private String createusername;
        private int id;
        private String isMy;
        private String ishandpick;
        private String isread;
        private String istop;
        private String jpushRid;
        private int level;
        private String linkid;
        private String replayparentid;
        private String replyuser;
        private String replyusername;
        private String rootparentid;
        private String subjecturl;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCommentTitle() {
            return commentTitle;
        }

        public void setCommentTitle(String commentTitle) {
            this.commentTitle = commentTitle;
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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateuser() {
            return createuser;
        }

        public void setCreateuser(String createuser) {
            this.createuser = createuser;
        }

        public String getCreateusername() {
            return createusername;
        }

        public void setCreateusername(String createusername) {
            this.createusername = createusername;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIsMy() {
            return isMy;
        }

        public void setIsMy(String isMy) {
            this.isMy = isMy;
        }

        public String getIshandpick() {
            return ishandpick;
        }

        public void setIshandpick(String ishandpick) {
            this.ishandpick = ishandpick;
        }

        public String getIsread() {
            return isread;
        }

        public void setIsread(String isread) {
            this.isread = isread;
        }

        public String getIstop() {
            return istop;
        }

        public void setIstop(String istop) {
            this.istop = istop;
        }

        public String getJpushRid() {
            return jpushRid;
        }

        public void setJpushRid(String jpushRid) {
            this.jpushRid = jpushRid;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getLinkid() {
            return linkid;
        }

        public void setLinkid(String linkid) {
            this.linkid = linkid;
        }

        public String getReplayparentid() {
            return replayparentid;
        }

        public void setReplayparentid(String replayparentid) {
            this.replayparentid = replayparentid;
        }

        public String getReplyuser() {
            return replyuser;
        }

        public void setReplyuser(String replyuser) {
            this.replyuser = replyuser;
        }

        public String getReplyusername() {
            return replyusername;
        }

        public void setReplyusername(String replyusername) {
            this.replyusername = replyusername;
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
    }
}
