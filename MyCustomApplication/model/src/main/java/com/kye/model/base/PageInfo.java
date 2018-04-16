package com.kye.model.base;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 08/01/2018
 * @updated : 08/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class PageInfo implements Parcelable {

    public final static String TAG_PAGE_INFO = "TAG_PAGE_INFO";
    public final static int INDEX_DEFAULT = 1;
    public final static int SIZE_DEFAULT = 50;

    private int pageIndex = INDEX_DEFAULT;
    private int pageSize = SIZE_DEFAULT;

    public static PageInfo newInstance() {
        return new PageInfo();
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int resetPage() {
        pageIndex = INDEX_DEFAULT;
        return pageIndex;
    }

    public int increasePage() {
        pageIndex++;
        return pageIndex;
    }

    public int decreasePage() {
        if (pageIndex > 1) {
            pageIndex--;
        }
        return pageIndex;
    }

    public int getNextPage() {
        return pageIndex + 1;
    }

    public int getPrePage() {
        return pageIndex - 1 < 0 ? 0 : pageIndex - 1;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.pageIndex);
        dest.writeInt(this.pageSize);
    }

    public PageInfo() {
    }

    protected PageInfo(Parcel in) {
        this.pageIndex = in.readInt();
        this.pageSize = in.readInt();
    }

    public static final Parcelable.Creator<PageInfo> CREATOR = new Parcelable.Creator<PageInfo>() {
        @Override
        public PageInfo createFromParcel(Parcel source) {
            return new PageInfo(source);
        }

        @Override
        public PageInfo[] newArray(int size) {
            return new PageInfo[size];
        }
    };
}
