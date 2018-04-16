package com.kye.model.bean.online;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chen on 18/1/19.
 * 获取完整的符合支付宝参数规范的订单信息
 */

public class AliPayAccountBean implements Parcelable {


    /**
     * url : partner="2088911663555061"&seller_id="2088911663555061"&out_trade_no="75dv5n11514862958019"&subject="yyyyy"&body="xxxxx"&total_fee="74.90"&notify_url="http://testapi.ky-express.com/kuayueapi/OpenTradeNotify"&service="mobile.securitypay.pay"&payment_type="1"&_input_charset="utf-8"&it_b_pay="30m"&return_url="m.alipay.com"&sign="pY5EtMCh80w3ifgyY1oCd3w0mXs69TyjR4bT%2FP9IMJxauii3qbF3AmSIoi9TLYCb4P%2FdkuPfCJUpQPGDLFO3YEtISMyHGkXzsClGOyRURZJiUF7Grcll3pl392aeJOm9XtwF568ZOjrDI52pW%2BsWMS6OBBtVnLxa%2FBmJQ%2F7boYU%3D"&sign_type="RSA"
     * errormsg : 34ch
     * out_trade_no : 75dv5n11514862958019
     */

    private String url;
    private String errormsg;
    private String out_trade_no;

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

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    protected AliPayAccountBean(Parcel in) {
        url = in.readString();
        errormsg = in.readString();
        out_trade_no = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(url);
        dest.writeString(errormsg);
        dest.writeString(out_trade_no);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AliPayAccountBean> CREATOR = new Creator<AliPayAccountBean>() {
        @Override
        public AliPayAccountBean createFromParcel(Parcel in) {
            return new AliPayAccountBean(in);
        }

        @Override
        public AliPayAccountBean[
                ] newArray(int size) {
            return new AliPayAccountBean[size];
        }
    };

}
