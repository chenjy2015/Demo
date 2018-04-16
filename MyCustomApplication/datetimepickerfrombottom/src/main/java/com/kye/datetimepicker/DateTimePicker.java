package com.kye.datetimepicker;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.bigkoo.pickerview.TimePickerView;

import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by harry on 2017/12/29 下午6:43.
 * TODO 这个选择器到时候可以进一步封装，很多可以动态传入
 */
public class DateTimePicker {

    public interface DateTimeCallBack {
        void callBack(Date date);
    }

    public static TimePickerView show(Context context, boolean showYear, boolean showMonth, boolean showDay, boolean showHours, boolean showMins, boolean showSeconds, final DateTimeCallBack callBack) {
        return show(context, "", showYear, showMonth, showDay, showHours, showMins, showSeconds, null, null, callBack);
    }

    public static TimePickerView show(Context context, String title, boolean showYear, boolean showMonth, boolean showDay, boolean showHours, boolean showMins, boolean showSeconds, final DateTimeCallBack callBack) {
        return show(context, title, showYear, showMonth, showDay, showHours, showMins, showSeconds, null, null, callBack);
    }

    public static TimePickerView show(Context context, boolean showYear, boolean showMonth, boolean showDay, boolean showHours, boolean showMins, boolean showSeconds, int currentYear, int currentMonth, final DateTimeCallBack callBack) {
        return show(context, showYear, showMonth, showDay, showHours, showMins, showSeconds, null, null, currentYear, currentMonth, callBack);
    }

    public static TimePickerView show(Context context, boolean showYear, boolean showMonth, boolean showDay, boolean showHours, boolean showMins, boolean showSeconds, Calendar startDate, Calendar endDate, Calendar selectedDate, final DateTimeCallBack callBack) {
        WeakReference<Context> contextReference = new WeakReference<>(context);
        //控制时间范围(如果不设置范围，则使用默认时间1900-2100年，此段代码可注释)
        //因为系统Calendar的月份是从0-11的,所以如果是调用Calendar的set方法来设置时间,月份的范围也要是从0-11
        if (selectedDate == null) {
            selectedDate = Calendar.getInstance();
        }
        if (startDate == null) {
            startDate = Calendar.getInstance();
            startDate.set(2007, 0, 23);
        }
        if (endDate == null) {
            endDate = Calendar.getInstance();
            endDate.set(2117, 11, 28);
        }

        //时间选择器
        TimePickerView pvTime = new TimePickerView.Builder(contextReference.get(), new TimePickerView.OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {//选中事件回调
                if (callBack != null) {
                    callBack.callBack(date);
                }
            }
        })
                //年月日时分秒 的显示与否，不设置则默认全部显示
                .setType(new boolean[]{showYear, showMonth, showDay, showHours, showMins, showSeconds})
                .setLabel("年", "月", "日", "时", "分", "秒")
                .isCenterLabel(false)
                .setCancelText("取消")
                .setSubmitText("完成")
                .setSubmitColor(0xff4d317c)
                .setCancelColor(0xff999999)
                .setDividerColor(Color.DKGRAY)
                .setContentSize(16)
                .setDate(selectedDate)
                .setRangDate(startDate, endDate)
                //.setBackgroundId(0x00FFFFFF) //设置外部遮罩颜色
                .setDecorView(null)
                .build();

        if (context instanceof Activity) hideSoftInput((Activity) context);

