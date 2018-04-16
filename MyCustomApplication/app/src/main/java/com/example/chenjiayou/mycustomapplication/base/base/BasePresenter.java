package com.example.chenjiayou.mycustomapplication.base.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.kye.base.Logger;
import com.kye.express.contract.base.view.RxView;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;

public abstract class BasePresenter<V extends RxView> {

    private V mView;
    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    public void bind(V view) {
        mView = view;

        if (view != null) {
            Observable.never()
                    .compose(view.bindToLifecycleDestroy())
                    .doOnTerminate(new Action() {
                        @Override
                        public void run() throws Exception {
                            unbind();
                        }
                    })
                    .subscribe();
        }
    }

    public void unbind() {
        mView = null;
        try {
            mCompositeDisposable.clear();
        } catch (Throwable throwable) {
            Logger.d("mCompositeDisposable.clear() exception : " + throwable.getMessage());
        }
    }

    public V getView() {
        return mView;
    }

    public void addDisposable(Disposable disposable) {
        mCompositeDisposable.add(disposable);
    }

    public void disposables() {
        mCompositeDisposable.clear();
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {

    }

    public void onSaveInstanceState(Bundle outState) {

    }

}
