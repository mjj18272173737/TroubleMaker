package com.kandashan.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by silence on 2016-07-29.
 */
public class Constants {

    // 用户回话KEY
    public static final String USER_PROFILE_KEY = "USER_PROFILE_KEY";

    public static final String REDIS_STATUS = null;

    public static final String LOGIN_TIMESTAMP_MILLTS = "LOGIN_TIMESTAMP_MILLTS";

    public static final String USER_CACHE_PREX = "redis_session_key_";

    /**
     * 响应码
     */
    public static Map<String, Object> RESPONSE_CODE = new HashMap<String, Object>();
    static{
        RESPONSE_CODE.put("OK", 200);
        RESPONSE_CODE.put("ERROR", 400);
    }

}