package com.kye.model.bean.jd.address.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 01/02/2018
 * @updated : 01/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestAddModifyAddress {

    /**

     phone	string	是	134285500855	手机号
     id	string	否	0	新增或者更新(Id为0或不填为新增，编辑时传查询接口查询出来的id)
     reviceName	string	是	收件人姓名	收件人姓名
     revicePhone	string	是	185755952237	收件人手机
     reviceTel	string	否		收件人电话
     email	string	否	18898355737@qq.com	邮箱
     province	string	是	19	省 (如：19)
     city	string	是	1607	市 (如：1607)
     country	string	是	4773	区 ( 如：4773)
     town	string	否	0	县 (如：0)
     provinceStr	string	是	省	省 (如：广东省)
     cityStr	string	是	市	市 (如：深圳市)
     countryStr	string	是	县	区 (如：宝安区)
     townStr	string	是	区	县 (如:县)
     address	string	是	广东省###深圳市宝安区S3(广深沿江高速)	详址
     zip	string	否	518000	邮编
     remark	string	否	公司地址	备注
     source	string	否		验证来源	(0：微信端认证
     type	string	否		类型	(0 京东,1 跨越)


     * phone : 134285500855
     * id : 0
     * reviceName : 收件人姓名
     * revicePhone : 185755952237
     * reviceTel : 861h
     * email : 18898355737@qq.com
     * province : 19
     * city : 1607
     * country : 4773
     * town : 0
     * provinceStr : 省
     * cityStr : 市
     * countryStr : 县
     * townStr : 区
     * address : 广东省###深圳市宝安区S3(广深沿江高速)
     * zip : 518000
     * remark : 公司地址
     * source : 7qua
     * type : i5g3
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("id")
    private String id = "0";
    @SerializedName("reviceName")
    private String reviceName;
    @SerializedName("revicePhone")
    private String revicePhone;
    @SerializedName("reviceTel")
    private String reviceTel;
    @SerializedName("email")
    private String email;
    @SerializedName("province")
    private String province;
    @SerializedName("city")
    private String city;
    @SerializedName("country")
    private String country;
    @SerializedName("town")
    private String town;
    @SerializedName("provinceStr")
    private String provinceStr;
    @SerializedName("cityStr")
    private String cityStr;
    @SerializedName("countryStr")
    private String countryStr;
    @SerializedName("townStr")
    private String townStr;
    @SerializedName("address")
    private String address;
    @SerializedName("zip")
    private String zip;
    @SerializedName("remark")
    private String remark;
    @SerializedName("source")
    private String source;
    @SerializedName("type")
    private String type;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReviceName() {
        return reviceName;
    }

    public void setReviceName(String reviceName) {
        this.reviceName = reviceName;
    }

    public String getRevicePhone() {
        return revicePhone;
    }

    public void setRevicePhone(String revicePhone) {
        this.revicePhone = revicePhone;
    }

    public String getReviceTel() {
        return reviceTel;
    }

    public void setReviceTel(String reviceTel) {
        this.reviceTel = reviceTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getProvinceStr() {
        return provinceStr;
    }

    public void setProvinceStr(String provinceStr) {
        this.provinceStr = provinceStr;
    }

    public String getCityStr() {
        return cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
    }

    public String getCountryStr() {
        return countryStr;
    }

    public void setCountryStr(String countryStr) {
        this.countryStr = countryStr;
    }

    public String getTownStr() {
        return townStr;
    }

    public void setTownStr(String townStr) {
        this.townStr = townStr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
