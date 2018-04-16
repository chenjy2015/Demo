package com.example.chenjiayou.mycustomapplication.view.bind_adapter;

import android.databinding.BindingAdapter;
import android.view.View;

public class ViewBindingAdapter {
    @BindingAdapter({"show"})
    public static void visibility(View view, boolean visible) {
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
    }
}
