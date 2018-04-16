package com.example.chenjiayou.mycustomapplication.base.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface RefreshListView<T> {
    void onLoading(int pageIndex, boolean hasData);

    void onLoadData(T t, int pageIndex, boolean hasData);

    void onApiError(int pageIndex, boolean hasData, String msg);

    void onError(int pageIndex, boolean hasData);

    void onLoaded(int pageIndex, boolean hasData);

    class Controller {

        public interface Listener {

            void onRefresh();

            void onLoading();

            void onLoadMore();

            void onEnableLoadMore(boolean b);

            void onShowEmptyView();

            void onSetItems(List items, List newItems);

            void onShowErrorServerView();

            void onApiError(String msg);

            void onShowErrorNetworkView();

            void onError();

            void onFinishRefresh();

            void onShowContentView();

            void onFinishLoadMore();
        }
        private Listener mListener;

        public Listener getListener() {
            return mListener;
        }

        public void setListener(Listener listener) {
            mListener = listener;
        }

        public void onLoaded(int pageIndex, boolean hasData) {
            if (mListener == null) return;

            if (pageIndex <= 1) {
                if (hasData) {
                    mListener.onFinishRefresh();
                } else {
                    mListener.onShowContentView();
                }
            } else {
                mListener.onFinishLoadMore();
            }
        }

        public void onError(int pageIndex, boolean hasData) {
           if (mListener == null) return;

            if (pageIndex <= 1 && !hasData) mListener.onShowErrorNetworkView();

            mListener.onError();
        }

        public void onApiError(int pageIndex, boolean hasData, String msg) {
            if (mListener == null) return;

            if (pageIndex <= 1 && !hasData) mListener.onShowErrorServerView();

            mListener.onApiError(msg);
        }

        public void onLoadData(List datas, int pageIndex, boolean hasData, int pageSize, Collection adatperDatas) {
            if (mListener == null) return;

            mListener.onEnableLoadMore(!(datas != null && datas.size() < pageSize));

            if (pageIndex <= 1 && (datas == null || datas.isEmpty())) {
                mListener.onShowEmptyView();
            } else {
                List<Object> items = new ArrayList<>();
                if (pageIndex > 1) items.addAll(adatperDatas);
                if (datas != null) items.addAll(datas);
                mListener.onSetItems(items, datas);
            }
        }

        public void onLoading(int pageIndex, boolean hasData) {
            if (mListener == null) return;

            if (pageIndex <= 1) {
                if (hasData) {
                    mListener.onRefresh();
                } else {
                    mListener.onLoading();
                }
            } else if (pageIndex > 1) {
                mListener.onLoadMore();
            }
        }
    }
}
