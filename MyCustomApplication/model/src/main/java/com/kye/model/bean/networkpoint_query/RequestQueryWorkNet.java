package com.kye.model.bean.networkpoint_query;

/**
 * Created by harry on 2018/1/9 下午4:23.
 */

public class RequestQueryWorkNet {

    /**
     * province : 广东省
     * city : 深圳市
     * district : 宝安区
     * town : 福永街道
     */

    private String province;
    private String city;
    private String district;
    private String town;

    public RequestQueryWorkNet(String province, String city, String district, String town) {
        this.province = province;
        this.city = city;
        this.district = district;
        this.town = town;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
