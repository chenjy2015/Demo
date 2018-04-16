package com.kye.model.bean.comment.notice;


public class RequestPvBean {

    /**
     * moduleID : 2
     * titleID : 123
     * titleName : 新闻模块的第一篇文章
     * source : 2
     */

    private String moduleID;
    private String titleID;
    private String titleName;
    private int    source;

    public String getModuleID()                { return moduleID;}

    public void setModuleID(String moduleID)   { this.moduleID = moduleID;}

    public String getTitleID()                 { return titleID;}

    public void setTitleID(String titleID)     { this.titleID = titleID;}

    public String getTitleName()               { return titleName;}

    public void setTitleName(String titleName) { this.titleName = titleName;}

    public int getSource()                     { return source;}

    public void setSource(int source)          { this.source = source;}
}
