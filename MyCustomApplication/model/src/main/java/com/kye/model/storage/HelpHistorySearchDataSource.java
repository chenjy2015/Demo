package com.kye.model.storage;

import android.text.TextUtils;

import com.google.gson.reflect.TypeToken;
import com.kye.base.utils.GsonUtils;
import com.kye.model.SharedPreferencesConfig;
import com.kye.model.SharedPreferencesManager;
import com.kye.model.base.IDataSource;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 02/01/2018
 * @updated : 02/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 * 帮助的历史搜索记录
 */

public class HelpHistorySearchDataSource implements IDataSource {

    private static final String KEY_HISTORY_SEARCH_CACHE = SharedPreferencesConfig.HELP_SEARCH_HISTORY_RECORDS;

    public boolean setSearchData(List<String> queryDatas) {
        return SharedPreferencesManager.commit(KEY_HISTORY_SEARCH_CACHE, queryDatas);
    }

    public List<String> getQueryData() {
        return SharedPreferencesManager.get(KEY_HISTORY_SEARCH_CACHE, new TypeToken<List<String>>() {}.getType());
    }

    public Observable<List<String>> getQueryDataRx() {
        return SharedPreferencesManager.getForRx(KEY_HISTORY_SEARCH_CACHE, new TypeToken<List<String>>() {}.getType());
    }

    public Single<Boolean> removeQueryDataRx() {
        return SharedPreferencesManager.removeForRx(KEY_HISTORY_SEARCH_CACHE);
    }

    public boolean setSearchData(String queryData) {
        List<String> queryDatas = getQueryData();
        if (queryDatas == null) {
            queryDatas = new ArrayList<>();
        } else {
            // todo : 是否有重复
            if (queryDatas.contains(queryData)) {
                return true;
            }
            // todo : 最多保存10条记录
            if (queryDatas.size() >= 10) {
                queryDatas.remove(0);
            }
            queryDatas.add(queryData);
        }
        return setSearchData(queryDatas);
    }

    public Single<Boolean> setSearchDataRx(final String queryData) {
        return
                Single.just(KEY_HISTORY_SEARCH_CACHE)
                        .map(new Function<String, List<String>>() {
                            @Override
                            public List<String> apply(String key) throws Exception {
                                String jsonData = SharedPreferencesManager.get(key);
                                if (TextUtils.isEmpty(jsonData)) {
                                    return new ArrayList<>();
                                }
                                return GsonUtils.toJsonList(jsonData, String.class);
                            }
                        })
                        .map(new Function<List<String>, List<String>>() {
                            @Override
                            public List<String> apply(List<String> strings) throws Exception {
                                strings.add(queryData);
                                return strings;
                            }
                        })
                        .map(new Function<List<String>, String>() {
                            @Override
                            public String apply(List<String> strings) throws Exception {
                                return GsonUtils.toJsonString(strings);
                            }
                        })
                        .map(new Function<String, Boolean>() {
                            @Override
                            public Boolean apply(String jsonDataNew) throws Exception {
                                return SharedPreferencesManager.commit(KEY_HISTORY_SEARCH_CACHE, jsonDataNew);
                            }
                        });
    }

}
