package com.example.base.ui;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.example.base.R;
import com.example.base.interfaces.BaseDefaultContants;
import com.example.base.interfaces.BaseFunctional;
import com.example.base.utils.ToastUtils;

public class BaseActivity extends Activity implements BaseDefaultContants, BaseFunctional{

    /**
     * 内容容器
     */
    private FrameLayout mainContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        setContentView();
    }

    @Override
    public void setContentView() {
        mainContainer = (FrameLayout) findViewById(R.id.activity_base_content);
        LayoutInflater.from(this).inflate(setView(), mainContainer);
    }


    @Override
    public void showTopToast(String content) {
        ToastUtils.showBlackWhiteToastOnCenter(BaseActivity.this, content);
    }
}
