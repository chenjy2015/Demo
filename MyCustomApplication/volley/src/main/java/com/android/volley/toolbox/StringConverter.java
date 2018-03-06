package com.android.volley.toolbox;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 * @version V1.0
 * @createAuthor yzw
 * @createDate 2016/5/13 16:01
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public class StringConverter implements JsonSerializer<String>, JsonDeserializer<String> {
    public StringConverter() {
    }

    public JsonElement serialize(String src, Type typeOfSrc, JsonSerializationContext context) {
        return src == null?new JsonPrimitive(""):new JsonPrimitive(src.toString());
    }

    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return json.getAsJsonPrimitive().getAsString();
    }
}
