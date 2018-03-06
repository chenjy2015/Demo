package com.example.base.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;


/**
 * Created by chenjiayou on 2018/3/5.
 */

public class GsonUtils {

    public static Gson mGson;

    static {
        mGson = new Gson();
    }

    public static Gson getGson() {
        return mGson;
    }

    public static Object createObjectByJson(String json, String className) {
        Object object = null;
        try {
            object = new Gson().fromJson(json, Class.forName(className).getClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static String createObjectByJson(Object c) {
        String json = new Gson().toJson(c);
        return json;
    }

    public static ArrayList<Object> createListByJson(String json, String className) {
        try {
            Class c = Class.forName(className);
            Object object = c.getClass();
            ArrayList<Object> data = new ArrayList<>();
            JSONArray array = new JSONArray(json);
            for (int i = 0; i < array.length(); i++) {
                data.add(new Gson().fromJson(array.get(0).toString(), Class.forName(className).getClass()));
            }
            return data;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
