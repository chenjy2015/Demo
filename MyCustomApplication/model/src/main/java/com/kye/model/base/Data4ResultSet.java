package com.kye.model.base;

import android.support.annotation.Nullable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 29/01/2018
 * @updated : 29/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class Data4ResultSet<T1, T2, T3, T4> {

    public final @Nullable T1 data1;
    public final @Nullable T2 data2;
    public final @Nullable T3 data3;
    public final @Nullable T4 data4;

    public Data4ResultSet(T1 data1, T2 data2, T3 data3, T4 data4) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }
}
