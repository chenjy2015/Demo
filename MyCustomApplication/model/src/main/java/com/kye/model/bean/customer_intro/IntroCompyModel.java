package com.kye.model.bean.customer_intro;

public class IntroCompyModel {
    private String name;
    private boolean isCheck;
    private boolean editenable = true;

    public boolean isEditenable() {
        return editenable;
    }

    public void setEditenable(boolean editenable) {
        this.editenable = editenable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }
}
