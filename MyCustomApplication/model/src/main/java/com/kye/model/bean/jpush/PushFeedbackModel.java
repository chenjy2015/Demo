package com.kye.model.bean.jpush;

import java.io.Serializable;

public class PushFeedbackModel implements Serializable {
    private int notifyId;
    private String title;
    private String contInfo;
    private String msgClass;
    private String msgRid;
    private String msgSendTime;
    private String msgId;

    public int getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(int notifyId) {
        this.notifyId = notifyId;
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

    public String getMsgClass() {
        return msgClass;
    }

    public void setMsgClass(String msgClass) {
        this.msgClass = msgClass;
    }

    public String getMsgRid() {
        return msgRid;
    }

    public void setMsgRid(String msgRid) {
        this.msgRid = msgRid;
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
}
