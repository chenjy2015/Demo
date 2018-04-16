package com.kye.model.bean.score;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/01/2018
 * @updated : 19/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestPostScore {

    /**

     phone	string	是	17629013892	登录账号
     code	string	是	99999999991	单号(type=0时为下单编码，)
     type	string	是	1	类型(0取货评价1派货评价)
     score	string	是	2	评分(1-满意，2-一般，3-不满意，4-很不满意)
     remark	string	否	dsda	备注(不满意、很不满意需填写备注)
     flag	string	否		预置文本

     * phone : 17629013892
     * code : 99999999991
     * type : 1
     * score : 2
     * remark : dsda
     * flag : f38p
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("code")
    private String code;
    @SerializedName("type")
    private String type;
    @SerializedName("score")
    private String score;
    @SerializedName("remark")
    private String remark;
    @SerializedName("flag")
    private String flag;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
