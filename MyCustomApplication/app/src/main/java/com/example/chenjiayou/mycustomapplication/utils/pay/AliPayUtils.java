package com.example.chenjiayou.mycustomapplication.utils.pay;


import android.app.Activity;
import android.text.TextUtils;

import com.alipay.sdk.app.PayTask;
import com.kye.express.utils.StringUtils;

import java.util.Map;

/**
 * @Author chen
 * @Date 18/1/22 下午3:29
 * @descript 支付宝支付工具类
 */

public class AliPayUtils {


    private static AliPayUtils mInstance;

    private AliPayUtils() {

    }

    public static AliPayUtils getInstance() {
        if (mInstance == null) {
            mInstance = new AliPayUtils();
        }
        return mInstance;
    }

    public Map<String, String> pay(Activity mContext, String url, boolean isNeedParse) {
        PayTask alipay = new PayTask(mContext);
        Map<String, String> result = alipay.payV2(url, true);
        if (isNeedParse) {
            return parseResponse(result, isNeedParse);
        }
        return result;
    }

    public Map<String, String> parseResponse(Map<String, String> responseMap, boolean isNeedReturn) {
        PayResult payResult = new PayResult(responseMap);
        /**
         对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
         */
        String msgResult = "";
        int resultCode = -1;
        String resultInfo = payResult.getResult();// 同步返回需要验证的信息
        String resultStatus = payResult.getResultStatus();
        // 判断resultStatus 为9000则代表支付成功
        if (TextUtils.equals(resultStatus, "9000")) {
            // 该笔订单是否真实支付成功，需要依赖服务端的异步通知。
            resultCode = 1;
            msgResult = "支付成功";
        } else {
            if (TextUtils.equals(resultStatus, "8000")) {
                msgResult = "支付结果确认中";
            } else if (TextUtils.equals(resultStatus, "4000")) {
                msgResult = "请检查支付宝是否安装，或者更新支付宝版本";
                resultCode = 0;
            } else if (TextUtils.equals(resultStatus, "5000")) {
                msgResult = "重复请求";
            } else if (TextUtils.equals(resultStatus, "6001")) {
                msgResult = "您已取消支付";
                resultCode = 0;
            } else if (TextUtils.equals(resultStatus, "6002")) {
                msgResult = "网络连接出错";
                resultCode = 0;
            } else if (TextUtils.equals(resultStatus, "6004")) {
                msgResult = "支付结果确认中";
            } else {
                msgResult = "支付失败";
                resultCode = 0;
            }
        }
        if (isNeedReturn) {
            responseMap.clear();
            responseMap.put("errcode", StringUtils.checkStringIsNull(resultStatus));
            responseMap.put("msg", msgResult);
        }else {
//            ToastManager.show(App.getContext(), msgResult);
        }
        return responseMap;
    }
}
