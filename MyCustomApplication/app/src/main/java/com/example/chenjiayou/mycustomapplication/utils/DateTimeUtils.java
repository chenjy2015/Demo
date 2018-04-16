package com.example.chenjiayou.mycustomapplication.utils;

import android.support.annotation.Nullable;
import android.text.format.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class DateTimeUtils {

    /**
     * 获取现在时间
     *
     * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
     */
    public static String getStringDate(long currentTimeMillis) {
        Date             currentTime = new Date(currentTimeMillis);
        SimpleDateFormat formatter   = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String           dateString  = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 获取现在时间 指定格式
     *
     * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
     */
    public static String getStringDate(long currentTimeMillis, String format) {
        Date             currentTime = new Date(currentTimeMillis);
        SimpleDateFormat formatter   = new SimpleDateFormat(format);
        String           dateString  = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 获取当前日期是星期几<br>
     *
     * @param date
     *
     * @return 当前日期是星期几
     */
    public static String getWeekOfDate(Date date) {
        String[] weeks = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal   = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (week_index < 0) {
            week_index = 0;
        }
        return weeks[week_index];
    }

    /**
     * 判断2个日期是否是同一天
     * <p>
     * source http://blog.csdn.net/u013174217/article/details/53691192
     */
    public static boolean sameDate(Date d1, Date d2) {
        if (null == d1 || null == d2) { return false; }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(d1);
        cal1.set(Calendar.HOUR_OF_DAY, 0);
        cal1.set(Calendar.MINUTE, 0);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d2);
        cal2.set(Calendar.HOUR_OF_DAY, 0);
        cal2.set(Calendar.MINUTE, 0);
        cal2.set(Calendar.SECOND, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        return cal1.getTime().equals(cal2.getTime());
    }

    /**
     * 或者每个月第1天
     * <p>
     * source https://www.cnblogs.com/lr393993507/p/5542607.html
     */
    public static String getCurrentMonthFirst() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar         c      = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
        return format.format(c.getTime());
    }

    /**
     * String类型时间 转 Date类型
     * <p>
     * source https://www.cnblogs.com/nzhbk/p/6489748.html
     */
    @Nullable
    public static Date StringToDate(String first) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        Date             date       = null;
        try {
            date = dateFormat.parse(first);
            System.out.println(date.toLocaleString().split(" ")[0]);//切割掉不要的时分秒数据
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 获取指定月份的第一天及最后一天
     *
     * @param date 日期
     *
     * @return
     */
    public static Map<String, String> getCustomMonthFirstAndLast(Date date) {
        SimpleDateFormat df       = new SimpleDateFormat("yyyy-MM-dd");
        Calendar         calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 0);
        Date theDate = calendar.getTime();

        //上个月第一天
        GregorianCalendar gcLast = (GregorianCalendar) Calendar.getInstance();
        gcLast.setTime(theDate);
        gcLast.set(Calendar.DAY_OF_MONTH, 1);
        String       day_first = df.format(gcLast.getTime());
        StringBuffer str       = new StringBuffer().append(day_first).append(" 00:00:00");
        day_first = str.toString();

        //上个月最后一天
        calendar.add(Calendar.MONTH, 1);    //加一个月
        calendar.set(Calendar.DATE, 1);        //设置为该月第一天
        calendar.add(Calendar.DATE, -1);    //再减一天即为上个月最后一天
        String       day_last = df.format(calendar.getTime());
        StringBuffer endStr   = new StringBuffer().append(day_last).append(" 23:59:59");
        day_last = endStr.toString();

        Map<String, String> map = new HashMap<String, String>();
        map.put("first", day_first);
        map.put("last", day_last);
        return map;
    }

    /**
     * 判断选择的日期是否是本月
     * <p>
     * source http://blog.csdn.net/j525dzq/article/details/41647417
     */
    public static boolean isThisMonth(long time) {
        return isThisTime(time, "yyyy-MM");
    }

    private static boolean isThisTime(long time, String pattern) {
        Date             date  = new Date(time);
        SimpleDateFormat sdf   = new SimpleDateFormat(pattern);
        String           param = sdf.format(date);//参数时间
        String           now   = sdf.format(new Date());//当前时间
        if (param.equals(now)) {
            return true;
        }
        return false;
    }

    /**
     * 获取当前日期的下个月1号
     * <p>
     * source https://zhidao.baidu.com/question/134634587897923445.html
     */
    public static Date nextMonthFirstDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.MONTH, 1);
        return calendar.getTime();
    }

    /**
     * 把传入Date的月份提取出来
     * <p>
     * source https://zhidao.baidu.com/question/286298954.html
     */
    public static int getDateMonth(Date currentDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        return cal.get(Calendar.MONTH);
    }

    public static String getStringDateTime(long currentTimeMillis) {
        Date             currentTime = new Date(currentTimeMillis);
        SimpleDateFormat formatter   = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter2  = new SimpleDateFormat("HH:mm:ss");
        String           dateString  = formatter.format(currentTime);
        String           timeString  = formatter2.format(currentTime);
        return dateString + "T" + timeString;
    }

    public static String getStringDateTime1(long currentTimeMillis) {
        Date             currentTime = new Date(currentTimeMillis);
        SimpleDateFormat formatter   = new SimpleDateFormat("yyyy-MM-dd");
        String           dateString  = formatter.format(currentTime);
        return dateString;
    }


    /**
     * 获取现在时间 年月日
     *
     * @return返回字符串格式 yyyy-MM-dd
     */
    public static String getStringDateByMounthDay(long currentTimeMillis) {
        Date             currentTime = new Date(currentTimeMillis);
        SimpleDateFormat formatter   = new SimpleDateFormat("yyyy-MM-dd");
        String           dateString  = formatter.format(currentTime);
        return dateString;
    }

    public static String getStringByDate(Date date) {
        SimpleDateFormat formatter  = new SimpleDateFormat("yyyy-MM-dd");
        String           dateString = formatter.format(date);
        return dateString;
    }


    public static String getCurrentTime() {
        String str = DateFormat.format("yyyy-M-d kk:mm:ss", Calendar.getInstance().getTime()).toString();//获得系统时间
        return str;
    }

    public static String getCurrentTimeNoSecond() {
        String str = DateFormat.format("yyyy-MM-dd kk:mm", Calendar.getInstance().getTime()).toString();//获得系统时间
        return str;
    }

    public static String getCurrentDate() {
        String str = DateFormat.format("yyyy-MM-dd", Calendar.getInstance().getTime()).toString();//获得系统时间
        return str;
    }

    public static String getCurrentFullDate() {
        return DateFormat.format("yyyy-MM-dd HH:mm:ss", Calendar.getInstance().getTime()).toString();
    }

    public static String getCurrentDayAndMinue(long time) {
        String str = DateFormat.format("MM-dd HH:mm", time).toString();//获得系统时间
        return str;
    }


    /**
     * 将时间格式为yyyy-MM-dd HH:mm:ss转换为long
     */
    public static long getOderTime(String time) {
        long millionSeconds;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            millionSeconds = sdf.parse(time).getTime();//毫秒
            return millionSeconds;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 将时间格式为yyyy-MM-dd HH:mm:ss转换为long
     */
    public static long getSimpleLongTime(String time) {
        long millionSeconds;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            millionSeconds = sdf.parse(time).getTime();//毫秒
            return millionSeconds;
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * 将时间格式为yyyy-MM-dd转换为long
     */
    public static long getSimpleLongDDTime(String time) {
        long millionSeconds;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            millionSeconds = sdf.parse(time).getTime();//毫秒
            return millionSeconds;
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * 将自定义格式时间，转换为long
     */
    public static long getSimpleLongTime(String time, String format) {
        long millionSeconds;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            millionSeconds = sdf.parse(time).getTime();//毫秒
            return millionSeconds;
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * 将时间格式为yyyy-MM-dd Date
     */
    public static Date strToDate(String time) {
        Date millionSeconds = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            millionSeconds = sdf.parse(time);//毫秒
            return millionSeconds;
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * 与当前时间对比  是否是同一天
     *
     * @param time
     *
     * @return
     */
    public static boolean isTheSameDay(long time) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        int year         = cal.get(Calendar.YEAR);
        int month        = cal.get(Calendar.MONTH);
        int day          = cal.get(Calendar.DAY_OF_MONTH);
        int currentYear  = Calendar.getInstance().get(Calendar.YEAR);
        int currentDay   = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        if (year == currentYear && month == currentMonth && day == currentDay) {
            return true;
        }
        return false;
    }

    /**
     * 获得当前系统日期(只获取年，用于航班日期判断显示日期有用)
     *
     * @return
     */
    public static String getFightDateTime() {
        SimpleDateFormat myFmt2 = new SimpleDateFormat("yyyy");
        Date             now    = new Date();
        String           date   = myFmt2.format(now);
        return date;
    }

    /**
     * 判断是否是工作时间
     *
     * @return
     */
    public static boolean isWorkTime() {
        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
//        String mYear = String.valueOf(c.get(Calendar.YEAR)); // 获取当前年份
//        String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// 获取当前月份
//        String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// 获取当前月份的日期号码
        int    mHour = c.get(Calendar.HOUR_OF_DAY);//获取当前的小时数
        String mWay  = String.valueOf(c.get(Calendar.DAY_OF_WEEK));
        if ("1".equals(mWay) || "7".equals(mWay)) {// 1 是星期日  7是星期六
            return false;
//        }else if("2".equals(mWay) || "3".equals(mWay) || "4".equals(mWay) || "5".equals(mWay) || "6".equals(mWay)){
        } else {
            if (mHour < 9 || mHour >= 18) {
                return false;
            } else {
                return true;
            }
        }
    }

    /**
     * 接收消息提醒时间设置   8点至22点不提醒
     *
     * @return
     */
    public static boolean isSetingShow() {
        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        int mHour = c.get(Calendar.HOUR_OF_DAY);//获取当前的小时数
        if (mHour >= 8 && mHour < 22) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 是否在当前时间区间内
     *
     * @param startTime 开始时间，时
     * @param endTime   结束时间，时
     *
     * @return
     */
    public static boolean isTimeSpace(int startTime, int endTime) {
        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        int mHour = c.get(Calendar.HOUR_OF_DAY);//获取当前的小时数
        if (mHour >= startTime && mHour < endTime) {
            return true;
        } else {
            return false;
        }
    }

    /***
     *  获取指定日后 后 dayAddNum 天的 日期
     *  @param dayAddNum 增加天数 格式为int;
     *  @return
     */
    public static String getDateAdd(String date, int dayAddNum) {
        String dateOk = "";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date             newDate2         = new Date(simpleDateFormat.parse(date).getTime() + dayAddNum * 24 * 60 * 60 * 1000);
            dateOk = simpleDateFormat.format(newDate2);
        } catch (Exception e) {
        }
        return dateOk;
    }

    /**
     * 转换日期格式
     *
     * @param date
     *
     * @return
     */
    public static String changeFormat(String date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date             d                = simpleDateFormat.parse(date);
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = simpleDateFormat.format(d);
        } catch (ParseException e) {
        }
        return date;
    }

    /**
     * 转换日期格式
     *
     * @param date
     *
     * @return
     */
    public static String changeDateFormat(String date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date             d                = simpleDateFormat.parse(date);
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            date = simpleDateFormat.format(d);
        } catch (ParseException e) {
        }
        return date;
    }

    /**
     * 对前一个星期或后一个星期日期的获取
     *
     * @param date
     * @param type 0获取后一个星期 1 获取前一个星期
     *
     * @return
     */
    public static Date getWeekDayByType(Date date, int type) {
        String mYear; // 当前年
        String mMonth; // 月
        String mDay;
        int    current_day;
        int    current_month;
        int    current_year;

        //设置当前时间
        final Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        current_year = c.get(Calendar.YEAR);
        current_month = c.get(Calendar.MONTH);
        current_day = c.get(Calendar.DAY_OF_MONTH);

        c.set(Calendar.MONTH, current_month);
        c.set(Calendar.DAY_OF_MONTH, current_day);
        c.set(Calendar.YEAR, current_year);
        if (type == 0) {
            c.add(Calendar.DATE, +7);//j记住是DATE
        } else {
            c.add(Calendar.DATE, -7);//j记住是DATE
        }
        mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);// 获取当前月份
        mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));// 获取当前日份的日期号码
        mYear = String.valueOf(c.get(Calendar.YEAR));// 获取当前年份
        String dateTime = mYear + "年" + mMonth + "月" + mDay + "日";
        return c.getTime();
    }

    /**
     * 判断是否超出指定时间 单位天数
     *
     * @param startMillon
     * @param endMillon
     * @param day
     *
     * @return
     */
    public static boolean isExceed(long startMillon, long endMillon, int day) {
        int dayMillon = 24 * 60 * 60 * 1000;
        if ((endMillon - startMillon) > dayMillon * day) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 获取距离现在半年前或半年后的时间 且半年后时间不大于当前时间
     * 并去除时分秒
     *
     * @param time
     */
    public static Date getTimeBYCurrentToHalfYear(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.MONTH, -6);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        int year   = calendar.get(Calendar.YEAR);
        int month  = calendar.get(Calendar.MONTH);
        int day    = calendar.get(Calendar.DAY_OF_MONTH);
        int hours  = calendar.get(Calendar.HOUR_OF_DAY);
        int hours1 = calendar.get(Calendar.HOUR);
        int minue  = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        return calendar.getTime();
    }

    /**
     * 获取距离现在10年前的时间
     */
    public static Calendar getTimeBYCurrentToTenfYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int year = calendar.get(Calendar.YEAR);
        calendar.set(Calendar.YEAR, (year - 10));
        return calendar;
    }


    /**
     * 获取距离现在时间为一周前的时间 且一周后时间不大于当前时间 一周前不大于半年前时间
     *
     * @param type type:1 一周前 type:2 一周后
     *
     * @return
     */
    public static Date getDayToWeekBeforeCurrentTime(Date date, int type) {
        long day = (1000 * 60 * 60 * 24);
        if (type == 1) {
            Date halfYearDate = getTimeBYCurrentToHalfYear(date.getTime());
            if ((date.getTime() - (day * 6)) < halfYearDate.getTime()) {
                return halfYearDate;
            } else {
                date.setTime(date.getTime() - (day * 6));
                return date;
            }
        } else {
            Date current = new Date(System.currentTimeMillis());
            if (current.getTime() < date.getTime() + (day * 6)) {
                return current;
            } else {
                date.setTime(date.getTime() + (day * 6));
                return date;
            }
        }
    }

    /**
     * 距离当前时间两小时之内的日期，和两小时之外的日期
     *
     * @param startDay
     * @param endDay
     * @param type     type:1 两小时之内的 type:2 两小时之外的
     *
     * @return
     */
    public static boolean getStartDiffEndByTwoHours(Date startDay, Date endDay, int type) {
        if (endDay.getTime() < startDay.getTime()) {
            return false;
        }
        long diff = endDay.getTime() - startDay.getTime();
        if (diff < 0) diff = 0;
        long hours = diff / (1000 * 60 * 60);

        if (type == 1 && hours >= 0 && hours < 2) {
            return true;
        }
        if (type == 2 && hours >= 2) {
            return true;
        }

        return false;
    }

    /**
     * 距离当前时间一天内的日期，和两小时之外的日期
     *
     * @param startDay
     * @param endDay
     * @param type     type:1 1天之内的 type:2 1天之外的
     *
     * @return
     */
    public static boolean getStartDiffEndByOneDay(Date startDay, Date endDay, int type) {
        if (endDay.getTime() < startDay.getTime()) {
            return false;
        }
        long diff = endDay.getTime() - startDay.getTime();
        if (diff < 0) diff = 0;
        long hours = diff / (1000 * 60 * 60);

        if (type == 1 && hours >= 0 && hours <= 24) return true;
        if (type == 2 && hours > 24) return true;

        return false;
    }


    /**
     * 判断是否超出指定时间 单位天数
     *
     * @param startMillon
     * @param endMillon
     * @param day
     * @return
     */


    /**
     * 距离当前时间七天之内的日期，和七天之外的日期
     *
     * @param type type:1--7天之内的 type:2--7天之外的
     *
     * @return
     */
    public static boolean getDayDiffFromToday(Date startDay, Date endDay, int type) {
        if (endDay.getTime() < startDay.getTime()) {
            return false;
        }
        long diff = endDay.getTime() - startDay.getTime();
        if (diff < 0) diff = 0;
        long days = diff / (1000 * 60 * 60 * 24);

        if (type == 1 && days >= 0 && days < 7) return true;
        if (type == 2 && days > 7) return true;

        return false;
    }


    /**
     * 判断时间选择时间是否小于当前时间
     *
     * @param startMillon
     * @param endMillon
     * @param day
     *
     * @return
     */
    public static boolean isBefore(long startMillon, long endMillon, int day) {
        int dayMillon = 24 * 60 * 60 * 1000;
        if (Math.abs(endMillon - startMillon) > dayMillon * day) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取传入日期n月前后的日期
     *
     * @param date  日期
     * @param month 需要叠加的月数
     *
     * @return
     */
    public static String getMonthDate(Date date, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return getStringByDate(calendar.getTime());
    }


}