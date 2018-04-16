package com.example.chenjiayou.mycustomapplication.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.kye.express.R;
import com.kye.nb.banner.loader.ImageLoader;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 25/12/2017
 * @updated : 25/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     for banner image loader
 */
public class GlideImageLoader extends ImageLoader {

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(context)
                .load(path)
//                .apply(new RequestOptions().error(R.drawable.error).placeholder(R.drawable.background_about_empty).centerInside())
                .apply(new RequestOptions().error(R.drawable.error).placeholder(R.drawable.background_about_empty))
                .into(imageView);
    }
}
