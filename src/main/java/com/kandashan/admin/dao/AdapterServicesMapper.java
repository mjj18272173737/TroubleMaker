package com.kandashan.admin.dao;

import com.kandashan.admin.entity.AdapterServices;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by silence on 2016-12-02.
 */
@Repository
public interface AdapterServicesMapper {

    AdapterServices getAdapterServiceByNo(@Param("adapterNo") String adapterNo);

    List<AdapterServices> getAllAdapter();
}
