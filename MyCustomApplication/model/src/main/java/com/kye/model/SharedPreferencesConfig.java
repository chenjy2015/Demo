package com.kye.model;

public interface SharedPreferencesConfig {
    String KEY_USER = "KEY_USER";// 用户
    String LAST_VERIFICATION_TIME = "LAST_VERIFICATION_TIME";// 发送验证码计时
    String HELP_SEARCH_HISTORY_RECORDS = "HELP_SEARCH_HISTORY_RECORDS";
    String KEY_ADVERTISEMENT_LIST = "KEY_ADVERTISEMENT_LIST";
    // true 能进TCL商场 false 不能进 显示升级中
    String KEY_IS_CAN_INTER_SHOP = "KEY_IS_CAN_INTER_SHOP";
    // 人气支持
    String KEY_POPULARITY_AGREEMENT = "KEY_POPULARITY_AGREEMENT";

    // 备注列表
    String KEY_REMARKS = "KEY_REMARKS";
    // 备注列表
    String KEY_HISTORY_WAYBILL = "KEY_HISTORY_WAYBILL";
    // 实名认证处提示时间
    String KEY_NAME_CERTIFICATION = "KEY_NAME_CERTIFICATION";

    // 推送设置
    String KEY_PUSH_SETTING = "KEY_PUSH_SETTING";

//    String COMMON_TOOL_ITEM_SELECTED = "COMMON_TOOL_ITEM_SELECTED"; // 选中的常用工具
//    String COMMON_TOOL_ITEM_UNSELECTED = "COMMON_TOOL_ITEM_UNSELECTED"; // 未选中的常用工具

    String KEY_QUERY_WAYBILL_ERROR_COUNT = "KEY_QUERY_WAYBILL_ERROR_COUNT";

    String KEY_RECHARGE_OFFLINE_USERNAME= "key_recharge_offline_username";
    String KEY_RECHARGE_OFFLINE_BANKNAME = "key_recharge_offline_bankname";
    String KEY_RECHARGE_OFFLINE_ACCOUNT = "key_recharge_offline_account";

    String LAST_VERIFICATION_TIME_CUSTOMER_INTRO = "LAST_VERIFICATION_TIME_CUSTOMER_INTRO";// 客户介绍中提现，发送验证码计时

    String KEY_APP_GUIDE_HOME = "KEY_APP_GUIDE_HOME"; // 是否启动了首页蒙版引导, true已经启动过
    String KEY_APP_GUIDE_INTEGRAL = "KEY_APP_GUIDE_INTEGRAL_CENTER"; // 是否启动了礼品蒙版引导, true已经启动过
    String KEY_INTEGRAL = "KEY_INTEGRAL";

}
