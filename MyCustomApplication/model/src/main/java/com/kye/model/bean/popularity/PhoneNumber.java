package com.kye.model.bean.popularity;

import com.google.gson.annotations.SerializedName;

public class PhoneNumber {
    @SerializedName("mobileNo")
    private String mobileNo;
    @SerializedName("mobileNa")
    private String mobileNa;

    public PhoneNumber() {}

    public PhoneNumber(String mobileNo, String mobileNa) {
        this.mobileNo = mobileNo;
        this.mobileNa = mobileNa;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMobileNa() {
        return mobileNa;
    }

    public void setMobileNa(String mobileNa) {
        this.mobileNa = mobileNa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber that = (PhoneNumber) o;

        return mobileNo != null ? mobileNo.equals(that.mobileNo) : that.mobileNo == null;
    }

    @Override
    public int hashCode() {
        return mobileNo != null ? mobileNo.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "mobileNo='" + mobileNo + '\'' +
                ", mobileNa='" + mobileNa + '\'' +
                '}';
    }
}
