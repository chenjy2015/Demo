package com.example.chenjiayou.rxjava2demo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.MainThread;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;


/**
 * Created by chenjiayou on 2018/4/11.
 */

public class MyTextView extends RelativeLayout {

    private Context mContext;

    //数据来源 resource 还是 databinding 方法
    private int from;

    private int mWidth;
    private int mHeight;

    private String mLeftTextString;
    private String mCenterTextString;
    private Drawable mRightIcon;
    private int drivDrection;


    public MyTextView(Context context) {
        super(context, null);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        getAttr(attrs);
    }

    public void getAttr(AttributeSet attrs) {
        TypedArray typedArray = this.mContext.obtainStyledAttributes(attrs, com.allen.library.R.styleable.SuperTextView);
        this.from = typedArray.getInteger(R.styleable.MySuperText_text_from, 0);
        if (this.from == 0) {
            this.mLeftTextString = typedArray.getString(R.styleable.SuperTextView_sLeftTextString);
            this.drivDrection = typedArray.getInt(R.styleable.MySuperText_driver_drection,0);
        }
    }

    public final void setLeftTextString(String leftTextString) {
        this.mLeftTextString = leftTextString;
    }
}
