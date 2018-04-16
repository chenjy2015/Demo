package com.kye.model.bean.jd_reservation.request;

import com.google.gson.annotations.SerializedName;
import com.kye.model.bean.RequestUser;

import java.util.Date;

public class RequestAddUpdateJD extends RequestUser{
    @SerializedName("operationType")
    private String operationType;

    @SerializedName("billId")
    private String billId;

    @SerializedName("orderno")
    private String orderno;

    @SerializedName("totalCount")
    private String totalCount;

    @SerializedName("appointCount")
    private String appointCount;

    @SerializedName("appointCode")
    private String appointCode;

    @SerializedName("apppointSTime")
    private Date apppointSTime;

    @SerializedName("goodsCode")
    private String goodsCode;

    @SerializedName("purchaseCode")
    private String purchaseCode;

    @SerializedName("apppointETime")
    private Date apppointETime;

    @SerializedName("reservationWarehouse")
    private String reservationWarehouse;

    public RequestAddUpdateJD(String phone, int operationType, String billId, String orderno, int totalCount, String appointCount, String appointCode, Date apppointSTime, String goodsCode, String purchaseCode, Date apppointETime, String reservationWarehouse) {
        super(phone);
        this.operationType = operationType + "";
        this.billId = billId;
        this.orderno = orderno;
        this.totalCount = totalCount + "";
        this.appointCount = appointCount;
        this.appointCode = appointCode;
        this.apppointSTime = apppointSTime;
        this.goodsCode = goodsCode;
        this.purchaseCode = purchaseCode;
        this.apppointETime = apppointETime;
        this.reservationWarehouse = reservationWarehouse;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getAppointCount() {
        return appointCount;
    }

    public void setAppointCount(String appointCount) {
        this.appointCount = appointCount;
    }

    public String getAppointCode() {
        return appointCode;
    }

    public void setAppointCode(String appointCode) {
        this.appointCode = appointCode;
    }

    public Date getApppointSTime() {
        return apppointSTime;
    }

    public void setApppointSTime(Date apppointSTime) {
        this.apppointSTime = apppointSTime;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public Date getApppointETime() {
        return apppointETime;
    }

    public void setApppointETime(Date apppointETime) {
        this.apppointETime = apppointETime;
    }

    public String getReservationWarehouse() {
        return reservationWarehouse;
    }

    public void setReservationWarehouse(String reservationWarehouse) {
        this.reservationWarehouse = reservationWarehouse;
    }
}
