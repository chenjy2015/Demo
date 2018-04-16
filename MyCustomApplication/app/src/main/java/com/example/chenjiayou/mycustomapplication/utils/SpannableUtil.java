package com.example.chenjiayou.mycustomapplication.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.BlurMaskFilter;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.Browser;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;

import com.kye.express.App;

/**
 * Android复合文本 工具类
 * <p>
 * Created by SkyYu on 2016/04/01
 */
public class SpannableUtil {

    /**
     * 构造函数私有化（不允许外部类 构建本类的实例 常见于单例模式：创建一个单例 可以提供一个对外提供产生一个对象的静态getter方法来生成这个单例）
     */
    private SpannableUtil() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 设置某段文字粗体
     */
    public static SpannableString setTextBold(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex > endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new StyleSpan(android.graphics.Typeface.BOLD),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    /**
     * 设置TextView的一段文本颜色
     */
    public static SpannableString setSectionTextColor(String content, int colorId, int startIndex, int endIndex) {
        SpannableString span = new SpannableString(content); span.setSpan(new ForegroundColorSpan(App.getContext().getResources().getColor(colorId)),
                                                                          startIndex,
                                                                          endIndex,
                                                                          Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); return span;
    }

    /**
     * 设置TextView的一段文本字体大小（单位dp）
     * <p>
     * add time : 2016/7/23
     * source : http://aichixihongshi.iteye.com/blog/1207503
     */
    public static SpannableString setSectionTextSize(CharSequence content, int size, int startIndex, int endIndex) {
        SpannableString sp = new SpannableString(content);
        //设置字体大小（绝对值,单位：像素）
        //sp.setSpan(new AbsoluteSizeSpan(20), 4, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sp.setSpan(new AbsoluteSizeSpan(size, true),
                   startIndex,
                   endIndex,
                   Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //第二个参数boolean dip，如果为true，表示前面的字体大小单位为dip，否则为像素，同上。
        return sp;
    }

    /**
     * 返回一个高亮spannable
     *
     * @param content 文本内容
     * @param color   高亮颜色
     * @param start   起始位置
     * @param end     结束位置
     *
     * @return 高亮spannable
     */
    public static CharSequence getHighLightText(String content, int color, int start, int end) {
        if (TextUtils.isEmpty(content)) {
            return "";
        } start = start >= 0 ? start : 0; end = end <= content.length() ? end : content.length(); SpannableString spannable = new SpannableString(
                content); CharacterStyle                                                                          span      = new ForegroundColorSpan(
                color); spannable.setSpan(span, start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); return spannable;
    }



    /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    /**
     * 以下来源：http://www.2cto.com/kf/201508/437801.html
     */

    /**
     * 1
     * BackgroundColorSpan 背景色
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param color
     *
     * @return
     */
    public static SpannableString setBackgroundColorSpan(String content, int startIndex, int endIndex, int color) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new BackgroundColorSpan(color),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    /**
     * 2
     * ClickableSpan 文本可点击，有点击事件
     * 去下划线的可点击span
     *
     * @param content
     * @param startIndex
     * @param endIndex
     * @param url
     *
     * @return
     */
    public static SpannableString setClickableSpan(String content, int startIndex, int endIndex, final String url) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new ClickableSpan() {

            @Override
            public void updateDrawState(TextPaint ds) {
//              super.updateDrawState(ds);
                ds.setColor(ds.linkColor); ds.setUnderlineText(false);
            }

            @Override
            public void onClick(View widget) {
                //url处理  跳转网页或其他
                Uri uri = Uri.parse(url); Context context = widget.getContext(); Intent intent = new Intent(Intent.ACTION_VIEW, uri); intent.putExtra(
                        Browser.EXTRA_APPLICATION_ID,
                        context.getPackageName()); context.startActivity(intent);
                //Log.i(span, url);
            }

        }, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); return spannableString;
    }

    /**
     * 2重载
     * ClickableSpan 文本可点击，有点击事件
     * 去下划线的可点击span
     *
     * @param content
     * @param startIndex
     * @param endIndex
     * @param clickableSpan 自己重写ClickableSpan的 updateDrawState与onClick方法
     *
     * @return
     */
    public static SpannableString setClickableSpan(String content, int startIndex, int endIndex, ClickableSpan clickableSpan) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); if (null != clickableSpan) {
            spannableString.setSpan(clickableSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } else {
            spannableString.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View widget) {
                    //Log.i(span, clicked);
                }
            }, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } return spannableString;
    }

    /**
     * 3
     * ForegroundColorSpan 前景色
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param color
     *
     * @return
     */
    public static SpannableString setForegroundColorSpan(String content, int startIndex, int endIndex, int color) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new ForegroundColorSpan(color),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    /**
     * 17
     * SubscriptSpan 下标（数学公式会用到）
     *
     * @param content
     * @param startIndex
     * @param endIndex
     *
     * @return
     */
    public static SpannableString setSubscriptSpan(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new SubscriptSpan(),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    /**
     * 18
     * SuperscriptSpan 上标（数学公式会用到）
     *
     * @param content
     * @param startIndex
     * @param endIndex
     *
     * @return
     */
    public static SpannableString setSuperscriptSpan(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new SuperscriptSpan(),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    /**
     * 4 (经测试无效，不知如何生效  硬件加速关闭也没有效果)
     * MaskFilterSpan 修饰效果，如模糊(BlurMaskFilter)、浮雕(EmbossMaskFilter)
     *
     * @param content
     * @param startIndex
     * @param endIndex
     * @param blurMaskFilter   模糊
     * @param embossMaskFilter 浮雕
     * @param maskFilter       其他自定义效果
     *
     * @return
     */
    public static SpannableString setMaskFilterSpan(String content,
                                                    int startIndex,
                                                    int endIndex,
                                                    BlurMaskFilter blurMaskFilter,
                                                    EmbossMaskFilter embossMaskFilter,
                                                    MaskFilter maskFilter) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); if (null == blurMaskFilter) {
            spannableString.setSpan(new BlurMaskFilter(50, BlurMaskFilter.Blur.SOLID), startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } else {
            spannableString.setSpan(blurMaskFilter, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } if (null == embossMaskFilter) {
            spannableString.setSpan(new EmbossMaskFilter(new float[]{1, 1, 1}, 0.4f, 6, (float) 3.5),
                                    startIndex,
                                    endIndex,
                                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } else {
            spannableString.setSpan(embossMaskFilter, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } if (null != maskFilter) {
            spannableString.setSpan(maskFilter, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } return spannableString;
    }

    /**
     * 7
     * StrikethroughSpan 删除线（中划线）
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     *
     * @return
     */
    public static SpannableString setStrikethroughSpan(String content, int startIndex, int endIndex) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new StrikethroughSpan(),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    /**
     * 8
     * SuggestionSpan 替换建议
     * @param content
     * @param startIndex
     * @param endIndex 设为0则到最后
     * @return
     */
    /*public static SpannableString setSuggestionSpan(String content,int startIndex,int endIndex) {
        if (0 == endIndex) {
            endIndex = content.length();
        }
        if( TextUtils.isEmpty( content ) || startIndex < 0 || endIndex > content.length( ) || startIndex >= endIndex ){
            return new SpannableString(content);
        }
        SpannableString spannableString = new SpannableString( content );
        spannableString.setSpan(new SuggestionSpan(Locale.CHINESE,new String[]{SuggestionSpan1,SuggestionSpan2,SuggestionSpan3}, SuggestionSpan
        .FLAG_EASY_CORRECT), startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }*/

    /**
     * 9
     * UnderlineSpan 下划线
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     *
     * @return
     */
    public static SpannableString setUnderlineSpan(String content, int startIndex, int endIndex) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new UnderlineSpan(),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    /**
     * 10
     * AbsoluteSizeSpan 绝对大小（文本字体）(不建议使用，因为此处指定的字号大小以px为单位)
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param size       字号，单位px
     *
     * @return
     */
    public static SpannableString setAbsoluteSizeSpan(String content, int startIndex, int endIndex, int size) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new AbsoluteSizeSpan(size),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    /**
     * 11
     * DynamicDrawableSpan 设置图片，基于文本基线或底部对齐
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param drawable   显示的图片
     *
     * @return
     */
    public static SpannableString setDynamicDrawableSpan(String content, int startIndex, int endIndex, final Drawable drawable) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content);
        //基线对齐
        spannableString.setSpan(new DynamicDrawableSpan(DynamicDrawableSpan.ALIGN_BASELINE) {

            @Override
            public Drawable getDrawable() {
                Drawable d = drawable; d.setBounds(0, 0, 50, 50); return d;
            }

        }, startIndex, startIndex + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //底部对齐
        spannableString.setSpan(new DynamicDrawableSpan(DynamicDrawableSpan.ALIGN_BOTTOM) {

            @Override
            public Drawable getDrawable() {
                Drawable d = drawable; d.setBounds(0, 0, 50, 50); return d;
            }

        }, startIndex + 1, startIndex + 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); return spannableString;
    }

    /**
     * 12
     * ImageSpan 图片
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param drawable   显示的图片
     *
     * @return
     */
    public static SpannableString setImageSpan(String content, int startIndex, int endIndex, final Drawable drawable) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); drawable.setBounds(0, 0, 50, 50); spannableString.setSpan(new ImageSpan(
                drawable), startIndex, startIndex + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); return spannableString;
    }

    /**
     * 13
     * RelativeSizeSpan 相对大小（文本字体）
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param size       字缩放倍数
     *
     * @return
     */
    public static SpannableString setRelativeSizeSpan(String content, int startIndex, int endIndex, float size) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new RelativeSizeSpan(size),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }
//  ScaleXSpan 基于x轴缩放

    /**
     * 15
     * ScaleXSpan 基于x轴缩放
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param size       x轴缩放倍数
     *
     * @return
     */
    public static SpannableString setScaleXSpan(String content, int startIndex, int endIndex, float size) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new ScaleXSpan(size),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    /**
     * 16
     * StyleSpan 字体样式：粗体、斜体等
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param flag       Typeface.xxx
     *
     * @return
     */
    public static SpannableString setStyleSpan(String content, int startIndex, int endIndex, int flag) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new StyleSpan(flag),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    /**
     * 19
     * TextAppearanceSpan 文本字体
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param activity
     *
     * @return
     */
    public static SpannableString setTextAppearanceSpan(String content, int startIndex, int endIndex, Context activity) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new TextAppearanceSpan(activity,
                                                                                                                         android.R.style.TextAppearance_Holo_Large_Inverse),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    /**
     * 20
     * TypefaceSpan 文本字体
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param family     The font family for this typeface.  Examples include monospace, serif, and sans-serif.
     *
     * @return
     */
    public static SpannableString setTypefaceSpan(String content, int startIndex, int endIndex, String family) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        } SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new TypefaceSpan(family),
                                                                                                  startIndex,
                                                                                                  endIndex,
                                                                                                  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }


    /**
     * 21
     * URLSpan 文本超链接
     *
     * @param content
     * @param startIndex
     * @param endIndex   设为0则到最后
     * @param url
     *
     * @return
     */
    public static SpannableString setURLSpan(String content, int startIndex, int endIndex, String url) {
        if (0 == endIndex) {
            endIndex = content.length();
        } if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex > content.length() || startIndex >= endIndex) {
            return new SpannableString(content);
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new URLSpan(url),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    /**
     * 以下来源：http://www.2cto.com/kf/201409/333384.html
     */

    /**
     * 改变字符串中某一段文字的字号
     * setTextSize("",24,0,2) = null;
     * setTextSize(null,24,0,2) = null;
     * setTextSize("abc",-2,0,2) = null;
     * setTextSize("abc",24,0,4) = null;
     * setTextSize("abc",24,-2,2) = null;
     * setTextSize("abc",24,0,2) = normal string
     */
    public static SpannableString setTextSize(String content, int startIndex, int endIndex, int fontSize) {
        if (TextUtils.isEmpty(content) || fontSize <= 0 || startIndex >= endIndex || startIndex < 0 || endIndex >= content.length()) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new AbsoluteSizeSpan(fontSize),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextSub(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new SubscriptSpan(),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextSuper(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new SuperscriptSpan(),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextStrikethrough(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new StrikethroughSpan(),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextUnderline(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new UnderlineSpan(),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextItalic(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new StyleSpan(android.graphics.Typeface.ITALIC),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextBoldItalic(String content, int startIndex, int endIndex) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new StyleSpan(android.graphics.Typeface.BOLD_ITALIC),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextForeground(String content, int startIndex, int endIndex, int foregroundColor) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new ForegroundColorSpan(foregroundColor),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextBackground(String content, int startIndex, int endIndex, int backgroundColor) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new BackgroundColorSpan(backgroundColor),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    /**
     * 设置文本的超链接
     *
     * @param content    需要处理的文本
     * @param startIndex
     * @param endIndex   被处理文本中需要处理字串的开始和结束索引
     * @param url        文本对应的链接地址，需要注意格式： （1）电话以"tel:"打头，比如"tel:02355692427" （2）邮件以"mailto:"打头，比如"mailto:zmywly8866@gmail.com"
     *                   （3）短信以"sms:"打头，比如"sms:02355692427" （4）彩信以"mms:"打头，比如"mms:02355692427" （5）地图以"geo:"打头，比如"geo:68.426537,68.123456"
     *                   （6）网络以"http://"打头，比如"http://www.google.com"
     */
    public static SpannableString setTextURL(String content, int startIndex, int endIndex, String url) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new URLSpan(url),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString setTextImg(String content, int startIndex, int endIndex, Drawable drawable) {
        if (TextUtils.isEmpty(content) || startIndex < 0 || endIndex >= content.length() || startIndex >= endIndex) {
            return null;
        }

        SpannableString spannableString = new SpannableString(content); spannableString.setSpan(new ImageSpan(drawable),
                                                                                                startIndex,
                                                                                                endIndex,
                                                                                                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

}
