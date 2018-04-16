package com.kye.model.bean.customer_intro;

/**
 * Created by harry on 2018/1/30 下午3:42.
 */

public class GetOpenIdResultBean {

    /**
     * openid : oUT8Xw1rIt0F0c6OHCYh5RUo6ck4
     * addressBookControl : 30
     * addressBook : 100
     */

    private String openid;
    private int addressBookControl;
    private int addressBook;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public int getAddressBookControl() {
        return addressBookControl;
    }

    public void setAddressBookControl(int addressBookControl) {
        this.addressBookControl = addressBookControl;
    }

    public int getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(int addressBook) {
        this.addressBook = addressBook;
    }
}
