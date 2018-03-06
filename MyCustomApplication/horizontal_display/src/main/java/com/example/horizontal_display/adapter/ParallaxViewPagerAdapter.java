package com.example.horizontal_display.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.support.v4.view.PagerAdapter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bm.library.PhotoView;
import com.example.horizontal_display.R;
import com.example.horizontal_display.anim.Rotate3dAnimation;
import com.example.horizontal_display.bean.PhotoBeanVO;
import com.example.horizontal_display.utils.ImgUtils;
import com.example.horizontal_display.utils.StrUtils;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ParallaxViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    public List<PhotoBeanVO> mData;
    public List<ViewHolder> mViewHolderList;
    private final int widthP;
    private final int heightP;
    private int size;           //初始化时的数据源大小 如果数据源发生变化则刷新View避免View没有销毁的情况

    public ParallaxViewPagerAdapter(Context context, List<PhotoBeanVO> data) {
        this.mContext = context;
        this.mData = data;
        size = mData.size();
        this.mViewHolderList = new ArrayList<ViewHolder>();
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager wm = (WindowManager) mContext
                .getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(dm);
        widthP = dm.widthPixels;
        heightP = dm.heightPixels;
    }

    @Override
    public int getCount() {
        if (mViewHolderList != null) {
            mViewHolderList.clear();
        }
        for (int i = 0; i < mData.size(); i++) {
            ViewHolder viewHolder = new ViewHolder();
            mViewHolderList.add(viewHolder);
        }
        return mData.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return size != mData.size() ? POSITION_NONE : super.getItemPosition(object);
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_parallax_viewpager_adapter, null);
        //ImageViewTouch imageView = (ImageViewTouch) view.findViewById(R.id.id_touch_img);
        ViewHolder viewHolder = mViewHolderList.get(position);
        viewHolder.initView(view, position);
        container.addView(view);
        return view;
    }

    public class ViewHolder implements Serializable {
        private RelativeLayout mLayout;
        private PhotoView mPhotoView;
        private LinearLayout mTextLayout;
        private TextView mTextView;
        private ProgressBar mLoadingBar;

        public ViewHolder() {

        }

        public void initView(View parentView, int position) {
            mLayout = (RelativeLayout) parentView.findViewById(R.id.id_layout);
            mTextLayout = (LinearLayout) parentView.findViewById(R.id.id_text_layout);
            mTextView = (TextView) parentView.findViewById(R.id.id_text);
            mPhotoView = (PhotoView) parentView.findViewById(R.id.id_photo_img);
            mLoadingBar = (ProgressBar) parentView.findViewById(R.id.loading_progressbar);
            mPhotoView.enable();//开启放大缩小
            PhotoBeanVO photoBeanVO = mData.get(position);
            initImageUrl(photoBeanVO);
            mLayout.setOnClickListener(new OnClick());
        }

        /**
         * 判断逻辑 首先读取网络地址 然后读取本地file地址 然后读取base64字符串
         *
         * @param photoBeanVO
         */
        public void initImageUrl(PhotoBeanVO photoBeanVO) {
            String url = photoBeanVO.getUrl();

            if (!StrUtils.isNullOrEmpty(url)) { //判断网络地址是否为空
                loadImage(url, 0);

            } else if (!StrUtils.isNullOrEmpty(photoBeanVO.getPath())) { //判断本地file文件地址是否为空
                url = photoBeanVO.getPath();
                loadImage(url, 1);

            } else if (!StrUtils.isNullOrEmpty(photoBeanVO.getBase64())) {//判断base64字符串是否为空
                url = photoBeanVO.getBase64();
                loadImage(url, 2);

            } else { //如果地址都为空 则显示默认图片
                loadImage(url, -1);
            }
        }

        /**
         * 加载图片
         *
         * @param url
         * @param type 0 网络地址 1 本地图片地址 2 base64字符串 -1默认图片
         */
        public void loadImage(String url, int type) {
            if (type == 0 || type == 1) {
                if (type == 1) {
                    url = "file:///" + url;
                }
                ImageLoader.getInstance().loadImage(url, new ImageLoadingListener() {
                    @Override
                    public void onLoadingStarted(String s, View view) {
                        mPhotoView.setImageResource(R.mipmap.ic_empty);
                        mLoadingBar.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onLoadingFailed(String s, View view, FailReason failReason) {
                        mPhotoView.setImageResource(R.mipmap.ic_error);
                        mLoadingBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                        mLoadingBar.setVisibility(View.GONE);
                        setImage(bitmap);
                    }

                    @Override
                    public void onLoadingCancelled(String s, View view) {

                    }
                });
            } else if (type == 2) {
                Bitmap bitmap = ImgUtils.Base64StringToBitmap2(url);
                setImage(bitmap);
                mLoadingBar.setVisibility(View.GONE);

            } else if (type == -1) {
                mPhotoView.setImageResource(R.mipmap.ic_error);
                mLoadingBar.setVisibility(View.GONE);
            }
        }


        public void setImage(Bitmap bitmap) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            //如果图片宽度大于高度
            float bi = 0;
            bi = widthP / width;
            if (bi != 0) {
                Matrix matrix = new Matrix();
                matrix.postScale(bi, bi); //长和宽放大缩小的比例
                try {
                    Bitmap resizeBmp = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    int w = resizeBmp.getWidth();
                    int h = resizeBmp.getHeight();
                    Log.d("ParallaxViewPagerAdapter", "w: " + w + " \t h: " + h);
                    mPhotoView.setImageBitmap(resizeBmp);
                } catch (Exception e) {
                    e.printStackTrace();
                    mPhotoView.setImageBitmap(bitmap);
                }
//                recyleBitmap(bitmap);
            } else {
                mPhotoView.setImageBitmap(bitmap);
            }
        }

        public void recyleBitmap(Bitmap bitmap) {
            bitmap.recycle();
        }


        public void initEvent() {
            mPhotoView.setOnLongClickListener(new OnLongClick());
            mTextView.setOnClickListener(new OnClick());
        }

        public class OnLongClick implements View.OnLongClickListener {

            @Override
            public boolean onLongClick(View v) {
                // 获取布局的中心点位置，作为旋转的中心点
                float centerX = mLayout.getWidth() / 2f;
                float centerY = mLayout.getHeight() / 2f;
                // 构建3D旋转动画对象，旋转角度为0到90度，这使得ListView将会从可见变为不可见
                final Rotate3dAnimation rotation = new Rotate3dAnimation(0, 90, centerX, centerY,
                        310.0f, true);
                // 动画持续时间500毫秒
                rotation.setDuration(500);
                // 动画完成后保持完成的状态
                rotation.setFillAfter(true);
                rotation.setInterpolator(new AccelerateInterpolator());
                // 设置动画的监听器
                rotation.setAnimationListener(new TurnToTextView());
                mLayout.startAnimation(rotation);
                return false;
            }
        }

        public class OnClick implements View.OnClickListener {

            @Override
            public void onClick(View v) {
                // 获取布局的中心点位置，作为旋转的中心点
                float centerX = mLayout.getWidth() / 2f;
                float centerY = mLayout.getHeight() / 2f;
                // 构建3D旋转动画对象，旋转角度为360到270度，这使得ImageView将会从可见变为不可见，并且旋转的方向是相反的
                final Rotate3dAnimation rotation = new Rotate3dAnimation(360, 270, centerX,
                        centerY, 310.0f, true);
                // 动画持续时间500毫秒
                rotation.setDuration(500);
                // 动画完成后保持完成的状态
                rotation.setFillAfter(true);
                rotation.setInterpolator(new AccelerateInterpolator());
                // 设置动画的监听器
                rotation.setAnimationListener(new TurnToImageView());
                mLayout.startAnimation(rotation);
            }
        }


        /**
         * 注册在ListView点击动画中的动画监听器，用于完成ListView的后续动画。
         *
         * @author guolin
         */
        class TurnToTextView implements Animation.AnimationListener {


            @Override
            public void onAnimationStart(Animation animation) {
            }

            /**
             * 当ListView的动画完成后，还需要再启动ImageView的动画，让ImageView从不可见变为可见
             */
            @Override
            public void onAnimationEnd(Animation animation) {
                // 获取布局的中心点位置，作为旋转的中心点
                float centerX = mLayout.getWidth() / 2f;
                float centerY = mLayout.getHeight() / 2f;
                // 将ListView隐藏
                mTextLayout.setVisibility(View.VISIBLE);
                // 将ImageView显示
                mPhotoView.setVisibility(View.GONE);
                mPhotoView.requestFocus();
                // 构建3D旋转动画对象，旋转角度为270到360度，这使得ImageView将会从不可见变为可见
                final Rotate3dAnimation rotation = new Rotate3dAnimation(270, 360, centerX, centerY,
                        310.0f, false);
                // 动画持续时间500毫秒
                rotation.setDuration(500);
                // 动画完成后保持完成的状态
                rotation.setFillAfter(true);
                rotation.setInterpolator(new AccelerateInterpolator());
                mLayout.startAnimation(rotation);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

        }

        /**
         * 注册在ImageView点击动画中的动画监听器，用于完成ImageView的后续动画。
         *
         * @author guolin
         */
        class TurnToImageView implements Animation.AnimationListener {


            @Override
            public void onAnimationStart(Animation animation) {
            }

            /**
             * 当ImageView的动画完成后，还需要再启动ListView的动画，让ListView从不可见变为可见
             */
            @Override
            public void onAnimationEnd(Animation animation) {
                // 获取布局的中心点位置，作为旋转的中心点
                float centerX = mLayout.getWidth() / 2f;
                float centerY = mLayout.getHeight() / 2f;
                // 将ImageView隐藏
                mPhotoView.setVisibility(View.VISIBLE);
                // 将ListView显示
                mTextLayout.setVisibility(View.GONE);
                mTextLayout.requestFocus();
                // 构建3D旋转动画对象，旋转角度为90到0度，这使得ListView将会从不可见变为可见，从而回到原点
                final Rotate3dAnimation rotation = new Rotate3dAnimation(90, 0, centerX, centerY,
                        310.0f, false);
                // 动画持续时间500毫秒
                rotation.setDuration(500);
                // 动画完成后保持完成的状态
                rotation.setFillAfter(true);
                rotation.setInterpolator(new AccelerateInterpolator());
                mLayout.startAnimation(rotation);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

        }
    }

}