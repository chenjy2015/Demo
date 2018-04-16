package com.kye.model.bean.deposit;

/**
 * Created by SkyYu on 2018/1/20
 */
public class ResultTradeURLBean {

    private String url;           // 支付url
    private String out_trade_no;  // 商户订单号
    private String errormsg;      // 错误信息

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
}
