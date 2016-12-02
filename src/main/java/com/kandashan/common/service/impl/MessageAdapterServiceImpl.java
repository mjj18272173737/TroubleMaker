package com.kandashan.common.service.impl;

import com.kandashan.admin.dao.AdapterServicesMapper;
import com.kandashan.admin.entity.AdapterServices;
import com.kandashan.common.service.IMessageAdapterService;
import com.kandashan.util.Constants;
import com.kandashan.util.SecretUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by silence on 2016-12-02.
 */
@Service
public class MessageAdapterServiceImpl implements IMessageAdapterService {

    @Resource
    private AdapterServicesMapper adapterServiceMapper;

    public AdapterServices getAdpaterServiceByNo(String adpaterNo) {
        return adapterServiceMapper.getAdapterServiceByNo(adpaterNo);
    }

    public List<AdapterServices> getAdpaterServices() {
        return adapterServiceMapper.getAllAdapter();
    }

    public boolean verifyAdpter(String adpaterNo, String identityCode) {
        boolean result = false;
        AdapterServices service = adapterServiceMapper.getAdapterServiceByNo(adpaterNo);
        if (service != null) {
            SecretUtil secretUtil = new SecretUtil();
            String password = secretUtil.decodeTicket(service.getIdentityCode(), identityCode);
            if (StringUtils.isNotEmpty(password) && password.indexOf(":") > 0) {
                String _password = password.split("[;]")[0];
                String _time = password.split("[;]")[2];
                if(StringUtils.isNotEmpty(_time)){
                    // 校验时间差不大于5分钟
                    Long diff = System.currentTimeMillis() - Long.valueOf(_time);
                    if(_password.equals(service.getIdentityCode()) && service.getServiceStatus().intValue()== Constants.VALID_VALUE.intValue() ){
                        return true;
                    }
                }

            }
        }
        return result;
    }

    public boolean verifyAdpter(String adpaterNo, String identityCode, String data, String timestamp) {
        boolean result = false;
        if(StringUtils.isEmpty(timestamp)){
            // 如果time为空则用第一种校验方式DES3
            AdapterServices service = getAdpaterServiceByNo(adpaterNo);
            if(service != null){
                SecretUtil secretUtil = new SecretUtil();
                String password = secretUtil.decodeTicket(service.getIdentityCode(), identityCode);
                if(StringUtils.isNotEmpty(password) && password.indexOf(";") >= 0){
                    String _password = password.split("[;]")[0];
                    String _time = password.split("[;]")[2];
                    if(StringUtils.isNotEmpty(_time)){
                        // 校验时间差不大于5分钟
                        Long diff = System.currentTimeMillis() - Long.valueOf(_time);
                        if(_password.equals(service.getIdentityCode()) && service.getServiceStatus().intValue()==Constants.VALID_VALUE.intValue() ){
                            return true;
                        }
                    }
                }
            }
        } else {
            Long diff = System.currentTimeMillis() - Long.valueOf(timestamp.substring(0, 10)) * 1000;
            if(diff > 5 * 60 * 1000){
                // 秘钥有效时长不超过5分钟
                return false;
            }
            AdapterServices service = getAdpaterServiceByNo(adpaterNo);
            if(service != null){
                SecretUtil secretUtil = new SecretUtil();
                String ticket = secretUtil.md5Ticket(data, timestamp);
                if(identityCode.equalsIgnoreCase(ticket)){
                    return true;
                }
            }
        }

        return result;
    }
}
