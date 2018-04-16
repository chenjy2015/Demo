package com.example.chenjiayou.mycustomapplication.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.kye.express.R;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 20/12/2017
 * @updated : 20/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class NotificationCommentDialog extends android.support.v4.app.DialogFragment implements View.OnClickListener {

    private static final String TAG = NotificationCommentDialog.class.getSimpleName();
    protected FrameLayout content;
    protected OnCancelListener onCancelListener;

    public static NotificationCommentDialog newInstance() {
        Bundle args = new Bundle();
        NotificationCommentDialog fragment = new NotificationCommentDialog();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setStyle(STYLE_NO_TITLE, R.style.kye_dialog);
        setCancelable(true);
    }

    @Override
    public void onStart() {
        super.onStart();
        // full screen
        Dialog dialog = getDialog();
        if (dialog != null) {
            int width = ViewGroup.LayoutParams.MATCH_PARENT;
            int height = ViewGroup.LayoutParams.MATCH_PARENT;
            dialog.getWindow().setLayout(width, height);
            // set status bar transparent
            getDialog().getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_comment_input, container, false);
//        content = view.findViewById(R.id.flContainer);
//        content.setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "dialog onclicked : ");
        if (isCancelable()) {
            dismiss();
            getView().post(new Runnable() {
                @Override
                public void run() {
                    if (onCancelListener != null) {
                        onCancelListener.onCancel(NotificationCommentDialog.this);
                    }
                }
            });
        }
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        getView().post(new Runnable() {
            @Override
            public void run() {
                if (onCancelListener != null) {
                    onCancelListener.onCancel(NotificationCommentDialog.this);
                }
            }
        });
    }

    public interface OnCancelListener {
        void onCancel(NotificationCommentDialog dialog);
    }

    public OnCancelListener getOnCancelListener() {
        return onCancelListener;
    }

    public void setOnCancelListener(OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
    }
}
