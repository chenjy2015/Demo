package com.kye.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.kye.model.bean.common_tool.CommonToolItemBean;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 07/01/2018
 * @updated : 07/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

@Dao
public interface CommonToolDao {

    @Query("SELECT * FROM common_tools")
    Flowable<List<CommonToolItemBean>> queryAllFlowable();

    @Query("SELECT * FROM common_tools")
    List<CommonToolItemBean> queryAll();

    @Query("SELECT * FROM common_tools WHERE id = :id")
    CommonToolItemBean query(int id);

    @Query("SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 1")
    Flowable<List<CommonToolItemBean>> querySelectedFlowable();

    @Query("SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 0")
    Flowable<List<CommonToolItemBean>> queryUnselectedFlowable();

    @Query("SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 1")
    Single<List<CommonToolItemBean>> querySelectedSingle();

    @Query("SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 0")
    Single<List<CommonToolItemBean>> queryUnselectedSingle();

    @Query("SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 1")
    List<CommonToolItemBean> querySelected();

    @Query("SELECT id, name, isSelected, position, positionSelected, positionUnselected FROM common_tools WHERE isSelected = 0")
    List<CommonToolItemBean> queryUnselected();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<CommonToolItemBean> selectedCommonTools);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    List<Long> insertAll(List<CommonToolItemBean> selectedCommonTools);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(CommonToolItemBean selectedCommonTool);

    @Delete
    void delete(CommonToolItemBean commonToolItemBean);

    @Delete
    void delete(List<CommonToolItemBean> commonToolItemBeans);

    @Query("DELETE FROM common_tools")
    void deleteAll();
}
