package com.kye.model.bean.jd.address;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 30/01/2018
 * @updated : 30/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDAddressBean implements Parcelable {

    /**
     * id : 2093
     * phone : 18924656687
     * reviceName : 测试数据
     * revicePhone : 18924656687
     * reviceTel :
     * reviceEmail :
     * province : 31
     * city : 2699
     * country : 2703
     * town : 15450
     * address : 233号
     * zip :4
     * remark : 收货人
     * type : 0
     * isDefault : true
     * provinceStr : 新疆
     * cityStr : 克孜勒苏州
     * countryStr : 阿克陶县
     * townStr : 恰尔隆乡
     */

    @SerializedName("id")
    private String id;
    @SerializedName("phone")
    private String phone;
    @SerializedName("reviceName")
    private String reviceName;
    @SerializedName("revicePhone")
    private String revicePhone;
    @SerializedName("reviceTel")
    private String reviceTel;
    @SerializedName("reviceEmail")
    private String reviceEmail;
    @SerializedName("province")
    private String province;
    @SerializedName("city")
    private String city;
    @SerializedName("country")
    private String country;
    @SerializedName("town")
    private String town;
    @SerializedName("address")
    private String address;
    @SerializedName("zip")
    private String zip;
    @SerializedName("remark")
    private String remark;
    @SerializedName("type")
    private String type;
    @SerializedName("isDefault")
    private boolean isDefault;
    @SerializedName("provinceStr")
    private String provinceStr;
    @SerializedName("cityStr")
    private String cityStr;
    @SerializedName("countryStr")
    private String countryStr;
    @SerializedName("townStr")
    private String townStr;

    /**
     *
     */
    private boolean isSelected;

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getReviceEmail() {
        return reviceEmail;
    }

    public void setReviceEmail(String reviceEmail) {
        this.reviceEmail = reviceEmail;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
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

    public JDAddressBean() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JDAddressBean)) return false;

        JDAddressBean that = (JDAddressBean) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.phone);
        dest.writeString(this.reviceName);
        dest.writeString(this.revicePhone);
        dest.writeString(this.reviceTel);
        dest.writeString(this.reviceEmail);
        dest.writeString(this.province);
        dest.writeString(this.city);
        dest.writeString(this.country);
        dest.writeString(this.town);
        dest.writeString(this.address);
        dest.writeString(this.zip);
        dest.writeString(this.remark);
        dest.writeString(this.type);
        dest.writeByte(this.isDefault ? (byte) 1 : (byte) 0);
        dest.writeString(this.provinceStr);
        dest.writeString(this.cityStr);
        dest.writeString(this.countryStr);
        dest.writeString(this.townStr);
        dest.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
    }

    protected JDAddressBean(Parcel in) {
        this.id = in.readString();
        this.phone = in.readString();
        this.reviceName = in.readString();
        this.revicePhone = in.readString();
        this.reviceTel = in.readString();
        this.reviceEmail = in.readString();
        this.province = in.readString();
        this.city = in.readString();
        this.country = in.readString();
        this.town = in.readString();
        this.address = in.readString();
        this.zip = in.readString();
        this.remark = in.readString();
        this.type = in.readString();
        this.isDefault = in.readByte() != 0;
        this.provinceStr = in.readString();
        this.cityStr = in.readString();
        this.countryStr = in.readString();
        this.townStr = in.readString();
        this.isSelected = in.readByte() != 0;
    }

    public static final Creator<JDAddressBean> CREATOR = new Creator<JDAddressBean>() {
        @Override
        public JDAddressBean createFromParcel(Parcel source) {
            return new JDAddressBean(source);
        }

        @Override
        public JDAddressBean[] newArray(int size) {
            return new JDAddressBean[size];
        }
    };
}
