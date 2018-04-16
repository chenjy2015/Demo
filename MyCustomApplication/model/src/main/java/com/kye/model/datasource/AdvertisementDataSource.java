package com.kye.model.datasource;

import com.google.gson.reflect.TypeToken;
import com.kye.base.utils.DateUtils;
import com.kye.model.BuildConfig;
import com.kye.model.SharedPreferencesConfig;
import com.kye.model.SharedPreferencesManager;
import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.advertisement.AdvertisementBean;
import com.kye.model.bean.advertisement.AdvertisementType;
import com.kye.model.service.AdvertisementService;

import java.util.Calendar;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 06/01/2018
 * @updated : 06/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class AdvertisementDataSource {

    private AdvertisementService service;
    public AdvertisementDataSource() {
        service = RetrofitManager.getInstance().createResourceService(AdvertisementService.class);
    }

    public Single<List<AdvertisementBean>> getAdvertisementList() {
        long timeStamp = DateUtils.getAdvertiseTimeStamp();
        return service.getAdvertisementList(BuildConfig.HOST_RES + "h5/advertisement.html?" + timeStamp);
    }

    public Single<List<AdvertisementBean>> getAdvertisementList(final AdvertisementType advertisementType) {
        long timeStamp = DateUtils.getAdvertiseTimeStamp();
        return service.getAdvertisementList(BuildConfig.HOST_RES + "h5/advertisement.html?" + timeStamp)
                .toObservable()
                .flatMap(new Function<List<AdvertisementBean>, ObservableSource<AdvertisementBean>>() {
                    @Override
                    public ObservableSource<AdvertisementBean> apply(List<AdvertisementBean> advertisementBeans) throws Exception {
                        return Observable.fromIterable(advertisementBeans);
                    }
                })
                .filter(new Predicate<AdvertisementBean>() {
                    @Override
                    public boolean test(AdvertisementBean advertisementBean) throws Exception {
                        return advertisementBean.getClassid() == advertisementType.getClassid();
                    }
                })
                .toList();
    }

    public Single<List<AdvertisementBean>> getAndSaveAdvertisementList() {
        return service.getAdvertisementList(BuildConfig.HOST_RES + "h5/advertisement.html?" + DateUtils.getAdvertiseTimeStamp())
                .toObservable()
                .flatMapIterable(new Function<List<AdvertisementBean>, Iterable<AdvertisementBean>>() {
                    @Override
                    public Iterable<AdvertisementBean> apply(List<AdvertisementBean> advertisementBeans) throws Exception {
                        return advertisementBeans;
                    }
                })
                .filter(new Predicate<AdvertisementBean>() {
                    @Override
                    public boolean test(AdvertisementBean advertisementBean) throws Exception {
                        int classid = advertisementBean.getClassid();
                        return classid == AdvertisementType.TYPE_AD_SPLASH.getClassid() ||
                                classid == AdvertisementType.TYPE_AD_BANNER_HOME.getClassid() ||
                                classid == AdvertisementType.TYPE_AD_POPUP_BIRTHDAY.getClassid() ||
                                classid == AdvertisementType.TYPE_AD_BANNER_WELFARE.getClassid();
                    }
                })
                .toList()
                .doOnSuccess(new Consumer<List<AdvertisementBean>>() {
                    @Override
                    public void accept(List<AdvertisementBean> advertisementBeans) throws Exception {
                        SharedPreferencesManager.commit(SharedPreferencesConfig.KEY_ADVERTISEMENT_LIST, advertisementBeans);
                    }
                });
    }

    public Observable<List<AdvertisementBean>> getAdvertisementListForRx() {
        return SharedPreferencesManager.getForRx(SharedPreferencesConfig.KEY_ADVERTISEMENT_LIST, new TypeToken<List<AdvertisementBean>>(){}.getType());
    }

    public Observable<List<AdvertisementBean>> getAdvertisementListForRx(final AdvertisementType advertisementType) {
        return getAdvertisementListForRx()
                .flatMap(new Function<List<AdvertisementBean>, ObservableSource<List<AdvertisementBean>>>() {
                    @Override
                    public ObservableSource<List<AdvertisementBean>> apply(List<AdvertisementBean> advertisementBeans) throws Exception {
                        return Observable.fromIterable(advertisementBeans)
                                .filter(new Predicate<AdvertisementBean>() {
                                    @Override
                                    public boolean test(AdvertisementBean advertisementBean) throws Exception {
                                        return advertisementBean.getClassid() == advertisementType.getClassid();
                                    }
                                })
                                .filter(new Predicate<AdvertisementBean>() {
                                    @Override
                                    public boolean test(AdvertisementBean advertisementBean) throws Exception {
                                        return isTimeShowSplashImage(advertisementBean);
                                    }
                                })
                                .toList()
                                .toObservable();
                    }
                });
    }

    private boolean isTimeShowSplashImage(AdvertisementBean adInfo) {
        //将系统时间呢转换成秒
        long startTime = DateUtils.getSimpleLongTime(adInfo.getStartDate());
        long endTime = DateUtils.getSimpleLongTime(adInfo.getEndDate());
        long currentTime = Calendar.getInstance().getTime().getTime();
        return currentTime < endTime && currentTime > startTime;
    }

//    public Single<OpenApiResult<List<AdvertisementBean>>> getAdvertisementListNew() {
//        return service.getAdvertisementList(new Object());
//    }
}
