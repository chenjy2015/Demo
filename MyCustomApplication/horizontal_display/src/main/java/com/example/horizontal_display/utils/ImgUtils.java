package com.example.horizontal_display.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;

public class ImgUtils {


    /**
     * 字节数组转Bitmap
     *
     * @param base64String
     * @return
     */
    public static Bitmap Base64StringToBitmap2(String base64String) {
        if (TextUtils.isEmpty(base64String)) {
            return null;
        }
        byte[] bitmapArray = Base64.decode(base64String, Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bitmapArray, 0, bitmapArray.length);
        return bitmap;
    }



}
