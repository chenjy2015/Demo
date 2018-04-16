package com.kye.model.bean.help;

/** 获取帮助列表信息
 * @version V1.0
 * @createAuthor chenyuhan
 * @createDate 2018/1/6 18:24
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public class ResultGetHelpListBean {

    private int id; //帮助ID
    private int module; //模块
    private String type; //帮助类型
    private String title; //标题
    private String descript; //描述
    private String content; //内容
    private String publishUser; //发布者
    private String createDate; //创建时间
    private String lastModifyUser; //最后修改用户
    private String lastModifyDate; //最后修改时间
    private int sort; //排序
    private int classid; //类别ID
    private int classSort; //类别排序
    private String className; //分类名称
    private int classLevel; //分类层级
    private String classParentId; //分类父类ID
    private String classRemark; //分类备注
    private int classVisible; //类别是否有效标识
    private int classRecomdFlag; //类别推荐标识
    private String classImagePath; //分类图标路径
    private String classKeyword; //类别关键字
    private String accessUrl; //网页访问URL
    private String clickNum; //点击量
    private String url; //链接地址
    private String titleImg; //标题图片地址
    private boolean success; //是否成功

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
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

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getClickNum() {
        return clickNum;
    }

    public void setClickNum(String clickNum) {
        this.clickNum = clickNum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "HelpInfoListModel{" +
                "id=" + id +
                ", module=" + module +
                ", type='" + type + '\'' +
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
                ", accessUrl='" + accessUrl + '\'' +
                ", clickNum='" + clickNum + '\'' +
                ", url='" + url + '\'' +
                ", titleImg='" + titleImg + '\'' +
                ", success=" + success +
                '}';
    }
}
