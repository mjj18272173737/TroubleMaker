package com.kandashan.util;

import com.kandashan.admin.service.IRedisService;
import org.apache.commons.lang.StringUtils;

/**
 * Created by silence on 2016-11-03.
 */
public class UserUtils {

    public static String getRedisSessionKey(String userName){
        String userKey=null;
        try{

            userKey = DigestUtil.digestToHex(userName.getBytes(), DigestUtil.MD5);
            if(StringUtils.isNotBlank(userKey)){
                userKey=Constants.USER_CACHE_PREX+userKey;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return userKey;
    }

}
