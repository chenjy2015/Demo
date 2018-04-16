package com.kye.model.bean.deposit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SkyYu on 2018/1/20
 */
public class ResultWXPayOrderBean {

    /**
     * sign : 5446AAC434977C96E75A44726F972700
     * timestamp : 1514858493
     * noncestr : tyk9rx31514858493347
     * partnerid : 1384947402
     * prepayid : wx20180102100133492e62231f0809776140
     * package : Sign=WXPay
     * appid : wxb3c0dc14850a5358
     */

    private String sign;
    private String timestamp;
    private String noncestr;
    private String partnerid;
    private String prepayid;
    @SerializedName("package")
    private String packageX;
    private String appid;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNoncestr() {
        return noncestr;
    }

    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    public String getPackageX() {
        return packageX;
    }

    public void setPackageX(String packageX) {
        this.packageX = packageX;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
}
