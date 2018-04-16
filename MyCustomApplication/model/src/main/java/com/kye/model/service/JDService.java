package com.kye.model.service;

import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.RequestPage;
import com.kye.model.bean.jd.address.JDAddressBean;
import com.kye.model.bean.jd.address.request.RequestAddModifyAddress;
import com.kye.model.bean.jd.address.request.RequestDeleteAddress;
import com.kye.model.bean.jd.address.request.RequestJDAddress;
import com.kye.model.bean.jd.address.request.RequestSetDefaultAddress;
import com.kye.model.bean.jd.after_sale.JDReturnModesResultBean;
import com.kye.model.bean.jd.after_sale.RequestGoodsReturnModes;
import com.kye.model.bean.jd.goods_detail.JDCheckGoodsAvailableResultBean;
import com.kye.model.bean.jd.goods_detail.JDGoodsDetailInfoBean;
import com.kye.model.bean.jd.goods_detail.RequestJDCheckGoodsAvailable;
import com.kye.model.bean.jd.goods_detail.RequestJDGoodsDetail;
import com.kye.model.bean.jd.order_details.JDCheckGoodsAfterSaleBean;
import com.kye.model.bean.jd.order_details.JDGoodsAfterSaleTypeBean;
import com.kye.model.bean.jd.order_details.JDOrderRouterInfoResultDataBean;
import com.kye.model.bean.jd.order_details.request.RequestCheckGoodsAfterSale;
import com.kye.model.bean.jd.order_details.request.RequestGoodsAfterSaleTypes;
import com.kye.model.bean.jd.order_details.request.RequestGooodsExchange;
import com.kye.model.bean.jd.order_details.request.RequestGooodsPreserve;
import com.kye.model.bean.jd.order_details.request.RequestJDOrderRouterInfo;
import com.kye.model.bean.jd.shop.JDCheckConsumeAvailableResultBean;
import com.kye.model.bean.jd.shop.JDCheckUploadAddressAvailableResultBean;
import com.kye.model.bean.jd.shop.JDGoodsCategoryBean;
import com.kye.model.bean.jd.shop.JDGoodsListResultBean;
import com.kye.model.bean.jd.shop.request.RequestJDCheckConsumeAvailable;
import com.kye.model.bean.jd.shop.request.RequestJDCheckUploadAddressAvailable;
import com.kye.model.bean.jd.shop.request.RequestJDGoodsCategories;
import com.kye.model.bean.jd.shop.request.RequestJDGoodsList;
import com.kye.model.bean.jd_reservation.JDReservationBean;
import com.kye.model.bean.jd_reservation.JDWaybillsBean;
import com.kye.model.bean.jd_reservation.request.RequestAddUpdateJD;
import com.kye.model.bean.jd_reservation.request.RequestGetJDWaybill;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     京东相关服务
 */

public interface JDService {

    /**
     * 查询京东路由信息接口 (V1.0)
     * @param requestJDOrderRouterInfo
     * @return
     */
    @Headers({"method:jd_showRoute"})
    @POST("router/rest")
    Single<OpenApiResult<JDOrderRouterInfoResultDataBean>> getJDOrderRouterInfo(@Body RequestJDOrderRouterInfo requestJDOrderRouterInfo);


    /**
     * 商品类别查询接口 (V1.0)
     * @param requestJDGoodsCategories
     * @return
     */
    @Headers({"method:jd_showGoodsType"})
    @POST("router/rest")
    Single<OpenApiResult<List<JDGoodsCategoryBean>>> getJDGoodsCategories(@Body RequestJDGoodsCategories requestJDGoodsCategories);

    /**
     * 商品首页推荐接口 (V1.0)
     * @param requestJDGoodsList
     * @return
     */
    @Headers({"method:jd_goodsHomepage"})
    @POST("router/rest")
    Single<OpenApiResult<JDGoodsListResultBean>> getJDGoodsList(@Body RequestJDGoodsList requestJDGoodsList);

    /**
     * 京东兑换历史地址查询接口接口 (V1.0)
     * @param requestJDAddress
     * @return
     */
    @Headers({"method:jd_showAddress"})
    @POST("router/rest")
    Single<OpenApiResult<List<JDAddressBean>>> getJDShowAddress(@Body RequestJDAddress requestJDAddress);

    /**
     * 获取商品详情接口 (V1.0)
     * @param requestJDGoodsDetail
     * @return
     */
    @Headers({"method:jd_goodsDetails"})
    @POST("router/rest")
    Single<OpenApiResult<JDGoodsDetailInfoBean>> getJDGoodsDetail(@Body RequestJDGoodsDetail requestJDGoodsDetail);

