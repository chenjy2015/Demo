package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.RequestUser;
import com.kye.model.bean.dstance.DstanceBean;
import com.kye.model.bean.freight_rates_query.GetCustomerInfoResultBean;
import com.kye.model.bean.freight_rates_query.RequestGetCustomerInfoBean;
import com.kye.model.bean.order.OrderAddOrderBean;
import com.kye.model.bean.order.OrderAddresses;
import com.kye.model.bean.order.OrderContrabandBean;
import com.kye.model.bean.order.OrderDetailResultBean;
import com.kye.model.bean.order.OrderEditResultBean;
import com.kye.model.bean.order.OrderIsCanAddBean;
import com.kye.model.bean.order.OrderListResultBean;
import com.kye.model.bean.order.OrderStatusBean;
import com.kye.model.bean.order.OrderValidationNameCertificationBean;
import com.kye.model.bean.order.request.RequestAddOrder;
import com.kye.model.bean.order.request.RequestCheckContraband;
import com.kye.model.bean.order.request.RequestDeleteOrder;
import com.kye.model.bean.order.request.RequestDeleteSannerOeder;
import com.kye.model.bean.order.request.RequestDeleteTempAddress;
import com.kye.model.bean.order.request.RequestEditOrder;
import com.kye.model.bean.order.request.RequestEditTempAddress;
import com.kye.model.bean.order.request.RequestNameCertification;
import com.kye.model.bean.order.request.RequestOrderAddresses;
import com.kye.model.bean.order.request.RequestOrderDeliveryDstance;
import com.kye.model.bean.order.request.RequestOrderDetail;
import com.kye.model.bean.order.request.RequestOrderList;
import com.kye.model.bean.order.request.RequestOrderStatusProgress;
import com.kye.model.bean.order.request.RequestScanOrderDetail;
import com.kye.model.bean.order.scan_code_order.CheckOrderCurrentTimeRequest;
import com.kye.model.bean.order.scan_code_order.CheckOrderCurrentTimeResponse;
import com.kye.model.bean.order.scan_code_order.IsCanScanCodeToAddOrder;
import com.kye.model.bean.order.scan_code_order.ResponseQuote;
import com.kye.model.bean.order.scan_code_order.ScanCodeAddOrderBean;
import com.kye.model.bean.order.scan_code_order.ScanCodeOrderAddress;
import com.kye.model.bean.order.scan_code_order.ValidationNameReponseBean;
import com.kye.model.bean.order.scan_code_order.request.RequestAddScanCode;
import com.kye.model.bean.order.scan_code_order.request.RequestDeleteScanCodeAddress;
import com.kye.model.bean.order.scan_code_order.request.RequestGetQuote;
import com.kye.model.bean.order.scan_code_order.request.RequestIsCanAddOrder;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 03/01/2018
 * @updated : 03/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 * <p>
 * 订单相关接口服务
 */

public interface OrderService {

    /**
     * order 7下单查询接口， 获取订单列表
     *
     * @param requestOrderList
     *
     * @return
     */
    @Headers({"method:order_queryOrder"})
    @POST("router/rest")
    Single<OpenApiResult<OrderListResultBean>> getOrderList(@Body RequestOrderList requestOrderList);

    /**
     * 普通下单的订单详情接口 (V1.0)
     *
     * @param requestOrderDetail
     *
     * @return
     */
    @Headers({"method:order_orderDetails"})
    @POST("router/rest")
    Single<OpenApiResult<OrderDetailResultBean>> getOrderDetail(@Body RequestOrderDetail requestOrderDetail);

    /**
     * 扫描下单的订单详情接口 (V1.0)
     *
     * @param requestScanOrderDetail
     *
     * @return
     */
    @Headers({"method:scanning_orderDetails"})
    @POST("router/rest")
    Single<OpenApiResult<OrderDetailResultBean>> getScanOrderDetail(@Body RequestScanOrderDetail requestScanOrderDetail);

    /**
     * 待取货订单状态接口 (V1.0)
     * 订单路由状态
     *
     * @param requestOrderStatusProgress
     *
     * @return
     */
    @Headers({"method:order_pendingOrderStatus"})
    @POST("router/rest")
    Single<OpenApiResult<List<OrderStatusBean>>> getOrderStatusProgress(@Body RequestOrderStatusProgress requestOrderStatusProgress);

    /**
     * 取件距离
     *
     * @param requestOrderDeliveryDstance
     *
     * @return
     */
    @Headers({"method:logistics_deliverydDstance"})
    @POST("router/rest")
    Single<OpenApiResult<DstanceBean>> getOrderDeliveryDstance(@Body RequestOrderDeliveryDstance requestOrderDeliveryDstance);

    /**
     * 获取地址簿地址
     *
     * @param requestAddresses
     *
     * @return
     */
    @Headers({"method:order_queryTemporaryAddressPagingCache"})
    @POST("router/rest")
    Single<OpenApiResult<List<OrderAddresses>>> getAddresses(@Body RequestOrderAddresses requestAddresses);


    /**
     * 判断是否可添加临时取货地址缓存
     *
     * @param requestAddresses
     *
     * @return
     */
    @Headers({"method:order_checkIsCanAddTemporaryAddressCache"})
    @POST("router/rest")
    Single<OpenApiResult<OrderIsCanAddBean>> checkIsCanAddAdress(@Body RequestOrderAddresses requestAddresses);



