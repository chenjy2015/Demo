package com.kye.model.bean.comment.notice;

import com.kye.model.base.BaseItem;

/**
 * Created by harry on 2018/4/3 15:49.
 */

public class MyCommentUnReadList implements BaseItem {


    /**
     * module : z4rh
     * linkId : 1326
     * createUser : 24gm
     * unReadNum : 2
     * myComment : 4xm7
     * pageSize : 0
     * pageNum : 0
     * startIndex : 0
     * endIndex : 0
     * limitSize : 0
     */

    private String module;
    private String linkId;
    private String createUser;
    private String unReadNum;
    private String myComment;
    private int    pageSize;
    private int    pageNum;
    private int    startIndex;
    private int    endIndex;
    private int    limitSize;

    public String getModule()                    { return module;}

    public void setModule(String module)         { this.module = module;}

    public String getLinkId()                    { return linkId;}

    public void setLinkId(String linkId)         { this.linkId = linkId;}

    public String getCreateUser()                { return createUser;}

    public void setCreateUser(String createUser) { this.createUser = createUser;}

    public String getUnReadNum()                 { return unReadNum;}

    public void setUnReadNum(String unReadNum)   { this.unReadNum = unReadNum;}

    public String getMyComment()                 { return myComment;}

    public void setMyComment(String myComment)   { this.myComment = myComment;}

    public int getPageSize()                     { return pageSize;}

    public void setPageSize(int pageSize)        { this.pageSize = pageSize;}

    public int getPageNum()                      { return pageNum;}

    public void setPageNum(int pageNum)          { this.pageNum = pageNum;}

    public int getStartIndex()                   { return startIndex;}

    public void setStartIndex(int startIndex)    { this.startIndex = startIndex;}

    public int getEndIndex()                     { return endIndex;}

    public void setEndIndex(int endIndex)        { this.endIndex = endIndex;}

    public int getLimitSize()                    { return limitSize;}

    public void setLimitSize(int limitSize)      { this.limitSize = limitSize;}
}
