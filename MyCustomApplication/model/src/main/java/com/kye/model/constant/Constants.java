package com.kye.model.constant;

/**
 * Created by harry on 2018/1/4 下午9:04.
 * 常量类
 */

public class Constants {
    public static final int PAGE_SIZE = 10;
    public static final int PAGE_SIZE_50 = 50;

    //sdcard中文件夹名字
    public static final String SDCARD_FOLDER_NAME = "kye";

    public static final int REQUEST_CODE_CAMERA = 1;   // Reqyest-选择拍照
    public static final int REQUEST_CODE_ALBUM = 2;    // Request-选择相册

    public static final String ACTION_IMAGE_CAPTURE = "android.media.action.IMAGE_CAPTURE";  // 意图-调用系统相机

    public static final int ResponseCode_SUCCESS = 0;  // 响应吗-操作成功
    public static final int ResponseCode_30003 = 30003;  // 响应吗-暂无数据

    public static final String PACKAGE_WX = "com.tencent.mm"; // 微信包名

    public static final String DATE_PICKER_DIALOG = "DATE_PICKER_DIALOG";
    public static final int QUERY_DATE_FROM = 0;
    public static final int QUERY_DATE_TO = 1;

    public static final String PLATFORM_ANDROID = "30";

    //app签名，有些接口中需要传
    public final static String KY_SIGN = "835025F35B3202115B1436B33B923FDF";
//    public final static String KY_SIGN = "123456";
    public static final String KEY_PAYMONEY = "key_paymoney";
    public static final String KEY_PAYTIME = "key_paytime";
    public static final String KEY_PAYMODE = "key_paymode";
    public static final String KEY_PAYACCOUNT = "key_payaccount";
    public static final String KEY_PROMPT = "key_prompt";
    public static final String KEY_SEARCHRESULT = "key_searchresult";

    public static final String KEY_REDPACKET_TIME   = "key_redpacket_time";
    public static final String KEY_REDPACKET_NUMBER = "key_redpacket_number";
    public static final String KEY_REDPACKET_ACTIVITYSN = "key_redpacket_activitySn";
    public static final String KEY_REDPACKET_ISHASPRIZE = "key_redpacket_isHasPrize";
    public static final String KEY_REDPACKET_MINNUM = "key_redpacket_minnum";
    public static final String KEY_REDPACKET_MAXNUM = "key_redpacket_maxnum";

    public static final String KEY_REDPACKET_MONRY = "key_redpacket_money";
    public static final String KEY_REDPACKET_SPONSOR= "key_redpacket_sponsor";
    public static final String KEY_REDPACKET_ISHASTIME = "key_redpacket_isHasTime";
    public static final String KEY_REDPACKET_ISSHOW= "key_redpacket_isShow";

    public static final String CURRENT_TIME_ALL = "yyyy-MM-dd HH:mm:ss";

    public static final String JD_KYSIGN = "123456";
    public static final String JD_RECOMMENDTYPE = "0";

    public static final String KEY_PHONE = "phone";
    public static final String KEY_PRODUCTID = "productid";
    public static final String KEY_URLADDRESS = "urladdress";

    public static final String GOODS_IMAGE_URL = "http://img13.360buyimg.com/n0/";



}
