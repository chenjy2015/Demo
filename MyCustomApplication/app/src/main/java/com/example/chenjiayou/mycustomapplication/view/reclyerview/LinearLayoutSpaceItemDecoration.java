package com.example.chenjiayou.mycustomapplication.view.reclyerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * RecyclerView的LinearLayout的间距工具类
 *
 * Created by SkyYu on 02/01/2018 16:17
 * Source  http://blog.csdn.net/csdndouniwan/article/details/51762269
 */
public class LinearLayoutSpaceItemDecoration extends RecyclerView.ItemDecoration{

    private int space;

    public LinearLayoutSpaceItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view,
                               RecyclerView parent, RecyclerView.State state) {
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildPosition(view) == 0)
            outRect.top = space;
    }

}