    /**
     * 京东下单前核对京东是否有货接口 (V1.0)
     * @param requestJDCheckGoodsAvailable
     * @return
     */
    @Headers({"method:jd_checkGoods"})
    @POST("router/rest")
    Single<OpenApiResult<JDCheckGoodsAvailableResultBean>> checkGoodsAvailable(@Body RequestJDCheckGoodsAvailable requestJDCheckGoodsAvailable);

    /**
     * 判断能否消费接口 (V1.0)
     * @param requestJDCheckConsumeAvailable
     * @return
     */
    @Headers({"method:exchange_judgeConsumption"}) // jd_judgeConsumption
    @POST("router/rest")
    Single<OpenApiResult<JDCheckConsumeAvailableResultBean>> checkConsumeAvailable(@Body RequestJDCheckConsumeAvailable requestJDCheckConsumeAvailable);

    /**
     * 判断是否上传通讯录接口 (V1.0)
     * @param requestJDCheckUploadAddressAvailable
     * @return
     */
    @Headers({"method:exchange_judgeUploadAddress"}) // jd_judgeUploadAddress
    @POST("router/rest")
    Single<OpenApiResult<JDCheckUploadAddressAvailableResultBean>> checkUploadAddressAvailable(@Body RequestJDCheckUploadAddressAvailable requestJDCheckUploadAddressAvailable);

    /**
     * 京东兑换历史地址删除接口 (V1.0)
     * @param requestDeleteAddress
     * @return
     */
    @Headers({"method:jd_deleteAddress"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> deleteAddress(@Body RequestDeleteAddress requestDeleteAddress);

    /**
     * 设置京东兑换历史默认地址接口 (V1.0)
     * @param requestSetDefaultAddress
     * @return
     */
    @Headers({"method:jd_settingAddress"})
    @POST("router/rest")
    Single<OpenApiResult<String>> setDefaultAddress(@Body RequestSetDefaultAddress requestSetDefaultAddress);

    /**
     * 新增和编辑京东后台地址 (V1.0)
     * @param requestAddModifyAddress
     * @return
     */
    @Headers({"method:jd_addModifyAddress"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> addModifyAddress(@Body RequestAddModifyAddress requestAddModifyAddress);

    /**
     * 京东新时效匹配运单号接口 (V1.0)
     */
    @Headers({"method:jd_queryJd"})
    @POST("router/rest")
    Single<OpenApiResult<JDReservationBean>> getJDList(@Body RequestPage requestPage);

    /**
     * 京东新时效匹配运单号接口 (V1.0)
     */
    @Headers({"method:jd_getJDWaybillByAging"})
    @POST("router/rest")
    Single<OpenApiResult<JDWaybillsBean>> getJDWaybills(@Body RequestGetJDWaybill requestGetJDWaybill);

    /**
     * 京东新时效新增修改接口 (V1.0)
     *  operationType 操作类型(1 新增 2修改)
     *   billId 单据ID(operationType = 2时 需要输入正确有效的值)
     */
    @Headers({"method:jd_addUpdateJD"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> addUpdateJD(@Body RequestAddUpdateJD requestAddUpdateJD);
    // todo : 积分售后退货相关接口

    /**
     * 校验商品是否可以提交售后接口 (V1.0)
     * @param requestCheckGoodsAfterSale
     * @return
     */
    @Headers({"method:jd_checkGoodsAfterSale"})
    @POST("router/rest")
    Single<OpenApiResult<JDCheckGoodsAfterSaleBean>> checkGoodsAfterSale(@Body RequestCheckGoodsAfterSale requestCheckGoodsAfterSale);

    /**
     * 退货支持的服务类型接口 (V1.0)
     * @param requestGoodsAfterSaleTypes
     * @return
     */
    @Headers({"method:jd_serviceType"})
    @POST("router/rest")
    Single<OpenApiResult<List<JDGoodsAfterSaleTypeBean>>> getGoodsAfterSaleTypes(@Body RequestGoodsAfterSaleTypes requestGoodsAfterSaleTypes);

    /**
     * 返回京东服务方式接口 (V1.0)
     * @param requestGoodsReturnModes
     * @return
     */
    @Headers({"method:jd_returnMode"})
    @POST("router/rest")
    Single<OpenApiResult<JDReturnModesResultBean>> getGoodsReturnModes(@Body RequestGoodsReturnModes requestGoodsReturnModes);

    /**
     * todo :
     * 服务单保存申请(京东退货)接口 (V1.0)
     * @param requestGooodsPreserve
     * @return
     */
    @Headers({"method:jd_applyPreservation"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> applyGooodsPreserve(@Body RequestGooodsPreserve requestGooodsPreserve);

    // todo : 京东兑换下单

    @Headers({"method:jd_exchange"})
    @POST("router/rest")
    Single<OpenApiResult<Object>> applyGooodsExchange(@Body RequestGooodsExchange requestGooodsExchange);

}
