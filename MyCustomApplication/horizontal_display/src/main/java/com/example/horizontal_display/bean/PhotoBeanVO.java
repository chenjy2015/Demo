package com.example.horizontal_display.bean;

import java.io.Serializable;

/**
 *
 * @company 跨越速运
 * @Description 图片详细信息
 * @author cjy
 * @date 2016/7/14
 * @version V1.0
 */
public class PhotoBeanVO implements Serializable {

    private String label;       //相片标签
    private String url;         //网络地址
    private String path;        //本地地址
    private String base64;      //图片base64字符串
    private String createTime;  //创建时间
    private String modifyTime;  //修改时间
    private String size;        //图片大小
    private String groupId;     //所属相册ID
    private String groupName;   //所属相册名称

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }
}