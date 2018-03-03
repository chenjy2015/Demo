package com.example.searchview.address_search.bean;

/**
 * Created by Administrator on 2017/11/22.
 */

public enum SearchDataType {

    SEARCH_DATA_TYPE_LOCAL_CITY("LOCAl_CITY"),
    SEARCH_DATA_TYPE_HOT_CITY("HOT_CITY"),
    SEARCH_DATA_TYPE_CITY("HOT_CITY");

    private String type;

    SearchDataType(String type){
        this.type = type;
    }
}
