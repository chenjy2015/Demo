package com.kye.model.bean.event;

/**
 * Created by chen on 18/1/23.
 */

public class EventFactory {

    public static class OnWechatPayEvent {
        public int code;
        public String msg;
    }

    public static class OnWeChatShareSuccessEvent {
    }

    public static class OnQQShareSuccessEvent {
    }

    public static class OnSinaShareSuccessEvent {
    }
}
