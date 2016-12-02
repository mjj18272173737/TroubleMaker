package com.kandashan.admin.entity;

/**
 * Created by silence on 2016-12-02.
 */
public class AdapterServices {

    private String adapterNo;
    private String identityCode;
    private String serviceCode;
    private String serviceName;
    private String serviceMethod;
    private Integer serviceType;
    private Integer serviceStatus;
    private String serviceDesc;

    public AdapterServices() {
    }

    public AdapterServices(String adapterNo) {
        this.adapterNo = adapterNo;
    }

    public AdapterServices(String adapterNo, String identityCode, String serviceCode, String serviceName, String serviceMethod, Integer serviceType, Integer serviceStatus, String serviceDesc) {
        this.adapterNo = adapterNo;
        this.identityCode = identityCode;
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.serviceMethod = serviceMethod;
        this.serviceType = serviceType;
        this.serviceStatus = serviceStatus;
        this.serviceDesc = serviceDesc;
    }

    public String getAdapterNo() {
        return adapterNo;
    }

    public void setAdapterNo(String adapterNo) {
        this.adapterNo = adapterNo;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceMethod() {
        return serviceMethod;
    }

    public void setServiceMethod(String serviceMethod) {
        this.serviceMethod = serviceMethod;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Integer serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }
}
