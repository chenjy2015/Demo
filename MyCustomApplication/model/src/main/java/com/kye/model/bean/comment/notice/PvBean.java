package com.kye.model.bean.comment.notice;


public class PvBean {

    /**
     * numberClicks : 3
     * moduleName : 新闻模块的第一篇文章
     * moduleID : 2
     */

    private int numberClicks;
    private String moduleName;
    private String moduleID;

    public int getNumberClicks()                  { return numberClicks;}

    public void setNumberClicks(int numberClicks) { this.numberClicks = numberClicks;}

    public String getModuleName()                 { return moduleName;}

    public void setModuleName(String moduleName)  { this.moduleName = moduleName;}

    public String getModuleID()                   { return moduleID;}

    public void setModuleID(String moduleID)      { this.moduleID = moduleID;}
}