        pvTime.show();
        return pvTime;
    }

    public static TimePickerView show(Context context,String title, boolean showYear, boolean showMonth, boolean showDay, boolean showHours, boolean
            showMins, boolean showSeconds, Calendar startDate, Calendar endDate, Calendar selectedDate, final DateTimeCallBack callBack) {
        WeakReference<Context> contextReference = new WeakReference<>(context);
        //控制时间范围(如果不设置范围，则使用默认时间1900-2100年，此段代码可注释)
        //因为系统Calendar的月份是从0-11的,所以如果是调用Calendar的set方法来设置时间,月份的范围也要是从0-11
        if (selectedDate == null) {
            selectedDate = Calendar.getInstance();
        }
        if (startDate == null) {
            startDate = Calendar.getInstance();
            startDate.set(2007, 0, 23);
        }
        if (endDate == null) {
            endDate = Calendar.getInstance();
            endDate.set(2117, 11, 28);
        }

        //时间选择器
        TimePickerView pvTime = new TimePickerView.Builder(contextReference.get(), new TimePickerView.OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {//选中事件回调
                if (callBack != null) {
                    callBack.callBack(date);
                }
            }
        })
                //年月日时分秒 的显示与否，不设置则默认全部显示
                .setTitleText(title)
                .setType(new boolean[]{showYear, showMonth, showDay, showHours, showMins, showSeconds})
                .setLabel("年", "月", "日", "时", "分", "秒")
                .isCenterLabel(false)
                .setCancelText("取消")
                .setSubmitText("完成")
                .setDividerColor(Color.DKGRAY)
                .setContentSize(16)
                .setDate(selectedDate)
                .setRangDate(startDate, endDate)
                //.setBackgroundId(0x00FFFFFF) //设置外部遮罩颜色
                .setDecorView(null)
                .build();

        if (context instanceof Activity) hideSoftInput((Activity) context);

        pvTime.show();
        return pvTime;
    }

    public static TimePickerView show(Context context, String title, boolean showYear, boolean showMonth, boolean showDay, boolean showHours, boolean showMins, boolean showSeconds, Calendar startDate, Calendar endDate, final DateTimeCallBack callBack) {
        WeakReference<Context> contextReference = new WeakReference<Context>(context);
        //控制时间范围(如果不设置范围，则使用默认时间1900-2100年，此段代码可注释)
        //因为系统Calendar的月份是从0-11的,所以如果是调用Calendar的set方法来设置时间,月份的范围也要是从0-11
        Calendar selectedDate = Calendar.getInstance();

        if (startDate == null) {
            startDate = Calendar.getInstance();
            startDate.set(2007, 0, 23);
        }
        if (endDate == null) {
            endDate = Calendar.getInstance();
            endDate.set(2117, 11, 28);
        }

        //时间选择器
        TimePickerView pvTime = new TimePickerView.Builder(contextReference.get(), new TimePickerView.OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {//选中事件回调
                if (callBack != null) {
                    callBack.callBack(date);
                }
            }
        })
                //年月日时分秒 的显示与否，不设置则默认全部显示
                .setTitleText(title)
                .setType(new boolean[]{showYear, showMonth, showDay, showHours, showMins, showSeconds})
                .setLabel("年", "月", "日", "时", "分", "秒")
                .isCenterLabel(false)
                .setCancelText("取消")
                .setSubmitText("完成")
                .setSubmitColor(0xff4d317c)
                .setCancelColor(0xff999999)
                .setDividerColor(Color.DKGRAY)
                .setContentSize(16)
                .setDate(selectedDate)
                .setRangDate(startDate, endDate)
                //.setBackgroundId(0x00FFFFFF) //设置外部遮罩颜色
                .setDecorView(null)
                .build();

        if (context instanceof Activity) hideSoftInput((Activity) context);

        pvTime.show();
        return pvTime;
    }

    public static TimePickerView show(Context context, boolean showYear, boolean showMonth, boolean showDay, boolean showHours, boolean showMins, boolean showSeconds, Calendar startDate, Calendar endDate, int currentYear, int currentMonth, final DateTimeCallBack callBack) {
        WeakReference<Context> contextReference = new WeakReference<>(context);

        Calendar selectedDate = Calendar.getInstance();
        selectedDate.set(Calendar.YEAR, currentYear);
        selectedDate.set(Calendar.MONTH, currentMonth);

        if (startDate == null) {
            startDate = Calendar.getInstance();
            startDate.set(2007, 0, 23);
        }
        if (endDate == null) {
            endDate = Calendar.getInstance();
            endDate.set(2117, 11, 28);
        }

        TimePickerView pvTime = new TimePickerView.Builder(contextReference.get(), new TimePickerView.OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {
                if (callBack != null) {
                    callBack.callBack(date);
                }
            }
        }).setType(new boolean[]{showYear, showMonth, showDay, showHours, showMins, showSeconds})
                .setLabel("年", "月", "日", "时", "分", "秒")
                .isCenterLabel(false)
                .setCancelText("取消")
                .setSubmitText("完成")
                .setSubmitColor(0xff4d317c)
                .setCancelColor(0xff999999)
                .setDividerColor(Color.DKGRAY)
                .setContentSize(16)
                .setDate(selectedDate)
                .setRangDate(startDate, endDate)
                .setDecorView(null)
                .build();

        if (context instanceof Activity) hideSoftInput((Activity) context);

        pvTime.show();
        return pvTime;
    }

    private static void hideSoftInput(Activity activity) {
        View view = activity.getCurrentFocus();
        if (view == null) return;
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm == null) return;
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
