package com.example.niftydialogbuilder.dialog.helper;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.RotateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.niftydialogbuilder.R;
import com.example.niftydialogbuilder.dialog.adapter.DialogIosStyleAdapter;
import com.example.niftydialogbuilder.dialog.factory.NiftyDialogBuilder;
import com.example.niftydialogbuilder.dialog.ie.DialogSinpleCallback;
import com.example.niftydialogbuilder.dialog.ie.SLDialogSelectListenner;
import com.example.niftydialogbuilder.dialog.image.LoadingView;
import com.example.niftydialogbuilder.dialog.utils.PermissionUtils;
import com.example.niftydialogbuilder.dialog.utils.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * 项目名称：CloudSurveyPro 类名称：BlobDialogHelper
 * 创建人：chenjiayou 创建时间：2015-7-15 pm 11:58
 * 注意：在调用SLDialogSelectListenner 这个接口回调的时候 不要直接在回调方法直接显示一个Dialog
 * 因为此方法回调还未出刚刚的Dialog对象 所以如果需要在Dialog关闭后 马上又起一个Dialog 需要用到Handler来转一下
 * 也就是在SLDialogSelectListenner回调方法里面 将结果通过handler发送在 handler里面新启一个Dialog实例
 */
@SuppressLint("UseSparseArrays")
public class DialogHelper {

    private static NiftyDialogBuilder mDialogBuilder;
    //private static Context mContext;
    private static DialogHelper mInstance;
    private static ShowType mShowType;
    private static View parentView;
    private static TextView mDeleteView; //删除按钮
    private static ListView mSListView; // 单选/多选展示ListView
    private static LinearLayout mEditLayout; //输入框父布局
    private static EditText mEditText; // 输入框
    private static LinearLayout mProgressLayout; // 进度条父元素
    private static TextView mProgressText;// 进度加载提示内容
    private static ProgressBar mProgressBar; //进度条
    private static LoadingView mProgressImg; // 进度展示图片
    private static RotateAnimation mRotateAnimatin;
    private static DialogItemChoiseAdapter mMultAdapter; // 单/多选适配器
    private static ArrayList<String> mMultSelectPosition;// 多选位置集合
    private static HashMap<Integer, String> mMultSelectString; // 多选结果集合
    private static ArrayList<String> mData;     //多选单选数据源
    private static TextView mMessage;

    /**
     * 内部类 枚举 标识当前展示的输入类型
     */
    public enum ShowType {

        showSingle(0), // 单选
        showMulit(1), // 多选
        showInput(2), // 输入框
        showNormal(3), // 普通对话提示
        showProgress(4), // 进度提示框
        showDismiss(5), // 标识对话框已关闭 还原所有View
        showProgressBar(6), //带进度条的提示框
        showHttpTimeOut(7); //网络请求超时提示
        int type;

        ShowType(int type) {
            // TODO Auto-generated constructor stub
            this.type = type;
        }
    }


    private static void initView(Context mContext) {
        parentView = LayoutInflater.from(mContext).inflate(
                R.layout.layout_blob_dialoghelper, null);
        mSListView = (ListView) parentView.findViewById(R.id.id_single);
        mEditLayout = (LinearLayout) parentView.findViewById(R.id.id_edit_layout);
        mEditText = (EditText) parentView.findViewById(R.id.id_edit);
        mProgressLayout = (LinearLayout) parentView
                .findViewById(R.id.id_progress_layout);
        mProgressImg = (LoadingView) parentView
                .findViewById(R.id.id_progress_img);
        mProgressImg.initAmin();
        mProgressText = (TextView) parentView
                .findViewById(R.id.id_progress_text);
        mProgressBar = (ProgressBar) parentView.findViewById(R.id.id_progressbar);
    }


