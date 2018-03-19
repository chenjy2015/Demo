package com.example.niftydialogbuilder.dialog.adapter;

import android.app.Activity;

import java.util.List;

/**
 * baseAdapter 可继承它
 * Created by yzw
 */
public abstract class MyBaseAdapter<T> extends android.widget.BaseAdapter
{
    protected List<T> mList;

    protected Activity mAct;

    public MyBaseAdapter(Activity act, List<T> list)
    {
        this.mAct = act;
        this.mList = list;
    }

    protected MyBaseAdapter(List<T> list) {
        mList = list;
    }

    @Override
    public int getCount()
    {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return mList == null ? null : mList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }
}
