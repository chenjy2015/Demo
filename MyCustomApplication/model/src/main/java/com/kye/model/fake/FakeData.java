package com.kye.model.fake;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/12/2017
 * @updated : 19/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class FakeData {

    private int position;
    private String data;

    public FakeData(int position, String data) {
        this.position = position;
        this.data = data;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FakeData{" +
                "position=" + position +
                ", data='" + data + '\'' +
                '}';
    }
}
