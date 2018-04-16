package com.kye.model.bean.comment.notice;


public class RequestUploadPvBean {


    /**
     * createUser : 18566117661
     * module : 3
     * moduleType : 2
     * moduleTypeName : 启动欢迎页
     * title : 介绍客户
     * linkId : 37
     */

    private String createUser;
    private String module;
    private String moduleType;
    private String moduleTypeName;
    private String title;
    private String linkId;

    public String getCreateUser()                        { return createUser;}

    public void setCreateUser(String createUser)         { this.createUser = createUser;}

    public String getModule()                            { return module;}

    public void setModule(String module)                 { this.module = module;}

    public String getModuleType()                        { return moduleType;}

    public void setModuleType(String moduleType)         { this.moduleType = moduleType;}

    public String getModuleTypeName()                    { return moduleTypeName;}

    public void setModuleTypeName(String moduleTypeName) { this.moduleTypeName = moduleTypeName;}

    public String getTitle()                             { return title;}

    public void setTitle(String title)                   { this.title = title;}

    public String getLinkId()                            { return linkId;}

    public void setLinkId(String linkId)                 { this.linkId = linkId;}
}
