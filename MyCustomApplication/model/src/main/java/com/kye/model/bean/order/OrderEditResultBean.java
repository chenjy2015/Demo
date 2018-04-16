package com.kye.model.bean.order;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 03/03/2018
 * @updated : 03/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class OrderEditResultBean implements Serializable {

    /**
     * isCanUp : 0
     */

    @SerializedName("isCanUp")
    private String isCanUp;

    public String getIsCanUp() {
        return isCanUp;
    }

    public void setIsCanUp(String isCanUp) {
        this.isCanUp = isCanUp;
    }
}
