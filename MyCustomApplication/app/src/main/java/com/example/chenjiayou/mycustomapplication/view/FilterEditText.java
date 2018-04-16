package com.example.chenjiayou.mycustomapplication.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ymh
 * @version V1.0
 * @company 跨越速运
 * @Description 过滤含有表情符号、只有回车键、空格键的EditText
 * @date 2016/4/9
 */
@SuppressLint("AppCompatCustomView")
public class FilterEditText extends EditText {
    public static final int LEVEL_LOW = 1;                      // 低过滤级别
    public static final int LEVEL_HIGH = 1 << 1;                // 高过滤级别（过滤表情，过滤特殊符号，不可输入逗号句号）
    public static final int LEVEL_ONLY_CHAR_OR_NUM = 1 << 2;    // 仅仅是字母或数字
    public static final int LEVEL_HIGH_PUNCTUATION = 1 << 3;    // 高过滤级别(过滤表情，过滤特殊符号，可输入逗号句号等)
    public static final int LEVEL_CHINESE_ONLY = 1 << 4;        // 仅仅是汉字
    private boolean isEmoji;

    private int level = LEVEL_HIGH;

    private TextWatcher watcher;
    private int textLenght = -1;

    public FilterEditText(Context context) {
        super(context);
    }

    public FilterEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FilterEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FilterEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        super.addTextChangedListener(mWatcher);
    }

    @Override
    public void addTextChangedListener(TextWatcher watcher) {
        removeTextChangedListener(mWatcher);
        this.watcher = watcher;
        super.addTextChangedListener(mWatcher);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    TextWatcher mWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            if (watcher != null) watcher.beforeTextChanged(s, start, count, after);
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (watcher != null) watcher.onTextChanged(s, start, before, count);
        }

        @Override
        public void afterTextChanged(Editable s) {
            int index = getSelectionStart() - 1;

            if (level == LEVEL_HIGH_PUNCTUATION) {
                if (textLenght == -1)
                    setFilters(new InputFilter[]{emojiFilter});
                else
                    setFilters(new InputFilter[]{emojiFilter, new InputFilter.LengthFilter(textLenght)});
            }

            if (s.length() > 0 && index >= 0) {
                String str = s.subSequence(index, index + 1).toString();
                String regEx = "[()（）]";
                Pattern p = Pattern.compile(regEx);
                Matcher m = p.matcher(str);
                if (m.find() && level != LEVEL_ONLY_CHAR_OR_NUM) return;
            }
            if (index > 0) {
                if (isIllegal(s.charAt(index))) {
                    Editable edit = getText();
                    edit.delete(index, index + 1);
                    return;
                }
            } else if (s.length() > 0 && isIllegal(s.charAt(0)) && index >= 0) {
                Editable edit = getText();
                edit.delete(index, index + 1);
                return;
            }
            if (isWrapOnly(s.toString()) || isSpaceOnly(s.toString())) {
                setText("");
                return;
            }

            if (watcher != null) watcher.afterTextChanged(s);
        }

        /**
         * 根据过滤级别判断是否需要过滤
         * @param c
         * @return
         */
        private boolean isIllegal(char c) {
            if (level == LEVEL_LOW) {
                return isInputIllegal(String.valueOf(c));
            } else if (level == LEVEL_HIGH_PUNCTUATION) {
                return isEmoji;
            } else if (level == LEVEL_HIGH) {
                return isEmojiCharacter(c) | isInputIllegal(c + "");
            } else if (level == LEVEL_ONLY_CHAR_OR_NUM) {
                return !isInputCharOrNum(c + "");
            } else if (level == LEVEL_CHINESE_ONLY) {
                return !isChineseOnly(c + "");
            } else {
                throw new RuntimeException("FilterEditText类，不支持[" + level + "]级别！");
            }
        }
    };

    /**
     * 过滤emoj表情
     */
    InputFilter emojiFilter = new InputFilter() {
        Pattern emoji = Pattern.compile(
                "[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]",
                Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);

        @Override
        public CharSequence filter(CharSequence source, int start, int end,
                                   Spanned dest, int dstart, int dend) {
            Matcher emojiMatcher = emoji.matcher(source);
            if (emojiMatcher.find()) {
                isEmoji = true;
                return "";
            }
            isEmoji = false;
            return null;
        }
    };


    public int getTextLenght() {
        return textLenght;
    }

    public void setTextLenght(int textLenght) {
        this.textLenght = textLenght;
    }

    /**
     * 判断用户输入的内容是否只含有换行符/n
     *
     * @param input
     * @return true -是  false-否
     */
    private boolean isWrapOnly(String input) {
        String regEx = "[\n]+";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    /**
     * 只有空格
     *
     * @param input
     * @return
     */
    private boolean isSpaceOnly(String input) {
        String regEx = "[ ]+";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    /**
     * 判断用户输入的内容是否非法
     *
     * @param input
     * @return true —— 非法   false —— 正常
     */
    private boolean isInputIllegal(String input) {
        //        String regEx = "[/\"“”$&＆%％%:：？?@<>||*￥$\\\\]";
        String regEx = "[\"\'\\\\''<>&%]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(input);
        return m.find();
    }

    /**
     * 过滤输入第三方表情
     *
     * @param codePoint
     * @return
     */
    private boolean isEmojiCharacter(char codePoint) {
        return ((codePoint >= 0xA0) && (codePoint <= 0xFF)) || !((codePoint == 0x0) || (codePoint == 0x9) || (codePoint == 0xA) ||
                (codePoint == 0xD) || ((codePoint >= 0x20) && codePoint <= 0xD7FF)) ||
                ((codePoint >= 0xE000) && (codePoint <= 0xEFFF)) ||
                ((codePoint >= 0x10000) && (codePoint <= 0x11FFFF)) ||
                ((codePoint >= 0x20FF) && (codePoint <= 0x32FF));
    }

    /**
     * 判断用户输入的内容是否是字母或数字
     *
     * @param input
     * @return true —— 是   false —— 不是
     */
    private boolean isInputCharOrNum(String input) {
        String regEx = "[a-zA-Z0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(input);
        return m.find();
    }

    /**
     * 是否只是汉字
     *
     * @param input
     * @return
     */
    private boolean isChineseOnly(String input) {
        Pattern pattern = Pattern.compile("^[\\u4e00-\\u9fa5]+$");
        Matcher isChinese = pattern.matcher(input);
        return isChinese.matches();
    }
}
