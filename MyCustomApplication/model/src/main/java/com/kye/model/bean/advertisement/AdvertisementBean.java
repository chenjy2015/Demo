package com.kye.model.bean.advertisement;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/01/2018
 * @updated : 06/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class AdvertisementBean implements Parcelable {

//    ID	number	18	活动ID
//    accessUrl	string	http://172.20.2.57/h5/advertisement/18.html	网页访问URL
//    adName	string	生日弹窗	广告名称
//    adType	number	1	广告类型
//    ajaxFilePath	string		异步返回生成文件路径
//    className	string	生日弹窗	类别名称
//    classid	string	8	类别ID
//    content	string	<strong>何国平祝您生日快乐！</strong>	文字内容
//    createDate	string	2016-09-20 16:24	创建时间
//    datas	string		播放语音控制代码
//    endDate	string	2018-12-31 16:23	结束时间
//    flag	number	1	是否有效
//    imgPaths	string	d://kye/res/attached/advertiseTitleImg/20160920162533067.png	分类图标路径
//    isOpenComment	string		是否允许评论:0为不允许,1为允许
//    isPlay	string	0	是否播放语音，0为不播放，1位播放
//    largeImg	string	https://img.ky-express.com/attached/advertiseTitleImg/20160920162541051.png	大图
//    largeImg_savePath	string		大图片保存路径
//    lastModifyDate	string	2017-12-12 22:54	最后修改时间
//    lastModifyUser	string		最后修改人
//    module	string	3	模块
//    moduleID	string	0	模块id
//    musicurl	string		音乐播放地址
//    publishUser	string		发布者
//    smallImg	string	https://img.ky-express.com/attached/advertiseTitleImg/20160920162528083.png	小图
//    smallImg_savePath	string		小图片保存路径
//    sort	number	0	排序
//    startDate	string	2016-07-01 16:23	开始时间
//    titleImg	string	https://img.ky-express.com/attached/advertiseTitleImg/20160920162533067.png	广告头图
//    url	string		链接地址

    /**
     * ID : 230
     * accessUrl : https://res.ky-express.com/h5/advertisement/230.html
     * adName : 新版app下单流程帮助！
     * adType : 1
     * ajaxFilePath :
     * className : 首页幻灯片
     * classid : 3
     * content : <img src="https://img.ky-express.com/attached/image/20180103/20180103112710_884.jpg" alt="" />
     * createDate : 2018-01-03 11:24
     * datas :
     * endDate : 2018-01-31 11:26
     * flag : 1
     * imgPaths : d://kye/res/attached/advertiseTitleImg/20180103112646804.jpg
     * isOpenComment :
     * isPlay : 0
     * largeImg : https://img.ky-express.com/attached/advertiseTitleImg/20180103112647851.jpg
     * largeImg_savePath :
     * lastModifyDate : 2018-01-03 11:24
     * lastModifyUser :
     * module : 3
     * moduleID : 0
     * musicurl :
     * publishUser :
     * smallImg : https://img.ky-express.com/attached/advertiseTitleImg/20180103112647351.jpg
     * smallImg_savePath :
     * sort : -8888
     * startDate : 2018-01-02 11:26
     * titleImg : https://img.ky-express.com/attached/advertiseTitleImg/20180103112646804.jpg
     * url :
     */

    @SerializedName("ID")
    private int ID;
    @SerializedName("accessUrl")
    private String accessUrl;
    @SerializedName("adName")
    private String adName;
    @SerializedName("adType")
    private int adType;
    @SerializedName("ajaxFilePath")
    private String ajaxFilePath;
    @SerializedName("className")
    private String className;
    @SerializedName("classid")
    private int classid;
    @SerializedName("content")
    private String content;
    @SerializedName("createDate")
    private String createDate;
    @SerializedName("datas")
    private String datas;
    @SerializedName("endDate")
    private String endDate;
    @SerializedName("flag")
    private int flag;
    @SerializedName("imgPaths")
    private String imgPaths;
    @SerializedName("isOpenComment")
    private String isOpenComment;
    @SerializedName("isPlay")
    private String isPlay;
    @SerializedName("largeImg")
    private String largeImg;
    @SerializedName("largeImg_savePath")
    private String largeImgSavePath;
    @SerializedName("lastModifyDate")
    private String lastModifyDate;
    @SerializedName("lastModifyUser")
    private String lastModifyUser;
    @SerializedName("module")
    private String module;
    @SerializedName("moduleID")
    private String moduleID;
    @SerializedName("musicurl")
    private String musicurl;
    @SerializedName("publishUser")
    private String publishUser;
    @SerializedName("smallImg")
    private String smallImg;
    @SerializedName("smallImg_savePath")
    private String smallImgSavePath;
    @SerializedName("sort")
    private int sort;
    @SerializedName("startDate")
    private String startDate;
    @SerializedName("titleImg")
    private String titleImg;
    @SerializedName("url")
    private String url;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public int getAdType() {
        return adType;
    }

    public void setAdType(int adType) {
        this.adType = adType;
    }

    public String getAjaxFilePath() {
        return ajaxFilePath;
    }

    public void setAjaxFilePath(String ajaxFilePath) {
        this.ajaxFilePath = ajaxFilePath;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDatas() {
        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getImgPaths() {
        return imgPaths;
    }

    public void setImgPaths(String imgPaths) {
        this.imgPaths = imgPaths;
    }

    public String getIsOpenComment() {
        return isOpenComment;
    }

    public void setIsOpenComment(String isOpenComment) {
        this.isOpenComment = isOpenComment;
    }

    public String getIsPlay() {
        return isPlay;
    }

    public void setIsPlay(String isPlay) {
        this.isPlay = isPlay;
    }

    public String getLargeImg() {
        return largeImg;
    }

    public void setLargeImg(String largeImg) {
        this.largeImg = largeImg;
    }

    public String getLargeImgSavePath() {
        return largeImgSavePath;
    }

    public void setLargeImgSavePath(String largeImgSavePath) {
        this.largeImgSavePath = largeImgSavePath;
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(String lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public String getMusicurl() {
        return musicurl;
    }

    public void setMusicurl(String musicurl) {
        this.musicurl = musicurl;
    }

    public String getPublishUser() {
        return publishUser;
    }

    public void setPublishUser(String publishUser) {
        this.publishUser = publishUser;
    }

    public String getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(String smallImg) {
        this.smallImg = smallImg;
    }

    public String getSmallImgSavePath() {
        return smallImgSavePath;
    }

    public void setSmallImgSavePath(String smallImgSavePath) {
        this.smallImgSavePath = smallImgSavePath;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.ID);
        dest.writeString(this.accessUrl);
        dest.writeString(this.adName);
        dest.writeInt(this.adType);
        dest.writeString(this.ajaxFilePath);
        dest.writeString(this.className);
        dest.writeInt(this.classid);
        dest.writeString(this.content);
        dest.writeString(this.createDate);
        dest.writeString(this.datas);
        dest.writeString(this.endDate);
        dest.writeInt(this.flag);
        dest.writeString(this.imgPaths);
        dest.writeString(this.isOpenComment);
        dest.writeString(this.isPlay);
        dest.writeString(this.largeImg);
        dest.writeString(this.largeImgSavePath);
        dest.writeString(this.lastModifyDate);
        dest.writeString(this.lastModifyUser);
        dest.writeString(this.module);
        dest.writeString(this.moduleID);
        dest.writeString(this.musicurl);
        dest.writeString(this.publishUser);
        dest.writeString(this.smallImg);
        dest.writeString(this.smallImgSavePath);
        dest.writeInt(this.sort);
        dest.writeString(this.startDate);
        dest.writeString(this.titleImg);
        dest.writeString(this.url);
    }

    public AdvertisementBean() {
    }

    protected AdvertisementBean(Parcel in) {
        this.ID = in.readInt();
        this.accessUrl = in.readString();
        this.adName = in.readString();
        this.adType = in.readInt();
        this.ajaxFilePath = in.readString();
        this.className = in.readString();
        this.classid = in.readInt();
        this.content = in.readString();
        this.createDate = in.readString();
        this.datas = in.readString();
        this.endDate = in.readString();
        this.flag = in.readInt();
        this.imgPaths = in.readString();
        this.isOpenComment = in.readString();
        this.isPlay = in.readString();
        this.largeImg = in.readString();
        this.largeImgSavePath = in.readString();
        this.lastModifyDate = in.readString();
        this.lastModifyUser = in.readString();
        this.module = in.readString();
        this.moduleID = in.readString();
        this.musicurl = in.readString();
        this.publishUser = in.readString();
        this.smallImg = in.readString();
        this.smallImgSavePath = in.readString();
        this.sort = in.readInt();
        this.startDate = in.readString();
        this.titleImg = in.readString();
        this.url = in.readString();
    }

    public static final Creator<AdvertisementBean> CREATOR = new Creator<AdvertisementBean>() {
        @Override
        public AdvertisementBean createFromParcel(Parcel source) {
            return new AdvertisementBean(source);
        }

        @Override
        public AdvertisementBean[] newArray(int size) {
            return new AdvertisementBean[size];
        }
    };
}
