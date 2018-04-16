package com.kye.model.bean.comment.notice;

/**
 * Created by harry on 2018/4/10 16:11.
 */

public class CommentSecurity {

    /**
     * security : 0
     * auditingType : 0
     * commentType : 0
     */

    private String security;
    private String auditingType;
    private String commentType;

    public String getSecurity()                      { return security;}

    public void setSecurity(String security)         { this.security = security;}

    public String getAuditingType()                  { return auditingType;}

    public void setAuditingType(String auditingType) { this.auditingType = auditingType;}

    public String getCommentType()                   { return commentType;}

    public void setCommentType(String commentType)   { this.commentType = commentType;}
}
