package com.example.niftydialogbuilder.dialog.helper;

/**
 * 对话框中按钮类型
 */
public enum DialogButtonType {

    LEFT("LEFT"),
    RIGHT("RIGHT");
    String type;

    private DialogButtonType(String type) {
        this.type = type;
    }
}
