package com.kandashan.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by silence on 2016-10-28.
 */
public class BaseController {

    public HttpSession getSession(HttpServletRequest request) {
        return request.getSession();
    }
}
