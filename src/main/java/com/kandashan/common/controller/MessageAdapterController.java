package com.kandashan.common.controller;

import com.kandashan.admin.entity.AdapterServices;
import com.kandashan.common.service.IMessageAdapterService;
import com.kandashan.util.Constants;
import com.kandashan.util.SpringContextHolder;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 外部访问接口
 * Created by silence on 2016-12-01.
 */
@Controller
public class MessageAdapterController {

    private static final Log logger = LogFactory.getLog("MessageAdapter");

    @Autowired
    private IMessageAdapterService adapterService;

    @ResponseBody
    @RequestMapping(value = "/messageAdapter")
    public Object messageAdapter(HttpServletRequest request, HttpServletResponse respone) {
        //http://localhost:8081/TroubleMaker/messageAdapter.do?adapterNo=100014&identityCode=fy2PPAPW9BIAENO1p9EU2Z/2ff5ZGFE4pGpnx0dutvWKdbjA/G2wxTFXQJVqJa1m
        Map<String, Object> result = new HashMap<String, Object>();
        String adapterNo = request.getParameter("adapterNo");
        String identityCode = request.getParameter("identityCode");
        String time = request.getParameter("time");
        String data = request.getParameter("data");
        logger.info("------------------message adpater request adapterNo:" + adapterNo + "------------------");
        logger.info("------------------message adpater request identityCode:" + identityCode + "------------------");
        logger.info("------------------message adpater request time:" + time + "------------------");
        logger.info("------------------message adpater request data:" + data + "------------------");

        if (StringUtils.isEmpty(adapterNo)) {
            result.put("code", -1);
            result.put("msg", "接口调用失败，缺少必要参数");
            return result;
        }
        if (!adapterService.verifyAdpter(adapterNo, identityCode, data, time)) {
            result.put("code", -1);
            result.put("code", "接口调用失败，接口编号不存在或接口识别码验证不通过");
            return result;
        }
        AdapterServices service = adapterService.getAdpaterServiceByNo(adapterNo);
        String serviceCode = service.getServiceCode();
        String serviceMethod = service.getServiceMethod();
        Object adpaterService = SpringContextHolder.getBean(serviceCode);
        if (adpaterService == null) {
            result.put("code", -1);
            result.put("msg", "接口调用失败，处理业务类不存在");
            return result;
        }
        try {
            Method method = adpaterService.getClass().getMethod(serviceMethod, new Class[] {HttpServletRequest.class, HttpServletResponse.class});
            Object resultObject = method.invoke(adpaterService, new Object[] {request, respone});
            result.put("code", 1);
            result.put("msg", "接口调用成功");
            result.put("result", resultObject);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", -1);
            result.put("msg", "接口调用失败，业务类处理异常："+e.getMessage()+","+e.getCause());
        }
        return result;
    }


}
