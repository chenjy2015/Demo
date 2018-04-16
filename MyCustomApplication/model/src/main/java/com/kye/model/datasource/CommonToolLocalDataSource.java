package com.kye.model.datasource;

import android.content.Context;

import com.kye.model.AppDatabase;
import com.kye.model.bean.common_tool.CommonToolItemBean;
import com.kye.model.dao.CommonToolDao;

import java.util.List;

import io.reactivex.Flowable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 07/01/2018
 * @updated : 07/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class CommonToolLocalDataSource {

    private CommonToolDao commonToolDao;

    public CommonToolLocalDataSource(Context context) {
        commonToolDao = AppDatabase.getInstance(context).commonToolDao();
    }

    public Flowable<List<CommonToolItemBean>> queryAll() {
        return commonToolDao.queryAllFlowable();
    }

    public Flowable<List<CommonToolItemBean>> querySelected() {
        return commonToolDao.querySelectedFlowable();
    }

    public Flowable<List<CommonToolItemBean>> queryUnselected() {
        return commonToolDao.queryUnselectedFlowable();
    }

    public void insert(List<CommonToolItemBean> selectedCommonTools) {
        commonToolDao.insert(selectedCommonTools);
    }

    public void delete(CommonToolItemBean commonToolItemBean) {
        commonToolDao.delete(commonToolItemBean);
    }

    public void delete(List<CommonToolItemBean> commonToolItemBeans) {
        commonToolDao.delete(commonToolItemBeans);
    }

    public void deleteAll() {
        commonToolDao.deleteAll();
    }
}
