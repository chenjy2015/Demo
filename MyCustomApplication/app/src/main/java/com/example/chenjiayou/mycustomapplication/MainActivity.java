package com.example.chenjiayou.mycustomapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.base.LogOut;
import com.example.base.config.Contants;
import com.example.base.ui.BaseCompatActivity;
import com.example.base.utils.ClickUtils;
import com.example.base.utils.GsonUtils;
import com.example.base.utils.StatusBarUtils;
import com.example.base.utils.StringUtils;
import com.example.horizontal_display.HorizontalDisplayPhotoListActivity;
import com.example.horizontal_display.bean.PhotoBeanVO;
import com.example.searchview.address_search.bean.SearchDataType;
import com.example.searchview.address_search.bean.SortModel;
import com.example.searchview.address_search.interfaces.OnItemClickListener;
import com.example.searchview.address_search.widget.SearchCityView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MainActivity extends BaseCompatActivity {


    private EditText mEditColor;
    private Button mBtnTest;
    private SearchCityView mSearchCityView;

    @Override
    public int setView() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mEditColor = findViewById(R.id.color_edit);
        mBtnTest = findViewById(R.id.test_btn);
    }

    @Override
    public void init() {
        mBtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyHandler().sendEmptyMessage(Contants.CHANGE_TITLE_BAR_COLOR);
            }
        });
    }

    @Override
    public void initData() {
        //初始化
        final LinearLayout parentView = (LinearLayout) this.findViewById(R.id.parent_view);
        mSearchCityView = new SearchCityView(this, parentView);
        //Java8 过滤数据源
        List<String> sources = Arrays.asList("颜色值测试", "", "横向流量大图放大缩小处理", "测试下拉刷新");
        List<String> data = sources.stream().filter(b -> !StringUtils.isNullOrEmpty(b)).collect(Collectors.<String>toList());
        String[] list = new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            list[i] = data.get(i);
        }
        //传入数据源
        mSearchCityView = new SearchCityView(this, parentView);
        mSearchCityView.hideSearchEdit().addOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position, SearchDataType searchDataType, SortModel sortModel) {
                if (ClickUtils.isClickable()) {
                    new MyHandler().sendEmptyMessage(position);
                }
            }
        }).setData(list);
    }

    class MyHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case Contants.CHANGE_TITLE_BAR_COLOR:
                    String color = mEditColor.getText().toString();
                    if (!StringUtils.isNullOrEmpty(color)) {
                        try {
                            int c = Color.parseColor(color);
                            StatusBarUtils.setStatusBarColor(MainActivity.this, c);
                            return;
                        } catch (Exception e) {
                            LogOut.printStackTrace(e);
                        }
                    }
                    showTopToast("请输入正确的三原色值");
                    break;

                case Contants.HROIZONTAL_DISPLAY:
                    String[] data = new String[9];
                    for (int i = 0; i < 9; i++) {
                        data[i] = Contants.imageUrls[i];
                    }
                    Intent intent = new Intent(MainActivity.this, HorizontalDisplayPhotoListActivity.class);
                    intent.putExtra("beans", data);
                    intent.putExtra("index", 0);
                    startActivity(intent);
                    break;

                case Contants.REFRESH_LIST:
                    startActivity(new Intent(MainActivity.this, PullAndRefreshListActivity.class));
                    break;

            }
        }
    }
}
