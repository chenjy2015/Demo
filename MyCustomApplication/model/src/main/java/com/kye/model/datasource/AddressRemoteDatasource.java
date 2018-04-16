package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.address.AddressBean;
import com.kye.model.bean.address.request.RequestAddressCity;
import com.kye.model.bean.address.request.RequestAddressCountry;
import com.kye.model.bean.address.request.RequestAddressProvince;
import com.kye.model.bean.address.request.RequestAddressTown;
import com.kye.model.gson_adapter.ApiException;
import com.kye.model.service.AddressService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 31/01/2018
 * @updated : 31/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class AddressRemoteDatasource {

    private AddressService addressService;

    public AddressRemoteDatasource() {
        this.addressService = RetrofitManager.getInstance().createOpenApiService(AddressService.class);
    }

    public SingleTransformer<OpenApiResult<TreeMap<String, Integer>>, List<AddressBean>> getTransformer() {
        return new SingleTransformer<OpenApiResult<TreeMap<String, Integer>>, List<AddressBean>>() {
            @Override
            public SingleSource<List<AddressBean>> apply(Single<OpenApiResult<TreeMap<String, Integer>>> upstream) {
                return upstream
                        .doOnSuccess(new Consumer<OpenApiResult<TreeMap<String, Integer>>>() {
                            @Override
                            public void accept(OpenApiResult<TreeMap<String, Integer>> treeMapOpenApiResult) throws Exception {
                                if (!treeMapOpenApiResult.isSuccess()) {
                                    throw new ApiException(treeMapOpenApiResult);
                                }
                            }
                        })
                        .flatMap(new Function<OpenApiResult<TreeMap<String, Integer>>, SingleSource<TreeMap<String, Integer>>>() {
                            @Override
                            public SingleSource<TreeMap<String, Integer>> apply(OpenApiResult<TreeMap<String, Integer>> treeMapOpenApiResult) throws Exception {
                                return Single.just(treeMapOpenApiResult.getData());
                            }
                        })
                        .flatMap(new Function<TreeMap<String, Integer>, Single<List<AddressBean>>>() {
                            @Override
                            public Single<List<AddressBean>> apply(TreeMap<String, Integer> stringIntegerTreeMap) throws Exception {
                                List<AddressBean> addressBeans = new ArrayList<>();
                                Set<String> keys = stringIntegerTreeMap.keySet();
                                for (String key : keys) {
                                    AddressBean addressBean = new AddressBean();
                                    addressBean.setId(stringIntegerTreeMap.get(key));
                                    addressBean.setName(key);
                                    addressBeans.add(addressBean);
                                }
                                return Single.just(addressBeans);
                            }
                        });
            }
        };
    }

    public SingleTransformer<OpenApiResult<TreeMap<String, TreeMap<String, Integer>>>, List<AddressBean>> getTransformerNew() {
        return new SingleTransformer<OpenApiResult<TreeMap<String, TreeMap<String, Integer>>>, List<AddressBean>>() {
            @Override
            public SingleSource<List<AddressBean>> apply(Single<OpenApiResult<TreeMap<String, TreeMap<String, Integer>>>> upstream) {
                return upstream
                        .map(new Function<OpenApiResult<TreeMap<String, TreeMap<String, Integer>>>, List<AddressBean>>() {
                            @Override
                            public List<AddressBean> apply(OpenApiResult<TreeMap<String, TreeMap<String, Integer>>> treeMapOpenApiResult) throws Exception {
                                List<AddressBean> addressBeans = new ArrayList<>();
                                TreeMap<String, TreeMap<String, Integer>> data = treeMapOpenApiResult.getData();
                                Set<String> letters = data.keySet();
                                for (String letter : letters) {
                                    TreeMap<String, Integer> addressInfos = treeMapOpenApiResult.getData().get(letter);
                                    Set<Map.Entry<String, Integer>> entries = addressInfos.entrySet();
                                    for (Map.Entry<String, Integer> entry : entries) {
                                        AddressBean addressBean = new AddressBean();
                                        addressBean.setFirstLetter(letter.charAt(0));
                                        addressBean.setName(entry.getKey());
                                        addressBean.setId(entry.getValue());
                                        addressBeans.add(addressBean);
                                    }
                                }
                                return addressBeans;
                            }
                        });
            }
        };
    }

    public Single<List<AddressBean>> getProvince(RequestAddressProvince requestProvince) {
        return this.addressService
                .getProvince(requestProvince)
                .compose(getTransformerNew());
    }

    public Single<List<AddressBean>> getCity(RequestAddressCity requestCity) {
        return this.addressService
                .getCity(requestCity)
                .compose(getTransformerNew());
    }

    public Single<List<AddressBean>> getCountry(RequestAddressCountry requestCountry) {
        return this.addressService
                .getCountry(requestCountry)
                .compose(getTransformerNew());
    }

    public Single<List<AddressBean>> getTown(RequestAddressTown requestTown) {
        return this.addressService
                .getTown(requestTown)
                .compose(getTransformerNew());
    }

}
