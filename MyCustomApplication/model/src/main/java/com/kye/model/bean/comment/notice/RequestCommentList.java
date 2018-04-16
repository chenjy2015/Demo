package com.kye.model.bean.comment.notice;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/03/2018
 * @updated : 15/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestCommentList {

//    module	string	是	3	模块（1：新闻管理 2：活动管理 3：广告管理 4：帮助管理 5：消息管理 6：资源管理 7：系统管理 9：通知模块 99：专题）
//    linkId	string	是	1	关联id（当前评论的新闻或活动 的id）
//    pageSize	string	是	3	页大小
//    pageIndex	string	是	1	页码
//    createUser	string	否	1	当前登录用户
//    deviceType	string	是	1	评论终端来源:1:外部APP,2:内部APP,3:微官网,4:微信

    /**
     * module : 3
     * linkId : 1
     * pageSize : 3
     * pageIndex : 1
     * createUser : 1
     * deviceType : 1
     */

    @SerializedName("module")
    private String module;
    @SerializedName("linkId")
    private String linkId;
    @SerializedName("pageSize")
    private String pageSize;
    @SerializedName("pageIndex")
    private String pageIndex;
    @SerializedName("createUser")
    private String createUser;
    @SerializedName("deviceType")
    private String deviceType;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}
