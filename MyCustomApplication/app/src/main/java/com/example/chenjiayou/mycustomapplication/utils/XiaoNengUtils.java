package com.example.chenjiayou.mycustomapplication.utils;

import android.content.Context;

import cn.xiaoneng.coreapi.ChatParamsBody;
import cn.xiaoneng.uiapi.Ntalker;

public class XiaoNengUtils {

    private static final String SETTING_ID = "kf_9519_1474444399743";
    private static final String SDK_KEY = "BB25D868-2C02-4D20-8327-81625126788F";


    public static void initSDK(Context context) {
        Ntalker.getBaseInstance().initSDK(context, SETTING_ID, SDK_KEY);
    }

    /**
     * @param context
     * @return 0为成功，其他为失败
     */
    public static int startChat(Context context) {
        ChatParamsBody chatparams = new ChatParamsBody();

        //**** 咨询发起页，用于PC客服端显示用户发起咨询的位置***********

        chatparams.startPageTitle = "外部安卓";  // 咨询发起页标题(必填)
        chatparams.startPageUrl = "http://www.ky-express.com/";//咨询发起页URL，必须以"http://"开头 （必填）

        /**
         *  @param appContext
         *  @param settingid  有效接待组Id,该组内必须有客服存在,建议使用非管理员客服【必传】
         *  @param groupName  客服组名称，默认的企业客服名称,在异常情况下显示(如网络异常)【建议】
         *  @param chatparams  聊天参数体（带子参数,与多个功能有关,不用时填null）
         */
        return Ntalker.getBaseInstance().startChat(context, SETTING_ID, null, chatparams);
    }

    /**
     * 登录
     * @param userid    登录用户的id，只能输入数字、英文字母和“@”、“.”、“_”三种字符。长度小于40,并且不能重复,
     *                  相同的userid会造成会话同步,切记不可重复 【必填】
     * @param username  登录用户名，只能包含字母、汉字、数字、_、@、.的字符串。长度小于32,显示于PC客服端,如未填写,
     *                  系统随机会随机生成一个用户名, 如:客人9527
     * @param leave     登录用户的等级，普通用户“0”，VIP用户传“1”到“5”,值越大等级越高。默认写 0 【必填】
     * @return 0为成功，其他失败
     */
    public static int login(String userid,String username,int leave){
        return Ntalker.getInstance().login(userid, username, leave);
    }

    /**
     * 退出
     * @return
     */
    public static int logout(){
        return Ntalker.getInstance().logout();
    }


}
