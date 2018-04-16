package com.kye.model.bean;

public class IncrementServiceModel {
    private int iconResId;
    private String title;
    private String url;

    public IncrementServiceModel(int iconResId, String title, String url) {
        this.iconResId = iconResId;
        this.title = title;
        this.url = url;
    }

    public int getIconResId() {
        return iconResId;
    }

    public void setIconResId(int iconResId) {
        this.iconResId = iconResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
