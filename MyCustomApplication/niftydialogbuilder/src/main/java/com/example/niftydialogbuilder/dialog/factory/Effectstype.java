package com.example.niftydialogbuilder.dialog.factory;


import com.example.niftydialogbuilder.dialog.animation.BaseEffects;
import com.example.niftydialogbuilder.dialog.animation.FadeIn;
import com.example.niftydialogbuilder.dialog.animation.Fall;
import com.example.niftydialogbuilder.dialog.animation.FlipH;
import com.example.niftydialogbuilder.dialog.animation.FlipV;
import com.example.niftydialogbuilder.dialog.animation.NewsPaper;
import com.example.niftydialogbuilder.dialog.animation.RotateBottom;
import com.example.niftydialogbuilder.dialog.animation.RotateLeft;
import com.example.niftydialogbuilder.dialog.animation.Shake;
import com.example.niftydialogbuilder.dialog.animation.SideFall;
import com.example.niftydialogbuilder.dialog.animation.SlideLeft;
import com.example.niftydialogbuilder.dialog.animation.SlideRight;
import com.example.niftydialogbuilder.dialog.animation.SlideTop;
import com.example.niftydialogbuilder.dialog.animation.SlideBottom;
import com.example.niftydialogbuilder.dialog.animation.Slit;

/**
 * Created by lee on 2014/7/30.
 */
@SuppressWarnings("rawtypes")
public enum  Effectstype {

    Fadein(FadeIn.class),
    Slideleft(SlideLeft.class),//左边滑出
    Slidetop(SlideTop.class),//左边滑出
    SlideBottom(SlideBottom.class),//底部滑出
    Slideright(SlideRight.class),//右边滑出
    Fall(Fall.class),//屏幕中间位置 由大到小缩放
    Newspager(NewsPaper.class),//X,Y轴旋转弹出
    Fliph(FlipH.class),//3D 横向翻转
    Flipv(FlipV.class),//3D 纵向翻转
    RotateBottom(RotateBottom.class),//底部三角型动画弹出
    RotateLeft(RotateLeft.class),//3D 翻转左侧弹出
    Slit(Slit.class),//3D 中间轴翻转
    Shake(Shake.class),//左右晃动
    Sidefill(SideFall.class);//倾斜 15度中间位置弹出

	private Class effectsClazz;

    private Effectstype(Class mclass) {
        effectsClazz = mclass;
    }

    public BaseEffects getAnimator() {
        try {
            return (BaseEffects) effectsClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
