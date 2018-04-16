package com.kye.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.kye.model.bean.order.UrgeRecordBean;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 24/01/2018
 * @updated : 24/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

@Dao
public interface UrgeRecordDao {

    @Query("SELECT * FROM urge_records WHERE code = :code")
    UrgeRecordBean query(String code);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(UrgeRecordBean urgeRecordBean);
}
