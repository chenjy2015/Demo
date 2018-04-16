package com.kye.model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.kye.model.bean.common_tool.CommonToolItemBean;
import com.kye.model.bean.order.UrgeRecordBean;
import com.kye.model.dao.CommonToolDao;
import com.kye.model.dao.UrgeRecordDao;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 07/01/2018
 * @updated : 07/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */
@Database(
        entities = {
                CommonToolItemBean.class,
                UrgeRecordBean.class
        },
        version = 2,
        exportSchema = false
)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase INSTANCE;

    public abstract CommonToolDao commonToolDao();

    public abstract UrgeRecordDao urgeRecordDao();

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(), AppDatabase.class, "key-app.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}

