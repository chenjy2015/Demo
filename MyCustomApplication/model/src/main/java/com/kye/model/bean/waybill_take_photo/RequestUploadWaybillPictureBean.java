package com.kye.model.bean.waybill_take_photo;

import java.util.List;

/**
 * Created by harry on 2018/1/11 下午4:38.
 */

public class RequestUploadWaybillPictureBean {


    /**
     * phone : 18924656687
     * array : [{"waybill":"75504920312","model":"1","pictureSize":"11","picture":"aVZCT1J3MEtHZ29BQUFBTlNVaEVVZ0FBQUJ3QUFBQVZDQUlBQUFEYVlCa0xBQUFHb0VsRVFWUTRFUlZWYTNCVHh4bmRlM2Z2MWNPUy9KQgvOXUwN2poeityc0p4aFFWR0xwdVpud3VJbXpnVmpCTVNTSkkyNHhaL1hXQlRBdmdHK24yKy93TzY4bHlUdE5GTDBnQUFBQUJKUlU1RXJrSmdnZz09"},{"waybill":"75504920312","model":"1","pictureSize":"11","picture":"aVZCT1J3MEtHZ29BQUFBTlNVaEVVZ0FBQUJ3QUFBQVZDQUlBQUFEYVlCa0xBQUFHb0VsRVFWUTRFUlZWYTNCVHh4bmRlM2Z2MWNPUy9KQmyc0p4aFFWR0xwdVpud3VJbXpnVmpCTVNTSkkyNHhaL1hXQlRBdmdHK24yKy93TzY4bHlUdE5GTDBnQUFBQUJKUlU1RXJrSmdnZz09"}]
     */

    private String phone;
    private List<ArrayBean> array;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<ArrayBean> getArray() {
        return array;
    }

    public void setArray(List<ArrayBean> array) {
        this.array = array;
    }

    public static class ArrayBean {
        /**
         * waybill : 75504920312
         * model : 1
         * pictureSize : 11
         * picture : aVZCT1J3MEtHZ29BQUFBTlNVaEVVZ0FBQUJ3QUFBQVZDQUlBQUFEYVlCa0xBQUFHb0VsRVFWUTRFUlZWYTNCVHh4bmRlM2Z2MWNPUy9KQgvOXUwN2poeityc0p4aFFWR0xwdVpud3VJbXpnVmpCTVNTSkkyNHhaL1hXQlRBdmdHK24yKy93TzY4bHlUdE5GTDBnQUFBQUJKUlU1RXJrSmdnZz09
         */

        private String waybill;
        private String model;
        private String pictureSize;
        private String picture;

        public String getWaybill() {
            return waybill;
        }

        public void setWaybill(String waybill) {
            this.waybill = waybill;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getPictureSize() {
            return pictureSize;
        }

        public void setPictureSize(String pictureSize) {
            this.pictureSize = pictureSize;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }
    }
}
