package com.example.pullrefreshlistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

public abstract class PtrDefaultHandler1 implements PtrHandler {

    public static boolean canChildScrollUp(View view) {
        if (android.os.Build.VERSION.SDK_INT < 14) {
            if (view instanceof AbsListView) {
                final AbsListView absListView = (AbsListView) view;
                return absListView.getChildCount() > 0
                        && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0)
                        .getTop() < absListView.getPaddingTop());
            } else {
                return view.getScrollY() > 0;
            }
        } else {
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View child = ((ViewGroup) view).getChildAt(i);
                    if (child instanceof AbsListView) {
                        return child.canScrollVertically(-1);
                    }
                }
            }
            return view.canScrollVertically(-1);
        }
    }

    /**
     * Default implement for check can perform pull to refresh
     *
     * @param frame
     * @param content
     * @param header
     * @return
     */
    public static boolean checkContentCanBePulledDown(PtrFrameLayout frame, View content, View header) {
        return !canChildScrollUp(content);
    }

    @Override
    public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
        return checkContentCanBePulledDown(frame, content, header);
    }
}