    /**
     * 刷新UI 当前Dialog中的单选列表或输入框是否显示
     *
     * @param showType  对话框类型 单选，多选，输入框，进度提示，单个按钮提示等
     * @param isShow    显示或隐藏
     * @param inputType 输入法类型 默认类型InputType.TYPE_NULL
     */
    private static void updateView(Context mContext, ShowType showType, boolean isShow,
                                   int inputType, int len) {
        mShowType = showType;// 记录当前Dialog类型
        switch (showType) {
            // 单选/多选 ListView
            case showSingle:

            case showMulit:
                if (isShow) {
                    mSListView.setVisibility(View.VISIBLE);
                    mEditLayout.setVisibility(View.GONE);
                    mProgressLayout.setVisibility(View.GONE);
                } else {
                    mSListView.setVisibility(View.GONE);
                }
                break;
            // 输入框 EditText
            case showInput:
                if (isShow) {
                    //                    mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(
                    //                            len == 0 ? 30 : len)});
                    mEditLayout.setVisibility(View.VISIBLE);
                    if (inputType != 0) {
                        mEditText.setInputType(inputType);
                    }
                    mSListView.setVisibility(View.GONE);
                    mProgressLayout.setVisibility(View.GONE);
                } else {
                    mEditLayout.setVisibility(View.GONE);
                }
                break;
            // 普通提示框
            case showNormal:
                if (isShow) {
                    mEditLayout.setVisibility(View.GONE);
                    mSListView.setVisibility(View.GONE);
                    mProgressLayout.setVisibility(View.GONE);
                }
                break;
            // 进度提示框
            case showProgress:
                if (isShow) {
                    mEditLayout.setVisibility(View.GONE);
                    mSListView.setVisibility(View.GONE);
                    mProgressBar.setVisibility(View.GONE);
                    mProgressLayout.setVisibility(View.VISIBLE);
                    mProgressText.setVisibility(View.VISIBLE);
                    mProgressImg.setVisibility(View.VISIBLE);
                    mProgressImg.startAnimation();
                } else {
                    mProgressImg.endAnimation();
                    mProgressText.setText("");
                    mProgressText.setVisibility(View.GONE);
                    mProgressImg.setVisibility(View.GONE);
                    mProgressLayout.setVisibility(View.GONE);
                }
                break;

            //带进度条提示框
            case showProgressBar:
                if (isShow) {
                    mEditLayout.setVisibility(View.GONE);
                    mSListView.setVisibility(View.GONE);
                    mProgressImg.setVisibility(View.GONE);
                    mProgressLayout.setVisibility(View.VISIBLE);
                    mProgressText.setVisibility(View.VISIBLE);
                    mProgressBar.setVisibility(View.VISIBLE);
                } else {
                    mProgressText.setVisibility(View.GONE);
                    mProgressImg.setVisibility(View.GONE);
                    mProgressBar.setVisibility(View.GONE);
                    mProgressLayout.setVisibility(View.GONE);
                    mProgressText.setText("");
                    mProgressBar.setProgress(0);
                }
                break;

            //网络超时提示框
            case showHttpTimeOut:
                mEditLayout.setVisibility(View.GONE);
                mSListView.setVisibility(View.GONE);
                mProgressImg.setVisibility(View.GONE);
                mProgressLayout.setVisibility(View.VISIBLE);
                mProgressLayout.setBackgroundResource(R.drawable.background_http_timeout);
                mProgressText.setVisibility(View.VISIBLE);
                mProgressBar.setVisibility(View.GONE);
                break;

            // 对话框关闭 还原所有View
            case showDismiss:
                // view在生成对话框对象时必然会生成所以这里只需要判断对象是否存在就行
                if (mDialogBuilder != null) {
                    mEditLayout.setVisibility(View.GONE);
                    mSListView.setVisibility(View.GONE);
                    mProgressLayout.setVisibility(View.GONE);
                    mProgressBar.setVisibility(View.GONE);
                    mProgressImg.setVisibility(View.GONE);
                    mEditText.setText("");
                    mProgressText.setText("");
                    mProgressBar.setProgress(0);
                    mProgressImg.clearAnimation();
                    if (mRotateAnimatin != null) {
                        mRotateAnimatin.cancel();
                        mRotateAnimatin = null;
                    }
                }
                break;

        }
    }

    private static void initDialog(Context mContext) {
        dismiss();
        initView(mContext);
        mDialogBuilder = new NiftyDialogBuilder(mContext).withDuration(50)
                .isCancelableOnTouchOutside(false);
    }


