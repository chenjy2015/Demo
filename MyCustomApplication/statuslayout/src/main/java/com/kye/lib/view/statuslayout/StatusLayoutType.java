package com.kye.lib.view.statuslayout;

import android.support.annotation.IntRange;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 21/12/2017
 * @updated : 21/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 */

public enum StatusLayoutType {

    CONTENT(0, "content view"), // 内容
    LOADING(1, "loading view"), // 正在加载
    EMPTY(2, "empty view"), // 无数据
    ERROR_NETWORK(3, "network error view"), // 网络错误
    ERROR_SERVER(4, "server error view"), // 后台错误
    CUSTOM(5, "custom view"); // 自定义


    StatusLayoutType(int order, String desc) {
        this.order = order;
        this.desc = desc;
    }

    private int order;
    private String desc;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "StatusLayoutType{" +
                "order=" + order +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static StatusLayoutType toOrder(@IntRange(from = 0, to = 5) int order) {
        switch (order) {
            case 0:
                return CONTENT;
            case 1:
                return LOADING;
            case 2:
                return EMPTY;
            case 3:
                return ERROR_NETWORK;
            case 4:
                return ERROR_SERVER;
            case 5:
                return CUSTOM;
        }
        throw new IllegalArgumentException("StatusLayoutType toOrder error : " + order);
    }
}
