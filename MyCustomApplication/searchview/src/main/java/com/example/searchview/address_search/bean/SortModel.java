package com.example.searchview.address_search.bean;

import java.io.Serializable;

public class SortModel implements Serializable {

    private String name;   //显示的数据
    private String sortLetters;  //显示数据拼音的首字母
    private int position;//原始index

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortLetters() {
        return sortLetters;
    }

    public void setSortLetters(String sortLetters) {
        this.sortLetters = sortLetters;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
