package com.kye.model.datasource;

import com.kye.model.UserSession;
import com.kye.model.base.RetrofitManager;
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
import com.kye.model.bean.user.User;
import com.kye.model.service.OrderService;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import retrofit2.http.Body;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 15/01/2018
 * @updated : 15/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class OrderDataSource {

    private OrderService service;

    public OrderDataSource() {
        service = RetrofitManager.getInstance().createOpenApiService(OrderService.class);
    }

    public Single<OpenApiResult<OrderListResultBean>> getOrderList(RequestOrderList requestOrderList) {
        return service.getOrderList(requestOrderList);
    }

    // normal order
    public Single<OpenApiResult<OrderDetailResultBean>> getOrderDetail(RequestOrderDetail requestOrderDetail) {
        return service.getOrderDetail(requestOrderDetail);
    }

    // scan order
    public Single<OpenApiResult<OrderDetailResultBean>> getScanOrderDetail(RequestScanOrderDetail requestScanOrderDetail) {
        return service.getScanOrderDetail(requestScanOrderDetail);
    }

    public Single<OpenApiResult<List<OrderStatusBean>>> getOrderStatusProgress(RequestOrderStatusProgress requestOrderStatusProgress) {
        return service.getOrderStatusProgress(requestOrderStatusProgress);
    }

    public Single<OpenApiResult<DstanceBean>> getOrderDeliveryDstance(RequestOrderDeliveryDstance requestOrderDeliveryDstance) {
//        requestOrderDeliveryDstance.setPhone("18198953406");
//        requestOrderDeliveryDstance.setWaybill("XD1801-0034675");
        return service.getOrderDeliveryDstance(requestOrderDeliveryDstance);
    }

    public Single<OpenApiResult<List<OrderAddresses>>> getAddresses(RequestOrderAddresses requestOrderAddresses) {
        return service.getAddresses(requestOrderAddresses);
    }

    public Single<OpenApiResult<OrderIsCanAddBean>> checkIsCanAddAdress(RequestOrderAddresses requestOrderAddresses) {
        return service.checkIsCanAddAdress(requestOrderAddresses);
    }

    public Single<OpenApiResult<OrderAddOrderBean>> addOrder(RequestAddOrder requestAddOrder) {
        return service.addOrder(requestAddOrder);
    }

    public Single<OpenApiResult<OrderEditResultBean>> editOrder(RequestEditOrder requestEditOrder) {
        return service.editOrder(requestEditOrder);
    }

    public Single<OpenApiResult<Object>> deleteTempAddress(RequestDeleteTempAddress requestDeleteTempAddress) {
        return service.deleteTempAddress(requestDeleteTempAddress);
    }

    public Single<OpenApiResult<Object>> editTempAddress(RequestEditTempAddress requestEditTempAddress) {
        return service.editTempAddress(requestEditTempAddress);
    }

    public Single<OpenApiResult<Object>> addTempAddress(RequestEditTempAddress requestEditTempAddress) {
        return service.addTempAddress(requestEditTempAddress);
    }

    public Single<OpenApiResult<IsCanScanCodeToAddOrder>> isCanAddOrder(String customerCode, String waybill) {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<OpenApiResult<IsCanScanCodeToAddOrder>>>() {
                              @Override
                              public SingleSource<OpenApiResult<IsCanScanCodeToAddOrder>> apply(User user) throws Exception {
                                  return service.isCanAddOrder(new RequestIsCanAddOrder(customerCode, waybill, user.getPhone()));
                              }
                          });
    }

    public Single<OpenApiResult<List<ScanCodeOrderAddress>>> getScanCodeAddress() {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<OpenApiResult<List<ScanCodeOrderAddress>>>>() {
                              @Override
                              public SingleSource<OpenApiResult<List<ScanCodeOrderAddress>>> apply(User user) throws Exception {
                                  return service.getScanCodeAddress(new RequestUser(user.getPhone()));
                              }
                          });
    }

    public Single<OpenApiResult<ScanCodeAddOrderBean>> addScanCode(@Body RequestAddScanCode requestAddScanCode) {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<? extends OpenApiResult<ScanCodeAddOrderBean>>>() {
                              @Override
                              public SingleSource<? extends OpenApiResult<ScanCodeAddOrderBean>> apply(User user) throws Exception {
                                  requestAddScanCode.setPhone(user.getPhone());
                                  return service.addScanCode(requestAddScanCode);
                              }
                          });
    }

    public Single<OpenApiResult<Object>> modifyScanCode(@Body RequestAddScanCode requestAddScanCode) {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<? extends OpenApiResult<Object>>>() {
                              @Override
                              public SingleSource<? extends OpenApiResult<Object>> apply(User user) throws Exception {
                                  requestAddScanCode.setPhone(user.getPhone());
                                  return service.modifyScanCode(requestAddScanCode);
                              }
                          });
    }

    public Single<OpenApiResult<Object>> addScanCodeAddress(ScanCodeOrderAddress address) {
        return service.addScanCodeAddress(address);
    }

    public Single<OpenApiResult<Object>> modifyScanCodeAddress(ScanCodeOrderAddress address) {
        return service.modifyScanCodeAddress(address);
    }

    public Single<OpenApiResult<Object>> deleteScanCodeAddress(String guid) {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<? extends OpenApiResult<Object>>>() {
                              @Override
                              public SingleSource<OpenApiResult<Object>> apply(User user) throws Exception {
                                  return service.deleteScanCodeAddress(new RequestDeleteScanCodeAddress(user.getPhone(), guid));
                              }
                          });
    }

    public Single<OpenApiResult<ResponseQuote>> getQuote(RequestGetQuote requestGetQuote) {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<? extends OpenApiResult<ResponseQuote>>>() {
                              @Override
                              public SingleSource<? extends OpenApiResult<ResponseQuote>> apply(User user) throws Exception {
                                  requestGetQuote.setPhone(user.getPhone());
                                  return service.getQuote(requestGetQuote);
                              }
                          });
    }

    public Single<OpenApiResult<Object>> deleteOrder(RequestDeleteOrder requestDeleteOrder) {
        return service.deleteOrder(requestDeleteOrder);
    }

    public Single<OpenApiResult<Object>> deleteScannerOrder(RequestDeleteSannerOeder requestDeleteSannerOeder) {
        return service.deleteScannerOrder(requestDeleteSannerOeder);
    }

    public Single<OpenApiResult<OrderContrabandBean>> checkContraband(String goodsName) {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<? extends OpenApiResult<OrderContrabandBean>>>() {
                              @Override
                              public SingleSource<? extends OpenApiResult<OrderContrabandBean>> apply(User user) throws Exception {
                                  return service.checkContraband(new RequestCheckContraband(user.getPhone(), goodsName));
                              }
                          });
    }

    public Single<OpenApiResult<Object>> nameCertification(String name, String idCard, String certificateType) {
        return UserSession
                .getInstance()
                .getUserForRx()
                .firstOrError()
                .flatMap(new Function<User, SingleSource<? extends OpenApiResult<Object>>>() {
                    @Override
                    public SingleSource<? extends OpenApiResult<Object>> apply(User user) throws Exception {
                        return service.nameCertification(new RequestNameCertification(user.getPhone(), name, idCard, certificateType));
                    }
                });
    }

    public Single<OpenApiResult<OrderValidationNameCertificationBean>> checkNameCertification() {
        return UserSession
                .getInstance()
                .getUserForRx()
                .firstOrError()
                .flatMap(new Function<User, SingleSource<? extends OpenApiResult<OrderValidationNameCertificationBean>>>() {
                    @Override
                    public SingleSource<? extends OpenApiResult<OrderValidationNameCertificationBean>> apply(User user) throws Exception {
                        return service.validationNameCertification(new RequestUser(user.getPhone()));
                    }
                });
    }

    public Single<OpenApiResult<ValidationNameReponseBean>> setNameCertification() {
        return UserSession
                .getInstance()
                .getUserForRx()
                .firstOrError()
                .flatMap(new Function<User, SingleSource<? extends OpenApiResult<ValidationNameReponseBean>>>() {
                    @Override
                    public SingleSource<? extends OpenApiResult<ValidationNameReponseBean>> apply(User user) throws Exception {
                        return service.setValidationNameCertionfication(new RequestUser(user.getPhone()));
                    }
                });
    }

    public Single<OpenApiResult<CheckOrderCurrentTimeResponse>> checkOrderForCurrentTime(String goodTime, String
            type, String orderCode) {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<OpenApiResult<CheckOrderCurrentTimeResponse>>>() {
                              @Override
                              public SingleSource<OpenApiResult<CheckOrderCurrentTimeResponse>> apply(User user) throws Exception {
                                  return service.checkOrderForCurrentTime(
                                          new CheckOrderCurrentTimeRequest(user.getCustomCode(), goodTime, user.getUserName(), type, orderCode));
                              }
                          });
//        return service.checkOrderForCurrentTime(new CheckOrderCurrentTimeRequest(companyCode, goodTime, orderMan, type,
//                                                                                                           orderCode));
    }

    public Single<OpenApiResult<GetCustomerInfoResultBean>> getCompanyCode() {
        return UserSession.getInstance()
                          .getUserForRx()
                          .firstOrError()
                          .flatMap(new Function<User, SingleSource<OpenApiResult<GetCustomerInfoResultBean>>>() {
                              @Override
                              public SingleSource<OpenApiResult<GetCustomerInfoResultBean>> apply(User user) throws Exception {
                                  return service.getCustomerInfo(new RequestGetCustomerInfoBean(user.getPhone()));
                              }
                          });
    }
}
