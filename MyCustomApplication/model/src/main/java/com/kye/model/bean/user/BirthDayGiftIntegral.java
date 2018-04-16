package com.kye.model.bean.user;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by harry on 2018/3/27 18:39.
 */

public class BirthDayGiftIntegral implements Serializable {
    /**
     * birthday : 0
     * retMsg : 亲,您的生日不是今天哟。
     */

    @SerializedName("birthday")
    private String birthday;
    @SerializedName("retMsg")
    private String retMsg;

    public String getBirthday()              { return birthday;}

    public void setBirthday(String birthday) { this.birthday = birthday;}

    public String getRetMsg()                { return retMsg;}

    public void setRetMsg(String retMsg)     { this.retMsg = retMsg;}
}
