package com.example.chenjiayou.mycustomapplication.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupWindow;

import com.kye.express.R;

import java.lang.ref.WeakReference;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 08/01/2018
 * @updated : 08/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class NotificationCommentBottomSheet extends PopupWindow {

    private static final String TAG = NotificationCommentBottomSheet.class.getName();
    WeakReference<Context> ctxRef;

    private EditText text;

    private NotificationCommentBottomSheet.OnClickListener clickListener;

    public NotificationCommentBottomSheet(Context context) {
        super(context);
        this.ctxRef = new WeakReference<Context>(context);
        init(ctxRef.get());
    }

    private void init(Context context) {
        final View contentView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_comment_input, null);
        setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_OUTSIDE) {
                    dismiss();
                    return true;
                }
                return false;
            }
        });
//        contentView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if (isShowing()) {
//                    dismiss();
//                }
//                return false;
//            }
//        });
        setContentView(contentView);
        setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        text = contentView.findViewById(R.id.comment_input_text);
        contentView.findViewById(R.id.comment_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener != null) {
                    String comment = text.getText().toString();
                    clickListener.onSend(comment);
                    dismiss();
                }
            }
        });
    }

    public void setClickListener(OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public static interface OnClickListener {
        void onSend(String comment);
    }
}
