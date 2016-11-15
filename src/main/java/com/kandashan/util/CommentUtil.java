package com.kandashan.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by silence on 2016-10-28.
 */
public class CommentUtil {

    public static HttpSession getSession(HttpServletRequest request) {
        return request.getSession();
    }


}
