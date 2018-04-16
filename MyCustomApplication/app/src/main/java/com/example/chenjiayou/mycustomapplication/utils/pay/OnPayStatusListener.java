package com.example.chenjiayou.mycustomapplication.utils.pay;

import java.util.Map;

/**
 * Created by chen on 18/1/23.
 */

public interface OnPayStatusListener {

     void onPayLoading();

     void onPaySuccess(Map<String, String> response);

     void onPayFail(Map<String, String> errMap, String error);
}
