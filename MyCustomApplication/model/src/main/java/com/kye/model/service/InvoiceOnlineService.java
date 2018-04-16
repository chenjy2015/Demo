package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.freight_rates_query.GetCustomerInfoResultBean;
import com.kye.model.bean.freight_rates_query.PermissionQueryCostResultBean;
import com.kye.model.bean.freight_rates_query.QueryAreaByCustomerCodeResultBean;
import com.kye.model.bean.freight_rates_query.QueryBillingMethodResultBean;
import com.kye.model.bean.freight_rates_query.QueryCostResultBean;
import com.kye.model.bean.freight_rates_query.QueryWaybillCostResultBean;
import com.kye.model.bean.freight_rates_query.RequestGetCustomerInfoBean;
import com.kye.model.bean.freight_rates_query.RequestPermissionQueryCostBean;
import com.kye.model.bean.freight_rates_query.RequestQueryAreaByCustomerCodeBean;
import com.kye.model.bean.freight_rates_query.RequestQueryBillingMethodBean;
import com.kye.model.bean.freight_rates_query.RequestQueryCostBean;
import com.kye.model.bean.freight_rates_query.RequestQueryWaybillCostBean;
import com.kye.model.bean.invoice_online.ElectronicInvoiceResultBean;
import com.kye.model.bean.invoice_online.FindInvoicingRecordsResultBean;
import com.kye.model.bean.invoice_online.GeneratedInvoiceDataResultBean;
import com.kye.model.bean.invoice_online.GetInvoiceDetailResultBean;
import com.kye.model.bean.invoice_online.GetInvoicedListResultBean;
import com.kye.model.bean.invoice_online.InvoiceQueryBillingInformation;
import com.kye.model.bean.invoice_online.InvoiceQueryBillingInformationResultBean;
import com.kye.model.bean.invoice_online.MailInvoiceResultBean;
import com.kye.model.bean.invoice_online.RequestBillGrantApplicationBean;
import com.kye.model.bean.invoice_online.RequestElectronicInvoiceBean;
import com.kye.model.bean.invoice_online.RequestFindInvoicingRecordsBean;
import com.kye.model.bean.invoice_online.RequestFindWaybillAmountBean;
import com.kye.model.bean.invoice_online.RequestGeneratedInvoiceDataBean;
import com.kye.model.bean.invoice_online.RequestGetInvoiceDetailBean;
import com.kye.model.bean.invoice_online.RequestGetInvoicedListBean;
import com.kye.model.bean.invoice_online.RequestMailInvoiceBean;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface InvoiceOnlineService {

    @Headers({"method:invoice_getInvoicedListData"})
    @POST("router/rest")
    Single<OpenApiResult<List<GetInvoicedListResultBean>>> getInvoicedListData(@Body RequestGetInvoicedListBean requestGetInvoicedListBean);

    @Headers({"method:invoice_findWaybillAmount"})
    @POST("router/rest")
    Single<OpenApiResult<List<GetInvoicedListResultBean>>> findWaybillAmount(@Body RequestFindWaybillAmountBean requestFindWaybillAmountBean);

    @Headers({"method:invoice_generatedData"})
    @POST("router/rest")
    Single<OpenApiResult<List<GeneratedInvoiceDataResultBean>>> generatedData(@Body RequestGeneratedInvoiceDataBean requestGeneratedInvoiceDataBean);

    @Headers({"method:invoice_electronicInvoice"})
    @POST("router/rest")
    Single<OpenApiResult<List<ElectronicInvoiceResultBean>>> electronicInvoice(@Body RequestElectronicInvoiceBean requestElectronicInvoiceBean);

    @Headers({"method:invoice_billingDetails"})
    @POST("router/rest")
    Single<OpenApiResult<GetInvoiceDetailResultBean>> billingDetails(@Body RequestGetInvoiceDetailBean requestGetInvoiceDetailBean);

    @Headers({"method:invoice_findInvoicingRecords"})
    @POST("router/rest")
    Single<OpenApiResult<List<FindInvoicingRecordsResultBean>>> findInvoicingRecords(@Body RequestFindInvoicingRecordsBean requestFindInvoicingRecordsBean);

    @Headers({"method:invoice_mailDelivery"})
    @POST("router/rest")
    Single<OpenApiResult<MailInvoiceResultBean>> mailInvoice(@Body RequestMailInvoiceBean requestMailInvoiceBean);

    @Headers({"method:invoice_billGrantApplication"})
    @POST("router/rest")
    Single<OpenApiResult<String>> billGrantApplication(@Body RequestBillGrantApplicationBean requestBillGrantApplicationBean);

    /**
     * 开票信息查询接口
     * @param invoiceQueryBillingInformation
     * @return
     */
    @Headers({"method:invoice_queryBillingInformation"})
    @POST("router/rest")
    Single<OpenApiResult<List<InvoiceQueryBillingInformationResultBean>>> invoiceQueryBillingInformation(@Body InvoiceQueryBillingInformation
                                                                                                            invoiceQueryBillingInformation);
}
