package com.kye.model.bean.jd.order_details;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 02/02/2018
 * @updated : 02/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDCheckGoodsAfterSaleBean {

    /**
     * resultMessage : 3253
     * result : 1
     */

    @SerializedName("resultMessage")
    private String resultMessage;
    @SerializedName("result")
    private int result;

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
