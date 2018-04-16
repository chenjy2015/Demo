package com.example.chenjiayou.mycustomapplication.view.bind_adapter;

import android.databinding.BindingAdapter;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 28/12/2017
 * @updated : 28/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class SmartRefreshLayoutBindingAdapter {

    @BindingAdapter({"enalbeRefresh"})
    public static void enalbeRefresh(SmartRefreshLayout view, boolean enable) {
        view.setEnableRefresh(enable);
    }
}
