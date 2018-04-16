package com.kye.model.bean.jpush;

import java.io.Serializable;

public class PushNewsModel implements Serializable {

    /**
     * msgId : 36
     * title : 下单如何增加目的地及重量选项
     * contInfo : 下单内容上方有【新增目的地】的按钮
     * accessUrl : http://res.ky-express.com/h5/news/36.html
     */

    private int notifyId;
    private String msgId;
    private String title;
    private String contInfo;
    private String accessUrl;
    private String msgSendTime;//弹窗用到时间
    private String phoneNumber; //通知推送 发布人号码

    public int getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(int notifyId) {
        this.notifyId = notifyId;
    }

    public String getMsgSendTime() {
        return msgSendTime;
    }

    public void setMsgSendTime(String msgSendTime) {
        this.msgSendTime = msgSendTime;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContInfo() {
        return contInfo;
    }

    public void setContInfo(String contInfo) {
        this.contInfo = contInfo;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
