package com.example.chenjiayou.mycustomapplication.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;


/**
 * @version V1.0
 * @Author GONGYJ
 * @company 跨越速运
 * @Description 语音播放动画视图
 * @Date 2016/7/13 16:47
 */
public class VoiceSoundView extends android.support.v7.widget.AppCompatImageView {

    private AnimationDrawable animationDrawable;

    public VoiceSoundView(Context context) {
        super(context);
    }

    public VoiceSoundView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VoiceSoundView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    /**
     * 开始动画
     * @param resId 动画资源
     */
    public void start(int resId) {
        setImageResource(resId);
        animationDrawable = (AnimationDrawable) getDrawable();
        animationDrawable.start();
    }

    /**
     * 停止动画
     *
     * @param defaultres 动画完成，默认的显示图片
     */
    public void stop(int defaultres) {
        if (animationDrawable != null) {
            animationDrawable.stop();
            clearAnimation();
        }
        setImageResource(defaultres);
    }
}
