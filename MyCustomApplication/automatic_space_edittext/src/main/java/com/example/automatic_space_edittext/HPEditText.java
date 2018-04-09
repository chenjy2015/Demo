package com.example.automatic_space_edittext;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * @author cjy
 * @company 跨越速运
 * @Description 输入若干位自动空格EditText
 * @createDate 2017/11/23 19:47
 * @updateAuthor
 */

public class HPEditText extends AppCompatEditText {
    private boolean isRun       = false;
    private String  d           = "";
    private int     insertcount = 3;
    private OnTextWatcher onTextWatcher;

    public HPEditText(Context context) {
        super(context);
        setBankCardTypeOn();
    }

    public HPEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBankCardTypeOn();
    }

    public HPEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBankCardTypeOn();
    }

    public void setInsertCount(int count) {
        this.insertcount = count;
    }


    boolean isPast = false;

    /**
     * 监听影响输入框文字的系统事件
     * id:16908319  --- 全选
     * id:16908328  --- 选择
     * id:16908320  --- 剪贴
     * id:16908321  --- 复制
     * id:16908322  --- 粘贴
     * id:16908324  --- 输入法
     *
     * @param id
     *
     * @return
     */
    @Override
    public boolean onTextContextMenuItem(int id) {
        switch (id) {
            //粘贴
            case 16908322:
                isPast = true;
                break;
        }
        return super.onTextContextMenuItem(id);

    }


    private void setBankCardTypeOn() {
        HPEditText.this.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (onTextWatcher != null) {
                    onTextWatcher.beforeTextChanged(s, start, count, after);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (isRun) {
                    isRun = false;
                    return;
                }
                isRun = true;
                d = "";
                String newStr = s.toString();
                newStr = newStr.replace(" ", "");
                int index = 0;
                while ((index + insertcount) < newStr.length()) {
                    d += (newStr.substring(index, index + insertcount) + " ");
                    index += insertcount;
                }
                d += (newStr.substring(index, newStr.length()));
                int i = getSelectionStart();
                HPEditText.this.setText(d);
                try {
                    if (i % (insertcount + 1) == 0 && before == 0) {
                        if (i + 1 <= d.length()) {
                            HPEditText.this.setSelection(i + 1);
                        } else {
                            HPEditText.this.setSelection(d.length());
                        }
                    } else if (before == 1 && i < d.length()) {
                        HPEditText.this.setSelection(i);
                    } else if (before == 0 && i < d.length()) {
                        HPEditText.this.setSelection(i);
                    } else {
                        HPEditText.this.setSelection(d.length());
                    }
                    //粘贴文字时光标会少了空格位 这里给补上
                    if (isPast) {
                        HPEditText.this.setSelection(d.length());
                        isPast = false;
                    }
                } catch (Exception e) {

                }
                if (onTextWatcher != null) {
                    onTextWatcher.onTextChanged(s, start, before, count);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (onTextWatcher != null) {
                    onTextWatcher.afterTextChanged(s);
                }
            }
        });

    }

    //对外提供暴漏的方法
    private void insertText(EditText editText, String mText) {
        editText.getText().insert(getSelectionStart(), mText);
    }

    public interface OnTextWatcherListener {
        void beforeTextChanged(CharSequence s, int start, int count, int after);

        void onTextChanged(CharSequence s, int start, int before, int count);

        void afterTextChanged(Editable s);
    }

    public abstract static class OnTextWatcher implements OnTextWatcherListener {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
}
