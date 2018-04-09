package com.example.chenjiayou.mycustomapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.automatic_space_edittext.HPEditText;
import com.example.base.LogOut;
import com.example.base.config.Contants;
import com.example.base.ui.BaseCompatActivity;
import com.example.base.utils.ClickUtils;
import com.example.base.utils.StatusBarUtils;
import com.example.base.utils.StringUtils;
import com.example.base.utils.ToastUtils;
import com.example.horizontal_display.HorizontalDisplayPhotoListActivity;
import com.example.niftydialogbuilder.dialog.helper.DialogButtonType;
import com.example.niftydialogbuilder.dialog.helper.DialogHelper;
import com.example.niftydialogbuilder.dialog.ie.DialogSinpleCallback;
import com.example.searchview.address_search.bean.SearchDataType;
import com.example.searchview.address_search.bean.SortModel;
import com.example.searchview.address_search.interfaces.OnItemClickListener;
import com.example.searchview.address_search.widget.SearchCityView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class MainActivity extends BaseCompatActivity {


    private EditText mEditColor;
    private HPEditText mHpEditText;
    private Button mBtnTest;
    private SearchCityView mSearchCityView;

    @Override
    public int setView() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mHpEditText = findViewById(R.id.auto_edit);
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
        List<String> sources = Arrays.asList(
                "颜色值测试", "", "横向流量大图放大缩小处理", "测试下拉刷新"
                , "单选", "多选", "单个按钮提示", "两个按钮提示", "输入框", "加载提示框", "带进度条的提示框", "自动空格edittext"
        );
        List<String> data = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            data = sources.stream().filter(b -> !StringUtils.isNullOrEmpty(b)).collect(Collectors.<String>toList());
        }
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

                case Contants.DIALOG_SINGLE:
                    ArrayList<String> list = new ArrayList<String>();
                    list.add("男");
                    list.add("女");
                    list.add("似男非女");
                    DialogHelper.showSingleDialog(MainActivity.this, 0, 0, "请选择性别", list, new DialogSinpleCallback() {
                        @Override
                        public void onSingleSelect(int tag, int index, int position, String select, Object object) {
                            super.onSingleSelect(tag, index, position, select, object);
//                            ToastUtils.showBlackWhiteToastOnCenter(MainActivity.this, list.get(position));
                            ToastUtils.showBlackWhiteToastOnCenter(MainActivity.this, select);
                            DialogHelper.dismiss();
                        }
                    }, null);
                    break;
                case Contants.DIALOG_MULIT:
                    ArrayList<String> citys = new ArrayList<String>();
                    citys.add("北京");
                    citys.add("上海");
                    citys.add("广州");
                    citys.add("深圳");
                    citys.add("南京");
                    citys.add("重庆");
                    citys.add("大连");
                    citys.add("武汉");
                    citys.add("哈尔滨");
                    DialogHelper.showMulitDialog(MainActivity.this, 0, 0, "请选择想要去的城市名称", citys, new DialogSinpleCallback() {

                        @Override
                        public void onMultiSelect(int tag, int index, ArrayList<String> selects, HashMap<Integer, String> selectString, Object object) {
                            super.onMultiSelect(tag, index, selects, selectString, object);
                            DialogHelper.dismiss();
                            StringBuilder stringBuilder = new StringBuilder();
                            if (selectString != null) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                                    selectString.forEach((k, v) -> stringBuilder.append(v + "\t"));
                                }
                                ToastUtils.showBlackWhiteToastOnCenter(MainActivity.this, "选中：" + stringBuilder.toString());
                            }

                        }
                    }, null);
                    break;
                case Contants.DIALOG_HINT:
                    DialogHelper.showHintDialog(MainActivity.this, "温馨提示", "关闭当前对话框", "关闭", 0, new DialogSinpleCallback() {
                        @Override
                        public void onButtonClick(int tag, DialogButtonType dialogButtonType, Object object) {
                            super.onButtonClick(tag, dialogButtonType, object);
                            DialogHelper.dismiss();
                        }
                    }, null);
                    break;
                case Contants.DIALOG_NORMAL:
                    DialogHelper.showNormalDialog(MainActivity.this, "温馨提示", "是否开始导航？", "取消", "确定", 0, new DialogSinpleCallback() {
                        @Override
                        public void onButtonClick(int tag, DialogButtonType dialogButtonType, Object object) {
                            super.onButtonClick(tag, dialogButtonType, object);
                            if (dialogButtonType == DialogButtonType.RIGHT) {
                                ToastUtils.showBlackWhiteToastOnCenter(MainActivity.this, "开始导航");
                            }
                            DialogHelper.dismiss();
                        }
                    }, null);

                    break;
                case Contants.DIALOG_INPUT:
                    DialogHelper.showEditDialogOneButton(MainActivity.this, 0, "请输入电话号码", InputType.TYPE_CLASS_PHONE, null, 11, new DialogSinpleCallback() {
                        @Override
                        public void onEditFinish(int index, String content, Object object) {
                            super.onEditFinish(index, content, object);
                            ToastUtils.showBlackWhiteToastOnCenter(MainActivity.this, "输入的电话号码是：" + content);
                            DialogHelper.dismiss();
                        }
                    });
                    break;
                case Contants.DIALOG_PROGRESS:
                    DialogHelper.showProgressDialog(MainActivity.this, "正在加载...", true, true);
                    break;
                case Contants.DIALOG_PROGRESSBAR:
                    DialogHelper.showProgressBarDialog(MainActivity.this, "正在加载...", true, true);
                    break;
                case Contants.AUTO_MATIC_EDIT:
                    if (mHpEditText.getVisibility() == View.GONE) {
                        mHpEditText.setVisibility(View.VISIBLE);
                    } else {
                        mHpEditText.setVisibility(View.GONE);
                    }
                    break;
            }
        }
    }

}
