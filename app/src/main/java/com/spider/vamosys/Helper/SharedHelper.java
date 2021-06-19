package com.spider.vamosys.Helper;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.Set;

public class SharedHelper {

    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;
    public static String token="";

    public static void putKey(Context context, String Key, String Value) {
        try {
            sharedPreferences = context.getSharedPreferences("Cache", Context.MODE_PRIVATE);
            editor = sharedPreferences.edit();
            editor.putString(Key, Value);
            editor.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getKey(Context contextGetKey, String Key) {
        sharedPreferences = contextGetKey.getSharedPreferences("Cache", Context.MODE_PRIVATE);
        String Value = sharedPreferences.getString(Key, "");
        return Value;

    }

}
