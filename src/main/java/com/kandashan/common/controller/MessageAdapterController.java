package com.kandashan.common.controller;

import com.kandashan.annotation.AnnotationDemo;
import com.kandashan.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

/**外部接口入口
 * Created by CPR199 on 2016-12-01.
 */
@Controller
public class MessageAdapterController {

    @ResponseBody
    @RequestMapping(value = "/messageAdapter")
    public Object messageAdapter() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", Constants.RESPONSE_CODE.get("ERROR"));
        return map;
    }

    @AnnotationDemo(item = "meijiajie", assignedTo = "男", dateAssigned = "帅" , severity = AnnotationDemo.Severity.IMPORTANT)
    private void demo() {

    }

}
