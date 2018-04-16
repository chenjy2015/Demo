package com.kye.model.bean.score;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 13/03/2018
 * @updated : 13/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class ScoreCheckResultBean {

    /**
     * code : 0
     */

    @SerializedName("code")
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
