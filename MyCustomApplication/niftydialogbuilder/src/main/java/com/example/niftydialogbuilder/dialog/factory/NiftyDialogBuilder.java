package com.example.niftydialogbuilder.dialog.factory;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.niftydialogbuilder.R;
import com.example.niftydialogbuilder.dialog.animation.BaseEffects;
import com.example.niftydialogbuilder.dialog.image.LoadingView;

/**
 * Created by lee on 2014/7/30.
 */

@SuppressWarnings("unused")
public class NiftyDialogBuilder extends Dialog implements DialogInterface {

    private final String defTextColor = "#FFFFFFFF";

    private final String defDividerColor = "#11000000";

    private final String defMsgColor = "#FFFFFFFF";

    private final String defDialogColor = "#FFE74C3C";

    private Effectstype type = null;

    private LinearLayout mLinearLayoutView;

    private RelativeLayout mRelativeLayoutView;

    private LinearLayout mLinearLayoutMsgView;

    private LinearLayout mLinearLayoutTopView;

    private FrameLayout mFrameLayoutCustomView;

    private LinearLayout mButtonLayout;

    private View mDialogView;

    private View mDivider;

    private TextView mTitle;

    private TextView mMessage;

    private ImageView mIcon;

    private LoadingView mProgressIv;

    private ImageView mDelete; //删除按钮

    private Button mButton1;

    private Button mButton2;

    private TextView mVerticalBtnLine; //按钮中间的竖线

    private int mDuration = -1;

    private static int mOrientation = 1;

    private boolean isCancelable = true;

    private volatile static NiftyDialogBuilder instance;

    Activity activity;

    public NiftyDialogBuilder(Context context) {
        // super(context);
        /* 改成我们自定义的布局文件 */

        this(context, R.style.dialog);
    }

