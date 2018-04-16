package com.kye.model.bean.president_online;

import java.io.Serializable;

/**
 * Created by harry on 2018/1/10 下午4:30.
 */

public class RequestPresidentOnlineResBean implements Serializable {


    /**
     * phone : 18924656687
     * picture : 4AFD650B4DD2461E99DFB9251BF6B79E
     * type : 1
     */

    private String phone;
    private String guid;
    private String type;

    public RequestPresidentOnlineResBean(String phone, String guid, String type) {
        this.phone = phone;
        this.guid = guid;
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
