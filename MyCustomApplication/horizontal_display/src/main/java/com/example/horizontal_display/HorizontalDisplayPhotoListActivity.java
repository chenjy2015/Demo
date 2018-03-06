package com.example.horizontal_display;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.example.horizontal_display.adapter.ParallaxViewPagerAdapter;
import com.example.horizontal_display.bean.PhotoBeanVO;
import com.example.horizontal_display.parallax_viewpager.ParallaxViewPager;

import java.util.ArrayList;


/**
 * @author cjy
 * @version V1.0
 * @company MyGril
 * @Description 横向浏览图片模式
 * @date 2016/4/22
 */
public class HorizontalDisplayPhotoListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private ParallaxViewPager mParallaxViewPager;
    private ParallaxViewPagerAdapter mPagerAdapter;
    private int mCurrentItem;               //当前页
    private String title;
    private String className;
    private String action;
    private String[] mBeanJson;
    private ArrayList<PhotoBeanVO> mPhotoBeanVOs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        StaticInit.init(this.getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_display_photo_list);
        initView();
        init();
        initEvent();
        initData();
    }

    public void initView() {
        mParallaxViewPager = findViewById(R.id.id_parallax_viewpager);
    }


    public void init() {
        mCurrentItem = getIntent().getIntExtra("index", 0);
        mBeanJson = getIntent().getStringArrayExtra("beans");
    }

    public void initEvent() {
    }

    public void initData() {

        if (mBeanJson == null){
            return;
        }
        initPhotoBeans(mBeanJson);
        if (mPhotoBeanVOs == null || mPhotoBeanVOs.size() < 1) {
            return;
        }
        initViewPager();
    }

    private void initPhotoBeans(String[] json){
        if (json == null || "".equals(json)){
            return ;
        }
        mPhotoBeanVOs = new ArrayList<PhotoBeanVO>();
        try {
            for (String s: json){
                PhotoBeanVO photoBeanVO = new PhotoBeanVO();
                photoBeanVO.setUrl(s);
                mPhotoBeanVOs.add(photoBeanVO);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * 初始化翻页数据
     */
    private void initViewPager() {
        mPagerAdapter = new ParallaxViewPagerAdapter(this, mPhotoBeanVOs);
        mParallaxViewPager.setAdapter(mPagerAdapter);
        mParallaxViewPager.setCurrentItem(mCurrentItem);//设置当前页
        mParallaxViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                mCurrentItem = position;
//                mTitleBar.setCenterText("图片详情  (" + (1 + mCurrentItem) + "/" + mPhotoBeanVOs.size() + ")");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        return false;
    }

}