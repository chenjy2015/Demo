package com.example.chenjiayou.mycustomapplication.view.bind_adapter;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.annotation.StringRes;
import android.view.View;

import com.allen.library.SuperTextView;

public class SuperTextViewBindAdapter {

    @BindingAdapter("sRightTextString")
    public static void setRightTextString(SuperTextView superTextView, CharSequence text) {
        superTextView.getRightTextView().setText(text);
        superTextView.getRightTextView().setVisibility(View.VISIBLE);
    }

    @BindingAdapter("sRightTextString")
    public static void setRightTextString(SuperTextView superTextView, @StringRes int resid) {
        superTextView.getRightTextView().setText(resid);
        superTextView.getRightTextView().setVisibility(View.VISIBLE);
    }

    @BindingAdapter("sRightTextVisibility")
    public static void setRightTextVisibility(SuperTextView superTextView, int visibility) {
        superTextView.getRightTextView().setVisibility(visibility);
    }

    @BindingAdapter("svgIconRes")
    public static void sLeftIconRes(SuperTextView view, Drawable drawable) {
        view.getLeftIconIV().setImageDrawable(drawable);
    }
}