    /**
     * 下单
     *
     * @param requestAddOrder
     *
     * @return
     */
    @Headers({"method:order_increaseOrder"})
    @POST("router/rest")
    Single<OpenApiResult<OrderAddOrderBean>> addOrder(@Body RequestAddOrder requestAddOrder);

    /**
     * 编辑订单
     *
     * @param requestEditOrder
     *
     * @return
     */
    @Headers({"method:order_checkOrderModifyDelete"})
    @POST("router/rest")
    Single<OpenApiResult<OrderEditResultBean>> editOrder(@Body RequestEditOrder requestEditOrder);

    /**
     * 删除临时地址
     */
    @Headers({"method:order_deleteTemporaryAddressCache"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> deleteTempAddress(@Body RequestDeleteTempAddress requestDeleteTempAddress);

    /**
     * 修改临时地址
     */
    @Headers({"method:order_modifyTemporaryAddressCache"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> editTempAddress(@Body RequestEditTempAddress requestEditTempAddress);

    /**
     * 增加临时地址
     */
    @Headers({"method:order_addTemporaryAddressCache"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> addTempAddress(@Body RequestEditTempAddress requestEditTempAddress);

    /**
     * 检验是否能扫码下单
     */
    @Headers({"method:scanning_scanningBackstageQrcode"})
    @POST("router/rest")
    Single<OpenApiResult<IsCanScanCodeToAddOrder>> isCanAddOrder(@Body RequestIsCanAddOrder requestIsCanAddOrder);

    /**
     * 查询地址列表
     */
    @Headers({"method:scanning_queryAddress"})
    @POST("router/rest")
    Single<OpenApiResult<List<ScanCodeOrderAddress>>> getScanCodeAddress(@Body RequestUser requestUser);

    /**
     * 扫码下单下单
     */
    @Headers({"method:scanning_scanningOrder"})
    @POST("router/rest")
    Single<OpenApiResult<ScanCodeAddOrderBean>> addScanCode(@Body RequestAddScanCode requestAddScanCode);

    /**
     * 扫描下单修改编辑
     */
    @Headers({"method:scanning_modifyOrder"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> modifyScanCode(@Body RequestAddScanCode requestAddScanCode);

    /**
     * 添加地址
     */
    @Headers({"method:scanning_addAddress"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> addScanCodeAddress(@Body ScanCodeOrderAddress addressData);

    /**
     * 修改地址
     */
    @Headers({"method:scanning_modifyAddress"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> modifyScanCodeAddress(@Body ScanCodeOrderAddress addressData);

    /**
     * 删除地址
     */
    @Headers({"method:scanning_deleteAddress"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> deleteScanCodeAddress(@Body RequestDeleteScanCodeAddress requestDeleteScanCodeAddress);

    /**
     * 保价费
     */
    @Headers({"method:scan_customerPlaceOrderOffer"})
    @POST("router/rest")
    Single<OpenApiResult<ResponseQuote>> getQuote(@Body RequestGetQuote requestGetQuote);

    /**
     * 删除订单
     */
    @Headers({"method:order_deleteOrder"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> deleteOrder(@Body RequestDeleteOrder requestDeleteOrder);

    /**
     * 删除扫码订单
     */
    @Headers({"method:scanning_deleteOrder"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> deleteScannerOrder(@Body RequestDeleteSannerOeder requestDeleteSannerOeder);


    /**
     * 检查违禁品
     */
    @Headers({"method:order_checkContraband"})
    @POST("router/rest")
    Single<OpenApiResult<OrderContrabandBean>> checkContraband(@Body RequestCheckContraband requestCheckContraband);

    /**
     * 实名认证
     */
    @Headers({"method:order_idCardRegistration"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> nameCertification(@Body RequestNameCertification requestNameCertification);

    /**
     * 验证是否需要实名认证
     */
    @Headers({"method:order_validationType"})
    @POST("router/rest")
    Single<OpenApiResult<OrderValidationNameCertificationBean>> validationNameCertification(@Body RequestUser requestUser);

    /**
     * 通知服务器 已点击下次验证实名认证
     * @param requestUser
     * @return
     */
    @Headers({"method:order_cancelRecord"})
    @POST("router/rest")
    Single<OpenApiResult<ValidationNameReponseBean>> setValidationNameCertionfication(@Body RequestUser requestUser);

    /**
     * 根据客户编码判断当前时间能否进入下单模块接口
     */
    @Headers({"method:order_checkOrderForCurrentTime"})
    @POST("router/rest")
    Single<OpenApiResult<CheckOrderCurrentTimeResponse>> checkOrderForCurrentTime(@Body CheckOrderCurrentTimeRequest request);

    /**
     * 自动带出客户编码及密码
     * @param requestGetCustomerInfoBean
     * @return
     */
    @Headers({"method:my_getCustomerInfoAutomatic"})
    @POST("router/rest")
    Single<OpenApiResult<GetCustomerInfoResultBean>> getCustomerInfo(@Body RequestGetCustomerInfoBean requestGetCustomerInfoBean);


}
