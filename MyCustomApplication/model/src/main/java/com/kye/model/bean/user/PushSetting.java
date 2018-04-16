package com.kye.model.bean.user;

import com.google.gson.annotations.SerializedName;

public class PushSetting {

    @SerializedName("isPushAPP")
    private boolean isPushAPP;

    public boolean isIsPushAPP() {
        return isPushAPP;
    }

    public void setIsPushAPP(boolean isPushAPP) {
        this.isPushAPP = isPushAPP;
    }
}
