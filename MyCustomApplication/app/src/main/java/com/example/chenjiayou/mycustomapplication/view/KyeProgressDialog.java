package com.example.chenjiayou.mycustomapplication.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.kye.express.R;

public class KyeProgressDialog extends Dialog {


    private Integer  drawableResId;
    private Drawable mDrawable;
    private int mResourceLayoutId = 0; // 0 全局通用  1 单号模块


    private KyeProgressDialog(@NonNull Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private KyeProgressDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.mResourceLayoutId = themeResId;
    }

    private KyeProgressDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public Integer getDrawableResId() {
        return drawableResId;
    }

    public void setDrawableResId(Integer drawableResId) {
        this.drawableResId = drawableResId;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();

        if (window != null) window.setBackgroundDrawable(new ColorDrawable(getContext().getResources().getColor(android.R.color.transparent)));
        setContentView(View.inflate(getContext(), R.layout.dialog_kye_loading, null));
        ImageView         iv = getWindow().findViewById(R.id.iv_load);
        AnimationDrawable ad = (AnimationDrawable) iv.getDrawable();
        ad.start();
    }

    public static Dialog show(Context context, Dialog dialog) {
        if (dialog == null) dialog = new Builder(context).build();
        if (!dialog.isShowing()) dialog.show();
        return dialog;
    }

    public static Dialog show(Context context, Dialog dialog, int mResourceLayoutId) { // 单号查询动画问题
        if (dialog == null) dialog = new Builder(context, mResourceLayoutId).build(mResourceLayoutId);
        if (!dialog.isShowing()) dialog.show();
        return dialog;
    }


    public static void dismiss(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) dialog.dismiss();
    }

    public static class Builder {
        private Context mContext;
        private boolean mCancelable;
        private int     mResourceLayoutId;

        public void setCancelable(boolean cancelable) {
            mCancelable = cancelable;
        }

        public Builder(Context context) {
            mContext = context;
        }

        public Builder(Context context, int resourceLayoutId) { // 单号查询动画问题
            mContext = context;
            this.mResourceLayoutId = resourceLayoutId;
        }

        public Dialog build() {
            KyeProgressDialog dialog = new KyeProgressDialog(mContext);

            dialog.setCancelable(mCancelable);
            return dialog;
        }

        public Dialog build(int resourceLayoutId) { // 单号查询动画问题
            KyeProgressDialog dialog = new KyeProgressDialog(mContext, resourceLayoutId);

            dialog.setCancelable(mCancelable);
            return dialog;
        }
    }
}
