package com.kye.model;

import android.content.SharedPreferences;
import android.util.Pair;

import com.f2prateek.rx.preferences2.RxSharedPreferences;
import com.google.gson.Gson;
import com.kye.base.Logger;

import java.lang.reflect.Type;
import java.util.Set;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class SharedPreferencesManager {

    private static final String DEFAULT_STRING = "";
    private static final String DEFAULT_OBJECT_STRING = "{}";
    private static final String DEFAULT_ARRAY_STRING = "[]";

    private static SharedPreferences sSharedPreferences;
    private static RxSharedPreferences sRxSharedPreferences;

    public static SharedPreferences getSharedPreferences() {
        return sSharedPreferences;
    }

    public static void setSharedPreferences(SharedPreferences sharedPreferences) {
        sSharedPreferences = sharedPreferences;
    }

    public static RxSharedPreferences getRxSharedPreferences() {
        return sRxSharedPreferences;
    }

    public static void setRxSharedPreferences(RxSharedPreferences rxSharedPreferences) {
        sRxSharedPreferences = rxSharedPreferences;
    }

    public static boolean commit(String key, Object value) {
        String json = toJson(value);
        Logger.d("json : " + json);
        return commit(key, json);
    }

    public static Single<Boolean> commitForRx(String key, Object value) {
        return Single.just(Pair.create(key, value))
                .map(new Function<Pair<String, Object>, Pair<String, String>>() {
                    @Override
                    public Pair<String, String> apply(Pair<String, Object> stringObjectPair) throws Exception {
                        return Pair.create(stringObjectPair.first, toJson(stringObjectPair.second));
                    }
                })
                .subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.io())
                .map(new Function<Pair<String, String>, Boolean>() {
                    @Override
                    public Boolean apply(Pair<String, String> stringStringPair) throws Exception {
                        return commit(stringStringPair.first, stringStringPair.second);
                    }
                });
    }

    public static boolean commit(String key, String value) {
        return getSharedPreferences().edit()
                .putString(key, value)
                .commit();
    }

    public static Single<Boolean> commitForRx(String key, String value) {
        return Single.just(Pair.create(key, value))
                .map(new Function<Pair<String, String>, Boolean>() {
                    @Override
                    public Boolean apply(Pair<String, String> pair) throws Exception {
                        return commit(pair.first, pair.second);
                    }
                })
                .subscribeOn(Schedulers.io());
    }

    public static boolean commit(String key, Set<String> value) {
        return getSharedPreferences().edit()
                .putStringSet(key, value)
                .commit();
    }

    public static Single<Boolean> commitForRx(String key, Set<String> value) {
        return Single.just(Pair.create(key, value))
                .map(new Function<Pair<String, Set<String>>, Boolean>() {
                    @Override
                    public Boolean apply(Pair<String, Set<String>> pair) throws Exception {
                        return commit(pair.first, pair.second);
                    }
                })
                .subscribeOn(Schedulers.io());
    }

    public static boolean commit(String key, int value) {
        return getSharedPreferences().edit()
                .putInt(key, value)
                .commit();
    }

    public static Single<Boolean> commitForRx(String key, int value) {
        return Single.just(Pair.create(key, value))
                .map(new Function<Pair<String, Integer>, Boolean>() {
                    @Override
                    public Boolean apply(Pair<String, Integer> pair) throws Exception {
                        return commit(pair.first, pair.second);
                    }
                })
                .subscribeOn(Schedulers.io());
    }

    public static boolean commit(String key, long value) {
        return getSharedPreferences().edit()
                .putLong(key, value)
                .commit();
    }

    public static Single<Boolean> commitForRx(String key, long value) {
        return Single.just(Pair.create(key, value))
                .map(new Function<Pair<String, Long>, Boolean>() {
                    @Override
                    public Boolean apply(Pair<String, Long> pair) throws Exception {
                        return commit(pair.first, pair.second);
                    }
                })
                .subscribeOn(Schedulers.io());
    }

    public static boolean commit(String key, float value) {
        return getSharedPreferences().edit()
                .putFloat(key, value)
                .commit();
    }

    public static Single<Boolean> commitForRx(String key, float value) {
        return Single.just(Pair.create(key, value))
                .map(new Function<Pair<String, Float>, Boolean>() {
                    @Override
                    public Boolean apply(Pair<String, Float> pair) throws Exception {
                        return commit(pair.first, pair.second);
                    }
                })
                .subscribeOn(Schedulers.io());
    }

    public static boolean commit(String key, boolean value) {
        return getSharedPreferences().edit()
                .putBoolean(key, value)
                .commit();
    }

    public static Single<Boolean> commitForRx(String key, boolean value) {
        return Single.just(Pair.create(key, value))
                .map(new Function<Pair<String, Boolean>, Boolean>() {
                    @Override
                    public Boolean apply(Pair<String, Boolean> pair) throws Exception {
                        return commit(pair.first, pair.second);
                    }
                })
                .subscribeOn(Schedulers.io());
    }

    public static boolean remove(String key) {
        return getSharedPreferences().edit()
                .remove(key)
                .commit();
    }

    public static Single<Boolean> removeForRx(String key) {
        return Single.just(key)
                .map(new Function<String, Boolean>() {
                    @Override
                    public Boolean apply(String s) throws Exception {
                        return remove(s);
                    }
                })
                .subscribeOn(Schedulers.io());
    }

    public static boolean clear() {
        return getSharedPreferences().edit()
                .clear()
                .commit();
    }

    public static Single<Boolean> clearForRx() {
        return Single.create(new SingleOnSubscribe<Boolean>() {
            @Override
            public void subscribe(SingleEmitter<Boolean> e) throws Exception {
                e.onSuccess(clear());
            }
        });
    }

    public static <T> T get(String key, Class<T> classOfT) {
        return fromJson(get(key, DEFAULT_OBJECT_STRING), classOfT);
    }

    public static <T> T get(String key, Type typeOfT) {
        return fromJson(get(key, DEFAULT_OBJECT_STRING), typeOfT);
    }

    public static <T> Observable<T> getForRx(String key, final Class<T> classOfT) {
        return getRxSharedPreferences().getString(key, DEFAULT_OBJECT_STRING)
                .asObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.computation())
                .map(new Function<String, T>() {
                    @Override
                    public T apply(String s) throws Exception {
                        return fromJson(s, classOfT);
                    }
                });
    }

    public static <T> Observable<T> getForRx(String key, final Type typeOfT) {
        return getRxSharedPreferences().getString(key, DEFAULT_OBJECT_STRING)
                .asObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.computation())
                .map(new Function<String, T>() {
                    @Override
                    public T apply(String s) throws Exception {
                        return fromJson(s, typeOfT);
                    }
                });
    }

    public static String get(String key) {
        return getSharedPreferences().getString(key, DEFAULT_STRING);
    }

    public static Observable<String> getForRx(String key) {
        return getRxSharedPreferences().getString(key)
                .asObservable()
                .subscribeOn(Schedulers.io());
    }

    public static String get(String key, String defaultValue) {
        return getSharedPreferences().getString(key, defaultValue);
    }

    public static Observable<String> getForRx(String key, String defaultValue) {
        return getRxSharedPreferences().getString(key, defaultValue)
                .asObservable()
                .subscribeOn(Schedulers.io());
    }

    public static int get(String key, int defaultValue) {
        return getSharedPreferences().getInt(key, defaultValue);
    }

    public static Observable<Integer> getForRx(String key, int defaultValue) {
        return getRxSharedPreferences().getInteger(key, defaultValue)
                .asObservable()
                .subscribeOn(Schedulers.io());
    }

    public static long get(String key, long defaultValue) {
        return getSharedPreferences().getLong(key, defaultValue);
    }

    public static Observable<Long> getForRx(String key, long defaultValue) {
        return getRxSharedPreferences().getLong(key, defaultValue)
                .asObservable()
                .subscribeOn(Schedulers.io());
    }

    public static float get(String key, float defaultValue) {
        return getSharedPreferences().getFloat(key, defaultValue);
    }

    public static Observable<Float> getForRx(String key, Float defaultValue) {
        return getRxSharedPreferences().getFloat(key, defaultValue)
                .asObservable()
                .subscribeOn(Schedulers.io());
    }

    public static boolean get(String key, boolean defaultValue) {
        return getSharedPreferences().getBoolean(key, defaultValue);
    }

    public static Observable<Boolean> getForRx(String key, boolean defaultValue) {
        return getRxSharedPreferences().getBoolean(key)
                .asObservable()
                .subscribeOn(Schedulers.io());
    }

    private static String toJson(Object value) {
        if (value == null) return null;
        return getGson().toJson(value);
    }

    private static <T> T fromJson(String json, Class<T> classOfT) {
        if (DEFAULT_OBJECT_STRING.equals(json)) {
            try {
                return getGson().fromJson(json, classOfT);
            } catch (Throwable t) {
                return getGson().fromJson(DEFAULT_ARRAY_STRING, classOfT);
            }
        }
        return getGson().fromJson(json, classOfT);
    }

    private static <T> T fromJson(String json, Type typeOfT) {
        if (DEFAULT_OBJECT_STRING.equals(json)) {
            try {
                return getGson().fromJson(json, typeOfT);
            } catch (Throwable t) {
                return getGson().fromJson(DEFAULT_ARRAY_STRING, typeOfT);
            }
        }
        return getGson().fromJson(json, typeOfT);
    }

    private static Gson getGson() {
        return ApiBase.getInstance().getGson();
    }
}
