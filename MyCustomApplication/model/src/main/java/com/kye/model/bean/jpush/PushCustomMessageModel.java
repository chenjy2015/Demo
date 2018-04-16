package com.kye.model.bean.jpush;

import java.io.Serializable;

public class PushCustomMessageModel implements Serializable {
    private String msgClass;
    private String msgResult;

    public String getMsgClass() {
        return msgClass;
    }

    public void setMsgClass(String msgClass) {
        this.msgClass = msgClass;
    }

    public String getMsgResult() {
        return msgResult;
    }

    public void setMsgResult(String msgResult) {
        this.msgResult = msgResult;
    }
}
