package com.android.volley.toolbox.download;

import com.android.volley.VolleyError;

/**
 * @version V1.0
 * @createAuthor yzw
 * @createDate 2016/5/18 20:36
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description 文件下载回调
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public interface IDownLoadListener<T> {
    /**
     * Inform when start to handle this Request.
     */
    void onPreExecute();

    /**
     * Inform when {@link com.android.volley.Request} execute is finish,
     * whatever success or error or cancel, this callback
     * method always invoke if request is done.
     */
    void onFinish();

    /**
     * Called when response success.
     */
    void onSuccess(T response);

    /**
     * Callback method that an error has been occurred with the
     * provided error code and optional user-readable message.
     */
    void onError(VolleyError error);

    /**
     * Inform when the {@link com.android.volley.Request} is truly cancelled.
     */
    void onCancel();

    /**
     * Inform when download progress change, this callback method only available
     * when request was {@link FileDownloadRequest}.
     */
    void onProgressChange(long fileSize, long downloadedSize);

    /**
     * Inform when {@link com.android.volley.Request} execute is going to retry.
     */
    void onRetry();
}
