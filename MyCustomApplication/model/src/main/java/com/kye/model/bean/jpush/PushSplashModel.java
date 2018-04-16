package com.kye.model.bean.jpush;

import com.google.gson.Gson;

import java.io.Serializable;

public class PushSplashModel implements Serializable {
    private String pushBean;
    private int pushId;
    private PushType pushType;
    private String title;
    private String content;
    private String phoneNumber; //通知推送 发布人号码

    public Object getPushBean(String className) {
        Gson gson = new Gson();
        Object object = null;
        try {
            object = gson.fromJson(pushBean, Class.forName(className));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public void setPushBean(String pushBean) {
        this.pushBean = pushBean;
    }

    public int getPushId() {
        return pushId;
    }

    public void setPushId(int pushId) {
        this.pushId = pushId;
    }

    public String getPushBean() {
        return pushBean;
    }

    public PushType getPushType() {
        return pushType;
    }

    public void setPushType(PushType pushType) {
        this.pushType = pushType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
