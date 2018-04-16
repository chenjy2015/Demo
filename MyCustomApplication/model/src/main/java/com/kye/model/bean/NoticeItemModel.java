package com.kye.model.bean;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 26/12/2017
 * @updated : 26/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *     通知中心数据
 */

public class NoticeItemModel {

    public NoticeItemModel() {
    }

    public NoticeItemModel(boolean isRead, String title, String date) {
        this.isRead = isRead;
        this.title = title;
        this.date = date;
    }

    private boolean isRead;
    private String title;
    private String date;

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "NoticeItemModel{" +
                "isRead=" + isRead +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
