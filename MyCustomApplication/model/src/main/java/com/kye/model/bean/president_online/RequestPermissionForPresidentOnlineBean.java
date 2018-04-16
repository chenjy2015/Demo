package com.kye.model.bean.president_online;

import java.io.Serializable;

/**
 * Created by harry on 2018/1/15 下午2:49.
 */

public class RequestPermissionForPresidentOnlineBean implements Serializable {

    /**
     * phone : 14777477467
     */

    private String phone;

    public RequestPermissionForPresidentOnlineBean(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
