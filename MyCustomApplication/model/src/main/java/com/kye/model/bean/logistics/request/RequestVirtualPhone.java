package com.kye.model.bean.logistics.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/03/2018
 * @updated : 19/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestVirtualPhone {

    /**
     * userPhone : 13410351393
     * merchantsPhone : 13691695269
     * dataSource : 1
     */

    @SerializedName("userPhone")
    private String userPhone;
    @SerializedName("merchantsPhone")
    private String merchantsPhone;
    @SerializedName("dataSource")
    private Integer    dataSource;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getMerchantsPhone() {
        return merchantsPhone;
    }

    public void setMerchantsPhone(String merchantsPhone) {
        this.merchantsPhone = merchantsPhone;
    }

    public int getDataSource() {
        return dataSource;
    }

    public void setDataSource(int dataSource) {
        this.dataSource = dataSource;
    }
}
