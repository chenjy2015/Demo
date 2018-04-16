package com.kye.model.gson_adapter;

import com.kye.model.bean.OpenApiResult;

public class ApiException extends RuntimeException {

    private final OpenApiResult mOpenApiResult;

    public ApiException(OpenApiResult openApiResult) {
        mOpenApiResult = openApiResult;
    }

    public OpenApiResult getOpenApiResult() {
        return mOpenApiResult;
    }

}
