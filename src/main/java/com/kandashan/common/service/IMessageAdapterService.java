package com.kandashan.common.service;

import com.kandashan.admin.entity.AdapterServices;

import java.util.List;

/**
 * Created by silence on 2016-12-02.
 */
public interface IMessageAdapterService {

    public AdapterServices getAdpaterServiceByNo(String adpaterNo);

    public List<AdapterServices> getAdpaterServices();

    public boolean verifyAdpter(String adpaterNo,String identityCode);

    public boolean verifyAdpter(String adpaterNo,String identityCode, String data, String timestamp);
}
