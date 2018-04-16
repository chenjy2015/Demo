package com.kye.model.bean.networkpoint_query;

/**
 * Created by harry on 2018/1/9 下午4:23.
 */

public class RequestQueryLatelyPointByUserCoordinate {


    public RequestQueryLatelyPointByUserCoordinate(String lnglatx, String lnglaty) {
        this.lnglatx = lnglatx;
        this.lnglaty = lnglaty;
    }

    /**
     * lnglatx : 113.74317169
     * lnglaty : 22.83694592
     */



    private String lnglatx;
    private String lnglaty;

    public String getLnglatx() {
        return lnglatx;
    }

    public void setLnglatx(String lnglatx) {
        this.lnglatx = lnglatx;
    }

    public String getLnglaty() {
        return lnglaty;
    }

    public void setLnglaty(String lnglaty) {
        this.lnglaty = lnglaty;
    }
}
