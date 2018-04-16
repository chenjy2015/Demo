package com.example.chenjiayou.mycustomapplication.view.bind_adapter;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.kye.express.R;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 28/12/2017
 * @updated : 28/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class ImageViewBindingAdapter {

    @BindingAdapter({"image"})
    public static void Image(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .apply(new RequestOptions().error(R.drawable.error).placeholder(R.drawable.background_about_empty).fitCenter())
                .into(view);
    }

    @BindingAdapter({"imageUrlCenterCrop"})
    public static void loadImageCenterCrop(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .apply(new RequestOptions().error(R.drawable.error).placeholder(R.drawable.error).centerCrop())
                .into(view);
    }

    @BindingAdapter({"imageIsSelected", "imageIsShow"})
    public static void isSelected(ImageView view, Boolean isSelected, Boolean imageIsShow) {
        Glide.with(view.getContext())
                .load(!isSelected ? R.drawable.ic_icon_select : R.drawable.ic_icon_unselect)
                .apply(new RequestOptions().error(R.drawable.error).placeholder(R.drawable.error).centerCrop())
                .into(view);
        view.setVisibility(imageIsShow ? View.VISIBLE : View.GONE);
    }

    @BindingAdapter({"imageResId"})
    public static void imageResId(ImageView view, int resId) {
        Glide.with(view.getContext())
                .load(resId)
                .apply(new RequestOptions().placeholder(R.drawable.kye_loading_anim).fitCenter())
                .into(view);
    }

    @BindingAdapter({"imageUrl", "circleCrop", "imageResId"})
    public static void loadImage(ImageView view, String imageUrl, boolean circleCrop, int resId) {
        RequestOptions requestOptions = new RequestOptions().placeholder(resId).error(resId);
        requestOptions = circleCrop ? requestOptions.circleCrop() : requestOptions;

        Glide.with(view)
                .load(imageUrl)
                .apply(requestOptions)
                .into(view);
    }
}
