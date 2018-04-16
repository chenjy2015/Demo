package com.kye.model.bean.update;

import com.google.gson.annotations.SerializedName;

public class AppInfoBean {

    public static final String INNER = "inner";

    /**
     * versioncode : 90
     * version : v6.06
     * uptype : inner //版本更新状态：inner 内部升级
     * msg : 优化改进下单功能、支持扫码查询、支付运费和开票
     * forceup : 0 //是否强制升级 0不 1强制
     * kye : d747e0e25868c1f2cf0bafbe32719aad // 安装包 md5
     * isCanInterShop : 1 //1 能进TCL商场 0不能进 显示升级中
     * download : https://res.ky-express.com/android/kyeexpress-release-v6.06_signed.apk
     */

    @SerializedName("versioncode")
    private int versioncode;
    @SerializedName("version")
    private String version;
    @SerializedName("uptype")
    private String uptype;
    @SerializedName("msg")
    private String msg;
    @SerializedName("forceup")
    private boolean forceup;
    @SerializedName("kye")
    private String kye;
    @SerializedName("isCanInterShop")
    private boolean isCanInterShop;
    @SerializedName("download")
    private String download;

    public int getVersioncode() {
        return versioncode;
    }

    public void setVersioncode(int versioncode) {
        this.versioncode = versioncode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUptype() {
        return uptype;
    }

    public void setUptype(String uptype) {
        this.uptype = uptype;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isForceup() {
        return forceup;
    }

    public void setForceup(boolean forceup) {
        this.forceup = forceup;
    }

    public String getKye() {
        return kye;
    }

    public void setKye(String kye) {
        this.kye = kye;
    }

    public boolean isCanInterShop() {
        return isCanInterShop;
    }

    public void setIsCanInterShop(boolean isCanInterShop) {
        this.isCanInterShop = isCanInterShop;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }
}
