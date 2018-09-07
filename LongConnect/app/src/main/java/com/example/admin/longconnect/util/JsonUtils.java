package com.example.admin.longconnect.util;

import com.alibaba.fastjson.JSON;


/**
 * Created by WuJingCheng on 2017/6/23.
 */

public class JsonUtils {
        public static <T> T getObject(String obj, Class<T> clazz){
            try {
                return JSON.parseObject(obj,clazz);
            }catch (Exception e){
                e.printStackTrace();
            }
         return null;
        }
}
