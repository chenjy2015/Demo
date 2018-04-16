package com.example.chenjiayou.mycustomapplication.utils.pay;

import android.app.Activity;

import com.kye.base.Logger;
import com.kye.express.R;
import com.kye.express.utils.StringUtils;
import com.kye.model.OpenApiResultObserver;
import com.kye.model.SingleApiResultObserver;
import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.online.AliPayAccountBean;
import com.kye.model.bean.online.PayAccountBean;
import com.kye.model.bean.online.PayStatusType;
import com.kye.model.bean.online.WechatPayAccountBean;
import com.kye.model.bean.online.request.GetAliPayUrlParams;
import com.kye.model.bean.online.request.GetFreightAliPayUrlParams;
import com.kye.model.bean.online.request.GetFreightPayAccountParams;
import com.kye.model.bean.online.request.GetFreightWechatPayParams;
import com.kye.model.bean.online.request.GetPayAccountParams;
import com.kye.model.bean.online.request.GetTargeNoByWechatParams;
import com.kye.model.bean.user.User;
import com.kye.model.service.OnlinePayService;
import com.oxbix.spanlogistics.share.Contants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by chen on 18/1/19.
 */

public class OnlinePayUtils {

    private static OnlinePayUtils   mInstance;
    private OnlinePayService mOnlinePayService;
    private static List<PayAccountBean> mPayAccounts = new ArrayList<PayAccountBean>();
    private static PayStatusType mPayStatusType;
//    private Activity mContext;


    private OnlinePayUtils() {
        mOnlinePayService = RetrofitManager.getInstance().createOpenApiService(OnlinePayService.class);
    }

    public static OnlinePayUtils getInstance() {
        if (mInstance == null) {
            mInstance = new OnlinePayUtils();
        }
        return mInstance;
    }

    private PayAccountBean getAccountByType(int type) {
        if (mPayAccounts != null && mPayAccounts.size() > 0) {
            for (PayAccountBean dataBean : mPayAccounts) {
                if (type == dataBean.getPayType()) {
                    return dataBean;
                }
            }
        }
        return null;
    }

    private void init(Activity activity) {
//        this.mContext = activity;
        WeiPayUtils.getInstance().init(activity);
    }


    /**
     * 记录当前支付进入状态 在线支付和预存运费模块
     * 请求账号信息的接口不同 但返回参数相同这里要做个区分
     *
     * @param payStatusType
     */
    private void initPayStatusType(PayStatusType payStatusType) {
        if (mPayStatusType != payStatusType) {
            mPayAccounts.clear();
        }
        mPayStatusType = payStatusType;
    }


