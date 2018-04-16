package com.kye.model.bean.comment.mine;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 11/01/2018
 * @updated : 11/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestCommentMineList {


    /**
     * createuser : FlGZW9Q/uUFIcH7Tn1Kr0Q==
     * pageSize : 2
     * pageNum : 1
     */

    @SerializedName("createuser")
    private String createuser;
    @SerializedName("pageSize")
    private String pageSize;
    @SerializedName("pageNum")
    private String pageNum;

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }
}