    public static void dismiss() {
        try {
            if (mDialogBuilder != null && mDialogBuilder.isShowing()) {
                mDialogBuilder.cancel();
                mDialogBuilder = null;
            }

            if (mDialog != null && mDialog.isShowing()) {
                mDialog.cancel();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param type 1表示关闭mDialogBuilder，2表示关闭mDialog
     */
    public static void dismiss(int type) {
        if (1 == type) {
            if (mDialogBuilder != null && mDialogBuilder.isShowing()) {
                mDialogBuilder.cancel();
                mDialogBuilder = null;
            }
        } else {
            if (mDialog != null && mDialog.isShowing()) {
                mDialog.cancel();
            }
        }
    }

    public static ShowType getShowType() {
        return mShowType;
    }


    public static void setDialogCancelable(boolean isCancelable) {
        if (mDialogBuilder != null) {
            mDialogBuilder.setCancelable(isCancelable);
        }
    }

    public static void setDialogCanceledOnTouchOutside(boolean isCancelable) {
        if (mDialogBuilder != null) {
            mDialogBuilder.isCancelableOnTouchOutside(isCancelable);
            //            mDialogBuilder.setCanceledOnTouchOutside(isCancelable);
        }

    }

    /**
     * 设置 当前按钮背景色 字体颜色默认白色 可单独设置字体颜色
     *
     * @param resourceId
     */
    public static void setDialogButtonBackground(int resourceId) {
        if (mDialogBuilder != null) {
            mDialogBuilder.setButon1Background(resourceId);
            mDialogBuilder.setButon2Background(resourceId);
        }
    }

    /**
     * 单位 PX
     *
     * @param height
     */
    public static void setEditLayoutHeight(int height) {
        if (mEditLayout != null) {
            mEditLayout.getLayoutParams().height = height;
        }
    }

    /**
     * 单位 PX
     *
     * @param height
     */
    public static void setSingleLayoutHeight(int height) {
        if (mSListView != null) {
            mSListView.getLayoutParams().height = height;
        }
    }


    public static EditText getEditText() {
        return mEditText;
    }

    public static void setEditLayoutBackgroundColor(int color) {
        if (mEditLayout != null) {
            mEditLayout.setBackgroundColor(color);
        }
    }

    public static void setEditTextHint(String hint) {
        if (mEditText != null) {
            mEditText.setHint(hint);
        }
    }

    public static void setEditTextContent(String text) {
        if (mEditText != null) {
            mEditText.setText(text);
        }
    }

    public static TextView getProgressText() {
        return mProgressText;
    }


    /**
     * @param mContext        上下文环境 (必须传递Activity.this)
     * @param index           默认选中位置
     * @param tag             当前Dialog唯一标识
     * @param list            单选数据源
     * @param selectListenner 选中内容回调
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showSingleDialog(final Context mContext, final int index, final int tag, String title,
                                        final ArrayList<String> list,
                                        final SLDialogSelectListenner selectListenner, final Object object) {
        initDialog(mContext);
        mMultSelectPosition = new ArrayList<String>();
        mMultSelectString = new HashMap<Integer, String>();
        mMultSelectString.put(index, "true");
        mMultAdapter = new DialogItemChoiseAdapter(list, mContext,
                mMultSelectString);
        if (index != -1) {
            mSListView.setSelection(index);
        }

        // 加载适配器
        mSListView.setAdapter(mMultAdapter);
        mSListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                // 刷新UI
                mSListView.setSelection(position);
                updateView(mContext, ShowType.showSingle, true, 0, 0);
                mMultAdapter.getView(position, view, parent).invalidate();
                selectListenner.onSingleSelect(tag, index, position,
                        list.get(position), object);
            }
        });

        updateView(mContext, ShowType.showSingle, true, 0, 0);
        mDialogBuilder.setTextGone();
        mDialogBuilder.setCustomView(parentView, mContext).withTitle(title).show();
    }


    /**
     * 复选框
     *
     * @param index           当前被选中的Item在Adapter中的位置
     * @param list            数据源
     * @param selectListenner 选中回调
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showMulitDialog(final Context mContext, final int index, final int tag, final String title,
                                       final ArrayList<String> list,
                                       final SLDialogSelectListenner selectListenner, final Object object) {
        initDialog(mContext);
        mData = list;
        mMultSelectPosition = new ArrayList<String>();
        mMultSelectString = new HashMap<Integer, String>();

        mMultAdapter = new DialogItemChoiseAdapter(list, mContext,
                mMultSelectString);
        // 加载适配器
        mSListView.setAdapter(mMultAdapter);
        mSListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String key = position + "";
                if (mMultSelectPosition.contains(key)) {
                    mMultSelectPosition.remove(key);
                    mMultSelectString.remove(position);
                } else {
                    mMultSelectPosition.add(key);
                    mMultSelectString.put(position, list.get(position));
                }
                // 刷新UI
                mMultAdapter.getView(position, view, parent).invalidate();
            }
        });

        updateView(mContext, ShowType.showMulit, true, 0, 0);
        mDialogBuilder.setCustomView(parentView, mContext)
                .withTitle(title)
                .withButton1Text("选定").withButton2Text("取消")
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        selectListenner.onMultiSelect(tag, index,
                                mMultSelectPosition, mMultSelectString, object);
                        updateView(mContext, ShowType.showMulit, false, 0, 0);
                    }
                }).setButton2Click(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                selectListenner
                        .onMultiSelect(tag, index, null, null, object);
                updateView(mContext, ShowType.showMulit, false, 0, 0);
            }
        }).show();

    }


    /**
     * 输入框
     *
     * @param index           当前被选中的Item在Adapter中的位置
     * @param selectListenner 按钮点击回调
     * @param title
     * @param InputType       输入法类型
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showEditDialog(final Context mContext, final int index,
                                      String title,
                                      final int InputType, final Object object, final int len, final SLDialogSelectListenner selectListenner) {
        initDialog(mContext);
        updateView(mContext, ShowType.showInput, true, InputType, len);
        mDialogBuilder.setCustomView(parentView, mContext).withTitle(title).withMessage(null)
                .withButton1Text("选定").withButton2Text("取消")
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        String content = mEditText.getText().toString().trim();
                        selectListenner.onEditFinish(index, content, object);
                        updateView(mContext, ShowType.showInput, false, InputType, len);
                    }
                }).setButton2Click(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                selectListenner.onEditFinish(index, "", object);
                updateView(mContext, ShowType.showInput, false, 0, len);
            }
        }).show();

        // 解决Dialog编辑框输入法无法弹出问题 下面两行代码加入后即可弹出输入法
        mDialogBuilder.getWindow().clearFlags(
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                        | WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
        ShowKeyboard(mEditText);
    }


    /**
     * 输入框
     *
     * @param index           当前被选中的Item在Adapter中的位置
     * @param selectListenner 按钮点击回调
     * @param title
     * @param InputType       输入法类型
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showEditDialogOneButton(final Context mContext, final int index,
                                               String title,
                                               final int InputType, final Object object, final int len, final SLDialogSelectListenner selectListenner) {
        initDialog(mContext);
        updateView(mContext, ShowType.showInput, true, InputType, len);
        mDialogBuilder.setCustomView(parentView, mContext).withTitle(title).withMessage(null)
                .withButton1Text("确定")
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        String content = mEditText.getText().toString().trim();
                        selectListenner.onEditFinish(index, content, object);
                        //                        updateView(mContext, ShowType.showInput, false, InputType, len);
                    }

                }).show();

        // 解决Dialog编辑框输入法无法弹出问题 下面两行代码加入后即可弹出输入法
        mDialogBuilder.getWindow().clearFlags(
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                        | WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
        ShowKeyboard(mEditText);
    }

    /**
     * 普通对话框
     *
     * @param title           标题
     * @param message         内容
     * @param button1         坐标按钮文字
     * @param button2         右边按钮文字
     * @param tag             自定义唯一标识
     * @param selectListenner 回调接口
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showNormalDialog(final Context mContext, String title,
                                        String message, String button1, String button2, final int tag,
                                        final SLDialogSelectListenner selectListenner, final Object object) {
        initDialog(mContext);
        updateView(mContext, ShowType.showNormal, true, 0, 0);
        //如果没有标题只有内容，用标题的view显示内容
        if (TextUtils.isEmpty(title) && !TextUtils.isEmpty(message)) {
            title = message;
            message = null;
        }
        mDialogBuilder.withTitle(title)
                .withMessage(message)
                .withButton1Text(button1)
                .withButton2Text(button2)
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        updateView(mContext, ShowType.showNormal, false, 0, 0);
                        selectListenner.onButtonClick(tag, DialogButtonType.LEFT,
                                object);
                    }
                }).setButton2Click(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                updateView(mContext, ShowType.showNormal, false, 0, 0);
                selectListenner.onButtonClick(tag, DialogButtonType.RIGHT,
                        object);

            }
        }).show();
    }

    /**
     * 普通对话框
     *
     * @param title           标题
     * @param message         内容
     * @param button1         坐标按钮文字
     * @param button2         右边按钮文字
     * @param tag             自定义唯一标识
     * @param selectListenner 回调接口
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showGuideDialog(final Context mContext, String title,
                                       String message, String button1, String button2, final int tag,
                                       final SLDialogSelectListenner selectListenner, final Object object) {
        initDialog(mContext);
        updateView(mContext, ShowType.showNormal, true, 0, 0);
        //        mDialogBuilder.setButon1Backgroun(R.drawable.background_dialog_button);
        //如果没有标题只有内容，用标题的view显示内容
        if (TextUtils.isEmpty(title) && !TextUtils.isEmpty(message)) {
            title = message;
            message = null;
        }
        mDialogBuilder.withTitle(title).withMessage(message)
                .withButton1Text(button1).withButton2Text(button2)
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        updateView(mContext, ShowType.showNormal, false, 0, 0);
                        selectListenner.onButtonClick(tag, DialogButtonType.LEFT,
                                object);
                    }
                }).setButton2Click(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                updateView(mContext, ShowType.showNormal, false, 0, 0);
                selectListenner.onButtonClick(tag, DialogButtonType.RIGHT,
                        object);

            }
        }).show();
    }


    /**
     * 普通对话框
     *
     * @param title           标题
     * @param message         内容
     * @param button1         坐标按钮文字
     * @param button2         右边按钮文字
     * @param tag             自定义唯一标识
     * @param selectListenner 回调接口
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showMonthDialog(final Context mContext, String title,
                                       String message, String button1, String button2, final int tag,
                                       final SLDialogSelectListenner selectListenner, final Object object) {
        initDialog(mContext);
        updateView(mContext, ShowType.showNormal, true, 0, 0);
        //        mDialogBuilder.setButon1Backgroun(R.drawable.background_dialog_button);
        //如果没有标题只有内容，用标题的view显示内容
        if (TextUtils.isEmpty(title) && !TextUtils.isEmpty(message)) {
            title = message;
            message = null;
        }
        mDialogBuilder.withTitle(title).withTitleColor("#000000")
                .withMessage(message)
                .withButton1Text(button1).withButton2Text(button2)
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        updateView(mContext, ShowType.showNormal, false, 0, 0);
                        selectListenner.onButtonClick(tag, DialogButtonType.LEFT,
                                object);
                    }
                }).setButton2Click(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                updateView(mContext, ShowType.showNormal, false, 0, 0);
                selectListenner.onButtonClick(tag, DialogButtonType.RIGHT,
                        object);

            }
        }).show();
    }


    /**
     * 提示Dialog 单个按钮
     *
     * @param title
     * @param message
     * @param button1
     * @param tag
     * @param selectListenner
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showHintDialog(final Context mContext, String title,
                                      String message, String button1, final int tag,
                                      final SLDialogSelectListenner selectListenner, final Object object) {
        initDialog(mContext);
        updateView(mContext, ShowType.showNormal, true, 0, 0);
        mDialogBuilder.setCanceledOnTouchOutside(false);
        //如果没有标题只有内容，用标题的view显示内容
        if (TextUtils.isEmpty(title) && !TextUtils.isEmpty(message)) {
            title = message;
            message = null;
        }
        mDialogBuilder.withTitle(title).withMessage(message)
                .withButton1Text(button1)
                .withButton1TextColor(mContext.getResources().getColor(R.color.txt_purple))
                .withButton1Background(R.drawable.dialog_btn_selector)
                .hideVerticalBtnLine()
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        updateView(mContext, ShowType.showNormal, false, 0, 0);
                        selectListenner.onButtonClick(tag, DialogButtonType.LEFT,
                                object);
                    }
                }).show();
    }

    /**
     * 提示Dialog 单个按钮 唯品会定制dialog
     *
     * @param title
     * @param message
     * @param button1
     * @param tag
     * @param selectListenner
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showHintDialogVIP(final Context mContext, String title,
                                         String message, String button1, final int tag,
                                         final SLDialogSelectListenner selectListenner, final Object object) {
        initDialog(mContext);
        updateView(mContext, ShowType.showNormal, true, 0, 0);
        //        mDialogBuilder.setButon1Backgroun(R.drawable.background_dialog_button);
        //        mDialogBuilder.setDefDividerColor(R.color.gray);
        //        mDialogBuilder.setTitleTextColor(R.color.black_pure);
        //        mDialogBuilder.setMessageColor(R.color.gray);
        //如果没有标题只有内容，用标题的view显示内容
        if (TextUtils.isEmpty(title) && !TextUtils.isEmpty(message)) {
            title = message;
            message = null;
        }
        mDialogBuilder.withTitle(title).withMessage(message)
                .withButton1Text(button1)
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        updateView(mContext, ShowType.showNormal, false, 0, 0);
                        selectListenner.onButtonClick(tag, DialogButtonType.LEFT,
                                object);
                    }
                }).show();
    }


    /**
     * 进度提示对话框
     */
    public static void showProgressDialog(final Context mContext, String progressText, boolean isCancelable, boolean isCanceledOnTouchside) {
        initDialog(mContext);
        mDialogBuilder.setCancelable(isCancelable);
        mDialogBuilder.setCanceledOnTouchOutside(isCanceledOnTouchside);
        updateView(mContext, ShowType.showProgress, true, 0, 0);
        parentView.setBackgroundColor(mContext.getResources().getColor(R.color.translucent));
        mProgressText.setText(progressText);
        mDialogBuilder.setCustomView(parentView, mContext)
                .withCustomBackgroundBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .withTitleLayoutBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .withContentPanelBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .show();
    }

    /**
     * 带进度提示条的对话框
     */
    public static void showProgressBarDialog(final Context mContext, String progressText, boolean isCancelable, boolean isCanceledOnTouchside) {
        initDialog(mContext);
        mDialogBuilder.setCancelable(isCancelable);
        mDialogBuilder.setCanceledOnTouchOutside(isCanceledOnTouchside);
        updateView(mContext, ShowType.showProgressBar, true, 0, 0);
        parentView.setBackgroundColor(mContext.getResources().getColor(R.color.translucent));
        mProgressText.setTextColor(mContext.getResources().getColor(R.color.white));
        mProgressText.setText(progressText);
        mDialogBuilder.setCustomView(parentView, mContext)
                .withCustomBackgroundBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .withTitleLayoutBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .withContentPanelBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .show();
    }

    public static void showHttpRequestTimeOutDialog(Context mContext, String content) {
        initDialog(mContext);
        mDialogBuilder.setCanceledOnTouchOutside(false);
        mDialogBuilder.setCancelable(false);
        updateView(mContext, ShowType.showHttpTimeOut, true, 0, 0);
        parentView.setBackgroundColor(mContext.getResources().getColor(R.color.translucent));
        mProgressText.setTextColor(mContext.getResources().getColor(R.color.white));
        mProgressText.setText(content);
        mDialogBuilder.setCustomView(parentView, mContext)
                .withCustomBackgroundBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .withTitleLayoutBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .withContentPanelBackgroundColor(mContext.getResources().getColor(R.color.translucent))
                .show();

    }


    /**
     * 更新进度显示 如果想隐藏进度条 progress值传-1
     *
     * @param progressText
     */
    public static void updateProgressDialog(String progressText, int progress) {
        if (mDialogBuilder == null || mProgressText == null || mProgressBar == null) {
            return;
        }

        if (mProgressText != null) {
            String str = TextUtils.isEmpty(progressText) ? "" : progressText;
            mProgressText.setText(StringUtils.checkStringIsNull(progressText));
        }

        if (mProgressBar != null) {
            if (progress == -1) {
                mProgressBar.setVisibility(View.INVISIBLE);
            } else {
                mProgressBar.setProgress(progress);
            }
        }
    }


    /**
     * 更新进度显示 如果想隐藏进度条 progress值传-1
     *
     * @param progressText
     */
    public static void updateProgressDialog(String progressText) {
        if (mDialogBuilder == null || mProgressText == null || mProgressBar == null) {
            return;
        }

        if (mProgressText != null) {
            mProgressText.setText(StringUtils.checkStringIsNull(progressText));
        }
    }

    /**
     * 更新 网络超时提示语
     *
     * @param content
     */
    public static void updateHttpTimeOutDialog(String content) {
        if (mProgressText != null) {
            mProgressText.setText(StringUtils.checkStringIsNull(content));
        }
    }


    // 隐藏虚拟键盘
    public static void HideKeyboard(EditText edit) {
        InputMethodManager imm = (InputMethodManager) edit.getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isActive()) {
            imm.hideSoftInputFromWindow(edit.getApplicationWindowToken(), 0);

        }
    }

    // 显示虚拟键盘
    public static void ShowKeyboard(View edit) {
        InputMethodManager imm = (InputMethodManager) edit.getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(edit, InputMethodManager.SHOW_FORCED);

    }

    /**
     * 复选框
     *
     * @param index           当前被选中的Item在Adapter中的位置
     * @param list            数据源
     * @param selectListenner 选中回调
     * @param object          自定义附加内容 不需要可以传null 自己判断
     */
    public static void showMulitDialog2(final Context mContext, final int index, final int tag, final String title, final String button1, final String button2,
                                        final ArrayList<String> list,
                                        final SLDialogSelectListenner selectListenner, final Object object) {
        initDialog(mContext);
        mData = list;
        mMultSelectPosition = new ArrayList<String>();
        mMultSelectString = new HashMap<Integer, String>();

        mMultAdapter = new DialogItemChoiseAdapter(list, mContext,
                mMultSelectString);
        // 加载适配器
        mSListView.setAdapter(mMultAdapter);
        updateView(mContext, ShowType.showMulit, true, 0, 0);
        mDialogBuilder.setCustomView(parentView, mContext)
                .withTitle(title)
                .withButton1Text(button1).withButton2Text(button2)
                .setButton1Click(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        setListSelectorAll();
                        selectListenner.onButtonClick(tag, DialogButtonType.LEFT, null);
                    }
                }).setButton2Click(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                selectListenner.onButtonClick(tag, DialogButtonType.RIGHT, null);
            }
        }).show();
    }


    /**
     * 设置全选
     */
    public static void setListSelectorAll() {
        if (mData == null) {
            return;
        }
        mMultSelectString.clear();
        for (int i = 0; i < mData.size(); i++) {
            mMultSelectString.put(i, mData.get(i));
        }
        mMultAdapter.notifyDataSetChanged();
    }

    /**
     * 弹出默认的拨打电话提示框
     *
     * @param context
     * @param telephoneNum
     */
    public static void showCallphoneDialog(final Activity context, final String telephoneNum) {
        showNormalDialog(context, context.getResources().getString(R.string.reminder), context.getResources().getString(R.string.callphone_message),
                context.getResources().getString(R.string.callphone_btn_no), context.getResources().getString(R.string.callphone_btn_ok), 3, new DialogSinpleCallback() {
                    @Override
                    public void onButtonClick(int tag, final DialogButtonType dialogButtonType, Object object) {
                        if (!dialogButtonType.equals(DialogButtonType.LEFT)) {
                            dismiss();
                            PermissionUtils.checkPermission(context, Manifest.permission.CALL_PHONE, "给" + telephoneNum + "拨号，需要先把拨号权限设为允许", new PermissionUtils.OnPermissionsOkListener() {
                                @SuppressLint("MissingPermission")
                                @Override
                                public void onPermissionsOkListener() {
                                    Intent intent = new Intent(Intent.ACTION_CALL);
                                    intent.setData(Uri.parse("tel:" + telephoneNum));
                                    context.startActivity(intent);
                                }
                            });
                        } else {
                            dismiss();
                        }
                    }
                }, null);
    }

    /**
     * 弹出默认的拨打电话提示框
     *
     * @param context
     * @param telephoneNum
     */
    public static void showCallphoneDialog(final Activity context, String content, final String telephoneNum) {
        showNormalDialog(context, "", content,
                context.getResources().getString(R.string.callphone_btn_no), context.getResources().getString(R.string.callphone_btn_ok), 3, new DialogSinpleCallback() {
                    @Override
                    public void onButtonClick(int tag, final DialogButtonType dialogButtonType, Object object) {
                        if (!dialogButtonType.equals(DialogButtonType.LEFT)) {
                            dismiss();
                            PermissionUtils.checkPermission(context, Manifest.permission.CALL_PHONE, "给" + telephoneNum + "拨号，需要先把拨号权限设为允许", new PermissionUtils.OnPermissionsOkListener() {
                                @SuppressLint("MissingPermission")
                                @Override
                                public void onPermissionsOkListener() {
                                    Intent intent = new Intent(Intent.ACTION_CALL);
                                    intent.setData(Uri.parse("tel:" + telephoneNum));
                                    context.startActivity(intent);
                                }
                            });
                        } else {
                            dismiss();
                        }
                    }
                }, null);
    }

    /**
     * 设置进度提示语颜色值
     *
     * @param color
     */
    public static void setProgressTextColor(int color) {
        if (mProgressText != null) {
            mProgressText.setTextColor(color);
        }
    }


    private static AlertDialog mDialog;

    /**
     * 必要权限弹框
     */
    public static Dialog showMustPermissionDialog(Context context, String content, ArrayList<String> permissions) {
        if (mDialog != null) {
            mDialog.cancel();
            mDialog = null;
            mDialog = new AlertDialog.Builder(context).create();
        } else {
            mDialog = new AlertDialog.Builder(context).create();
        }

        View view = LayoutInflater.from(context).inflate(R.layout.dialog_permission, null);
        View mSdInfo = view.findViewById(R.id.lv_dialog_sd);
        View mDevicesInfo = view.findViewById(R.id.lv_dialog_devices);
        View mGpsInfo = view.findViewById(R.id.lv_dialog_gps);

        for (int i = 0; i < permissions.size(); i++) {
            String s = permissions.get(i);
            if ("sd".equals(s)) {
                mSdInfo.setVisibility(View.VISIBLE);
            }
            if ("deviceInfo".equals(s)) {
                mDevicesInfo.setVisibility(View.VISIBLE);
            }
            if ("gps".equals(s)) {
                mGpsInfo.setVisibility(View.VISIBLE);
            }
        }

        TextView mMsgText = view.findViewById(R.id.content);
        mMsgText.setText(content);

        Button mBtnNext = (Button) view.findViewById(R.id.btn_permission_right);
        mBtnNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //                TODO  批量申请权限
            }
        });

        mDialog.show();
        mDialog.setContentView(view);
        return mDialog;
    }


    /**
     * 拨打电话Dialog
     *
     * @param context
     * @param phoneNum
     */
    public static void callPhoneDialog(final Context context, String content, final String phoneNum) {
        if (StringUtils.isNullOrEmpty(phoneNum)) {
            return;
        }
        showGuideDialog(context, context.getResources().getString(R.string.reminder), content, "取消", "拨打", 0, new DialogSinpleCallback() {
            @Override
            public void onButtonClick(int tag, DialogButtonType dialogButtonType, Object object) {
                super.onButtonClick(tag, dialogButtonType, object);
                if (dialogButtonType == DialogButtonType.RIGHT) {
                    DialogHelper.dismiss();
                    PermissionUtils.checkPermission((Activity) context, Manifest.permission.CALL_PHONE, context.getString(R.string.permission_call_faile), new PermissionUtils.OnPermissionsOkListener() {
                        @Override
                        public void onPermissionsOkListener() {
                            try {
                                Intent in = new Intent("android.intent.action.CALL", Uri.parse("tel:"
                                        + phoneNum));
                                context.startActivity(in);
                            } catch (SecurityException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else {
                    DialogHelper.dismiss();
                }
            }
        }, null);
    }

    public static void showListDialog(Context context, String titlestr, BaseAdapter adapter, OnClickListener clickListener) {
        if (mDialog != null) {
            mDialog.cancel();
            mDialog = null;
            mDialog = new AlertDialog.Builder(context).create();
        } else {
            mDialog = new AlertDialog.Builder(context).create();
        }

        View view = LayoutInflater.from(context).inflate(R.layout.dialog_list, null);
        TextView title = (TextView) view.findViewById(R.id.tv_title);
        ListView listView = (ListView) view.findViewById(R.id.list_dialog);
        Button enture = (Button) view.findViewById(R.id.btn_enture_listdialog);

        if (TextUtils.isEmpty(titlestr)) {
            titlestr = "温馨提示";
        }
        title.setText(titlestr);

        if (adapter != null) {
            listView.setAdapter(adapter);
        } else {
            adapter.notifyDataSetChanged();
        }

        if (clickListener != null) {
            enture.setOnClickListener(clickListener);
        } else {
            enture.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    mDialog.dismiss();
                }
            });
        }

        mDialog.show();
        mDialog.setContentView(view);
    }

    /**
     * 首页我要下单入口，未绑定客户编码时弹出对话框
     *
     * @param context
     * @param listening
     */
    public static void showOrderOption(Activity context, String title, String msg, final List<String> items, final SLDialogSelectListenner listening) {
        final Dialog dialog = new Dialog(context, R.style.dialog_photo_select);
        final View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_order_option, null);
        TextView mTitle = inflate.findViewById(R.id.title);
        TextView mMsg = inflate.findViewById(R.id.msg);
        mTitle.setText(title);
        mMsg.setText(msg);
        ListView listView = inflate.findViewById(R.id.item_list);
        items.add("取消");
        DialogIosStyleAdapter adapter = new DialogIosStyleAdapter(context, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                dialog.dismiss();
                if (i != items.size() - 1) {
                    listening.onSingleSelect(0, i, i, items.get(i), null);
                }
            }
        });

        dialog.setContentView(inflate);
        dialog.show();
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

        int width = wm.getDefaultDisplay().getWidth();
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = width * 7 / 8;
        //        attributes.height = width/8*3;
        window.setAttributes(attributes);
    }


    /**
     * 返回进图提示的ImageView对象
     *
     * @return
     */
    public static LoadingView getProgressImg() {
        return mProgressImg;
    }

    /**
     * 获取当前Dialog状态
     *
     * @return
     */
    public static boolean isDialogShow() {
        boolean isShow = false;
        if (mDialogBuilder != null) {
            isShow = mDialogBuilder.isShowing();
        }
        return isShow;
    }


}
