package com.example.chenjiayou.rxjava2demo;

import java.io.Serializable;

/**
 * Created by chenjiayou on 2018/4/11.
 */

public class PersonBean implements Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
