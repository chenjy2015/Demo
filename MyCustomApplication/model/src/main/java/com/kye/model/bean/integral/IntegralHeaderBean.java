package com.kye.model.bean.integral;

import android.os.Parcel;
import android.os.Parcelable;

import com.kye.model.base.BaseItem;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 12/01/2018
 * @updated : 12/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 *
 *     用户积分信息
 */

public class IntegralHeaderBean implements Parcelable, BaseItem {

    public IntegralUserBean integralUserBean;
    public IntegralUpdateByUser integralUpdateByUser;
    public boolean isIntegralUpdateSuccess;

    public IntegralHeaderBean clone() {
        IntegralHeaderBean copy = new IntegralHeaderBean();
        copy.setIntegralUserBean(getIntegralUserBean());
        copy.setIntegralUpdateByUser(getIntegralUpdateByUser());
        copy.setIntegralUpdateSuccess(isIntegralUpdateSuccess());
        return copy;
    }

    public IntegralHeaderBean(IntegralUserBean integralUserBean) {
        this.integralUserBean = integralUserBean;
    }

    public IntegralHeaderBean() {
    }

    public IntegralUserBean getIntegralUserBean() {
        return integralUserBean;
    }

    public void setIntegralUserBean(IntegralUserBean integralUserBean) {
        this.integralUserBean = integralUserBean;
    }

    public IntegralUpdateByUser getIntegralUpdateByUser() {
        return integralUpdateByUser;
    }

    public void setIntegralUpdateByUser(IntegralUpdateByUser integralUpdateByUser) {
        this.integralUpdateByUser = integralUpdateByUser;
    }

    public boolean isIntegralUpdateSuccess() {
        return isIntegralUpdateSuccess;
    }

    public void setIntegralUpdateSuccess(boolean integralUpdateSuccess) {
        isIntegralUpdateSuccess = integralUpdateSuccess;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.integralUserBean, flags);
        dest.writeParcelable(this.integralUpdateByUser, flags);
        dest.writeByte(this.isIntegralUpdateSuccess ? (byte) 1 : (byte) 0);
    }

    protected IntegralHeaderBean(Parcel in) {
        this.integralUserBean = in.readParcelable(IntegralUserBean.class.getClassLoader());
        this.integralUpdateByUser = in.readParcelable(IntegralUpdateByUser.class.getClassLoader());
        this.isIntegralUpdateSuccess = in.readByte() != 0;
    }

    public static final Creator<IntegralHeaderBean> CREATOR = new Creator<IntegralHeaderBean>() {
        @Override
        public IntegralHeaderBean createFromParcel(Parcel source) {
            return new IntegralHeaderBean(source);
        }

        @Override
        public IntegralHeaderBean[] newArray(int size) {
            return new IntegralHeaderBean[size];
        }
    };
}
