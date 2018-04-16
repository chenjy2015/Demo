package com.kye.model.fake;

import android.os.SystemClock;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;


/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/12/2017
 * @updated : 19/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class FakeDataSource {

    private int pageMax = 1;
    private int pageCurrent = 1;

    public FakeDataSource(int pageMax) {
        this.pageMax = pageMax;
    }

    public int getPageMax() {
        return pageMax;
    }

    public void setPageMax(int pageMax) {
        this.pageMax = pageMax;
    }

    public void resetPage() {
        pageCurrent = 1;
    }

    public List<FakeData> getDatas() {
        if (pageCurrent <= pageMax) {
            int base = (int) (System.currentTimeMillis() % 10000);
            List<FakeData> dataList = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                dataList.add(new FakeData(i, "data : " + (base + i)));
            }
            return dataList;
        }
        return new ArrayList<>();
    }

    public List<FakeData> getDatas(int page) {
        SystemClock.sleep(1000);
        if (page <= pageMax) {
            int base = (int) (System.currentTimeMillis() % 10000);
            List<FakeData> dataList = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                dataList.add(new FakeData(i, "data : " + (base + i)));
            }
            return dataList;
        }
        return new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    public Observable<List<FakeData>> getFakeDataObservable(final int page) {
        return Observable.create(new ObservableOnSubscribe<List<FakeData>>() {
            @Override
            public void subscribe(ObservableEmitter<List<FakeData>> e) throws Exception {
                if (page >= 4) {
                    e.onError(new RuntimeException("服务器错误"));
                } else {
                    e.onNext(getDatas(page));
                    e.onComplete();
                }
            }
        });
    }
}
