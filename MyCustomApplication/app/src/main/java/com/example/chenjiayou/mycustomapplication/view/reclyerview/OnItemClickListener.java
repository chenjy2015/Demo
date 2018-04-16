package com.example.chenjiayou.mycustomapplication.view.reclyerview;

import android.view.View;

public interface OnItemClickListener<T> {
    void onClickItem(T item, View view);
}
