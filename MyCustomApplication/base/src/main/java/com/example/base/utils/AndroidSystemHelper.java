package com.example.base.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;

/**
 * Created by chenjiayou on 2018/3/3.
 */

public class AndroidSystemHelper {
    /**
     * 动态设置GrideView高度
     *
     * @param listView
     */
    public static void setGridViewHeight(GridView listView, int marginLeft, int marginTop, int marginRight, int marginBottom) {
        // 获取listview的adapter
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }
        // 固定列宽，有多少列
        int col = 4;// listView.getNumColumns();
        int totalHeight = 0;
        // i每次加4，相当于listAdapter.getCount()小于等于4时 循环一次，计算一次item的高度，
        // listAdapter.getCount()小于等于8时计算两次高度相加
        for (int i = 0; i < listAdapter.getCount(); i += col) {
            // 获取listview的每一个item
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            // 获取item的高度和
            totalHeight += listItem.getMeasuredHeight() + SizeUtils.dp2px(15, listView.getContext());
        }

        // 获取listview的布局参数
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        // 设置高度
        params.height = totalHeight;
        // 设置margin
        ((ViewGroup.MarginLayoutParams) params).setMargins(marginLeft, marginTop, marginRight, marginBottom);
        // 设置参数
        listView.setLayoutParams(params);
    }
}
