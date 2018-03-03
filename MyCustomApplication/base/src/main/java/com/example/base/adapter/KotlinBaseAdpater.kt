package com.example.base.adapter

import android.content.Context
import android.widget.BaseAdapter
import java.util.*

/**
 * Created by chenjiayou on 2018/3/3.
 */
abstract class KotlinBaseAdpater<Any>(var context: Context, var list: ArrayList<Any>) : BaseAdapter() {
    var mContext: Context = context
    var mList: ArrayList<Any> = list

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return mList.size
    }

    override fun getItem(p0: Int): Any {
        return mList.get(p0)
    }
}