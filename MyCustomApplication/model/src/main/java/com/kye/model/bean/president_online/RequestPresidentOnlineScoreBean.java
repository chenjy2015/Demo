package com.kye.model.bean.president_online;

import java.io.Serializable;

/**
 * Created by harry on 2018/1/10 下午4:30.
 */

public class RequestPresidentOnlineScoreBean implements Serializable {

    /**
     * code : WBLY1712-00004
     * satisfaction : 不满意
     * message : 回复不满意信息
     * phone : 18924656687
     */

    private String code;
    private String satisfaction;
    private String message;
    private String phone;

    public RequestPresidentOnlineScoreBean(String code, String satisfaction, String message, String phone) {
        this.code = code;
        this.satisfaction = satisfaction;
        this.message = message;
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
