package com.kye.model.bean.popularity;

/**
 * Created by yangwentao on 2018/4/9.
 */

public class HelpInfo {

    /**
     * id : 27
     * type : 外部APP帮助
     * title : 外部APP帮助
     * descript :
     * content : 外部APP帮助
     * publishUser : 管理员
     * createDate : 2016-04-25 17:04:22
     * lastModifyUser : 管理员
     * lastModifyDate : 2016-04-25 17:04:22
     * sort : 0
     * classid : 5
     * classSort : 0
     * className : 外部APP帮助
     * classLevel : 0
     * classParentId : 1
     * classRemark :
     * classVisible : 1
     * classRecomdFlag : 0
     * classImagePath :
     * classKeyword :
     */

    private int id;
    private String type;
    private String module;
    private String title;
    private String descript;
    private String content;
    private String publishUser;
    private String createDate;
    private String lastModifyUser;
    private String lastModifyDate;
    private int sort;
    private int classid;
    private int classSort;
    private String className;
    private int classLevel;
    private String classParentId;
    private String classRemark;
    private int classVisible;
    private int classRecomdFlag;
    private String classImagePath;
    private String classKeyword;
    private String url;
    private String accessUrl;
    private String titleImg;
    private int clickNum;

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public int getClickNum() {
        return clickNum;
    }

    public void setClickNum(int clickNum) {
        this.clickNum = clickNum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishUser() {
        return publishUser;
    }

    public void setPublishUser(String publishUser) {
        this.publishUser = publishUser;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(String lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public int getClassSort() {
        return classSort;
    }

    public void setClassSort(int classSort) {
        this.classSort = classSort;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public String getClassParentId() {
        return classParentId;
    }

    public void setClassParentId(String classParentId) {
        this.classParentId = classParentId;
    }

    public String getClassRemark() {
        return classRemark;
    }

    public void setClassRemark(String classRemark) {
        this.classRemark = classRemark;
    }

    public int getClassVisible() {
        return classVisible;
    }

    public void setClassVisible(int classVisible) {
        this.classVisible = classVisible;
    }

    public int getClassRecomdFlag() {
        return classRecomdFlag;
    }

    public void setClassRecomdFlag(int classRecomdFlag) {
        this.classRecomdFlag = classRecomdFlag;
    }

    public String getClassImagePath() {
        return classImagePath;
    }

    public void setClassImagePath(String classImagePath) {
        this.classImagePath = classImagePath;
    }

    public String getClassKeyword() {
        return classKeyword;
    }

    public void setClassKeyword(String classKeyword) {
        this.classKeyword = classKeyword;
    }

    @Override
    public String toString() {
        return "HelpInfo{" +
               "id=" + id +
               ", type='" + type + '\'' +
               ", module='" + module + '\'' +
               ", title='" + title + '\'' +
               ", descript='" + descript + '\'' +
               ", content='" + content + '\'' +
               ", publishUser='" + publishUser + '\'' +
               ", createDate='" + createDate + '\'' +
               ", lastModifyUser='" + lastModifyUser + '\'' +
               ", lastModifyDate='" + lastModifyDate + '\'' +
               ", sort=" + sort +
               ", classid=" + classid +
               ", classSort=" + classSort +
               ", className='" + className + '\'' +
               ", classLevel=" + classLevel +
               ", classParentId='" + classParentId + '\'' +
               ", classRemark='" + classRemark + '\'' +
               ", classVisible=" + classVisible +
               ", classRecomdFlag=" + classRecomdFlag +
               ", classImagePath='" + classImagePath + '\'' +
               ", classKeyword='" + classKeyword + '\'' +
               ", url='" + url + '\'' +
               ", accessUrl='" + accessUrl + '\'' +
               ", titleImg='" + titleImg + '\'' +
               ", clickNum=" + clickNum +
               '}';
    }
}
