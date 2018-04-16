package com.kye.model.bean.networkpoint_query;

import java.io.Serializable;

/**
 * Created by harry on 2018/1/9 下午4:23.
 */

public class ResultQueryWorkNet implements Serializable{
    /**
     * cityIsHot : false
     * pointContactmen : 跨越速运
     * town : 黄石街道
     * city : 广州市
     * pointAddress : 广东省广州市白云区黄石西路
     * pointArea :
     * cityHotOrder : 4
     * pointName : 小坪点部
     * lnglatx : 113.259
     * lnglaty : 23.2121
     * provinceOrder : 5
     * cityOrder : 1
     * districtOrder : null
     * townOrder : null
     * province : 广东省
     * district : 白云区
     * pointServiceContent : 航空快递
     * id : 2829
     * pointLxdh : 4008-098-098
     * pointTime : 7*24小时
     */

    private boolean cityIsHot;
    private String pointContactmen;
    private String town;
    private String city;
    private String pointAddress;
    private String pointArea;
    private int cityHotOrder;
    private String pointName;
    private double lnglatx;
    private double lnglaty;
    private int provinceOrder;
    private int cityOrder;
    private Object districtOrder;
    private Object townOrder;
    private String province;
    private String district;
    private String pointServiceContent;
    private int id;
    private String pointLxdh;
    private String pointTime;

    public boolean isCityIsHot() {
        return cityIsHot;
    }

    public void setCityIsHot(boolean cityIsHot) {
        this.cityIsHot = cityIsHot;
    }

    public String getPointContactmen() {
        return pointContactmen;
    }

    public void setPointContactmen(String pointContactmen) {
        this.pointContactmen = pointContactmen;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPointAddress() {
        return pointAddress;
    }

    public void setPointAddress(String pointAddress) {
        this.pointAddress = pointAddress;
    }

    public String getPointArea() {
        return pointArea;
    }

    public void setPointArea(String pointArea) {
        this.pointArea = pointArea;
    }

    public int getCityHotOrder() {
        return cityHotOrder;
    }

    public void setCityHotOrder(int cityHotOrder) {
        this.cityHotOrder = cityHotOrder;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public double getLnglatx() {
        return lnglatx;
    }

    public void setLnglatx(double lnglatx) {
        this.lnglatx = lnglatx;
    }

    public double getLnglaty() {
        return lnglaty;
    }

    public void setLnglaty(double lnglaty) {
        this.lnglaty = lnglaty;
    }

    public int getProvinceOrder() {
        return provinceOrder;
    }

    public void setProvinceOrder(int provinceOrder) {
        this.provinceOrder = provinceOrder;
    }

    public int getCityOrder() {
        return cityOrder;
    }

    public void setCityOrder(int cityOrder) {
        this.cityOrder = cityOrder;
    }

    public Object getDistrictOrder() {
        return districtOrder;
    }

    public void setDistrictOrder(Object districtOrder) {
        this.districtOrder = districtOrder;
    }

    public Object getTownOrder() {
        return townOrder;
    }

    public void setTownOrder(Object townOrder) {
        this.townOrder = townOrder;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPointServiceContent() {
        return pointServiceContent;
    }

    public void setPointServiceContent(String pointServiceContent) {
        this.pointServiceContent = pointServiceContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPointLxdh() {
        return pointLxdh;
    }

    public void setPointLxdh(String pointLxdh) {
        this.pointLxdh = pointLxdh;
    }

    public String getPointTime() {
        return pointTime;
    }

    public void setPointTime(String pointTime) {
        this.pointTime = pointTime;
    }
}
