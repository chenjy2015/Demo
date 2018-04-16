package com.kye.model.bean.dstance;

import com.google.gson.annotations.SerializedName;

public class DstanceBean {

    /**
     * carX : 14rn
     * carY : ycbt
     * custX : 9525
     * custY : 8ub8
     * speed : 289u
     * retMsg : 查无此信息，请拔打：4008-098-098
     * isShows : false
     * distance : e9y3
     * direction : 0
     * terminalID : epe9
     */

    @SerializedName("carX")
    private double carX;
    @SerializedName("carY")
    private double carY;
    @SerializedName("custX")
    private double custX;
    @SerializedName("custY")
    private double custY;
    @SerializedName("speed")
    private String speed;
    @SerializedName("retMsg")
    private String retMsg;
    @SerializedName("isShows")
    private boolean isShows;
    @SerializedName("distance")
    private float distance;
    @SerializedName("direction")
    private int direction;
    @SerializedName("terminalID")
    private String terminalID;

    public double getCarX() {
        return carX;
    }

    public void setCarX(double carX) {
        this.carX = carX;
    }

    public double getCarY() {
        return carY;
    }

    public void setCarY(double carY) {
        this.carY = carY;
    }

    public double getCustX() {
        return custX;
    }

    public void setCustX(double custX) {
        this.custX = custX;
    }

    public double getCustY() {
        return custY;
    }

    public void setCustY(double custY) {
        this.custY = custY;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public boolean isIsShows() {
        return isShows;
    }

    public void setIsShows(boolean isShows) {
        this.isShows = isShows;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }
}
