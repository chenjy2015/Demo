package com.kye.model.bean.president_online;

/**
 * Created by harry on 2018/1/11 下午4:38.
 */

public class PresidentOnlineImagesModel {
    private String url;
    private boolean showDelete = false;

    public PresidentOnlineImagesModel(String url, boolean showDelete) {
        this.url = url;
        this.showDelete = showDelete;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isShowDelete() {
        return showDelete;
    }

    public void setShowDelete(boolean showDelete) {
        this.showDelete = showDelete;
    }
}
