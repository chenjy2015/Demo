package com.kye.model.bean.jpush;

import java.io.Serializable;

/**
 * Created by harry on 2018/2/6 下午2:47.
 */

public enum PushType implements Serializable {
    news //新闻 消息
    , order //订单消息
    , express //运单消息
    , otherLogin //下线通知
    , noticeDialog //弹窗通知
    , noticeDetatil //通知栏直接跳转通知详情界面
    , commentOne //通知一级评论
    , commentTwo //通知二级评论
    , feedBack //反馈
    , sendLog //上传接口日志
    , other // 其它
}
