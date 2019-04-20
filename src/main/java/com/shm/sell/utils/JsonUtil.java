package com.shm.sell.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Auther: shm
 * @Date: 2019/4/19
 * @Description: com.shm.sell.utils
 * @version: 1.0
 */
public class JsonUtil {

    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
