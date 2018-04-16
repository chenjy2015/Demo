package com.example.chenjiayou.mycustomapplication.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.github.chrisbanes.photoview.PhotoView;
import com.kye.express.R;

/**
 * Created by harry on 2018/3/8 下午4:34.
 * 全屏弹出展示图片
 */
public class PopupPhotoView extends PopupWindow  {

    private Context mContext;
    private PopupWindow mPopupWindow;

    public PopupPhotoView(Context context){
        super(context);
        mContext=context;
        init();
    }

    /**
     * 新建实例
     * @param context
     * @return
     */
    public static  PopupPhotoView newInstance(Context context) {
        PopupPhotoView popupPhotoView = new PopupPhotoView(context);
        return popupPhotoView;
    }
   private   void init() {
        //获取视图
       View popupView = View.inflate(mContext, R.layout.popup_photo_view, null);
       mPopupWindow = new PopupWindow(popupView,
               ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
       //设置popupWindow背景色
       mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
       //设置popupWindow出现与消失的动画
       mPopupWindow.setAnimationStyle(R.style.popup_anim_style);

   }

    /**
     * 显示图片
     * @param bitmap
     */
    public void show(Bitmap bitmap){
        PhotoView photoView = (PhotoView) mPopupWindow.getContentView().findViewById(R.id.photoView);
        photoView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        photoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPopupWindow.dismiss();
            }
        });
        photoView.setImageBitmap(bitmap);
        mPopupWindow.showAtLocation(((Activity)mContext).getWindow().getDecorView(),
                Gravity.CENTER, 0, 0);
   }

}
