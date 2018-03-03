package com.example.searchview.address_search.interfaces;


import com.example.searchview.address_search.bean.SearchDataType;
import com.example.searchview.address_search.bean.SortModel;

/**
 * Created by Administrator on 2017/11/22.
 */

public interface OnItemClickListener {
     void onItemClick(int position, SearchDataType searchDataType, SortModel sortModel);
}
