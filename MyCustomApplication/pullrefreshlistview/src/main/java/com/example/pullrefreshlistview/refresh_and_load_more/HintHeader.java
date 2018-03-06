package com.example.pullrefreshlistview.refresh_and_load_more;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pullrefreshlistview.R;


/**
 * @version V1.0
 * @Author ly
 * @company 跨越速运
 * @Description 头部的提示控件
 * @Date 2017/3/23
 */
public class HintHeader extends FrameLayout {

    private static final String TAG = HintHeader.class.getSimpleName();
    private TextView mHintTv;
    private View headerRootView;
    private LinearLayout mHintHeader;
    private int mDefaultHeadHeight = 45;

    public HintHeader(Context context) {
        this(context, null);
    }

    public HintHeader(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HintHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        headerRootView = LayoutInflater.from(getContext()).inflate(R.layout.layout_list_hint_header, this);
        mHintHeader = (LinearLayout) findViewById(R.id.layout_hint_header);
        mHintTv = (TextView) headerRootView.findViewById(R.id.tv_hint);
    }

    /**
     * 设置提示
     *
     * @param hint
     */
    public void setHint(String hint) {
        mHintTv.setText(hint);
    }

    /**
     * @param isShow
     */
    public void showHintHeader(boolean isShow) {
        if (isShow) {//显示头部
            setHeaderHeight(mDefaultHeadHeight);
        } else {
            setHeaderHeight(0);
        }
    }

    public void setHeaderHeight(int height) {
        mHintHeader.getLayoutParams().height = height;
        mHintHeader.requestLayout();
    }

}
