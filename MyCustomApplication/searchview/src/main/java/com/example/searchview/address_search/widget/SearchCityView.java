package com.example.searchview.address_search.widget;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.searchview.R;
import com.example.searchview.address_search.adapter.HotListAdapter;
import com.example.searchview.address_search.adapter.SortAdapter;
import com.example.searchview.address_search.bean.SearchDataType;
import com.example.searchview.address_search.bean.SortModel;
import com.example.searchview.address_search.config.CharacterParser;
import com.example.searchview.address_search.interfaces.OnClickListener;
import com.example.searchview.address_search.interfaces.OnItemClickListener;
import com.example.searchview.address_search.utils.AndroidSystemHelper;
import com.example.searchview.address_search.utils.PinyinComparator;
import com.example.searchview.address_search.utils.SizeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/11/22.
 */

public class SearchCityView {

    private Activity mContext;
    private List<SortModel> mHotCitys = new ArrayList<>();
    private List<SortModel> mCitys = new ArrayList<>();
    private OnItemClickListener mOnItemClickListener;
    private OnClickListener mOnClickListener;


    private ViewGroup mParentView;
    private ListView mSortListView;
    private GridView mHotListView;
    private SideBar mSideBar;
    private TextView mDialog;
    private SortAdapter mSortAdapter;
    private TextView mClearEditText;

    /**
     * 汉字转换成拼音的类
     */
    private CharacterParser characterParser;

    /**
     * 根据拼音来排列ListView里面的数据类
     */
    private PinyinComparator pinyinComparator;

    /**
     * GPS定位城市
     */
    private View mLocationView;
    private TextView mLocationBtn;
    private String mLocationCity = "";
    /**
     * 排序列表headerView个数
     */
    private int mHeadCount;

    /**
     * 热门城市
     *
     * @param savedInstanceState
     */
    private View mHotCitysView;
    private HotListAdapter mHotListAdapter;

    public SearchCityView(Activity context, ViewGroup parentView) {
        this.mContext = context;
        this.mParentView = parentView;
        init();
        initViews();
        initEvent();
        initData();
    }

    /**
     * 添加Item监听事件
     *
     * @param onItemClickListener
     */
    public SearchCityView addOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
        return this;
    }

    public SearchCityView addOnLocationClickListener(OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        return this;
    }

    /**
     * 隐藏搜索框
     */
    public SearchCityView hideSearchEdit() {
        mClearEditText.setVisibility(View.GONE);
        return this;
    }

    /**
     * 设置当前定位城市
     *
     * @param location
     */
    public SearchCityView setLocation(String location) {
        this.mLocationCity = location;
        this.mLocationBtn.setText(mLocationCity);
        return this;
    }

    /**
     * 设置城市列表
     *
     * @param hotCitys 热门城市列表
     * @param citys
     */
    public SearchCityView setData(String[] hotCitys, String[] citys) {
        this.mHotCitys = filledData(hotCitys);
        this.mCitys = filledData(citys);
        // 根据a-z进行排序源数据
        Collections.sort(mCitys, pinyinComparator);
        mHandler.sendEmptyMessage(0);
        return this;
    }

    /**
     * 设置城市列表
     *
     * @param citys
     */
    public SearchCityView setData(String[] citys) {
        this.mCitys = filledData(citys);
        // 根据a-z进行排序源数据
        Collections.sort(mCitys, pinyinComparator);
        mSortAdapter = new SortAdapter(mContext, mCitys);
        mSortListView.setAdapter(mSortAdapter);
        mHandler.sendEmptyMessage(0);
        return this;
    }

    public void init() {
        //实例化汉字转拼音类
        characterParser = new CharacterParser(mContext);
        pinyinComparator = new PinyinComparator();
    }

    private void initViews() {
        View convertView = LayoutInflater.from(mContext).inflate(R.layout.item_search_city_view, mParentView);
        mSortListView = (ListView) convertView.findViewById(R.id.country_lvcountry);
        mClearEditText = (TextView) convertView.findViewById(R.id.filter_edit);
        mSideBar = (SideBar) convertView.findViewById(R.id.sidrbar);
        mDialog = (TextView) convertView.findViewById(R.id.dialog);
        mSideBar.setTextView(mDialog);
        //当前定位城市
        mLocationView = LayoutInflater.from(mContext).inflate(R.layout.item_location_city, null);
        mLocationBtn = (TextView) mLocationView.findViewById(R.id.city_btn);
        //热门城市
        mHotCitysView = LayoutInflater.from(mContext).inflate(R.layout.item_hotcitys, null);
        mHotListView = (GridView) mHotCitysView.findViewById(R.id.hot_citys);
    }


    private void initEvent() {
        /**
         * 设置右侧触摸监听
         */
        mSideBar.setOnTouchingLetterChangedListener(new SideBar.OnTouchingLetterChangedListener() {

            @Override
            public void onTouchingLetterChanged(String s) {
                //该字母首次出现的位置
                int position = mSortAdapter.getPositionForSection(s.charAt(0));
                if (position != -1) {
                    mSortListView.setSelection(position);
                }
            }
        });

        /**
         * 城市列表点击事件监听
         */
        mSortListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //这里要利用adapter.getItem(position)来获取当前position所对应的对象
                int index;
                if (mHeadCount == 0) {
                    index = position;
                } else if (position - mHeadCount <= 0) {
                    index = 0;
                } else {
                    index = position - mHeadCount;
                }
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(mCitys.get(index).getPosition(), SearchDataType.SEARCH_DATA_TYPE_CITY, mCitys.get(index));
                }
            }
        });

        /**
         * 热门城市列表监听
         */
        mHotListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(position, SearchDataType.SEARCH_DATA_TYPE_HOT_CITY, mHotCitys.get(position));
                }
            }
        });

        mLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnClickListener != null) {
                    SortModel sortModel = new SortModel();
                    sortModel.setName(mLocationCity);
                    mOnClickListener.OnClick(sortModel);
                }
            }
        });

