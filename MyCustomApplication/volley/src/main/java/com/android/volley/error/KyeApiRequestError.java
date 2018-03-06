package com.android.volley.error;

import com.android.volley.VolleyError;

/**
 * Created by Administrator on 2017/5/10.
 */

public class KyeApiRequestError extends VolleyError {
    private static final String errorMsg = "retStatus 等于 0 或者json字符串中result字段数据为空字符串";

    public KyeApiRequestError() {
        super("retStatus 等于 0 或者json字符串中result字段数据为空字符串");
    }

    public KyeApiRequestError(Throwable reason) {
        super(reason);
    }
}