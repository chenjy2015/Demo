package com.example.chenjiayou.mycustomapplication.utils;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormatUtils {
    /**
     * 加密手机号码 中间四位数
     *
     * @param phone
     */
    public static String encryptionPhone(String phone) {
        String newPhone = "";
        if (TextUtils.isEmpty(phone)) {
            return newPhone;
        }
        if (phone.length() >= 11) {
            String head = phone.substring(0, 3);
            String center = "****";
            String footer = phone.substring(7, phone.length());
            newPhone = head + center + footer;
        }
        return newPhone;
    }

    /**
     * 检查是否纯中文
     * @param name
     * @return
     */
    public static boolean checkNameIsChinese(String name) {
        return !Pattern.compile("^[\u4e00-\u9fa5]+$").matcher(name).matches();
    }

    /**
     * 检查身份证证件是否合法
     * @param idNumber
     * @return
     */
    public static boolean checkIDNumber(String idNumber) {
        boolean flag;
        try {
            String check = "^(\\d{15}|\\d{17})([0-9]|x|X)$";
            String hongkong = "^[A-Z][0-9]{6}\\([0-9A]\\)$";
            String aomen = "^[157][0-9]{6}\\([0-9]\\)$";
            String taiwang = "^[A-Z][0-9]{9}$";

            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(idNumber);
            flag = matcher.matches();

            if (!flag) {
                Pattern hk = Pattern.compile(hongkong);
                Matcher matcherHK = hk.matcher(idNumber);
                flag = matcherHK.matches();
            }

            if (!flag) {
                Pattern AM = Pattern.compile(aomen);
                Matcher matcherAM = AM.matcher(idNumber);
                flag = matcherAM.matches();
            }

            if (!flag) {
                Pattern TW = Pattern.compile(taiwang);
                Matcher matcherTW = TW.matcher(idNumber);
                flag = matcherTW.matches();
            }

        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 判断输入内容是否是中文
     * @param txt
     * @return
     */
    public static boolean isChinese(String txt) {
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(txt);
        if (m.find()) {
            return true;
        }
        return false;
    }

    /**
     * 字符串中是否包含表情,包含返回true
     *
     * @param str
     * @return
     */
    public static boolean containsEmoji(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (isEmojiCharacter(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * 过滤输入第三方表情
     *
     * @param codePoint
     * @return
     */
    public static boolean isEmojiCharacter(char codePoint) {
        return ((codePoint >= 0xA0) && (codePoint <= 0xFF)) || !((codePoint == 0x0) || (codePoint == 0x9) || (codePoint == 0xA) ||
                (codePoint == 0xD) || ((codePoint >= 0x20) && codePoint <= 0xD7FF)) ||
                ((codePoint >= 0xE000) && (codePoint <= 0xEFFF)) ||
                ((codePoint >= 0x10000) && (codePoint <= 0x11FFFF)) ||
                ((codePoint >= 0x20FF) && (codePoint <= 0x32FF));
    }

    /**
     * 特殊字符
     * @param expressNum
     * @return
     */
    public static boolean hasSpecialCharacters(String expressNum) {
        if (TextUtils.isEmpty(expressNum)) {
            return false;
        }
        String regularExpression = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regularExpression);
        Matcher m = p.matcher(expressNum);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * (当输入联系人Contact>=2个汉字and不包含字母（不能输入英语）.)
     * <h3>Version</h3> 1.0
     * <h3>CreateTime</h3> 2016/4/29,20:07
     * <h3>UpdateTime</h3> 2016/4/29,20:07
     * <h3>CreateAuthor</h3> （Geoff）
     * <h3>UpdateAuthor</h3>
     * <h3>UpdateInfo</h3> (此处输入修改内容,若无修改可不写.)
     *
     * @param value
     * @return
     */
    public static boolean checkChineseLanguage(String value) {
        try {
            char[] ch = value.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char c : ch) {
                if (String.valueOf(c).getBytes().length >= 2) {
                    sb.append(c);
                } else {
                    return false;
                }
            }
            if (sb.toString().length() < 2) {
                return false;
            }

            // 把中文替换成空
            String reg = "[\u4e00-\u9fa5]";
            Pattern pat = Pattern.compile(reg);
            Matcher mat = pat.matcher(value);
            String repickStr = mat.replaceAll("");
            if (repickStr.length() > 0) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
