package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class RequestCustomerAppealBean {


    /**
     * orderNO : JS1604-00088
     * phone : 18923876620
     * appeal : 测试申诉哈哈哈222
     */

    private String orderNO;
    private String phone;
    private String appeal;

    public RequestCustomerAppealBean(String orderNO, String phone, String appeal) {
        this.orderNO = orderNO;
        this.phone = phone;
        this.appeal = appeal;
    }

    public String getOrderNO() {
        return orderNO;
    }

    public void setOrderNO(String orderNO) {
        this.orderNO = orderNO;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAppeal() {
        return appeal;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal;
    }
}
