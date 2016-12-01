package com.kandashan.filter;

import com.kandashan.admin.service.IRedisService;
import com.kandashan.common.bean.UserProfile;
import com.kandashan.util.Constants;
import com.kandashan.util.SpringContextHolder;
import com.kandashan.util.UserUtils;
import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by silence on 2016-11-03.
 */
public class AjaxSessionTimeoutFilter implements Filter{

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;
        HttpSession session = req.getSession();
        String url = req.getRequestURI();
        if (url.indexOf("logout.do") != -1) {
            filterChain.doFilter(request, response);
            return;
        }

        boolean flag = false;

        Object o = req.getSession().getAttribute(Constants.LOGIN_TIMESTAMP_MILLTS);//登录时间
        if (session.getAttribute(Constants.USER_PROFILE_KEY) != null) {
            IRedisService redisService = SpringContextHolder.getBean("redisService");
            UserProfile userProfile = (UserProfile)req.getSession().getAttribute(Constants.USER_PROFILE_KEY);
            String userKey = UserUtils.getRedisSessionKey(userProfile.getUser().getUserName());//redis key
            String loginTime = redisService.get(userKey);
            if (StringUtils.isNotEmpty(loginTime) && !loginTime.equals(o.toString())) {
                flag = true;
            }
        }
        if (session.getAttribute(Constants.USER_PROFILE_KEY) == null) {
            if (req.getHeader("x-requested-with") != null && req.getHeader("x-requested-with").equals("XMLHttpRequest")) {
                res.setHeader("sessionstatus", "timeout");
                if (flag) {
                    res.setHeader("sessionstatus", "fitOut");
                }
                return;
            } else {
                if (flag) {
                    res.sendRedirect(req.getContextPath() + "/logout.do?fitOut=1");
                } else {
                    filterChain.doFilter(request, response);
                }
            }
            return;
        } else {
            if (flag) {
                res.setHeader("sessionstatus", "timeout");
                res.setHeader("sessionstatus", "fitOut");
                res.sendRedirect(req.getContextPath() + "/logout.do?fitOut=1");
                return;
            } else {
                filterChain.doFilter(request, response);
            }
        }


    }

    public void destroy() {
    }
}
