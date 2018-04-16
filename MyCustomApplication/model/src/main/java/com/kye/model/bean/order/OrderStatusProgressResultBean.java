package com.kye.model.bean.order;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 18/01/2018
 * @updated : 18/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class OrderStatusProgressResultBean implements Serializable {

    private List<OrderStatusBean> data;

    public List<OrderStatusBean> getData() {
        return data;
    }

    public void setData(List<OrderStatusBean> data) {
        this.data = data;
    }

}
