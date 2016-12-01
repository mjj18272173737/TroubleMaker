package com.kandashan.interceptor;

import com.kandashan.common.bean.UserProfile;
import com.kandashan.util.Constants;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by silence on 2016-11-03.
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserProfile user = (UserProfile) request.getSession().getAttribute(Constants.USER_PROFILE_KEY);
        String uri = request.getRequestURI();
        if (user == null && uri.indexOf("toLogin.do") == -1 && uri.indexOf("login.do") == -1 && uri.indexOf("logout.do") == -1) {
            response.sendRedirect(request.getContextPath() + "/toLogin.do");
            return false;
        }
        return true;
    }

}
