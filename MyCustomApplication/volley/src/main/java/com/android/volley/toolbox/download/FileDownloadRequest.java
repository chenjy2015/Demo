/*
 * Copyright (C) 2015 Vince Styling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.volley.toolbox.download;

import android.os.SystemClock;
import android.text.TextUtils;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.HttpUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.*;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

/**
 * @version V1.0
 * @createAuthor yzw
 * @createDate 2016/5/18 20:36
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description 文件下载Request
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public class FileDownloadRequest extends Request<Void> {


    private File mStoreFile;
    private File mTemporaryFile;

    public FileDownLoadListener mIFileDownLoadListener;

    public FileDownloadRequest(String storeFilePath, String url) {
        this(new File(storeFilePath), url);
    }

    public FileDownloadRequest(File storeFile, String url) {
        super(Method.GET, url, null);
        mStoreFile = storeFile;
        mTemporaryFile = new File(storeFile + ".tmp");
        setShouldCache(false); // 不缓存
        // Turn the retries frequency greater.
        setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 200, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
    }

    /**
     * 设置文件下载监听器
     *
     * @param l 监听器
     */
    public void setFileDownLoadListener(FileDownLoadListener l) {
        mIFileDownLoadListener = l;
    }

    /**
     * Init or reset the Range header, ensure the begin position always be the temporary file size.
     */
    @Override
    public void prepare() {
        // Note: if the request header "Range" greater than the actual length that server-size have,
        // the response header "Content-Range" will return "bytes */[actual length]", that's wrong.
        addHeader("Range", "bytes=" + mTemporaryFile.length() + "-");
        addHeader("Accept-Encoding", "identity");

//		Suppress the HttpStack accept gzip encoding, avoid the progress calculate wrong problem.
//		addHeader("Accept-Encoding", "identity");
    }

    /**
     * Ignore the response content, just rename the TemporaryFile to StoreFile.
     */
    @Override
    protected Response<Void> parseNetworkResponse(NetworkResponse response) {
        if (!isCanceled()) {
            if (mTemporaryFile.canRead() && mTemporaryFile.length() > 0) {
                if (mTemporaryFile.renameTo(mStoreFile)) {
                    return Response.success(null, HttpHeaderParser.parseCacheHeaders(response));
                } else {
                    return Response.error(new VolleyError("Can't rename the download temporary file!"));
                }
            } else {
                return Response.error(new VolleyError("Download temporary file was invalid!"));
            }
        }
        return Response.error(new VolleyError("Request was Canceled!"));
    }

    @Override
    protected void deliverResponse(Void response) {
        if (mIFileDownLoadListener != null) {
            mIFileDownLoadListener.onSuccess(response);
        }
    }

    @Override
    public void deliverError(VolleyError error) {
        if (mIFileDownLoadListener != null) {
            mIFileDownLoadListener.onError(error);
        }
    }

    /**
     * In this method, we got the Content-Length, with the TemporaryFile length,
     * we can calculate the actually size of the whole file, if TemporaryFile not exists,
     * we'll take the store file length then compare to actually size, and if equals,
     * we consider this download was already done.
     * We used {@link RandomAccessFile} to continue download, when download success,
     * the TemporaryFile will be rename to StoreFile.
     */
    @Override
    public byte[] handleResponse(com.android.volley.toolbox.ByteArrayPool mPool, HttpResponse response, ResponseDelivery delivery) throws IOException {
        // Content-Length might be negative when use HttpURLConnection because it default header Accept-Encoding is gzip,
        // we can force set the Accept-Encoding as identity in prepare() method to slove this problem but also disable gzip response.
        HttpEntity entity = response.getEntity();
        long fileSize = entity.getContentLength();
        if (fileSize <= 0) {
            VolleyLog.d("Response doesn't present Content-Length!");
        }

        long downloadedSize = mTemporaryFile.length();
        boolean isSupportRange = HttpUtils.isSupportRange(response);
        if (isSupportRange) {
            fileSize += downloadedSize;

            // Verify the Content-Range Header, to ensure temporary file is part of the whole file.
            // Sometime, temporary file length add response content-length might greater than actual file length,
            // in this situation, we consider the temporary file is invalid, then throw an exception.
            String realRangeValue = HttpUtils.getHeader(response, "Content-Range");
            // response Content-Range may be null when "Range=bytes=0-"
            if (!TextUtils.isEmpty(realRangeValue)) {
                String assumeRangeValue = "bytes " + downloadedSize + "-" + (fileSize - 1);
                if (TextUtils.indexOf(realRangeValue, assumeRangeValue) == -1) {
                    throw new IllegalStateException(
                            "The Content-Range Header is invalid Assume[" + assumeRangeValue + "] vs Real[" + realRangeValue + "], " +
                                    "please remove the temporary file [" + mTemporaryFile + "].");
                }
            }
        }

        // Compare the store file size(after download successes have) to server-side Content-Length.
        // temporary file will rename to store file after download success, so we compare the
        // Content-Length to ensure this request already download or not.
        if (fileSize > 0 && mStoreFile.length() == fileSize) {
            // Rename the store file to temporary file, mock the download success. ^_^
            mStoreFile.renameTo(mTemporaryFile);

            // Deliver download progress.
            delivery.postDownloadProgress(this, fileSize, fileSize);

            return new byte[0];
        }

        RandomAccessFile tmpFileRaf = new RandomAccessFile(mTemporaryFile, "rw");

        // If server-side support range download, we seek to last point of the temporary file.
        if (isSupportRange) {
            tmpFileRaf.seek(downloadedSize);
        } else {
            // If not, truncate the temporary file then start download from beginning.
            tmpFileRaf.setLength(0);
            downloadedSize = 0;
        }

        InputStream in = null;
        try {
            in = entity.getContent();
            // Determine the response gzip encoding, support for HttpClientStack download.
            if (HttpUtils.isGzipContent(response) && !(in instanceof GZIPInputStream)) {
                in = new GZIPInputStream(in);
            }
            byte[] buffer = new byte[6 * 1024]; // 6K buffer
            int offset;

            while ((offset = in.read(buffer)) != -1) {
                tmpFileRaf.write(buffer, 0, offset);

                downloadedSize += offset;
                delivery.postDownloadProgress(this, fileSize, downloadedSize);

                if (isCanceled()) {
                    delivery.postCancel(this);
                    break;
                }
            }
        } finally {
            try {
                // Close the InputStream
                if (in != null) in.close();
            } catch (Exception e) {
                VolleyLog.v("Error occured when calling InputStream.close");
            }

            try {
                // release the resources by "consuming the content".
                entity.consumeContent();
            } catch (Exception e) {
                // This can happen if there was an exception above that left the entity in
                // an invalid state.
                VolleyLog.v("Error occured when calling consumingContent");
            }
            tmpFileRaf.close();
        }

        return new byte[0];
    }

    @Override
    public Priority getPriority() {
        return Priority.LOW;
    }

}
