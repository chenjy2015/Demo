package com.example.chenjiayou.mycustomapplication.base.observer;

import com.kye.express.contract.base.base.BasePresenter;
import com.kye.model.OpenApiResultObserver;

import io.reactivex.disposables.Disposable;

public abstract class LifecycleOpenApiResultObserver<T> extends OpenApiResultObserver<T> {

    private final BasePresenter mPresenter;

    public LifecycleOpenApiResultObserver(BasePresenter basePresenter) {
        mPresenter = basePresenter;
    }

    @Override
    public final void onLoading(Disposable d) {
        if (mPresenter != null) mPresenter.addDisposable(d);
        onStart(d);
    }

    public abstract void onStart(Disposable d);
}
