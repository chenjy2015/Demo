package com.kye.model.bean.advertisement;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/01/2018
 * @updated : 06/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public enum AdvertisementType {

    TYPE_AD_BANNER_HOME(3),    // 首页轮播
    TYPE_AD_POMOTION(1),    // 广告推广
    TYPE_AD_SCREEN(11),    // 首页插屏广告
    TYPE_AD_POPUP_SHOP(7),    // 积分商城弹窗
    TYPE_AD_BANNER_WELFARE(9), // 福利
    TYPE_AD_GIFT_EXCHANGE(12),  // 礼品兑换列表
    TYPE_AD_POPUP_DEFAULT(4),  // 弹窗
    TYPE_AD_POPUP_BIRTHDAY(8), // 生日弹窗
    TYPE_AD_SPLASH(2);       // 启动欢迎页图

    private int classid;

    AdvertisementType(int classid) {
        this.classid = classid;
    }

    public int getClassid() {
        return classid;
    }
}
