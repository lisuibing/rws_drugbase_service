package com.inspur.health.utill;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Auther:lisuibing
 * @Date: 2021/1/26
 * @Description: com.inspur.health.rws.project.utill
 * @Version: 1.0
 */
public class ObjectMapperUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 对象转化为json
     */
    public static String ObjecttoJSON(Object target) {
        String result = null;
        try {
            result = MAPPER.writeValueAsString(target);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return result;
    }

    public static <T> T toObject(String json, Class<T> targetClass) {
        T object = null;
        try {
            object = MAPPER.readValue(json, targetClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return object;
    }

}
