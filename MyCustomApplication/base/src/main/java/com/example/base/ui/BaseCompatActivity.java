package com.example.base.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.example.base.R;
import com.example.base.interfaces.BaseDefaultContants;
import com.example.base.interfaces.BaseFunctional;
import com.example.base.utils.ToastUtils;

public class BaseCompatActivity extends AppCompatActivity implements BaseDefaultContants, BaseFunctional{

    /**
     * 内容容器
     */
    private FrameLayout mainContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        setContentView();
        initView();
        initEvent();
        init();
        initData();
    }

    @Override
    public void setContentView() {
        mainContainer = (FrameLayout) findViewById(R.id.activity_base_content);
        LayoutInflater.from(this).inflate(setView(), mainContainer);
    }

    @Override
    public int setView() {
        return 0;
    }


    @Override
    public void showTopToast(String content) {
        ToastUtils.showBlackWhiteToastOnCenter(BaseCompatActivity.this, content);
    }
}
