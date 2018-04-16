package com.kye.model.gson_adapter;

import android.text.TextUtils;
import android.util.Base64;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class ByteArrayTypeAdapter extends TypeAdapter<byte[]> {
    @Override
    public void write(JsonWriter out, byte[] value) throws IOException {
        if (value == null) {
            out.nullValue();
        } else {
            try {
                out.value(Base64.encodeToString(value, Base64.DEFAULT));
            } catch (Throwable e) {
                out.nullValue();
            }
        }
    }

    @Override
    public byte[] read(JsonReader in) throws IOException {
        JsonToken peek = in.peek();
        switch (peek) {
            case NULL:
                in.nextNull();
                return null;
            case STRING:
                try {
                    String string = in.nextString();
                    if (TextUtils.isEmpty(string)) {
                        return null;
                    }
                    return Base64.decode(string, Base64.DEFAULT);
                } catch (Throwable e) {
                    return null;
                }
            default:
                throw new IllegalStateException("Expected STRING but was " + peek);
        }
    }
}
