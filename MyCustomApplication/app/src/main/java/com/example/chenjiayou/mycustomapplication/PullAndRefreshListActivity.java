package com.example.chenjiayou.mycustomapplication;

import android.widget.ArrayAdapter;

import com.android.volley.NoConnectionError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.example.base.ui.BaseCompatActivity;
import com.example.base.utils.StringUtils;
import com.example.pullrefreshlistview.PtrFrameLayout;
import com.example.pullrefreshlistview.refresh_and_load_more.RefreshAndLoadListView;

import java.util.ArrayList;

/**
 * createBy：chenjiayou
 * on: 2018/3/6 15:20
 * descript: 下拉刷新测试页
 */
public class PullAndRefreshListActivity extends BaseCompatActivity {

    RefreshAndLoadListView mRefreshListView;
    int mPageIndex = 1;
    int mPageSize = 20;
    ArrayList<String> mDatas = new ArrayList<String>();
    ArrayAdapter mArrayAdapter;

    @Override
    public int setView() {
        return R.layout.activity_pull_and_refresh_list;
    }

    @Override
    public void initView() {
        mRefreshListView = findViewById(R.id.refresh_list);
    }

    @Override
    public void init() {
        mRefreshListView.setMinItemCount(15);
    }

    @Override
    public void initEvent() {
        mRefreshListView.setOnCallBack(new RefreshAndLoadListView.OnCallBack() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                mPageIndex = 1;
                loadData();
            }

            @Override
            public void onLoadMoreBegin() {
                mPageIndex++;
                loadData();
            }
        });
    }

    @Override
    public void initData() {
        loadData();
    }

    public void loadData() {
        if (mPageIndex == 1) {
            mDatas.clear();
        }
        ArrayList<String> tempList = new ArrayList<String>();
        for (int i = mDatas.size(); i < mPageSize * mPageIndex; i++) {
            tempList.add("" + i);
        }
        mDatas.addAll(tempList);
        if (mDatas.size() < 1) {
            mRefreshListView.setLoadMore(false, 0);
            mRefreshListView.setMode(RefreshAndLoadListView.Modes.REFRESH);
        } else {
            mRefreshListView.setMode(RefreshAndLoadListView.Modes.BOTH);
            if (mDatas.size() >= mPageSize * 3) {
                mRefreshListView.setLoadMore(false, tempList.size());
            } else {
                mRefreshListView.setLoadMore(true, tempList.size());
            }
        }
        if (mArrayAdapter == null) {
            mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, mDatas);
            mRefreshListView.setContentAdapter(mArrayAdapter);
        }
        mArrayAdapter.notifyDataSetChanged();
        stopRefreshOrLoad(null, true, "");
    }

    /**
     * 最终加载数据成功或者失败结果处理
     */
    public void stopRefreshOrLoad(VolleyError error, boolean isSuccess, String errMsg) {

        //设置数据为空时View提示语
        if (mPageIndex == 1) {
            if (mDatas == null || mDatas.size() < 1) {
                mRefreshListView.setNoDataText("没有数据!");
            }
        }

        //设置无数据提示View是否显示
        if (mPageIndex == 1 && mDatas == null || mDatas.size() < 1) {
            mRefreshListView.showNoDataLayout1(null, true);
        } else {
            mRefreshListView.showNoDataLayout1(null, false);
        }

        //请求成功 设置ListView模式
        if (error == null) {
            if (isSuccess) {
                mRefreshListView.refreshOrLoadComplete(null, true);
            } else {
                mRefreshListView.refreshOrLoadComplete(null, false);
            }
            //请求失败
        } else {
            if (error instanceof NoConnectionError || error instanceof TimeoutError) {
//                showToastOrError(MyBalanceActivity.this, errMsg, error);
            } else if (StringUtils.isNullOrEmpty(errMsg)) {
                showTopToast(errMsg);
            }
            mRefreshListView.refreshOrLoadComplete(error, false);
        }
    }
}
