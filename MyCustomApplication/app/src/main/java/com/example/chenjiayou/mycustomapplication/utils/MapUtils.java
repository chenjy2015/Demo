package com.example.chenjiayou.mycustomapplication.utils;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static Map<String, String> map(String... items) {
        Map<String, String> result = new HashMap<>();
        for (int i = 0; i < items.length; i += 2) {
            result.put(items[i], items[i + 1]);
        }
        return result;
    }
}
