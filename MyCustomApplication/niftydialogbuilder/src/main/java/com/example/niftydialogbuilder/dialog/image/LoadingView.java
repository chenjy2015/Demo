package com.example.niftydialogbuilder.dialog.image;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class LoadingView extends ImageView {

//    RotateAnimation mRotateAnimation; // 旋转动画


    public LoadingView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public LoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }


    /**
     * 初始化动画
     */
    public void initAmin() {
//        mRotateAnimation = new RotateAnimation(0f, 360f,
//                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
//                0.5f);
    }

    /**
     * 开始旋转动画
     */
    public void startAnimation() {
//        this.startAnimation(mRotateAnimation);
        AnimationDrawable animationDrawable = (AnimationDrawable) this.getBackground();
        animationDrawable.start();
    }

    /**
     * 结束动画
     */
    public void endAnimation() {
//        this.clearAnimation();
//        mRotateAnimation.cancel();
    }

}
