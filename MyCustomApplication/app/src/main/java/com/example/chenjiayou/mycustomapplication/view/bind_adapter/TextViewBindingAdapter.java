package com.example.chenjiayou.mycustomapplication.view.bind_adapter;

import android.databinding.BindingAdapter;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.text.TextUtils;
import android.widget.TextView;

import com.kye.express.R;
import com.kye.model.bean.integral.IntegralRecordType;

import java.util.Date;

public class TextViewBindingAdapter {

    @BindingAdapter({"textcolor"})
    public static void setTextColor(TextView view, String color) {
        if (view != null){
            if (!TextUtils.isEmpty(color)){
                view.setTextColor(Color.parseColor("#"+color));
            }else{
                view.setTextColor(view.getContext().getResources().getColor(R.color.black_333));
            }
        }
    }

    @BindingAdapter({"textDateFormat"})
    public static void textDateFormat(TextView view, long date) {
        String dateTx = view.getContext().getResources().getString(R.string.common_date_2, new Date(date));
        view.setText(dateTx);
    }

    @BindingAdapter({"textSetBold"})
    public static void textSetBold(TextView view, IntegralRecordType type) {
        if (type == IntegralRecordType.TYPE_EXCHANGE) {
            view.setTypeface(view.getTypeface(), Typeface.BOLD);
        } else {
            view.setTypeface(view.getTypeface(), Typeface.NORMAL);
        }
    }

    @BindingAdapter({"android:textColor"})
    public static void setTextColor(TextView view, @ColorInt int color) {
        view.setTextColor(color);
    }

    @BindingAdapter({"underline"})
    public static void setUnderline(TextView view, boolean underline) {
        if (underline) {
            view.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        } else {
            view.getPaint().setFlags(0);
        }
    }
}