    /**
     * 调起微信支付 -- 在线支付
     *
     * @param context
     * @param waybill
     * @param total_fee 总金额
     * @param user
     * @param data      运单列表
     */
    public void onlinePayByWechat(Activity context,
                                  String waybill,
                                  String total_fee,
                                  User user,
                                  ArrayList<GetTargeNoByWechatParams.Data> data,
                                  OnPayStatusListener onPayStatusListener) {
        init(context);
        initPayStatusType(PayStatusType.PAY_TYPE_ON_LINE);
        if (!WeiPayUtils.getInstance().checkIsHaveWeiChat()) {
            final String wechatStr = context.getString(R.string.wechat_unavailable);
            onPayStatusListener.onPayFail(null, wechatStr);
            return;
        }

        GetTargeNoByWechatParams params = new GetTargeNoByWechatParams();
        params.setPhone(user.getPhone());
        params.setBody("跨越运单付款");
        params.setSpbill_create_ip(WeiPayUtils.getIp(context));
        params.setTotal_fee(total_fee);
        params.setCompany(user.getWorkcompany());
        params.setSellerid(Contants.TENCENT_WECHAT_APPID);
        params.setExtFiled1("APP");
        params.setYdinfo(data);
        PayAccountBean dataBean = getAccountByType(1);
        onPayStatusListener.onPayLoading();
        if (dataBean != null) {
            if (!StringUtils.isNullOrEmpty(dataBean.getPayAppId())) {
                params.setSellerid(dataBean.getPayAppId());
            }
            payByWechat(params, onPayStatusListener);
        } else {
            GetPayAccountParams getPayAccountParams = new GetPayAccountParams();
            getPayAccountParams.setPhone(user.getPhone());
            getPayAccountParams.setWaybill(waybill);
            mOnlinePayService.getPayAccount(getPayAccountParams)
                             .observeOn(AndroidSchedulers.mainThread())
                             .subscribe(

//                            new OpenApiResultObserver<List<PayAccountBean>>() {
//
//                        @Override
//                        public void onLoading(Disposable d) {
//
//                        }
//
//                        @Override
//                        public void onSuccess(OpenApiResult<List<PayAccountBean>> result, List<PayAccountBean> payAccountBeans) {
//                            mPayAccounts = payAccountBeans;
//                            PayAccountBean bean = getAccountByType(1);
//                            if (!StringUtils.isNullOrEmpty(bean) && !StringUtils.isNullOrEmpty(bean.getPayAppId())) {
//                                params.setSellerid(bean.getPayAppId());
//                            }
//                            payByWechat(params, onPayStatusListener);
//                        }
//
//                        @Override
//                        public void onApiError(OpenApiResult<List<PayAccountBean>> result, int code, String msg) {
//                            Logger.e("onlinePayByWechat", StringUtils.checkStringIsNull(msg));
//                            onPayStatusListener.onPayFail(null,StringUtils.checkStringIsNull(msg));
//                        }
//
//                        @Override
//                        public void onOtherError(Throwable e) {
//                            Logger.e("onlinePayByWechat", e);
//                            onPayStatusListener.onPayFail(null,StringUtils.checkStringIsNull(e.getMessage()));
//                        }
//
//                        @Override
//                        public void onLoaded() {
//
//                        }
//                    }
                                     new SingleApiResultObserver<List<PayAccountBean>>() {
                                         @Override
                                         public void onResponseLoading(Disposable d) {
                                             onPayStatusListener.onPayLoading();
                                         }

                                         @Override
                                         public void onResponseSuccess(List<PayAccountBean> payAccountBeans, int code, String successMsg) {
                                             mPayAccounts = payAccountBeans;
                                             PayAccountBean bean = getAccountByType(1);
                                             if (!StringUtils.isNullOrEmpty(bean) && !StringUtils.isNullOrEmpty(bean.getPayAppId())) {
                                                 params.setSellerid(bean.getPayAppId());
                                             }
                                             payByWechat(params, onPayStatusListener);
                                         }

                                         @Override
                                         public void onResponseError(Throwable error, int errorCode, String errMsg) {
                                             onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(errMsg));
                                         }
                                     }
                                       );
        }
    }


    private void payByWechat(GetTargeNoByWechatParams getTargeNoByWechatParams, OnPayStatusListener onPayStatusListener) {
        initPayStatusType(PayStatusType.PAY_TYPE_ON_LINE);

        mOnlinePayService.getPayByWechatInfor(getTargeNoByWechatParams)
                         .subscribeOn(Schedulers.io())
                         .observeOn(AndroidSchedulers.mainThread())
                         .subscribe(
//                                 new OpenApiResultObserver<WechatPayAccountBean>() {
//                             @Override
//                             public void onSubscribe(Disposable d) {
//
//                             }
//
//
//                             @Override
//                             public void onLoading(Disposable d) {
//
//                             }
//
//                             @Override
//                             public void onSuccess(OpenApiResult<WechatPayAccountBean> result, WechatPayAccountBean wechatPayAccountBean) {
//                                 Map<String, String> response = new HashMap<String, String>();
//                                 response.put("out_trade_no", result.getData().getOut_trade_no());
//                                 if (WeiPayUtils.getInstance().checkIsHaveWeiChat()) {
//                                     WeiPayUtils.getInstance().startPay(wechatPayAccountBean);
//                                     onPayStatusListener.onPaySuccess(response);
//                                 } else {
//                                     onPayStatusListener.onPayFail(null, "微信未安装或者不支持支付");
//                                 }
//                             }
//
//                             @Override
//                             public void onApiError(OpenApiResult<WechatPayAccountBean> result, int code, String msg) {
//                                 Logger.e("payByWechat", StringUtils.checkStringIsNull(msg));
//                                 onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(msg));
//                             }
//
//                             @Override
//                             public void onOtherError(Throwable e) {
//                                 Logger.e("payByWechat", e);
//                                 onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(e.getMessage()));
//                             }
//
//                             @Override
//                             public void onLoaded() {
//
//                             }
//                         }
                                 new SingleApiResultObserver<WechatPayAccountBean>() {
                                     @Override
                                     public void onResponseLoading(Disposable d) {
                                         onPayStatusListener.onPayLoading();
                                     }

                                     @Override
                                     public void onResponseSuccess(WechatPayAccountBean responseData, int code, String successMsg) {
                                         Map<String, String> response = new HashMap<String, String>();
                                         response.put("out_trade_no", responseData.getOut_trade_no());
                                         if (WeiPayUtils.getInstance().checkIsHaveWeiChat()) {
                                             WeiPayUtils.getInstance().startPay(responseData);
                                             onPayStatusListener.onPaySuccess(response);
                                         } else {
                                             onPayStatusListener.onPayFail(null, "微信未安装或者不支持支付");
                                         }
                                     }

                                     @Override
                                     public void onResponseError(Throwable error, int errorCode, String errMsg) {
                                         onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(errMsg));
                                     }
                                 }
                                   );
    }


    /**
     * 调起支付宝支付 - 在线支付
     *
     * @param waybill
     * @param total_fee
     * @param user
     * @param data
     */
    public void onlinePayByAli(Activity context,
                               String waybill,
                               String total_fee,
                               User user,
                               ArrayList<GetAliPayUrlParams.Data> data,
                               OnPayStatusListener onPayStatusListener) {

        init(context);
        initPayStatusType(PayStatusType.PAY_TYPE_ON_LINE);


        GetAliPayUrlParams params = new GetAliPayUrlParams();
        params.setPhone(user.getPhone());
        params.setBillSource("APP");
        params.setCompany(user.getWorkcompany());
        params.setPhone(user.getPhone());
        params.setSubject("跨越运单付款");
        params.setBody("跨越运单付款");
        params.setTotalFee(total_fee);
        params.setYdinfo(data);

        PayAccountBean dataBean = getAccountByType(0);
        if (dataBean != null) {
            if (!StringUtils.isNullOrEmpty(dataBean.getPayAppId())) {
                params.setSellerId(dataBean.getPayAppId());
            }
            payByAli(context, params, onPayStatusListener);
        } else {
            GetPayAccountParams getPayAccountParams = new GetPayAccountParams();
            getPayAccountParams.setPhone(user.getPhone());
            getPayAccountParams.setWaybill(waybill);

            mOnlinePayService.getPayAccount(getPayAccountParams)
                             .subscribeOn(Schedulers.io())
                             .subscribeOn(Schedulers.newThread())
                             .subscribe(
//                                     new OpenApiResultObserver<List<PayAccountBean>>() {
//                                 @Override
//                                 public void onLoading(Disposable d) {
//
//                                 }
//
//                                 @Override
//                                 public void onSuccess(OpenApiResult<List<PayAccountBean>> result, List<PayAccountBean> payAccountBeans) {
//                                     mPayAccounts = payAccountBeans;
//                                     PayAccountBean bean = getAccountByType(0);
//                                     if (!StringUtils.isNullOrEmpty(bean) && !StringUtils.isNullOrEmpty(bean.getPayAppId())) {
//                                         params.setSellerId(bean.getPayAppId());
//                                     }
//                                     payByAli(context, params, onPayStatusListener);
//                                 }
//
//                                 @Override
//                                 public void onApiError(OpenApiResult<List<PayAccountBean>> result, int code, String msg) {
//                                     Logger.e("onlinePayByAli", StringUtils.checkStringIsNull(msg));
//                                     onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(msg));
//                                 }
//
//                                 @Override
//                                 public void onOtherError(Throwable e) {
//                                     Logger.e("onlinePayByAli", e);
//                                     onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(e.getMessage()));
//                                 }
//
//                                 @Override
//                                 public void onLoaded() {
//
//                                 }
//                             }
                                     new SingleApiResultObserver<List<PayAccountBean>>() {
                                         @Override
                                         public void onResponseLoading(Disposable d) {
                                             onPayStatusListener.onPayLoading();
                                         }

                                         @Override
                                         public void onResponseSuccess(List<PayAccountBean> responseData, int code, String successMsg) {
                                             mPayAccounts = responseData;
                                             PayAccountBean bean = getAccountByType(0);
                                             if (!StringUtils.isNullOrEmpty(bean) && !StringUtils.isNullOrEmpty(bean.getPayAppId())) {
                                                 params.setSellerId(bean.getPayAppId());
                                             }
                                             payByAli(context, params, onPayStatusListener);
                                         }

                                         @Override
                                         public void onResponseError(Throwable error, int errorCode, String errMsg) {
                                             onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(errMsg));
                                         }
                                     }
                                       );

        }

    }


    private void payByAli(Activity context, GetAliPayUrlParams getAliPayUrlParams, OnPayStatusListener onPayStatusListener) {

        initPayStatusType(PayStatusType.PAY_TYPE_ON_LINE);

        mOnlinePayService.getPayByAliInfor(getAliPayUrlParams)
                         .subscribeOn(Schedulers.io())
                         .map(new Function<OpenApiResult<AliPayAccountBean>, Map<String, String>>() {
                             @Override
                             public Map<String, String> apply(OpenApiResult<AliPayAccountBean> aliPayAccountBeanOpenApiResult) throws Exception {
                                 Map<String, String> map               = new HashMap<String, String>();
                                 AliPayAccountBean aliPayAccountBean = aliPayAccountBeanOpenApiResult.getData();
                                 map.put("out_trade_no", aliPayAccountBean.getOut_trade_no());
                                 map.putAll(AliPayUtils.getInstance().pay(context, aliPayAccountBean.getUrl(), true));
                                 return map;
                             }
                         })
                         .observeOn(AndroidSchedulers.mainThread())
                         .subscribe(new SingleObserver<Map<String, String>>() {
                             @Override
                             public void onSubscribe(Disposable d) {

                             }

                             @Override
                             public void onSuccess(Map<String, String> response) {
                                 if (response.get("errcode").equals("9000")) {
                                     onPayStatusListener.onPaySuccess(response);
                                 } else {
                                     onPayStatusListener.onPayFail(response, "支付失败");
                                 }
                             }

                             @Override
                             public void onError(Throwable e) {
                                 Logger.e("payByAli", e);
                                 onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(e.getMessage()));
                             }
                         });
    }


    /**
     * 调起微信支付 -- 预存运费
     *
     * @param context
     * @param total_fee 总金额
     */
    public void preDepositFreigPayByWechat(Activity context, User user, String total_fee, String remark, OnPayStatusListener onPayStatusListener) {
        init(context);
        initPayStatusType(PayStatusType.PAY_TYPE_FREIGHT);

        GetFreightWechatPayParams params = new GetFreightWechatPayParams();
        params.setPhone(user.getPhone());
        params.setBody("跨越运单运存款");
        params.setSpbill_create_ip(WeiPayUtils.getIp(context));
        params.setTotal_fee(total_fee);
        String customCode  = "";
        String companyName = "";
        for (User.Address address : user.getLastAddress()) {
            if (customCode.equals(address.getCompanyCode())) {
                companyName = address.getCompanyName();
                break;
            }
        }
        if (companyName.equals("")) {
            for (User.Address address : user.getLastAddress()) {
                if (address.getIsBinding()) {
                    companyName = address.getCompanyName();
                    break;
                }
            }
        }
        params.setCompany(companyName);
        params.setRemark(remark);
        //params.setSellerid(Contants.TENCENT_WECHAT_APPID);

        PayAccountBean dataBean = getAccountByType(1);
        if (dataBean != null) {
            freigByWechat(params, onPayStatusListener);
        } else {
            GetFreightPayAccountParams getFreightPayAccountParams = new GetFreightPayAccountParams();
            getFreightPayAccountParams.setPhone(user.getPhone());
            getFreightPayAccountParams.setCompanyCode(user.getCustomCode());
            mOnlinePayService.getFreightPayAccount(getFreightPayAccountParams)
                             .subscribeOn(Schedulers.io())
                             .subscribeOn(Schedulers.newThread())
                             .subscribe(new OpenApiResultObserver<List<PayAccountBean>>() {
                                 @Override
                                 public void onLoading(Disposable d) {

                                 }

                                 @Override
                                 public void onSuccess(OpenApiResult<List<PayAccountBean>> result, List<PayAccountBean> payAccountBeans) {
                                     mPayAccounts = payAccountBeans;
//                            params.setSellerid(getAccountByType(1).getPayAppId());
                                     PayAccountBean bean = getAccountByType(1);
                                     if (!StringUtils.isNullOrEmpty(bean) && !StringUtils.isNullOrEmpty(bean.getPayAppId())) {
                                     }
                                     freigByWechat(params, onPayStatusListener);
                                 }

                                 @Override
                                 public void onApiError(OpenApiResult<List<PayAccountBean>> result, int code, String msg) {
                                     Logger.e("preDepositFreigPayByWechat", StringUtils.checkStringIsNull(msg));
                                     onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(msg));
                                 }

                                 @Override
                                 public void onOtherError(Throwable e) {
                                     Logger.e("preDepositFreigPayByWechat", e);
                                     onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(e.getMessage()));
                                 }

                                 @Override
                                 public void onLoaded() {

                                 }


                             });


        }
    }


    private void freigByWechat(GetFreightWechatPayParams getFreightWechatPayParams, OnPayStatusListener onPayStatusListener) {

        mOnlinePayService.getFreightPayByWechatInfor(getFreightWechatPayParams)
                         .subscribeOn(Schedulers.io())
                         .observeOn(AndroidSchedulers.mainThread())
                         .subscribe(new OpenApiResultObserver<WechatPayAccountBean>() {
                             @Override
                             public void onSubscribe(Disposable d) {

                             }

                             @Override
                             public void onLoading(Disposable d) {

                             }

                             @Override
                             public void onSuccess(OpenApiResult<WechatPayAccountBean> result, WechatPayAccountBean wechatPayAccountBean) {
                                 Map<String, String> response = new HashMap<String, String>();
                                 response.put("out_trade_no", result.getData().getOut_trade_no());
                                 if (WeiPayUtils.getInstance().checkIsHaveWeiChat()) {
                                     WeiPayUtils.getInstance().startPay(wechatPayAccountBean);
                                     onPayStatusListener.onPaySuccess(response);
                                 } else {
                                     onPayStatusListener.onPayFail(response, "未检测到微信应用");
                                 }
                             }

                             @Override
                             public void onApiError(OpenApiResult<WechatPayAccountBean> result, int code, String msg) {
                                 Logger.e("freigByWechat", StringUtils.checkStringIsNull(msg));
                                 onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(msg));
                             }

                             @Override
                             public void onOtherError(Throwable e) {
                                 Logger.e("freigByWechat", e);
                                 onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(e.getMessage()));
                             }

                             @Override
                             public void onLoaded() {

                             }
                         });
    }


    /**
     * 调起支付宝支付 - 预存运费
     *
     * @param total_fee
     * @param user
     */
    public void preDepositFreigByAli(Activity context, String total_fee, User user, OnPayStatusListener onPayStatusListener) {
        init(context);
        final GetFreightAliPayUrlParams params = new GetFreightAliPayUrlParams();
        params.setPhone(user.getPhone());
        params.setSubject("跨越速运");
        params.setTotalFee(total_fee);
        params.setBody("跨越运单预存款");
        String customCode  = "";
        String companyName = "";
        for (User.Address address : user.getLastAddress()) {
            if (customCode.equals(address.getCompanyCode())) {
                companyName = address.getCompanyName();
                break;
            }
        }
        if (companyName.equals("")) {
            for (User.Address address : user.getLastAddress()) {
                if (address.getIsBinding()) {
                    companyName = address.getCompanyName();
                    break;
                }
            }
        }
        params.setCompany(companyName);

        PayAccountBean bean = getAccountByType(0);
        if (!StringUtils.isNullOrEmpty(bean) && !StringUtils.isNullOrEmpty(bean.getPayAppId())) {
            params.setSellerId(bean.getPayAppId());
            freigPayByAli(context, params, onPayStatusListener);
        } else {
            GetFreightPayAccountParams getFreightPayAccountParams = new GetFreightPayAccountParams();
            getFreightPayAccountParams.setPhone(user.getPhone());
            getFreightPayAccountParams.setCompanyCode(user.getCustomCode());

            mOnlinePayService.getFreightPayAccount(getFreightPayAccountParams)
                             .subscribeOn(Schedulers.io())
                             .subscribeOn(Schedulers.newThread())
                             .subscribe(new OpenApiResultObserver<List<PayAccountBean>>() {
                                 @Override
                                 public void onLoading(Disposable d) {

                                 }

                                 @Override
                                 public void onSuccess(OpenApiResult<List<PayAccountBean>> result, List<PayAccountBean> payAccountBeans) {
                                     mPayAccounts = payAccountBeans;
                                     PayAccountBean bean = getAccountByType(0);
                                     if (!StringUtils.isNullOrEmpty(bean) && !StringUtils.isNullOrEmpty(bean.getPayAppId())) {
                                         params.setSellerId(bean.getPayAppId());
                                     }
                                     freigPayByAli(context, params, onPayStatusListener);
                                 }

                                 @Override
                                 public void onApiError(OpenApiResult<List<PayAccountBean>> result, int code, String msg) {
                                     Logger.e("preDepositFreigByAli", StringUtils.checkStringIsNull(msg));
                                     onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(msg));
                                 }

                                 @Override
                                 public void onOtherError(Throwable e) {
                                     Logger.e("preDepositFreigByAli", e);
                                     onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(e.getMessage()));
                                 }


                                 @Override
                                 public void onLoaded() {

                                 }


                             });
        }

    }


    private void freigPayByAli(Activity context, GetFreightAliPayUrlParams getFreightAliPayUrlParams, OnPayStatusListener onPayStatusListener) {

        initPayStatusType(PayStatusType.PAY_TYPE_ON_LINE);

        mOnlinePayService.getFreightPayByAliInfor(getFreightAliPayUrlParams)
                         .subscribeOn(Schedulers.io())
                         .map(new Function<OpenApiResult<AliPayAccountBean>, Map<String, String>>() {
                             @Override
                             public Map<String, String> apply(OpenApiResult<AliPayAccountBean> aliPayAccountBeanOpenApiResult) throws Exception {
                                 Map<String, String> map               = new HashMap<String, String>();
                                 AliPayAccountBean aliPayAccountBean = aliPayAccountBeanOpenApiResult.getData();
                                 map.put("out_trade_no", aliPayAccountBean.getOut_trade_no());
                                 map.putAll(AliPayUtils.getInstance().pay(context, aliPayAccountBean.getUrl(), true));
                                 return map;
                             }
                         })
                         .observeOn(AndroidSchedulers.mainThread())
                         .subscribe(new SingleObserver<Map<String, String>>() {
                             @Override
                             public void onSubscribe(Disposable d) {

                             }

                             @Override
                             public void onSuccess(Map<String, String> response) {
                                 if (response.get("errcode").equals("9000")) {
                                     onPayStatusListener.onPaySuccess(response);
                                 } else {
                                     onPayStatusListener.onPayFail(response, "支付失败");
                                 }
                             }

                             @Override
                             public void onError(Throwable e) {
                                 Logger.e("payByAli", e);
                                 onPayStatusListener.onPayFail(null, StringUtils.checkStringIsNull(e.getMessage()));
                             }
                         });

    }


}
