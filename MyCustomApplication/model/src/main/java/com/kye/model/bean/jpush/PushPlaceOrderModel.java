package com.kye.model.bean.jpush;

import java.io.Serializable;

public class PushPlaceOrderModel implements Serializable {

    private String msgId;       //订单号
    private String title;       //主题
    private String contInfo;    //内容
    private String msgClass;    //推送类别   1为新闻 2 为消息  3为下单
    private String type;        //接收类别  1：下单人接收 2：收件人接收
    private String alias;       //别名
    private String tag;       //标示

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public String getMsgClass() {
        return msgClass;
    }

    public void setMsgClass(String msgClass) {
        this.msgClass = msgClass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}