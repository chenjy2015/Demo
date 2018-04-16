package com.example.chenjiayou.mycustomapplication.utils.pay;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;

import com.kye.model.bean.online.WechatPayAccountBean;
import com.oxbix.spanlogistics.share.Contants;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;


/**
 *
 *@Author chen
 *@Date 18/1/22 下午3:28
 *@descript 微信支付工具类
 */


public class WeiPayUtils {

    private static WeiPayUtils mInstance;
    private static IWXAPI mWXAPI;
//    private Activity mAct;

    private WeiPayUtils (){

    }

    public static WeiPayUtils getInstance(){
        if (mInstance == null){
            mInstance = new WeiPayUtils();
        }
        return mInstance;
    }

    public WeiPayUtils init(Activity context){
//        this.mAct = context;
        if (mWXAPI == null) {
            mWXAPI = WXAPIFactory.createWXAPI(context, null);
            mWXAPI.registerApp(Contants.TENCENT_WECHAT_APPID);
        }
        return getInstance();
    }

    public boolean checkIsHaveWeiChat() {
        return mWXAPI.isWXAppInstalled() && mWXAPI.isWXAppSupportAPI();
    }


    public void startPay(WechatPayAccountBean bean) {

        PayReq req = new PayReq();
        req.appId = bean.getAppid();
        //商户id
        req.partnerId = bean.getPartnerid();
        //预付id
        req.prepayId = bean.getPrepayid();
        req.packageValue = bean.getPayType();
        //随机数
        req.nonceStr = bean.getNoncestr();
        //以秒为单位的时间戳，就时间长整形除1000
        req.timeStamp = bean.getTimestamp();
        req.sign = bean.getSign();
        //发生请求
        boolean b = mWXAPI.sendReq(req);
    }

    public static String getIp(Context context) {
        String ipWifi = getIpWifi(context);
        if (ipWifi != null) {
            return ipWifi;

        } else {
            String localIpAddress = getLocalIpAddress();
            if (localIpAddress != null) {
                return localIpAddress;
            }
        }
        return null;
    }

    /**
     * wifi下获取ip
     *
     * @param context
     * @return
     */
    public static String getIpWifi(Context context) {
        //获取wifi服务
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        //判断wifi是否开启
        if (wifiManager.isWifiEnabled()) {
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            int ipAddress = wifiInfo.getIpAddress();
            String ip = intToIp(ipAddress);
            return ip;
        }
        return null;
    }

    public static String getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements(); ) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
//这里需要注意：这里增加了一个限定条件( inetAddress instanceof Inet4Address ),主要是在Android4.0高版本中可能优先得到的是IPv6的地址。参考：http://blog.csdn.net/stormwy/article/details/8832164
                    if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                        return inetAddress.getHostAddress().toString();
                    }
                }
            }
        } catch (SocketException ex) {
            Log.e("IpAddress", ex.toString());
        }
        return null;
    }

    private static String intToIp(int i) {

        return (i & 0xFF) + "." +
                ((i >> 8) & 0xFF) + "." +
                ((i >> 16) & 0xFF) + "." +
                (i >> 24 & 0xFF);
    }


}