//        /**
//         * 根据输入框输入值的改变来过滤搜索
//         */
//        mClearEditText.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                //当输入框里面的值为空，更新为原来的列表，否则为过滤数据列表
//                filterData(s.toString());
//            }
//
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count,
//                                          int after) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//            }
//        });
    }


    private void initData() {
    }

    /**
     * 搜索框点击事件
     * @param listener
     */
    public void setSearchFuzzyOnclick(View.OnClickListener listener) {
        mClearEditText.setOnClickListener(listener);
    }

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    //设置热门城市数据源
                    if (mHotCitys != null && mHotCitys.size() > 0) {
                        mHotCitysView.setVisibility(View.VISIBLE);
                        if (mHotListAdapter == null) {
                            mHotListAdapter = new HotListAdapter(mContext, mHotCitys);
                        }
                        mHotListView.setAdapter(mHotListAdapter);
                        //设置城市列表数据源
                        if (mSortAdapter == null) {
                            mSortAdapter = new SortAdapter(mContext, mCitys);
                        }
                        mSortListView.setAdapter(mSortAdapter);
                    } else {
                        mHotCitysView.setVisibility(View.GONE);
                    }
                    this.sendEmptyMessage(1);
                    break;
                case 1:
                    if (mLocationCity != null && !mLocationCity.equals("")) {
                        mLocationView.setVisibility(View.VISIBLE);
                        //当前GPS定位城市
                        mLocationBtn.setText(mLocationCity);
                        mSortListView.addHeaderView(mLocationView);
                        mHeadCount++;
                    } else {
                        mLocationView.setVisibility(View.GONE);
                    }
                    this.sendEmptyMessage(2);
                    break;

                case 2:
                    //城市列表
                    if (mHotCitys != null && mHotCitys.size() > 0) {
                        int left = SizeUtils.dp2px(15, mContext);
                        int right = SizeUtils.dp2px(15, mContext);
                        int top = SizeUtils.dp2px(15, mContext);
                        int bottom = SizeUtils.dp2px(15, mContext);
                        AndroidSystemHelper.setGridViewHeight(mHotListView, left, right, top, bottom);
                        mHotListAdapter.notifyDataSetChanged();
                        mSortListView.addHeaderView(mHotCitysView);
                        mHeadCount++;
                    }
                    mSortAdapter.notifyDataSetChanged();
                    break;
            }
        }
    };


    /**
     * 为ListView填充数据
     *
     * @param date
     * @return
     */
    private List<SortModel> filledData(String[] date) {
        List<SortModel> mSortList = new ArrayList<SortModel>();

        for (int i = 0; i < date.length; i++) {
            SortModel sortModel = new SortModel();
            sortModel.setName(date[i]);
            sortModel.setPosition(i);
            //汉字转换成拼音
            String pinyin = characterParser.getSellingWithPolyphone(date[i]);
            String sortString = pinyin.substring(0, 1).toUpperCase();

            // 正则表达式，判断首字母是否是英文字母
            if (sortString.matches("[A-Z]")) {
                sortModel.setSortLetters(sortString.toUpperCase());
            } else {
                sortModel.setSortLetters("#");
            }

            mSortList.add(sortModel);
        }
        return mSortList;

    }

    /**
     * 根据输入框中的值来过滤数据并更新ListView
     *
     * @param filterStr
     */
    private void filterData(String filterStr) {
        List<SortModel> filterDateList = new ArrayList<SortModel>();

        if (TextUtils.isEmpty(filterStr)) {
            filterDateList = mCitys;
        } else {
            filterDateList.clear();
            for (SortModel sortModel : mCitys) {
                String name = sortModel.getName();
                if (name.indexOf(filterStr.toString()) != -1 || characterParser.getSellingWithPolyphone(name).startsWith(filterStr.toString())) {
                    filterDateList.add(sortModel);
                }
            }
        }

        // 根据a-z进行排序
        Collections.sort(filterDateList, pinyinComparator);
        mSortAdapter.updateListView(filterDateList);
    }
}
