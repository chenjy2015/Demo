package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.jd.address.JDAddressBean;
import com.kye.model.bean.jd.address.request.RequestAddModifyAddress;
import com.kye.model.bean.jd.address.request.RequestDeleteAddress;
import com.kye.model.bean.jd.address.request.RequestJDAddress;
import com.kye.model.bean.jd.address.request.RequestSetDefaultAddress;
import com.kye.model.bean.jd.goods_detail.JDCheckGoodsAvailableResultBean;
import com.kye.model.bean.jd.goods_detail.JDGoodsDetailInfoBean;
import com.kye.model.bean.jd.goods_detail.RequestJDCheckGoodsAvailable;
import com.kye.model.bean.jd.goods_detail.RequestJDGoodsDetail;
import com.kye.model.bean.jd.order_details.JDOrderRouterInfoResultDataBean;
import com.kye.model.bean.jd.order_details.request.RequestGooodsExchange;
import com.kye.model.bean.jd.order_details.request.RequestJDOrderRouterInfo;
import com.kye.model.bean.jd.shop.JDCheckConsumeAvailableResultBean;
import com.kye.model.bean.jd.shop.JDCheckUploadAddressAvailableResultBean;
import com.kye.model.bean.jd.shop.JDGoodsCategoryBean;
import com.kye.model.bean.jd.shop.JDGoodsListResultBean;
import com.kye.model.bean.jd.shop.request.RequestJDCheckConsumeAvailable;
import com.kye.model.bean.jd.shop.request.RequestJDCheckUploadAddressAvailable;
import com.kye.model.bean.jd.shop.request.RequestJDGoodsCategories;
import com.kye.model.bean.jd.shop.request.RequestJDGoodsList;
import com.kye.model.service.JDService;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 27/01/2018
 * @updated : 27/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class JDShopDataSource {

    private JDService jdService;

    public JDShopDataSource() {
        jdService = RetrofitManager.getInstance().createOpenApiService(JDService.class);
    }

    public Single<OpenApiResult<JDOrderRouterInfoResultDataBean>> getJDOrderRouterInfo(@Body RequestJDOrderRouterInfo requestJDOrderRouterInfo) {
        return jdService.getJDOrderRouterInfo(requestJDOrderRouterInfo);
    }

    public Single<OpenApiResult<List<JDGoodsCategoryBean>>> getJDGoodsCategories(@Body RequestJDGoodsCategories requestJDGoodsCategories) {
        return jdService.getJDGoodsCategories(requestJDGoodsCategories);
    }

    public Single<OpenApiResult<JDGoodsListResultBean>> getJDGoodsList(@Body RequestJDGoodsList requestJDGoodsList) {
        return jdService.getJDGoodsList(requestJDGoodsList);
    }

    public Single<OpenApiResult<List<JDAddressBean>>> getJDShowAddress(@Body RequestJDAddress requestJDAddress) {
        return jdService.getJDShowAddress(requestJDAddress);
    }

    public Single<OpenApiResult<JDGoodsDetailInfoBean>> getJDGoodsDetail(@Body RequestJDGoodsDetail requestJDGoodsDetail) {
        return jdService.getJDGoodsDetail(requestJDGoodsDetail);
    }

    public Single<OpenApiResult<JDCheckGoodsAvailableResultBean>> checkGoodsAvailable(@Body RequestJDCheckGoodsAvailable requestJDCheckGoodsAvailable) {
        return jdService.checkGoodsAvailable(requestJDCheckGoodsAvailable);
    }

    public Single<OpenApiResult<JDCheckConsumeAvailableResultBean>> checkConsumeAvailable(@Body RequestJDCheckConsumeAvailable requestJDCheckConsumeAvailable) {
        return jdService.checkConsumeAvailable(requestJDCheckConsumeAvailable);
    }

    public Single<OpenApiResult<JDCheckUploadAddressAvailableResultBean>> checkUploadAddressAvailable(@Body RequestJDCheckUploadAddressAvailable requestJDCheckUploadAddressAvailable) {
        return jdService.checkUploadAddressAvailable(requestJDCheckUploadAddressAvailable);
    }

    public Single<OpenApiResult<Object>> deleteAddress(@Body RequestDeleteAddress requestDeleteAddress) {
        return jdService.deleteAddress(requestDeleteAddress);
    }

    public Single<OpenApiResult<String>> setDefaultAddress(@Body RequestSetDefaultAddress requestSetDefaultAddress) {
        return jdService.setDefaultAddress(requestSetDefaultAddress);
    }

    public Single<OpenApiResult<Object>> addModifyAddress(@Body RequestAddModifyAddress requestAddModifyAddress) {
        return jdService.addModifyAddress(requestAddModifyAddress);
    }

    public Single<OpenApiResult<Object>> applyGooodsExchange(@Body RequestGooodsExchange requestGooodsExchange) {
        return jdService.applyGooodsExchange(requestGooodsExchange);
    }
}
