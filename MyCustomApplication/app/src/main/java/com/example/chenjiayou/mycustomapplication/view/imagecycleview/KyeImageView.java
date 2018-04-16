package com.example.chenjiayou.mycustomapplication.view.imagecycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * @version V1.0
 * @createAuthor chenxiaoping
 * @createDate 2017/1/12 17:41
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
@SuppressLint("AppCompatCustomView")
public class KyeImageView extends ImageView {
    public KyeImageView(Context context) {
        super(context);
    }

    public KyeImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            System.out
                    .println("MyImageView  -> onDraw() Canvas: trying to use a recycled bitmap");
        }
    }
}
