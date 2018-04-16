package com.kye.model.bean.jd.shop.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/01/2018
 * @updated : 27/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestJDGoodsCategories {

    /**

     kySign	string	是	123456	APP签名
     iD	string	否	432	分类ID (空则不判断)
     parentID	string	否	428	父类ID (空则不判断)
     recommendType	string	否		是否推荐,0否，1是，空则不判断

     * kySign : 123456
     * iD : 432
     * parentID : 428
     * recommendType : q00v
     */

    @SerializedName("kySign")
    private String kySign;
    @SerializedName("iD")
    private String iD;
    @SerializedName("parentID")
    private String parentID;
    @SerializedName("recommendType")
    private String recommendType;

    public String getKySign() {
        return kySign;
    }

    public void setKySign(String kySign) {
        this.kySign = kySign;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(String recommendType) {
        this.recommendType = recommendType;
    }
}
