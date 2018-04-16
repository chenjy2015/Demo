package com.kye.model.bean.freight_rates_query;

import java.io.Serializable;

/**
 * Created by harry on 2018/1/15 下午7:41.
 */

public class PermissionQueryCostResultBean implements Serializable{


    /**
     * status : 1
     * name : 1pm6
     * phone : 263s
     */

    private String status;
    private String name;
    private String phone;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
