package com.kandashan.admin.entity;

public class ReceiverWithBLOBs extends Receiver {
    private String address;

    private String areaPath;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAreaPath() {
        return areaPath;
    }

    public void setAreaPath(String areaPath) {
        this.areaPath = areaPath == null ? null : areaPath.trim();
    }
}