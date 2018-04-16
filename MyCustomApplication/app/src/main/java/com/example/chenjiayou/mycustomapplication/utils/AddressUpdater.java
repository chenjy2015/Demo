package com.example.chenjiayou.mycustomapplication.utils;

import com.kye.addrpicker.db.DBManager;
import com.kye.addrpicker.model.City;
import com.kye.express.App;
import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.address.AddressUpdateBean;
import com.kye.model.bean.address.request.RequestAddressAndLatticePoint;
import com.kye.model.service.AddressService;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * get address info and save to local db.
 */

public class AddressUpdater {

    public static void update() {
        // 1. get timestamp 2.get data 3.update db, save timestamp
        String timestamp = DBManager.getTimeStamp(App.getInstance());

        AddressService addressService = RetrofitManager.getInstance().createOpenApiService(AddressService.class);
        RequestAddressAndLatticePoint requestAddressAndLatticePoint = new RequestAddressAndLatticePoint();
        requestAddressAndLatticePoint.setTimestamp(timestamp);
        addressService.login_getAddressAndLatticePoint(requestAddressAndLatticePoint)
                      .subscribeOn(Schedulers.io())
              .subscribe(new SingleObserver<OpenApiResult<AddressUpdateBean>>() {
                  @Override
                  public void onSubscribe(Disposable d) {

                  }

                  @Override
                  public void onSuccess(OpenApiResult<AddressUpdateBean> result) {
                      List<AddressUpdateBean.AllCitiesBean> allCities = result.getData().getAllCities();
                      if (allCities == null || allCities.size() == 0) return;

                      List<City> cities = convert(allCities);
                      DBManager dbManager = DBManager.getInstance(App.getInstance());
                      dbManager.updateCities(cities, result.getData().getTimestamp());
                  }

                  @Override
                  public void onError(Throwable e) {
                      // ignore
                  }
              });
    }

    private static List<City> convert(List<AddressUpdateBean.AllCitiesBean> allCitiesBeans) {
        List<City> result = new ArrayList<>();
        for (AddressUpdateBean.AllCitiesBean bean : allCitiesBeans) {
            result.add(new City(bean.getUniqueID(), bean.getFullName(), bean.getFullPY(), bean.getStartPY(), bean.getParentID(), bean
                    .getLevelType()
                    , bean.getStatus(), bean.getFlag(), bean.getDotMark(), bean.getAllFlag()));
        }
        return result;
    }
}
