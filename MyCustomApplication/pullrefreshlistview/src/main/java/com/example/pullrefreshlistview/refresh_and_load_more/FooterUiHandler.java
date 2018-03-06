package com.example.pullrefreshlistview.refresh_and_load_more;

/**
 * @version V1.0
 * @Author ly
 * @company 跨越速运
 * @Description
 * @Date 2017/3/27
 */
public interface FooterUiHandler {
    /**
     * 没有更多数据
     */
    public void onUINoDataToLoad();

    /**
     * prepare for loading
     *
     */
    public void onUILoadMorePrepare();

    /**
     *
     */
    public void onUILoadMoreBegin();

    /**
     *
     */
    public void onUILoadMoreComplete(boolean isSuccess, String hint);

    /**
     *
     */
    public void onUIPrepareStateChange();
}