    public NiftyDialogBuilder(Context context, int theme) {

        super(context, theme);
        this.activity = (Activity) context;
        init(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.height = ViewGroup.LayoutParams.MATCH_PARENT;
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        getWindow().setAttributes(
                (WindowManager.LayoutParams) params);

    }

    private void init(Context context) {

        mDialogView = View.inflate(context, R.layout.dialog_layout, null);
        mButtonLayout = (LinearLayout) mDialogView.findViewById(R.id.button_layout);
        mRelativeLayoutView = (RelativeLayout) mDialogView
                .findViewById(R.id.main);
        mLinearLayoutTopView = (LinearLayout) mDialogView
                .findViewById(R.id.topPanel);
        mLinearLayoutMsgView = (LinearLayout) mDialogView
                .findViewById(R.id.contentPanel);
        mFrameLayoutCustomView = (FrameLayout) mDialogView
                .findViewById(R.id.customPanel);

        mProgressIv = (LoadingView) mDialogView.findViewById(R.id.iv);

        mLinearLayoutView = (LinearLayout) mDialogView
                .findViewById(R.id.parentPanel);
        mProgressIv.initAmin();
        mTitle = (TextView) mDialogView.findViewById(R.id.alertTitle);
        mMessage = (TextView) mDialogView.findViewById(R.id.message);
        mIcon = (ImageView) mDialogView.findViewById(R.id.icon);
        mDivider = mDialogView.findViewById(R.id.titleDivider);
        mButton1 = (Button) mDialogView.findViewById(R.id.button1);
        mButton2 = (Button) mDialogView.findViewById(R.id.button2);
        mVerticalBtnLine = (TextView) mDialogView.findViewById(R.id.button_vertical_line);
        mDelete = (ImageView) mDialogView.findViewById(R.id.delete);

        setContentView(mDialogView);

        this.setOnShowListener(new OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {

                mLinearLayoutView.setVisibility(View.VISIBLE);
                if (type == null) {
                    type = Effectstype.Slidetop;
                }
                start(type);

            }
        });
        mRelativeLayoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCancelable)
                    dismiss();
            }
        });
    }

    /**
     * 設置隱藏textview
     */
    public void setTextGone() {
        mMessage.setVisibility(View.GONE);
    }

    /**
     * 设置Button的父控件背景色
     *
     * @param color
     */
    public void setButtonlayoutBackgroundColor(int color) {
        mButtonLayout.setBackgroundColor(color);
    }

    /**
     * 设置删除按钮点击后回调监听
     */
    public void setDeleteImageClickListenner(View.OnClickListener listenner) {
        mDelete.setOnClickListener(listenner);
    }

    /**
     * 设置删除按钮是否显示
     *
     * @param isShow
     */
    public void setDeleteImageVisible(boolean isShow) {
        if (isShow) {
            mDelete.setVisibility(View.VISIBLE);
        } else {
            mDelete.setVisibility(View.GONE);
        }
    }

    /**
     * 设置头部title颜色值
     *
     * @param color
     */
    public NiftyDialogBuilder withTitleLayoutBackgroundColor(int color) {
        mLinearLayoutView.setBackgroundColor(color);
        return this;
    }

    /**
     * 设置 中间内容背景色
     *
     * @param color
     */
    public NiftyDialogBuilder withContentPanelBackgroundColor(int color) {
        mLinearLayoutMsgView.setBackgroundColor(color);
        return this;
    }

    /**
     * 设置 自定义背景颜色值
     *
     * @param color
     * @return
     */
    public NiftyDialogBuilder withCustomBackgroundBackgroundColor(int color) {
        mFrameLayoutCustomView.setBackgroundColor(color);
        return this;
    }

    /**
     * 设置Button1背景色
     * 并设置字体颜色为白色
     */
    public void setButon1Backgroun(int resId) {
        mButton1.setBackgroundResource(resId);
    }

    /**
     * 设置Button1背景色
     * 并设置字体颜色为白色
     *
     * @param color
     */
    public void setButon1BackgroundColor(int color) {
        mButton1.setBackgroundColor(color);
        mButton1.setTextColor(Color.WHITE);
    }

    /**
     * 设置Button2背景色
     * 并设置字体颜色为白色
     *
     * @param color
     */
    public void setButon2BackgroundColor(int color) {
        mButton2.setBackgroundColor(color);
        mButton2.setTextColor(Color.WHITE);
    }

    /**
     * 设置Button1背景色
     * 并设置字体颜色为白色
     *
     * @param drawable
     */
    public void setButon1Background(int drawable) {
        mButton1.setBackgroundResource(drawable);
        mButton1.setTextColor(Color.WHITE);
    }

    /**
     * 设置Button2背景色
     * 并设置字体颜色为白色
     *
     * @param drawable
     */
    public void setButon2Background(int drawable) {
        mButton2.setBackgroundResource(drawable);
        mButton2.setTextColor(Color.WHITE);
    }

    public void setDefDividerColor(int color) {
        mDivider.setBackgroundColor(color);
    }

    public void setTitleTextColor(int color) {
        mTitle.setTextColor(color);
    }

    public void setTitleTextSize(int size){
        mTitle.setTextSize((float)size);
    }

    public void setMessageColor(int color) {
        mMessage.setTextColor(color);
    }

    public void toDefault() {
        mTitle.setTextColor(Color.parseColor(defTextColor));
        mDivider.setBackgroundColor(Color.parseColor(defDividerColor));
        mMessage.setTextColor(Color.parseColor(defMsgColor));
        mLinearLayoutView.setBackgroundColor(Color.parseColor(defDialogColor));
    }

    public NiftyDialogBuilder withDividerColor(String colorString) {
        mDivider.setBackgroundColor(Color.parseColor(colorString));
        return this;
    }

    public NiftyDialogBuilder withTitle(CharSequence title) {
        toggleView(mLinearLayoutTopView, title);
        mTitle.setText(title);
        return this;
    }

    public NiftyDialogBuilder withTitleColor(String colorString) {
        mTitle.setTextColor(Color.parseColor(colorString));
        return this;
    }

    public NiftyDialogBuilder withMessage(int textResId) {
        toggleView(mLinearLayoutMsgView, textResId);
        mMessage.setText(textResId);
        return this;
    }

    public NiftyDialogBuilder withMessage(CharSequence msg) {
        toggleView(mLinearLayoutMsgView, msg);
        mMessage.setText(msg);
        return this;
    }

    public NiftyDialogBuilder withMessageColor(String colorString) {
        mMessage.setTextColor(Color.parseColor(colorString));
        return this;
    }

    public NiftyDialogBuilder withIcon(int drawableResId) {
        mIcon.setImageResource(drawableResId);
        return this;
    }

    public NiftyDialogBuilder withIcon(Drawable icon) {
        mIcon.setImageDrawable(icon);
        return this;
    }

    public NiftyDialogBuilder withDuration(int duration) {
        this.mDuration = duration;
        return this;
    }

    public NiftyDialogBuilder withEffect(Effectstype type) {
        this.type = type;
        return this;
    }

    public NiftyDialogBuilder withButtonDrawable(int resid) {
        mButton1.setBackgroundResource(resid);
        mButton2.setBackgroundResource(resid);
        return this;
    }

    public NiftyDialogBuilder withButton1Text(CharSequence text) {
        mButtonLayout.setVisibility(View.VISIBLE);
        mButton1.setVisibility(View.VISIBLE);
        mButton1.setText(text);

        return this;
    }

    public NiftyDialogBuilder withButton1TextColor(int color) {
        mButton1.setTextColor(color);
        return this;
    }

    public NiftyDialogBuilder withButton1Background(int resourceId) {
        mButton1.setBackgroundResource(resourceId);
        return this;
    }

    /**
     * 隐藏BUTTON之间的间隔竖线
     * @return
     */
    public NiftyDialogBuilder hideVerticalBtnLine() {
        mVerticalBtnLine.setVisibility(View.GONE);
        return this;
    }

    public NiftyDialogBuilder withButton2Text(CharSequence text) {
        mButtonLayout.setVisibility(View.VISIBLE);
        mButton2.setVisibility(View.VISIBLE);
        mButton2.setText(text);
        return this;
    }

    public NiftyDialogBuilder setButton1Click(View.OnClickListener click) {
        mButton1.setOnClickListener(click);
        return this;
    }

    public NiftyDialogBuilder setButton2Click(View.OnClickListener click) {
        mButton2.setOnClickListener(click);
        return this;
    }

    public NiftyDialogBuilder setCustomView(int resId, Context context) {
        View customView = View.inflate(context, resId, null);
        if (mFrameLayoutCustomView.getChildCount() > 0) {
            mFrameLayoutCustomView.removeAllViews();
        }
        mFrameLayoutCustomView.addView(customView);
        return this;
    }

    public NiftyDialogBuilder setCustomView(View view, Context context) {
        if (mFrameLayoutCustomView.getChildCount() > 0) {
            mFrameLayoutCustomView.removeAllViews();
        }
        mFrameLayoutCustomView.addView(view);

        return this;
    }

    public NiftyDialogBuilder isCancelableOnTouchOutside(boolean cancelable) {
        this.isCancelable = cancelable;
        this.setCanceledOnTouchOutside(cancelable);
        return this;
    }

    public NiftyDialogBuilder isCancelable(boolean cancelable) {
        this.isCancelable = cancelable;
        this.setCancelable(cancelable);
        return this;
    }

    private void toggleView(View view, Object obj) {
        if (obj == null) {
            view.setVisibility(View.GONE);
        } else {
            view.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void show() {
        try {
            if (!activity.isFinishing()) {
                if (mTitle.getText().equals(""))
                    mDialogView.findViewById(R.id.topPanel)
                            .setVisibility(View.GONE);
//			mProgressIv.startAnimation();
                super.show();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(" DIALOG 显示 错误 ");
        }
    }

    private void start(Effectstype type) {
        BaseEffects animator = type.getAnimator();
        if (mDuration != -1) {
            animator.setDuration(Math.abs(mDuration));
        }
        animator.start(mRelativeLayoutView);

    }

    @Override
    public void dismiss() {
        super.dismiss();
        mButton1.setVisibility(View.GONE);
        mButton2.setVisibility(View.GONE);
        mProgressIv.endAnimation();
    }

    public LoadingView getProgressImageView() {
        return mProgressIv;
    }
    public TextView getMessageView() {
        return mMessage;
    }

}
